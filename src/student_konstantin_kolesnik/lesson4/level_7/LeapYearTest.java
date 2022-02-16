package student_konstantin_kolesnik.lesson4.level_7;

class LeapYearTest {

    public static void main(String[] args) {
        LeapYearTest test = new LeapYearTest();
        test.shouldBeRegularYearIfNotDevidedBy4();
        test.shouldBeLeapYearIfDevidedBy4AndNotDevidedBy100();
        test.shouldBeLeapYearIfDevidedBy4AndDevidedBy100AndDividedBy400();
        test.shouldBeRegularYearIfDevidedBy4AndDevidedBy100AndNotDividedBy400();
    }

    void shouldBeRegularYearIfNotDevidedBy4() {
        LeapYear leapYear = new LeapYear();
        checkResults(!leapYear.isLeapYear(2), "shouldBeRegularYearIfNotDevidedBy4");
    }

    void shouldBeLeapYearIfDevidedBy4AndNotDevidedBy100() {
        LeapYear leapYear = new LeapYear();
        checkResults(leapYear.isLeapYear(80), "shouldBeLeapYearIfDevidedBy4AndNotDevidedBy100");
    }

    void shouldBeLeapYearIfDevidedBy4AndDevidedBy100AndDividedBy400() {
        LeapYear leapYear = new LeapYear();
        checkResults(leapYear.isLeapYear(400), "shouldBeLeapYearIfDevidedBy4AndDevidedBy100AndDividedBy400");
    }

    void shouldBeRegularYearIfDevidedBy4AndDevidedBy100AndNotDividedBy400() {
        LeapYear leapYear = new LeapYear();
        checkResults(!leapYear.isLeapYear(500), "shouldBeRegularYearIfDevidedBy4AndDevidedBy100AndNotDividedBy400");
    }

    void checkResults(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }

}
