package student_vladislav_deineka.lesson_4.level_6;

class StockTest {
    public static void main(String[] args) {
        StockTest test = new StockTest();

        test.testActualPrice();
        test.testMinPrice();
        test.testMaxPrice();
    }

    void testActualPrice() {
        Stock test = new Stock("company", 5);
        test.updatePrice(7);
        test.updatePrice(4);
        test.updatePrice(12);
        test.updatePrice(10);
        int expectedResult = 10;
        int actualResult = test.getActualPrice();
        checkResult(expectedResult, actualResult, "Actual price test");

    }

    void testMinPrice() {
        Stock test = new Stock("company", 5);
        test.updatePrice(7);
        test.updatePrice(4);
        test.updatePrice(12);
        test.updatePrice(10);
        int expectedResult = 4;
        int actualResult = test.getMinPrice();
        checkResult(expectedResult, actualResult, "Minimal price test");
    }

    void testMaxPrice() {
        Stock test = new Stock("company", 5);
        test.updatePrice(7);
        test.updatePrice(4);
        test.updatePrice(12);
        test.updatePrice(10);
        int expectedResult = 12;
        int actualResult = test.getMaxPrice();
        checkResult(expectedResult, actualResult, "Maximal price test");

    }

    void checkResult(int expectedResult, int actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " has failed");
            System.out.println("Expected result was " + expectedResult + ", actual result is " + actualResult);
        }
    }
}
