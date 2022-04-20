package student_arturs_melnikovs.lesson_04.level_06;

class StockDemo {
    public static void main(String[] args) {
        Stock google = new Stock("Google", 1000);
        google.getPriceInformation();

        google.updatePrice(900);
        google.getPriceInformation();
        google.updatePrice(1200);
        google.getPriceInformation();
    }
}
