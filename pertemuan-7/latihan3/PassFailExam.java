package latihan3;

public class PassFailExam extends PassFailActivity {

    int numberOfQuestion;
    double pointsPerQuestion;
    int numberMissed;

    public PassFailExam(int questions, int missed, double minPassing) {
        super(minPassing);
        double numScore;
        numberOfQuestion = questions;
        numberMissed = missed;

        pointsPerQuestion = 100.0 / questions;
        numScore = 100.0 - (missed * pointsPerQuestion);

        setScore(numScore);
    }

    public double getPointsEach() {
        return pointsPerQuestion;
    }

    public int getNumberMissed() {
        return numberMissed;
    }

}
