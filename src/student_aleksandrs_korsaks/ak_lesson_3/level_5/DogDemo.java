package student_aleksandrs_korsaks.ak_lesson_3.level_5;

public class DogDemo {
    public static void main(String[] args) {
        Dog myDog = new Dog("Bobik", 15, "Black");
        myDog.voice();
        System.out.println();

        myDog.happyBirthday();
        myDog.changeColor("White");
        myDog.voice();
        System.out.println();

        myDog.happyBirthday();
        myDog.changeColor("Brown");
        myDog.voice();
    }
}
