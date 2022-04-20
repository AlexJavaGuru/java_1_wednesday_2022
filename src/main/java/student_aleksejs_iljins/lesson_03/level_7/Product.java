package student_aleksejs_iljins.lesson_03.level_7;
//Task31
class Product {
    String name;
    double regularPrice;
    double discount;

    public Product(String name, double regularPrice, double discount){
        this.name = name;
        this.regularPrice = regularPrice;
        this.discount = discount;
    }
    public void name() {
        System.out.println("Название продукта: " + name);
    }
    public void regularPrice() {
        System.out.println("Стандартная цена: " + regularPrice);
    }

    public void discount() {
        System.out.println("Цена со скидкой: " + (regularPrice - (discount * regularPrice)));
    }
}
