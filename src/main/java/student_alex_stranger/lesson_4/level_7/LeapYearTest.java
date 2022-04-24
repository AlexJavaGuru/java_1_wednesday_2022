package student_alex_stranger.lesson_4.level_7;

class LeapYearTest {

    public static void main(String[] args) {
        LeapYearTest leapYearTest = new LeapYearTest();
        leapYearTest.notDevideByFourTest();
        leapYearTest.devideByFourAndNotDevideByHundredTest();
        leapYearTest.milleniumTest();
        leapYearTest.notMilleniumTest();
    }
    public void notDevideByFourTest() {
        LeapYear leapYear = new LeapYear();
        boolean actualResult = leapYear.isLeapYear(1800);
        boolean expectedResult = false;
        if (actualResult == expectedResult) {
            System.out.println("Not devide by four test = OK");
        } else {
            System.out.println("Not devide by four test = FAIL");
        }
    }
    public void devideByFourAndNotDevideByHundredTest() {
        LeapYear leapYear = new LeapYear();
        boolean actualResult = leapYear.isLeapYear(1980);
        boolean expectedResult = true;
        if (actualResult == expectedResult) {
           System.out.println("Devide by four and not devide by hundred test = OK");
        } else {
            System.out.println("Devide by four and not devide by hundred test = FAIL");
        }
    }
    public void milleniumTest() {
        LeapYear leapYear = new LeapYear();
        boolean actualResult = leapYear.isLeapYear(2000);
        boolean expectedResult = true;
        if (actualResult == expectedResult) {
            System.out.println("Millenium test = OK");
        } else {
            System.out.println("Millenium test = FAIL");
        }
    }
    public void notMilleniumTest() {
        LeapYear leapYear = new LeapYear();
        boolean actualResult = leapYear.isLeapYear(2005);
        boolean expectedResult = false;
        if (actualResult == expectedResult) {
            System.out.println("Not millenium test = OK");
        } else {
            System.out.println("Not millenium test = FAIL");
        }
    }
}
