package student_aleksandrs_korsaks.ak_lesson_9.level_4;

class TemperatureConverterTest {
    public static void main(String[] args) {
        TemperatureConverterTest temperatureConverterTest = new TemperatureConverterTest();
        temperatureConverterTest.fahrenheitConverterTest();
        temperatureConverterTest.kelvinConverterTest();

    }

    public void fahrenheitConverterTest() {
        TemperatureConverter fahrenheitConverter = new FahrenheitConverter();
        double expectedResult = 50;
        double realResult = fahrenheitConverter.convert(10);
        checkTestResult("FahrenheitConverterTest", expectedResult == realResult);
    }

    public void kelvinConverterTest() {
        TemperatureConverter kelvinConverter = new KelvinConverter();
        double expectedResult = 283.15;
        double realResult = kelvinConverter.convert(10);
        checkTestResult("KelvinConverterTest", expectedResult == realResult);
    }

    public void checkTestResult(String testName, boolean condition) {
        if (condition) {
            System.out.println("'" + testName + "'" + " test is OK");
        } else {
            System.out.println("'" + testName + "'" + " test is FAIL");
        }
    }
}
