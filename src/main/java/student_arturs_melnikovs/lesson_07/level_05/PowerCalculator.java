package student_arturs_melnikovs.lesson_07.level_05;

class PowerCalculator {

    public double raiseToPower(int number, int power) {
        double result = 1;
        if (power == 0) {
            return result;
        } else if (power > 0) {
            return positive(number, power, result);
        } else {
            return negative(number, power, result);
        }
    }

    private double positive(int number, int power, double result) {
        for (int i = 0; i < power; i++) {
            result = result * number;
        }
        return result;
    }

    private double negative(int number, int power, double result) {
        for (int i = 0; i < -power; i++) {
            result = result * number;
        }
        return 1 / result;
    }
}
