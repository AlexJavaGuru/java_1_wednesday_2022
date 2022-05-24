package student_jekaterina_soldatova.lesson_09.level_4_junior;

class TemperatureConverterTest {
    public static void main(String[] args) {
        TemperatureConverterTest test = new TemperatureConverterTest();

        test.Celsius();
        test.Kelvin();
        test.Fahrenheit();
    }

    void Celsius() {
        CelsiusConverter celsiusConverter = new CelsiusConverter();
        double expectedResult = 21.5;
        double realResult = celsiusConverter.convert(21.5);

        if (expectedResult == realResult) {
            System.out.println("Celsius - ok");
        } else {
            System.out.println("Celsius - fail");
        }
    }

    void Kelvin() {
        KelvinConverter kelvinConverter = new KelvinConverter();
        double expectedResult = 268.15;
        double realResult = kelvinConverter.convert(-5.0);

        if (expectedResult == realResult) {
            System.out.println("Kelvin - ok");
        } else {
            System.out.println("Kelvin - fail");
        }
    }

    void Fahrenheit() {
        FahrenheitConverter fahrenheitConverter = new FahrenheitConverter();
        double expectedResult = 23.0;
        double realResult = fahrenheitConverter.convert(-5.0);

        if (expectedResult == realResult) {
            System.out.println("Fahrenheit - ok");
        } else {
            System.out.println("Fahrenheit - fail");
        }
    }
}
