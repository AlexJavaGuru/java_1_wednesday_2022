package student_aleksandrs_korsaks.ak_lesson_4.level_6;

class StockTest {
    public static void main(String[] args) {
        StockTest stockTest = new StockTest();

        stockTest.stockUpdatePriceTest();
        stockTest.stockUpdateSamePriceTest();
        stockTest.stockMaxOnCreationTest();
        stockTest.stockMinOnCreationTest();
        stockTest.stockMaxTest1();
        stockTest.stockMaxTest2();
        stockTest.stockMaxTest3();
        stockTest.stockMaxTest4();
        stockTest.stockMaxTest5();
        stockTest.stockMinTest1();
        stockTest.stockMinTest2();
        stockTest.stockMinTest3();
        stockTest.stockMinTest4();
        stockTest.stockMinTest5();
    }

    public void stockUpdatePriceTest() {
        Stock stock = new Stock("x", 999);
        stock.updatePrice(100);
        int expectedResult = 100;
        int realResult = stock.getCurrentPrice();
        checkTestResult("stockUpdatePriceTest", expectedResult, realResult);
    }

    public void stockUpdateSamePriceTest() {
        Stock stock = new Stock("x", 999);
        stock.updatePrice(999);
        int expectedResult = 999;
        int realResult = stock.getCurrentPrice();
        checkTestResult("stockUpdateSamePriceTest", expectedResult, realResult);
    }

    public void stockMaxOnCreationTest() {
        Stock stock = new Stock("x", 999);
        int expectedResult = 999;
        int realResult = stock.getMaxPrice();
        checkTestResult("stockMaxOnCreationTest", expectedResult, realResult);
    }

    public void stockMinOnCreationTest() {
        Stock stock = new Stock("x", 1);
        int expectedResult = 1;
        int realResult = stock.getMinPrice();
        checkTestResult("stockMinOnCreationTest", expectedResult, realResult);
    }

    public void stockMaxTest1() {
        Stock stock = new Stock("x", 999);
        stock.updatePrice(1);
        int expectedResult = 999;
        int realResult = stock.getMaxPrice();
        checkTestResult("stockMaxTest1", expectedResult, realResult);
    }

    public void stockMaxTest2() {
        Stock stock = new Stock("x", 999);
        stock.updatePrice(2);
        stock.updatePrice(1000);
        int expectedResult = 1000;
        int realResult = stock.getMaxPrice();
        checkTestResult("stockMaxTest2", expectedResult, realResult);
    }

    public void stockMaxTest3() {
        Stock stock = new Stock("x", 999);
        stock.updatePrice(2);
        stock.updatePrice(1000);
        stock.updatePrice(8);
        int expectedResult = 1000;
        int realResult = stock.getMaxPrice();
        checkTestResult("stockMaxTest3", expectedResult, realResult);
    }

    public void stockMaxTest4() {
        Stock stock = new Stock("x", 9);
        stock.updatePrice(27);
        int expectedResult = 27;
        int realResult = stock.getMaxPrice();
        checkTestResult("stockMaxTest4", expectedResult, realResult);
    }

    public void stockMaxTest5() {
        Stock stock = new Stock("x", 9);
        stock.updatePrice(27);
        stock.updatePrice(8);
        int expectedResult = 27;
        int realResult = stock.getMaxPrice();
        checkTestResult("stockMaxTest5", expectedResult, realResult);
    }

    public void stockMinTest1() {
        Stock stock = new Stock("x", 999);
        stock.updatePrice(1);
        int expectedResult = 1;
        int realResult = stock.getMinPrice();
        checkTestResult("stockMinTest1", expectedResult, realResult);
    }

    public void stockMinTest2() {
        Stock stock = new Stock("x", 999);
        stock.updatePrice(2);
        stock.updatePrice(1000);
        int expectedResult = 2;
        int realResult = stock.getMinPrice();
        checkTestResult("stockMinTest2", expectedResult, realResult);
    }

    public void stockMinTest3() {
        Stock stock = new Stock("x", 999);
        stock.updatePrice(2);
        stock.updatePrice(1000);
        stock.updatePrice(8);
        int expectedResult = 2;
        int realResult = stock.getMinPrice();
        checkTestResult("stockMinTest3", expectedResult, realResult);
    }

    public void stockMinTest4() {
        Stock stock = new Stock("x", 27);
        stock.updatePrice(9);
        int expectedResult = 9;
        int realResult = stock.getMinPrice();
        checkTestResult("stockMinTest4", expectedResult, realResult);
    }

    public void stockMinTest5() {
        Stock stock = new Stock("x", 27);
        stock.updatePrice(9);
        stock.updatePrice(28);
        int expectedResult = 9;
        int realResult = stock.getMinPrice();
        checkTestResult("stockMinTest5", expectedResult, realResult);
    }

    public void checkTestResult(String testName, int expectedResult, int realResult) {
        if (realResult == expectedResult) {
            System.out.println("\"" + testName + "\"" + " test = OK");
        } else {
            System.out.println("\"" + testName + "\"" + " test = FAIL");
        }
    }
}
