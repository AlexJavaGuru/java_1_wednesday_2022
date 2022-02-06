package student_konstantin_kolesnik.lesson_3.level_7;

import java.sql.SQLOutput;

class Product {
    String name;
    double regularPrice;
    double discount;

    Product(String name) {
        this.name = name;
        regularPrice = 1.49;
        discount = 17.5;
    }
    double actualDiscount() {
        double actualDiscount = (regularPrice / 100) * discount;
        return actualDiscount;
    }
    double actualPrice() {
        double actualDiscount = (regularPrice / 100) * discount;
        double actualPrice = (regularPrice - actualDiscount);
        return actualPrice;

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