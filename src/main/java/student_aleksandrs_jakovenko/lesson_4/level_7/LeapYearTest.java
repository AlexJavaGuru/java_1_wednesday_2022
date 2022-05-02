package student_aleksandrs_jakovenko.lesson_4.level_7;

class LeapYearTest {
    public static void main(String[] args) {
        LeapYearTest leapYearTest = new LeapYearTest();
        leapYearTest.notFourTest();
        leapYearTest.fourAndHundredTest();
        leapYearTest.centuryTest();
        leapYearTest.notCenturyTest();
    }
    public void notFourTest(){
        LeapYear leapYear = new LeapYear();
        boolean actualResult = leapYear.isLeapYear(2001);
        boolean expectedResult = false;
        if (actualResult == expectedResult) {
            System.out.println("%4 != 0 test = OK");
        } else {
            System.out.println("4% != 0 test = FAIL");
        }
    }
    public void fourAndHundredTest(){
        LeapYear leapYear = new LeapYear();
        boolean actualResult = leapYear.isLeapYear(2004);
        boolean expectedResult = true;
        if (actualResult == expectedResult) {
            System.out.println("4 and 100 test = OK");
        } else {
            System.out.println("4 and 100 test = FAIL");
        }
    }
    public void centuryTest(){
        LeapYear leapYear = new LeapYear();
        boolean actualResult = leapYear.isLeapYear(2000);
        boolean expectedResult = true;
        if (actualResult == expectedResult) {
            System.out.println("Century test = OK");
        } else {
            System.out.println("Century test = FAIL");
        }
    }
    public void notCenturyTest(){
        LeapYear leapYear = new LeapYear();
        boolean actualResult = leapYear.isLeapYear(2100);
        boolean expectedResult = false;
        if (actualResult == expectedResult) {
            System.out.println("Not Century test = OK");
        } else {
            System.out.println("Not Century test = FAIL");
        }
    }
}
