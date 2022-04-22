package student_aleksandrs_korsaks.ak_lesson_3.level_7;

class ProductDemo {
    public static void main(String[] args) {
        Product firstProduct = new Product("Iphone 13");
        firstProduct.regularPrice = 1500;
        firstProduct.discount = 36;
        firstProduct.actualPrice();
        firstProduct.printInformation();
    }
}
