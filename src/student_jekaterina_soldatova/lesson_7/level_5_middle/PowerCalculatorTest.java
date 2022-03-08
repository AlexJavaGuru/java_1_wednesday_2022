package student_jekaterina_soldatova.lesson_7.level_5_middle;

class PowerCalculatorTest {
    public static void main(String[] args) {
        PowerCalculatorTest test = new PowerCalculatorTest();

        test.checkPowerPositive();
        test.checkPowerZero();
        test.checkPowerNegative();
        test.exponentiationPositive();
        test.exponentiationZero();
        test.exponentiationNegative();
    }

    void checkPowerPositive() {
        boolean realResult = PowerCalculator.checkPower(new int[]{2, 5});
        if (realResult) {
            System.out.println("checkPowerPositive = OK");
        } else {
            System.out.println("checkPowerPositive = FAIL");
        }
    }

    void checkPowerZero() {
        boolean realResult = PowerCalculator.checkPower(new int[]{2, 0});
        if (realResult) {
            System.out.println("checkPowerZero = OK");
        } else {
            System.out.println("checkPowerZero = FAIL");
        }
    }

    void checkPowerNegative() {
        boolean realResult = PowerCalculator.checkPower(new int[]{2, -5});
        if (!realResult) {
            System.out.println("checkPowerNegative = OK");
        } else {
            System.out.println("checkPowerNegative = FAIL");
        }
    }

    void exponentiationPositive() {
        int expectedResult = 8;
        int realResult = PowerCalculator.exponentiationPositive(new int[]{2, 3});
        if (expectedResult==realResult) {
            System.out.println("exponentiationPositive = OK");
        } else {
            System.out.println("exponentiationPositive = FAIL");
        }
    }


    void exponentiationZero() {
        int expectedResult = 1;
        int realResult = PowerCalculator.exponentiationPositive(new int[]{2, 0});
        if (expectedResult==realResult) {
            System.out.println("exponentiationZero = OK");
        } else {
            System.out.println("exponentiationZero = FAIL");
        }
    }

    void exponentiationNegative() {
        double expectedResult = 0.125;
        double realResult = PowerCalculator.exponentiationNegative(new int[]{2, -3});
        if (expectedResult==realResult) {
            System.out.println("exponentiationNegative = OK");
        } else {
            System.out.println("exponentiationNegative = FAIL");
            System.out.println(realResult);
        }
    }
}
