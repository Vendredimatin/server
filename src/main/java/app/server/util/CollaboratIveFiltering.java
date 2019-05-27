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

//@Component
public class CollaboratIveFiltering implements CFService {
    private static final double WEIGHT1 = 0.3;//权重
    private static final double WEIGHT2 = 0.15;//权重
    private static final double WEIGHT3 = 0.15;//权重
    private static final double WEIGHT4 = 0.2;//权重
    private static final double WEIGHT5 = 0.2;//权重

    private ArrayList<String> courseIds = new ArrayList<>();//课程IDs
    private ArrayList<String> stuIds = new ArrayList<>();//学生IDs
    private ArrayList<ArrayList<Double>> scoreVectors = new ArrayList<>();
    private Double[][] scores;
    private Double[][] similarity;
    private CourseDAO courseDAO;
    private StudentDAO studentDAO;
    private CommentDAO commentDAO;

    @Autowired
    public CollaboratIveFiltering(CourseDAO courseDAO,StudentDAO studentDAO,CommentDAO commentDAO){
        this.courseDAO = courseDAO;
        this.studentDAO = studentDAO;
        this.commentDAO = commentDAO;
       // init();
    }

    public void init(){
        List<Course> courseList = courseDAO.findAll();
        List<Student> studentList = studentDAO.findAll();

        for(Course course:courseList){
            courseIds.add(course.getId());
        }
        for(Student student:studentList){
            stuIds.add(student.getUsername());
        }

        scores = new Double[courseIds.size()][stuIds.size()];
        setScores();
        similarity = new Double[courseIds.size()][courseIds.size()];
        setSimilarity();
    }
    private void setScores(){
        for(int i = 0;i<courseIds.size();i++){
            for(int j = 0;j<courseIds.size();j++){
                List<Comment> comments = commentDAO.findAllByCourseIdAndCommenter(courseIds.get(i),stuIds.get(j));
                double score = scoreCal(comments);
                scores[i][j] = score;
            }
        }
        //减用户评价平均数减少因用户评分习惯导致的误差
        decreaseAver();
        fillVectors();
    }
    private double scoreCal(List<Comment> comment){
        if(comment==null&&comment.size()==0)return 0;
        double res = 0.0;
        int count = comment.size();
        for(Comment c:comment){
            RatingDetail ratingDetails = c.getRatingDetail();
            res += ratingDetails.getScore1()*WEIGHT1+ratingDetails.getScore2()*WEIGHT2+ratingDetails.getScore3()*WEIGHT3+ratingDetails.getScore4()*WEIGHT4+ratingDetails.getScore5()*WEIGHT5;
        }
        return res/count;
    }
    private void decreaseAver(){
        double aver;
        double sum;
        int count;
        for(int i = 0;i<courseIds.size();i++){
            aver = 0;
            sum = 0;
            count = 0;
            for(int j = 0;j<courseIds.size();j++){
                if(scores[i][j]!=0){
                    sum+=scores[i][j];
                    count++;
                }
            }
            if(count!=0)
                aver = sum/count;
            for(int j = 0;j<courseIds.size();j++){
                if(scores[i][j]!=0){
                    scores[i][j] -= aver;
                }
            }
        }
    }
    private void fillVectors(){
        for(int i = 0;i<courseIds.size();i++){
            ArrayList<Double> list = new ArrayList<>(scores[i].length);
            Collections.addAll(list, scores[i]);
            scoreVectors.add(list);
        }
    }
    //计算相似度
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

    //key:CourseId    val:recommend
    public Map<String,Double> getRecommendCourses(String username){
        Map<String,Double> map = new HashMap<>();
        List<Integer> inds = new ArrayList<>();
        int index = stuIds.indexOf(username);
        for(int i = 0;i<courseIds.size();i++){
            if(scores[i][index]==0){
                inds.add(i);
                map.put(courseIds.get(i),0.0);
            }
        }
        for(int i:inds){
            map.replace(courseIds.get(i),calPredict(i,index));
        }
        return map;
    }
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
