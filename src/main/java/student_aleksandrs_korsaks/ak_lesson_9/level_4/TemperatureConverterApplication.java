package student_aleksandrs_korsaks.ak_lesson_9.level_4;

import java.util.Scanner;

class TemperatureConverterApplication {

    static final double TEMPERATURE = 25.00;


    public static void main(String[] args) {

        TemperatureConverter temperatureConverter;

        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                Please make you choice:
                1) Show temperature in Kelvin;\s
                2) Show temperature in Fahrenheit\s
                3) Show temperature in Celsius""");
        int choice = scanner.nextInt();

        temperatureConverter = switch (choice) {
            case 1 -> new KelvinConverter();
            case 2 -> new FahrenheitConverter();
            default -> new CelsiusConverter();
        };

        TemperatureConverterContext temperatureConverterContext = new TemperatureConverterContext(temperatureConverter);
        System.out.println(temperatureConverterContext.makeConversion(TEMPERATURE));
    }
}
