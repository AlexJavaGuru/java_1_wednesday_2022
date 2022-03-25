package student_aleksandrs_jakovenko.lesson_9.level_4;

import java.util.Optional;

class TemperatureConverterTest {

    public static void main(String[] args) {

        TemperatureConverterTest test = new TemperatureConverterTest();
        test.kelvinTest();
        test.FahrenheitTest();
    }

    public void kelvinTest () {
        KelvinConverter kelvinConverter = new KelvinConverter();
        double actualResult = kelvinConverter.convert(30);
        double expectedResult = 303.15;
        checkResult(actualResult, expectedResult, "Kelvin test");
    }

    public void FahrenheitTest () {
        FahrenheitConverter fahrenheitConverter = new FahrenheitConverter();
        double actualResult = fahrenheitConverter.convert(30);
        double expectedResult = 86;
        checkResult(actualResult, expectedResult, "Fahrenheit test");
    }

    public void checkResult(double actualResult, double expectedResult, String testName) {
        if (actualResult == expectedResult) {
            System.out.println(testName + " = OK");
        } else System.out.println(testName + " = FAIL");
    }
}
