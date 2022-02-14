package student_konstantin_kolesnik.lesson_3.level_7;

class Product {
    String name;
    double regularPrice;
    double discount;

    public Product(String name, double regularPrice, double discount) {
        this.name = name;
        this.regularPrice = regularPrice ;
        this.discount = discount;
    }
    double actualDiscount() {
        return (regularPrice / 100) * discount;
    }
    double actualPrice() {
        return (regularPrice / 100) * discount;


    }
    void print() {
        System.out.println("Sale -" + discount +" %");
        System.out.println();
        System.out.println(name);
        System.out.println(actualPrice() + " €");
        System.out.println();
        System.out.println("You save:");
        System.out.println(actualDiscount() + " €");
        System.out.println();
    }
}