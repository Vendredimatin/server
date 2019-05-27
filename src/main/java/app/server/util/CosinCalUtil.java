package app.server.util;

import java.util.ArrayList;

//Test版本
public class CosinCalUtil {

    private ArrayList<Double> validVector1 = new ArrayList<>();
    private ArrayList<Double> validVector2 = new ArrayList<>();
    private double vectorMul = 0.0;
    private double validVectorLen1 = 0;
    private double validVectorLen2 = 0;

    //获取两个向量中同时有评分的部分
    private void setValidVectors(ArrayList<Double> a,ArrayList<Double> b){
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

    //求向量内积
    private void vectorMul(ArrayList<Double> a,ArrayList<Double> b){
        if(a==null||b==null||a.size()==0||b.size()==0||a.size()!=b.size())vectorMul = -1;
        double res = 0;
        for(int i = 0;i<a.size();i++){
            res+=(a.get(i)*b.get(i));
        }
        vectorMul = res;
    }

    //求向量长度
    private double vectorLen(ArrayList<Double> a){
        if(a==null||a.size()==0)return -1;
        double sum = 0;
        for(Double d:a){
            sum+=(d*d);
        }
        return Math.sqrt(sum);
    }

    public double cosin(){
        return vectorMul/(validVectorLen1*validVectorLen2);
    }

    public CosinCalUtil(ArrayList<Double> a,ArrayList<Double> b){
        setValidVectors(a,b);
        vectorMul(this.validVector1,this.validVector2);
        validVectorLen1 = vectorLen(this.validVector1);
        validVectorLen2 = vectorLen(this.validVector2);
    }
}
