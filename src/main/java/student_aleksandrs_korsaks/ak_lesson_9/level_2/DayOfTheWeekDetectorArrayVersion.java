package student_aleksandrs_korsaks.ak_lesson_9.level_2;

import java.util.Arrays;

public class DayOfTheWeekDetectorArrayVersion implements DayOfTheWeekDetector {

    String[] names = getAnyEnumConstantsToArray(DaysOfWeek.class);


    public static String[] getAnyEnumConstantsToArray(Class<? extends Enum<?>> e) {
        return Arrays.stream(e.getEnumConstants()).map(Enum::name).toArray(String[]::new);
    }

    @Override
    public String detectDayName(int number) {
        if ((number <= 0) || (number > names.length)) {
            return "Please input a valid number between 1 and 7";
        }
        return names[number - 1];
    }
}
