package student_daniel_demisins.hw_lesson3.lvl7;

public class CatDemo {
    public static void main(String[] args) {
        Cat myCat = new Cat("Бося", 6, "Бело-оранжевый");
        String name= myCat.getName();
        int age= myCat.getAge();
        String color= myCat.getColor();
        System.out.println("Имя моего кота " + name);
        System.out.println("Моему коту " + age + " лет");
        System.out.println("У моего кота " + color + " окрас");
    }
}
