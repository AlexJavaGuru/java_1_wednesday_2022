package student_aleksandr_zuk.lesson_9.level_4;

class FahrenheitConverter implements TemperatureConverter {
    @Override
    public double convert(double celsiusTemperature) {
        return 1.8 * celsiusTemperature +32;
    }
}
