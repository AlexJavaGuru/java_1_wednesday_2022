package student_arturs_melnikovs.lesson_03.level_07;

class Product {
    String name;
    double regularPrice;
    double discount;

    Product(String name) {
        this.name = name;
    }

    void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }
    void setDiscount(double discount) {
        this.discount = discount;
    }
    double actualPrice() {
        return this.regularPrice - (this.regularPrice * this.discount);
    }
    void printInformation() {
        System.out.println("Product: " + this.name);
        System.out.println("Regular price: " + this.regularPrice);
        System.out.println("Actual price: " + actualPrice());
    }
}
