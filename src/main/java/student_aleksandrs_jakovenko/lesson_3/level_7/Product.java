package student_aleksandrs_jakovenko.lesson_3.level_7;
// Task_31
class Product {
    String name;
    double regularPrice;
    double discount;

    double actualPrice(){
        double actualDiscount = regularPrice * discount;
        double actualPrice = regularPrice - actualDiscount;
        return actualPrice;
    }
    void printInformation(){
        System.out.println("Product name is: " + name);
        System.out.println("Product regular price is: " + regularPrice);
        System.out.println("Product discount is: " + (int)discount + "%");
    }
    public Product(String name){
        this.name = name;
    }
    void setDiscount(double discount){
        discount = discount * 100;
        this.discount = discount;
    }
}
