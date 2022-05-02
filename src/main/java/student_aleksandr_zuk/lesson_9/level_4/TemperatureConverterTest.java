package student_aleksandr_zuk.lesson_9.level_4;

class TemperatureConverterTest {

    public static void main(String[] args) {

        TemperatureConverterTest test = new TemperatureConverterTest();
        test.kelvinTest();
        test.fahrenheitTest();

    }

    public void checkResult(double actualResult, double expectedResult, String testName) {
        if (actualResult == expectedResult) {
            System.out.println(testName + " = OK");
        } else System.out.println(testName + " = FAIL");
    }

    public void kelvinTest() {
        KelvinConverter kelvinConverter = new KelvinConverter();
        double actualResult = kelvinConverter.convert(10);
        double expectedResult = 283.15;
        checkResult(actualResult, expectedResult, "Kelvin test");
    }
    public void fahrenheitTest() {
        FahrenheitConverter fahrenheitConverter = new FahrenheitConverter();
        double actualResult = fahrenheitConverter.convert(10);
        double expectedResult = 50;
        checkResult(actualResult, expectedResult, "Fahrenheit test");
    }
}
