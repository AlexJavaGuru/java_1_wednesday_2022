package student_arturs_melnikovs.lesson_09.level_04;

class TemperatureConverterTest {
    public static void main(String[] args) {
        TemperatureConverterTest tester = new TemperatureConverterTest();
        tester.testKelvinConverter();
        tester.testFahrenheitConverter();
    }

    public void testKelvinConverter() {
        TemperatureConverter converter = new KelvinConverter();
        double celsius = 10;
        double expectedResult = 283.15;
        double actualResult = converter.convert(celsius);
        checkResult(expectedResult, actualResult);
    }

    public void testFahrenheitConverter() {
        TemperatureConverter converter = new FahrenheitConverter();
        double celsius = 10;
        double expectedResult = 50;
        double actualResult = converter.convert(celsius);
        checkResult(expectedResult, actualResult);
    }
    private void checkResult(double expectedResult, double actualResult) {
        if (expectedResult == actualResult) {
            System.out.println("Test has passed");
        } else {
            System.out.println("Test has failed");
            System.out.println("Expected result was - " + expectedResult + ", actual result is - " + actualResult);
        }
    }
}
