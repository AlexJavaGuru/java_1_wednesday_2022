package student_jekaterina_soldatova.lesson_4.middle;

import java.util.Objects;

class StockTest {
    public static void main(String[] args) {
        StockTest stock = new StockTest();

        stock.stockTestALot();
    }

    void stockTestALot() {
        int wavelength = 10;
        String expectedResult = "Company = \"GOOG\", Current Price = 77, Min Price = 5, Max Price = 99";
        Stock stock = new Stock("GOOG", 10);
        stock.updatePrice(12);
        stock.updatePrice(5);
        stock.updatePrice(7);
        stock.updatePrice(99);
        stock.updatePrice(77);

        String realResult = stock.getPriceInformation();
        if (Objects.equals(realResult, expectedResult)) {
            System.out.println("10 -> 12 -> 5 -> 7 -> 99 -> 77 test = OK");
        } else {
            System.out.println("10 -> 12 -> 5 -> 7 -> 99 -> 77 test = FAIL");
        }
    }
}
