/*
Свойства:
- Наименование (String name)
- Стандартная цена (double regularPrice)
- Скидка в процентах (double discount)

Методы:
1. Расчет актуальной стоимости с учетом скидки (double actualPrice())
Вывод информации о продукте в консоль (void printInformation())1P
2. Название продукта нужно задавать через конструктор, а стоимость и скидку через оператор ".".
 */

package student_jekaterina_soldatova.lesson_3.senior;

public class Product {
    String productName;

    Product(String productName) {
        this.productName = productName;
    }

    double actualPrice(double regularPrice, double discount) {
        return regularPrice - (regularPrice * (discount / 100));
    }

    void printInformation(double actualPrice) {
        System.out.println("Actual price of the " + productName + " is " + actualPrice);
    }
}
