package student_aleksandrs_jakovenko.lesson_4.level_6;

class StockDemo {
    public static void main(String[] args) {
        Stock google = new Stock("Google", 10);
        String priceInformation = google.getPriceInformation();
        System.out.println(priceInformation);
        google.updatePrice(15);
//        google.updatePrice(7);
//        google.updatePrice(14);
        priceInformation = google.getPriceInformation();
        System.out.println(priceInformation);
    }
}
