package latihan3;

public class FinalExam extends GradeActivity {

    int numberOfQuestion;
    int numberMissed;
    double pointsPerQuestion;

    public FinalExam(int questions, int missed) {
        double numScore;
        numberOfQuestion = questions;
        numberMissed = missed;
        pointsPerQuestion = 100 / questions;
        numScore = 100 - (missed * pointsPerQuestion);
        setScore(numScore);
    }

    public double getPointsPerQuestion() {
        return pointsPerQuestion;
    }

    public int getNumberMissed() {
        return numberMissed;
    }
}
