package student_alex_stranger.lesson_3.level_7;

public class Product {

    String name;
    double regularPrice;
    double discount;

    public Product(String name, double regularPrice, double discount){
        this.name = name;
        this.regularPrice = regularPrice;
        this.discount = discount;
    }
    public void name() {
        System.out.println("Product name: " + name);

    }
    public void regularPrice() {
        System.out.println("Product regular price: " + regularPrice);

    }
    public void discount() {
        System.out.println("Discounted price: " + (regularPrice - (discount * regularPrice)));

    }
}
