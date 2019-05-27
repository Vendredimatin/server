package app.server.bean;

/**
 * @Author：Liu hanyi
 * @Description：
 * @Date Created in ${Time} ${Date}
 * @Modified By:
 */
public class RatingDetail {
    private double score1 = 0;
    private double score2 = 0;
    private double score3 = 0;
    private double score4 = 0;
    private double score5 = 0;

    public RatingDetail() {
    }

    public RatingDetail(double score1, double score2, double score3, double score4, double score5) {
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
        this.score4 = score4;
        this.score5 = score5;
    }

    public double getScore1() {
        return score1;
    }

    public void setScore1(double score1) {
        this.score1 = score1;
    }

    public double getScore2() {
        return score2;
    }

    public void setScore2(double score2) {
        this.score2 = score2;
    }

    public double getScore3() {
        return score3;
    }

    public void setScore3(double score3) {
        this.score3 = score3;
    }

    public double getScore4() {
        return score4;
    }

    public void setScore4(double score4) {
        this.score4 = score4;
    }

    public double getScore5() {
        return score5;
    }

    public void setScore5(double score5) {
        this.score5 = score5;
    }

    @Override
    public String toString() {
        return "RatingDetail{" + "score1=" + score1 + ", score2=" + score2 + ", score3=" + score3 + ", score4=" + score4 + ", score5=" + score5 + '}';
    }
}
