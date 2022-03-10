package student_andrejs_saldavs.lesson_06.level_2;

class DayOfTheWeekDetectorTest {


    public static void main(String[] args) {
        DayOfTheWeekDetectorTest dayOfTheWeekDetectorTest = new DayOfTheWeekDetectorTest();
        dayOfTheWeekDetectorTest.isMondayTest();
        dayOfTheWeekDetectorTest.isTuesdayTest();
        dayOfTheWeekDetectorTest.isWednesdayTest();
        dayOfTheWeekDetectorTest.isThursdayTest();
        dayOfTheWeekDetectorTest.isFridayTest();
        dayOfTheWeekDetectorTest.isSaturdayTest();
        dayOfTheWeekDetectorTest.isSundayTest();
    }

        public void isMondayTest() {
            String expectedResult = "Monday";
            DayOfTheWeekDetector detector = new DayOfTheWeekDetector();

            String actualResult = detector.findDayOfTheWeek(1);
            checkResult(expectedResult, actualResult, "Monday Test");

        }

        public void isTuesdayTest() {
            String expectedResult = "Tuesday";
            DayOfTheWeekDetector detector = new DayOfTheWeekDetector();

            String actualResult = detector.findDayOfTheWeek(2);
            checkResult(expectedResult, actualResult, "Tuesday Test");

        }

        public void isWednesdayTest() {
            String expectedResult = "Wednesday";
            DayOfTheWeekDetector detector = new DayOfTheWeekDetector();

            String actualResult = detector.findDayOfTheWeek(3);
            checkResult(expectedResult, actualResult, "Wednesday Test");

        }

        public void isThursdayTest() {
            String expectedResult = "Thursday";
            DayOfTheWeekDetector detector = new DayOfTheWeekDetector();

            String actualResult = detector.findDayOfTheWeek(4);
            checkResult(expectedResult, actualResult, "Thursday Test");

        }

        public void isFridayTest() {
            String expectedResult = "Friday";
            DayOfTheWeekDetector detector = new DayOfTheWeekDetector();

            String actualResult = detector.findDayOfTheWeek(5);
            checkResult(expectedResult, actualResult, "Friday Test");

        }

        public void isSaturdayTest() {
            String expectedResult = "Saturday";
            DayOfTheWeekDetector detector = new DayOfTheWeekDetector();

            String actualResult = detector.findDayOfTheWeek(6);
            checkResult(expectedResult, actualResult, "Saturday Test");

        }

        public void isSundayTest() {
            String expectedResult = "Sunday";
            DayOfTheWeekDetector detector = new DayOfTheWeekDetector();

            String actualResult = detector.findDayOfTheWeek(7);
            checkResult(expectedResult, actualResult, "Sunday Test");

        }

        private void checkResult(String expectedResult, String actualResult, String testName) {
            if (expectedResult == actualResult) {
                System.out.println(testName + " has passed!");
            } else {
                System.out.println(testName + " has failed! Expected result was " + expectedResult + " but actual is " + actualResult);
            }
        }

}
