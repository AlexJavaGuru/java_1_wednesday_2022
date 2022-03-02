package student_andrejs_saldavs.lesson_04.level_6;

class StockDemo {

    public static void main(String[] args) {
        Stock google = new Stock("Google", 500);
        google.getPriceInformation();

        google.updatePrice(850);
        google.getPriceInformation();
        google.updatePrice(300);
        google.getPriceInformation();
        google.updatePrice(700);
        google.getPriceInformation();
    }

}
