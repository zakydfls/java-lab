package latihan3;

public class GradeActivity {
    double score;
    String name;

    public GradeActivity() {
    }

    public GradeActivity(String n) {
        name = n;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public char getGrade() {
        char grade;
        if (score >= 85) {
            grade = 'A';
        } else if (score >= 70) {
            grade = 'B';
        } else if (score >= 60) {
            grade = 'C';
        } else {
            grade = 'D';
        }
        return grade;
    }
}
