package student_jelena_boicova.lesson_4_homerwork;

public class StockTest {

    public static void main(String[] args) {
        Stock google = new Stock("Google", 10);
        String priceInformation = google.getPriceInformation();
        System.out.println(priceInformation);
        google.updatePrice(15);
        google.updatePrice(7);
        google.updatePrice(14);
        priceInformation = google.getPriceInformation();
        System.out.println(priceInformation);

        StockTest stockTest = new StockTest();
        stockTest.currentPriceTest();
        stockTest.minPriceTest();
        stockTest.maxPriceTest();
    }

    public void currentPriceTest() {
        Stock stock = new Stock("Google", 10);
        stock.updatePrice(10);
        stock.updatePrice(12);
        stock.updatePrice(5);
        stock.updatePrice(7);
        stock.updatePrice(99);
        stock.updatePrice(77);
        int expectedResult = 77;
        int realResult = stock.getCurrentPrice();
        if (realResult == expectedResult){
            System.out.println("Current price test is OK");
        } else
            System.out.println("Current price test is WRONG");
    }

    public void minPriceTest() {
        Stock stock = new Stock("Google", 10);
        stock.updatePrice(10);
        stock.updatePrice(12);
        stock.updatePrice(5);
        stock.updatePrice(7);
        stock.updatePrice(99);
        stock.updatePrice(77);
        int expectedResult = 5;
        int realResult = stock.getMinPrice();
        if (realResult == expectedResult){
            System.out.println("Current price test is OK");
        } else
            System.out.println("Current price test is WRONG");
    }

    public void maxPriceTest() {
        Stock stock = new Stock("Google", 10);
        stock.updatePrice(10);
        stock.updatePrice(12);
        stock.updatePrice(5);
        stock.updatePrice(7);
        stock.updatePrice(99);
        stock.updatePrice(77);
        int expectedResult = 99;
        int realResult = stock.getMaxPrice();
        if (realResult == expectedResult){
            System.out.println("Current price test is OK");
        } else
            System.out.println("Current price test is WRONG");
    }
}