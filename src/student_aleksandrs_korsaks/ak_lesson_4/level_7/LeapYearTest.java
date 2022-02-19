package student_aleksandrs_korsaks.ak_lesson_4.level_7;

class LeapYearTest {

    public static void main(String[] args) {
        LeapYearTest leapYearTest = new LeapYearTest();
        leapYearTest.isCommonYearDiv4();
        leapYearTest.isLeapYearDiv4NotDiv100();
        leapYearTest.isCommonYearDiv4And100NotDiv400();
        leapYearTest.isCommonYearDiv4And100And400();
    }

    public void isCommonYearDiv4() {
        LeapYear leapYear = new LeapYear();
        int year = 300;
        boolean realResult = !leapYear.isLeapYear(year);
        checkTestResult("isCommonYearDiv4", realResult);
    }

    public void isLeapYearDiv4NotDiv100() {
        LeapYear leapYear = new LeapYear();
        int year = 404;
        boolean realResult = leapYear.isLeapYear(year);
        checkTestResult("isLeapYearDiv4NotDiv100", realResult);
    }

    public void isCommonYearDiv4And100NotDiv400() {
        LeapYear leapYear = new LeapYear();
        int year = 500;
        boolean realResult = !leapYear.isLeapYear(year);
        checkTestResult("isCommonYearDiv4And100NotDiv400", realResult);
    }

    public void isCommonYearDiv4And100And400() {
        LeapYear leapYear = new LeapYear();
        int year = 400;
        boolean realResult = leapYear.isLeapYear(year);
        checkTestResult("isCommonYearDiv4And100And400", realResult);
    }

    public void checkTestResult(String testName, boolean realResult) {
        if (realResult) {
            System.out.println("\"" + testName + "\"" + " test = OK");
        } else {
            System.out.println("\"" + testName + "\"" + " test = FAIL");
        }
    }
}
