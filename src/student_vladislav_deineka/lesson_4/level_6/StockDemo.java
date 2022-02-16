package student_vladislav_deineka.lesson_4.level_6;

class StockDemo {
    public static void main(String[] args) {
        Stock amazon = new Stock("Amazon", 50000);
        amazon.getPriceInformation();

        amazon.updatePrice(49999);
        amazon.getPriceInformation();
        amazon.updatePrice(50500);
        amazon.getPriceInformation();
    }
}
