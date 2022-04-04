package student_aleksandr_zuk.lesson_7.level_5;

class PowerCalculator {

    public double numberToPower(int number, int power){
        double result = 1;
        if (power > 0) {
            for (int i = 0; i < power; i++) {
                result = result * number;
            }
            return result;
        } else if (power < 0){
            for (int i = 0; i < power * -1; i++) {
                result = result * number;
            }
            return 1 / result;
        } else return 1;
    }
}
