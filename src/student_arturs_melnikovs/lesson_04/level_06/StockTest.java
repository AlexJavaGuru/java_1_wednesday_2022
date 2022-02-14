package student_arturs_melnikovs.lesson_04.level_06;

public class StockTest {
    public static void main(String[] args) {
        StockTest test = new StockTest();

        test.testCurrentPrice();
        test.testMinPrice();
        test.testMaxPrice();
    }

    void testMaxPrice() {
        Stock test = new Stock("test", 10);
        test.updatePrice(12);
        test.updatePrice(5);
        test.updatePrice(99);
        test.updatePrice(77);
        int expectedResult = 99;
        int actualResult = test.getMaxPrice();
        checkResult(expectedResult, actualResult, "Max price test");
    }
    void testMinPrice() {
        Stock test = new Stock("test", 10);
        test.updatePrice(12);
        test.updatePrice(5);
        test.updatePrice(99);
        test.updatePrice(77);
        int expectedResult = 5;
        int actualResult = test.getMinPrice();
        checkResult(expectedResult, actualResult, "Min price test");
    }
    void testCurrentPrice() {
        Stock test = new Stock("test", 10);
        test.updatePrice(12);
        test.updatePrice(5);
        test.updatePrice(99);
        test.updatePrice(77);
        int expectedResult = 77;
        int actualResult = test.getCurrentPrice();
        checkResult(expectedResult, actualResult, "Current price test");
    }

    void checkResult(int expectedResult, int actualResult, String testName) {
        if(expectedResult == actualResult) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " has failed");
            System.out.println("Expected result was " + expectedResult + ", actual result is " + actualResult);
        }
    }
}
