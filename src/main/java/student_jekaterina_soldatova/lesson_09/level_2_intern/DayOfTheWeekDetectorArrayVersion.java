package student_jekaterina_soldatova.lesson_09.level_2_intern;

class DayOfTheWeekDetectorArrayVersion implements DayOfTheWeekDetector {

    @Override
    public String detectDayName(int number) {
        String[] week = createArray();
        for (int i = 1; i < 8; i++) {
            if (number == i) {
                return week[i];
            }
        }
        return week[0];
    }

    String[] createArray() {
        return new String[]{
                "Please input a valid number between 1 and 7",
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday"};
    }

}