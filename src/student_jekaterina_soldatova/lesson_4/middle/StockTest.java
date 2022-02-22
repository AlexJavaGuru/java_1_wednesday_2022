package student_jekaterina_soldatova.lesson_4.middle;

import java.util.Objects;

class StockTest {
    public static void main(String[] args) {
        StockTest stock = new StockTest();

        stock.stockTestALot();
        stock.stockTest999();
        stock.stockTest999To1();
        stock.stockTest999ALotTo8();
    }

    void stockTestALot() {
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

    void stockTest999() {
        String expectedResult = "Company = \"GOOG\", Current Price = 999, Min Price = 999, Max Price = 999";
        Stock stock = new Stock("GOOG", 999);

        String realResult = stock.getPriceInformation();
        if (Objects.equals(realResult, expectedResult)) {
            System.out.println("999 test = OK");
        } else {
            System.out.println("999 test = FAIL");
        }
    }

    void stockTest999To1() {
        String expectedResult = "Company = \"GOOG\", Current Price = 1, Min Price = 1, Max Price = 999";
        Stock stock = new Stock("GOOG", 999);

        stock.updatePrice(1);

        String realResult = stock.getPriceInformation();
        if (Objects.equals(realResult, expectedResult)) {
            System.out.println("999 to 1 test = OK");
        } else {
            System.out.println("999 to 1 test = FAIL");
        }
    }

    void stockTest999ALotTo8() {
        String expectedResult = "Company = \"GOOG\", Current Price = 8, Min Price = 2, Max Price = 1000";
        Stock stock = new Stock("GOOG", 999);

        stock.updatePrice(2);
        stock.updatePrice(1000);
        stock.updatePrice(8);

        String realResult = stock.getPriceInformation();
        if (Objects.equals(realResult, expectedResult)) {
            System.out.println("999 -> 2 -> 1000 -> 8 test = OK");
        } else {
            System.out.println("999 -> 2 -> 1000 -> 8 test = FAIL");
        }
    }
}
