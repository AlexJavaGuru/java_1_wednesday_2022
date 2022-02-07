package student_andrejs_saldavs.lesson_03.level_7;

public class Product {

    String name;
    double regularPrice;
    double discount;
    double actualPrice = regularPrice - regularPrice * discount;

    public Product() {

    }

    public Product(String name, double regularPrice, double discount) {
        this.name = name;
        this.regularPrice = regularPrice;
        this.discount = discount;
    }

    public double printInformation() {
        return actualPrice;
    }

}
