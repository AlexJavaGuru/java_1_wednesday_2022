package student_alex_stranger.lesson_4.level_6;

class StockDemo {

    public static void main(String[] args) {
        Stock google = new Stock("Google", 10);
        google.getPriceInformation();

        google.updatePrice(15);
        google.getPriceInformation();
        google.updatePrice(7);
        google.getPriceInformation();
        google.updatePrice(14);
        google.getPriceInformation();




    }
}
