package student_arturs_melnikovs.lesson_15.level_06;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {
    Customer customer;

    @BeforeEach
    void setUp() {
        customer = new Customer("Mike");
    }

    @Test
    public void testRegularFor1Day() {
        Movie movie = new Movie("TestMovie", Movie.REGULAR);
        customer.addRental(new Rental(movie,1));
        String expected = "Rental Record for Mike\n\tTestMovie\t2.0\nYou owed 2.0\nYou earned 1 frequent renter points\n";
        String actual = customer.statement();
        assertEquals(expected, actual);
    }
    @Test
    public void testRegularFor2Days() {
        Movie movie = new Movie("TestMovie", Movie.REGULAR);
        customer.addRental(new Rental(movie,2));
        String expected = "Rental Record for Mike\n\tTestMovie\t2.0\nYou owed 2.0\nYou earned 1 frequent renter points\n";
        String actual = customer.statement();
        assertEquals(expected, actual);
    }
    @Test
    public void testRegularFor3Days() {
        Movie movie = new Movie("TestMovie", Movie.REGULAR);
        customer.addRental(new Rental(movie,3));
        String expected = "Rental Record for Mike\n\tTestMovie\t3.5\nYou owed 3.5\nYou earned 1 frequent renter points\n";
        String actual = customer.statement();
        assertEquals(expected, actual);
    }
    @Test
    public void testRegularFor4Days() {
        Movie movie = new Movie("TestMovie", Movie.REGULAR);
        customer.addRental(new Rental(movie,4));
        String expected = "Rental Record for Mike\n\tTestMovie\t5.0\nYou owed 5.0\nYou earned 1 frequent renter points\n";
        String actual = customer.statement();
        assertEquals(expected, actual);
    }
    @Test
    public void testNewReleaseFor1Days() {
        Movie movie = new Movie("TestMovie", Movie.NEW_RELEASE);
        customer.addRental(new Rental(movie,1));
        String expected = "Rental Record for Mike\n\tTestMovie\t3.0\nYou owed 3.0\nYou earned 1 frequent renter points\n";
        String actual = customer.statement();
        assertEquals(expected, actual);
    }
    @Test
    public void testNewReleaseFor2Days() {
        Movie movie = new Movie("TestMovie", Movie.NEW_RELEASE);
        customer.addRental(new Rental(movie,2));
        String expected = "Rental Record for Mike\n\tTestMovie\t6.0\nYou owed 6.0\nYou earned 2 frequent renter points\n";
        String actual = customer.statement();
        assertEquals(expected, actual);
    }
    @Test
    public void testNewReleaseFor3Days() {
        Movie movie = new Movie("TestMovie", Movie.NEW_RELEASE);
        customer.addRental(new Rental(movie,3));
        String expected = "Rental Record for Mike\n\tTestMovie\t9.0\nYou owed 9.0\nYou earned 2 frequent renter points\n";
        String actual = customer.statement();
        assertEquals(expected, actual);
    }
    @Test
    public void testChildrenFor1Days() {
        Movie movie = new Movie("TestMovie", Movie.CHILDRENS);
        customer.addRental(new Rental(movie,1));
        String expected = "Rental Record for Mike\n\tTestMovie\t1.5\nYou owed 1.5\nYou earned 1 frequent renter points\n";
        String actual = customer.statement();
        assertEquals(expected, actual);
    }
    @Test
    public void testChildrenFor3Days() {
        Movie movie = new Movie("TestMovie", Movie.CHILDRENS);
        customer.addRental(new Rental(movie,3));
        String expected = "Rental Record for Mike\n\tTestMovie\t1.5\nYou owed 1.5\nYou earned 1 frequent renter points\n";
        String actual = customer.statement();
        assertEquals(expected, actual);
    }
    @Test
    public void testChildrenFor4Days() {
        Movie movie = new Movie("TestMovie", Movie.CHILDRENS);
        customer.addRental(new Rental(movie,4));
        String expected = "Rental Record for Mike\n\tTestMovie\t3.0\nYou owed 3.0\nYou earned 1 frequent renter points\n";
        String actual = customer.statement();
        assertEquals(expected, actual);
    }
    @Test
    public void testChildrenFor6Days() {
        Movie movie = new Movie("TestMovie", Movie.CHILDRENS);
        customer.addRental(new Rental(movie,6));
        String expected = "Rental Record for Mike\n\tTestMovie\t6.0\nYou owed 6.0\nYou earned 1 frequent renter points\n";
        String actual = customer.statement();
        assertEquals(expected, actual);
    }
    @Test
    public void testChildrenAndRegularFor4Days() {
        Movie movieChildren = new Movie("ChildrenMovie", Movie.CHILDRENS);
        Movie movieRegular = new Movie("RegularMovie", Movie.REGULAR);
        customer.addRental(new Rental(movieChildren,4));
        customer.addRental(new Rental(movieRegular,4));
        String expected = "Rental Record for Mike\n\tChildrenMovie\t3.0\n\tRegularMovie\t5.0\nYou owed 8.0\nYou earned 2 frequent renter points\n";
        String actual = customer.statement();
        assertEquals(expected, actual);
    }
    @Test
    public void testChildrenAndRegularFor2Days() {
        Movie movieChildren = new Movie("ChildrenMovie", Movie.CHILDRENS);
        Movie movieRegular = new Movie("RegularMovie", Movie.REGULAR);
        customer.addRental(new Rental(movieChildren,2));
        customer.addRental(new Rental(movieRegular,2));
        String expected = "Rental Record for Mike\n\tChildrenMovie\t1.5\n\tRegularMovie\t2.0\nYou owed 3.5\nYou earned 2 frequent renter points\n";
        String actual = customer.statement();
        assertEquals(expected, actual);
    }
    @Test
    public void testRegularFor4DaysAndNewReleaseFor1Day() {
        Movie movieChildren = new Movie("RegularMovie", Movie.REGULAR);
        Movie movieRegular = new Movie("NewRelease", Movie.NEW_RELEASE);
        customer.addRental(new Rental(movieChildren,4));
        customer.addRental(new Rental(movieRegular,1));
        String expected = "Rental Record for Mike\n\tRegularMovie\t5.0\n\tNewRelease\t3.0\nYou owed 8.0\nYou earned 2 frequent renter points\n";
        String actual = customer.statement();
        assertEquals(expected, actual);
    }
    @Test
    public void testRegularFor1DayAndNewReleaseFor4Days() {
        Movie movieChildren = new Movie("RegularMovie", Movie.REGULAR);
        Movie movieRegular = new Movie("NewRelease", Movie.NEW_RELEASE);
        customer.addRental(new Rental(movieChildren,1));
        customer.addRental(new Rental(movieRegular,4));
        String expected = "Rental Record for Mike\n\tRegularMovie\t2.0\n\tNewRelease\t12.0\nYou owed 14.0\nYou earned 3 frequent renter points\n";
        String actual = customer.statement();
        assertEquals(expected, actual);
    }
}