package student_igors.lesson_3.level_7;

public class ProductDemo {
    public static void main(String[] args) {
        Product product = new Product("Orange", 1.2, 10.0);

        Product orange = new Product();
        orange.setRegularPrice(1.20);
        orange.setDiscount(0.12);
        orange.printInformation();
  

    }
}
