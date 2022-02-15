package student_jelena_boicova.lesson_4_homerwork;

public class StockTest {
    public static void main(String[] args) {

        Stock google;
        google.updatePrice(15);
        google.updatePrice(7);
        google.updatePrice(14);


        StockTest stockTest = new StockTest();
        priceInformation = google.getPriceInformation();
        System.out.println(priceInformation);
    }
    public void updatePrice() {
        int currentPrice = 14;
        int minPrice = 7;
        int maxPrice = 15;
        int expectedResult = 14;
        Stock google = new Stock();
        int realResult = stock.updatePrice (currentPrice, minPrice, maxPrice);
        if (realResult == expectedResult){

        }
    }
}


