package studen_natalja_isajeva.lesson_7.level_5;

public class PowerCalculator {
    public double calculateDegree(double number, int degree) {
        double calculation = 1;
        if (degree == 0) {
            return calculation;
        }
        return Math.pow(number, degree);
    }
}
