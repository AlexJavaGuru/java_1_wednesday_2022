package student_aleksandrs_korsaks.ak_lesson_3.level_7;

class Product {
    private final String name;
    double regularPrice;
    double discount;

    public Product(String name) {
        this.name = name;
    }

    double actualPrice() {
        return regularPrice - regularPrice * discount / 100;
    }

    void printInformation() {
        System.out.println("Product - " + name +
                "; regular price - " + regularPrice +
                " eur; discount - " + discount +
                " %; final price - " + actualPrice() + " eur.");
    }
}
