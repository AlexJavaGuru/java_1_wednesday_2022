package student_igors.lesson_3.level_7;

public class ProductDemo {
    public static void main(String[] args) {
        Product product = new Product("Orange", 1.2, 10.0);

        double regularPrice = 1.2;
        double discount = (1.2 * 10) / 100;
        double result = (regularPrice - discount);


        System.out.println("Result actual price is: " + result + " EUR");

    }
}
