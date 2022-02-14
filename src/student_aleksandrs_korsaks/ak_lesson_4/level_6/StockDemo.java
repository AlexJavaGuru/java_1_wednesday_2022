package student_aleksandrs_korsaks.ak_lesson_4.level_6;

class StockDemo {
    public static void main(String[] args) {

        Stock google = new Stock("GOOGLE", 10);
        String priceInformation = google.getPriceInformation();
        System.out.println(priceInformation);

        google.updatePrice(8);
        google.updatePrice(19);
        google.updatePrice(10);

        priceInformation = google.getPriceInformation();
        System.out.println(priceInformation);
    }
}
