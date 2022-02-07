package student_andrejs_saldavs.lesson_03.level_7;

public class ProductDemo {

    public static void main(String[] args) {

        Product productRequirements = new Product("Milk", 1, 0.25);

        double actualPrice = productRequirements.printInformation();
        System.out.println(actualPrice);

        // На консоль почему то выводится только результат с классами Circle и CircleDemo. Не знаю в чем дело

    }

}
