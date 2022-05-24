package student_andrejs_saldavs.lesson_07.level_5;


class PowerCalculator {


    public double powCalculator(int number, int power) {
        if (power == 0) {
            return number;
        }

        double result = 1;
        if (power > 0) {
            for (int i = 0; i < power; i++) {
                result = result * number;
            }
            return result;
        } else {
            for (int i = 0; i < -power; i++) {
                result = result * number;
            }
            return 1 / result;
        }

    }

}
