package student_andrejs_saldavs.lesson_04.level_6;

class StockTest {

    public static void main(String[] args) {
        StockTest test = new StockTest();

        test.testCurrentPrice();
        test.testMinPrice();
        test.testMaxPrice();
    }

    void testMaxPrice() {
        Stock test = new Stock("test", 10);
        test.updatePrice(15);
        test.updatePrice(7);
        test.updatePrice(80);
        test.updatePrice(61);
        int expectedResult = 80;
        int actualResult = test.getMaxPrice();
        checkResult(expectedResult, actualResult, "Max price test");
    }
    void testMinPrice() {
        Stock test = new Stock("test", 10);
        test.updatePrice(15);
        test.updatePrice(7);
        test.updatePrice(80);
        test.updatePrice(61);
        int expectedResult = 7;
        int actualResult = test.getMinPrice();
        checkResult(expectedResult, actualResult, "Min price test");
    }
    void testCurrentPrice() {
        Stock test = new Stock("test", 10);
        test.updatePrice(15);
        test.updatePrice(7);
        test.updatePrice(80);
        test.updatePrice(61);
        int expectedResult = 61;
        int actualResult = test.getCurrentPrice();
        checkResult(expectedResult, actualResult, "Current price test");
    }

    void checkResult(int expectedResult, int actualResult, String testName) {
        if(expectedResult == actualResult) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " has failed");
            System.out.println("Expected result was " + expectedResult + ", but actual result is " + actualResult);
        }
    }

}
