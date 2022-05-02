package student_aleksandrs_jakovenko.lesson_4.level_6;

class StockTest {
    public static void main(String[] args) {
        StockTest stockTest = new StockTest();
        stockTest.currentPriceTest();
        stockTest.minPriceTest();
        stockTest.maxPriceTest();
    }

    public void currentPriceTest(){
        Stock stock = new Stock("Google", 10);
        stock.updatePrice(10);
        stock.updatePrice(12);
        stock.updatePrice(5);
        stock.updatePrice(7);
        stock.updatePrice(99);
        stock.updatePrice(77);
        int expectedResult = 77;
        int realResult = stock.getCurrentPrice();
        if (realResult == expectedResult) {
            System.out.println("Current price test = OK");
        } else {
            System.out.println("Current price test = FAIL");
        }
    }

    public void minPriceTest(){
        Stock stock = new Stock("Google", 10);
        stock.updatePrice(10);
        stock.updatePrice(12);
        stock.updatePrice(5);
        stock.updatePrice(7);
        stock.updatePrice(99);
        stock.updatePrice(77);
        int expectedResult = 5;
        int realResult = stock.getMinPrice();
        if (realResult == expectedResult) {
            System.out.println("Minimal price test = OK");
        } else {
            System.out.println("Minimal price test = FAIL");
        }
    }

    public void maxPriceTest(){
        Stock stock = new Stock("Google", 10);
        stock.updatePrice(10);
        stock.updatePrice(12);
        stock.updatePrice(5);
        stock.updatePrice(7);
        stock.updatePrice(99);
        stock.updatePrice(77);
        int expectedResult = 99;
        int realResult = stock.getMaxPrice();
        if (realResult == expectedResult) {
            System.out.println("Max price test = OK");
        } else {
            System.out.println("Max price test = FAIL");
        }
    }
}
