package student_aleksandrs_jakovenko.lesson_3.level_7;

class ProductDemo {
    public static void main(String[] args) {
        Product product = new Product("Juice");

        product.regularPrice = 1.15;
        product.discount = 0.3;
        product.actualPrice();
        double actualResult = product.actualPrice();
        double discountPercent = product.getDiscount(product.discount);
        product.printInformation();
        System.out.println("Actual product price is: " + actualResult);
    }
}
