package student_jekaterina_soldatova.lesson_4.middle;

class StockDemo {
    public static void main(String[] args) {
        Stock google = new Stock("GOOG", 10);
        String priceInformation = google.getPriceInformation();
        System.out.println(priceInformation);

        google.updatePrice(15);
        google.updatePrice(7);
        google.updatePrice(14);


        priceInformation = google.getPriceInformation();
        System.out.println(priceInformation);
    }
}
