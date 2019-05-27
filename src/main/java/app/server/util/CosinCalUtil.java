package app.server.util;

import java.util.ArrayList;
import java.util.List;


class CosinCalUtil {

    private ArrayList<Double> validVector1 = new ArrayList<>();//有效向量1 去除未评论部分
    private ArrayList<Double> validVector2 = new ArrayList<>();//有效向量2 去除未评论部分
    private double vectorMul = 0.0;//向量内积
    private double validVectorLen1;//有效向量1长度
    private double validVectorLen2;//有效向量2长度

    /**
     * 获取两个向量中同时有评分的部分
     * @param a 向量
     * @param b 向量
     */
    private void setValidVectors(List<Double> a,List<Double> b){
        if(a==null||b==null||a.size()!=b.size())return;
        for(int i = 0;i<a.size();i++){
            double aTemp = a.get(i);
            double bTemp = b.get(i);
            if(aTemp==-1&&bTemp!=-1){
                validVector1.add(aTemp);
                validVector2.add(bTemp);
            }
        }
    }

    /**
     * 求向量内积
     * @param a 向量
     * @param b 向量
     */
    private void vectorMul(List<Double> a,List<Double> b){
        if(a==null||b==null||a.isEmpty()||b.isEmpty()||a.size()!=b.size())vectorMul = -1;
        double res = 0;
        if(a!=null&&b!=null)
            for(int i = 0;i<a.size();i++){
                    res+=(a.get(i)*b.get(i));
            }
        vectorMul = res;
    }

    /**
     * 求向量长度
     * @param a 向量
     * @return 向量长度
     */
    private double vectorLen(List<Double> a){
        if(a==null||a.isEmpty())return -1;
        double sum = 0;
        for(Double d:a){
            sum+=(d*d);
        }
        return Math.sqrt(sum);
    }
    /**
     * 计算余弦值
     * @return 余弦值
     */
    double cosin(){
        return vectorMul/(validVectorLen1*validVectorLen2);
    }


    /**
     * 构造函数，初始化成员变量
     * @param a 向量
     * @param b 向量
     */
    CosinCalUtil(List<Double> a, List<Double> b){
        setValidVectors(a,b);
        vectorMul(this.validVector1,this.validVector2);
        validVectorLen1 = vectorLen(this.validVector1);
        validVectorLen2 = vectorLen(this.validVector2);
    }
}
