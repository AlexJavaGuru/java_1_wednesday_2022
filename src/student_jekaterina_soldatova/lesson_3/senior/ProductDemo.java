package student_jekaterina_soldatova.lesson_3.senior;

import java.util.Scanner;

class ProductDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the name of a product:");
        String productName = scanner.nextLine();
        System.out.println("Please enter price of the product");
        double regularPrice = scanner.nextDouble();
        System.out.println("Please enter the discount in percents (ex. 25)");
        int discount = scanner.nextInt();

        Product productPrice = new Product(productName);
        double actualPrice = productPrice.actualPrice(regularPrice, discount);
        System.out.println("Actual price of the " + productName + " is " + actualPrice);
    }
}
