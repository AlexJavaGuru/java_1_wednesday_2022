package student_aleksejs_iljins.lesson_04.level_6;

public class StockDemo {
    public static void main(String[] args) {

        Stock google = new Stock ("GOOG", 10);
        String priceInformation = google.getPriceInformation();

        System.out.println(priceInformation);

        google.updatePrice(15);
        google.updatePrice(7);
        google.updatePrice(14);

        priceInformation = google.getPriceInformation();
        System.out.println(priceInformation);
    }
}
