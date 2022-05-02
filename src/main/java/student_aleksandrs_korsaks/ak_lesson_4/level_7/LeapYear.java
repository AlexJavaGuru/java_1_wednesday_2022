package student_aleksandrs_korsaks.ak_lesson_4.level_7;

class LeapYear {
    // variant 1 - main
    public boolean isLeapYear(int year) {

        if (year % 4 != 0) {
            return false;
        } else if (year % 100 != 0) {
            return true;
        } else return (year % 400 == 0);
    }

    // variant 2 - дополнительно, пытался придумать что-то другое, для более глубокого понимания логики
    public boolean isLeapYearTwo(int year) {
        if ((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0)) {
            return true;
        } else if ((year % 4 == 0) && (year % 100 == 0)) {
            return false;
        } else return (year % 4 == 0);
    }

    //    variant 3 из интернета :)
    public boolean isLeapYearThree(int year) {
        return (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
    }
}
