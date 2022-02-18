package student_konstantin_kolesnik.lesson_3.level_7;

class Car {

    String brand;
    int year;
    String price;


    public Car(String brand,int year,String price) {
        this.brand = brand;
        this.year = year;
        this.price = price;
    }

    public void carPrint() {
        System.out.println(brand);
        System.out.println(year);
        System.out.println(price);
        System.out.println();
    }
}
