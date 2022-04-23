package student_aleksandrs_korsaks.ak_lesson_9.level_4;

class TemperatureConverterContext {
    
    TemperatureConverter temperatureConverter;

    public TemperatureConverterContext(TemperatureConverter temperatureConverter) {
        this.temperatureConverter = temperatureConverter;
    }

    double makeConversion(double celsiusTemperature){
        return temperatureConverter.convert(celsiusTemperature);
    }
}
