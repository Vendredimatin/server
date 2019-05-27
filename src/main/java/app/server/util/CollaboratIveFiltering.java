package app.server.util;

import app.server.bean.Comment;
import app.server.bean.Course;
import app.server.bean.RatingDetail;
import app.server.bean.Student;
import app.server.dao.CommentDAO;
import app.server.dao.CourseDAO;
import app.server.dao.StudentDAO;
import app.server.service.CFService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;

/**
 * 基于items的协同过滤算法
 */
@Component
public class CollaboratIveFiltering implements CFService {
    private static final double WEIGHT1 = 0.3;//权重
    private static final double WEIGHT2 = 0.15;//权重
    private static final double WEIGHT3 = 0.15;//权重
    private static final double WEIGHT4 = 0.2;//权重
    private static final double WEIGHT5 = 0.2;//权重

    private ArrayList<String> courseIds = new ArrayList<>();//课程IDs
    private ArrayList<String> stuIds = new ArrayList<>();//学生IDs
    private ArrayList<ArrayList<Double>> scoreVectors = new ArrayList<>();//课程得分向量
    private double[][] scores;//scores[i][j] i为课程index，j为学生index，courseId.get(i)为该课程的ID，stuIds.get(j)为该学生的ID
    private double[][] similarity;//各个课程之间的相似度矩阵
    private CourseDAO courseDAO;
    private StudentDAO studentDAO;
    private CommentDAO commentDAO;

    @Autowired
    public CollaboratIveFiltering(CourseDAO courseDAO,StudentDAO studentDAO,CommentDAO commentDAO){
        this.courseDAO = courseDAO;
        this.studentDAO = studentDAO;
        this.commentDAO = commentDAO;
        init();
    }

    /**
     * 初始化成员变量
     */
    private void init(){
        List<Course> courseList = courseDAO.findAll();
        List<Student> studentList = studentDAO.findAll();

        for(Course course:courseList){
            courseIds.add(course.getId());
        }
        for(Student student:studentList){
            stuIds.add(student.getUsername());
        }
        scores = new double[courseIds.size()][stuIds.size()];
        setScores();
        similarity = new double[courseIds.size()][courseIds.size()];
        setSimilarity();
    }
    /**
     * 设置得分
     */
    private void setScores(){
        for(int i = 0;i<courseIds.size();i++){
            for(int j = 0;j<stuIds.size();j++){
                List<Comment> comments = commentDAO.findAllByCourseIdAndCommenter(courseIds.get(i),stuIds.get(j));
                double score = scoreCal(comments);
                scores[i][j] = score;
            }
        }
        decreaseAver();
        fillVectors();
    }
    /**
     * 根据权重计算最终的score
     * @param comment 评论列表
     * @return 最终的score
     */
    private double scoreCal(List<Comment> comment){
        if(comment==null||comment.isEmpty())return 0;
        double res = 0.0;
        int count = comment.size();
        for(Comment c:comment){
            RatingDetail ratingDetails = c.getRatingDetail();
            res += ratingDetails.getScore1()*WEIGHT1+ratingDetails.getScore2()*WEIGHT2+ratingDetails.getScore3()*WEIGHT3+ratingDetails.getScore4()*WEIGHT4+ratingDetails.getScore5()*WEIGHT5;
        }
        return res/count;
    }

    /**
     * 减用户评价平均数减少因用户评分习惯导致的误差
     */
    private void decreaseAver(){
        double aver;
        double sum;
        int count;
        for(int j = 0;j<stuIds.size();j++){
            aver = 0;
            sum = 0;
            count = 0;
            for(int i = 0;i<courseIds.size();i++){
                if(scores[i][j]!=0){
                    sum+=scores[i][j];
                    count++;
                }
            }
            if(count!=0)aver = sum/count;
            for(int i = 0;i<courseIds.size();i++){
                if(scores[i][j]!=0){
                    scores[i][j] -= aver;
                }
            }
        }
    }
    /**
     * 将二维数组转化为CosinCalUtil可以处理的ArrayList
     */
    private void fillVectors(){
        for(int i = 0;i<courseIds.size();i++){
            ArrayList<Double> list = new ArrayList<>(scores[i].length);
            for(double d:scores[i])list.add(d);
            scoreVectors.add(list);
        }
    }
    /**
     * 计算相似度
     */
    private void setSimilarity(){
        int size = courseIds.size();
        for(int i = 0;i<size;i++){
            for(int j = 0;j<size;j++){
                if(i==j)similarity[i][j] = 1.0;
                else if(similarity[j][i]!=0)similarity[i][j] = similarity[j][i];
                else{
                    CosinCalUtil cosinCalUtil = new CosinCalUtil(scoreVectors.get(i),scoreVectors.get(j));
                    similarity[i][j] = cosinCalUtil.cosin();
                }
            }
        }
    }
    /**
     * 返回用户未评论过的课程id和预测评分
     * @param username 用户名
     * @return key:CourseId    val:recommend
     */
    public Map<String,Double> getRecommendCourses(String username){
        Map<String,Double> map = new HashMap<>();
        List<Integer> inds = new ArrayList<>();
        int index = stuIds.indexOf(username);
        if(index>=0) {
            for (int i = 0; i < courseIds.size(); i++) {
                if (scores[i][index] == 0) {
                    inds.add(i);
                    map.put(courseIds.get(i), 0.0);
                }
            }
            for (int i : inds) {
                map.replace(courseIds.get(i), calPredict(i, index));
            }
        }
        return map;
    }
    /**
     * 预测
     * @param n courseIndex
     * @param stu studentIndex
     * @return 预测结果
     */
    private double calPredict(int n,int stu){
        double similaritySum = 0.0;
        double sum = 0;
        for(int i = 0;i<courseIds.size();i++){
            if(i!=n&&scores[i][stu]!=0){
                similaritySum += similarity[n][i];
                sum += similarity[n][i]*scores[i][stu];
            }
        }
        if(similaritySum==0)return 0;
        return sum/similaritySum;
    }
}
