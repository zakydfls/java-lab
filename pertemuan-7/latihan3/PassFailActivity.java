package latihan3;

public class PassFailActivity extends GradeActivity {

    double minPassingScore;

    public PassFailActivity(double min) {
        minPassingScore = min;
    }

    public char getGrade() {
        char letterGrade;

        if (super.getScore() >= minPassingScore)
            letterGrade = 'P';
        else
            letterGrade = 'F';

        return letterGrade;
    }
}
