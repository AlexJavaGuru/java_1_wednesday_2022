package student_aleksandrs_jakovenko.lesson_3.level_5;

public class Dog {
    String name = "Richy";
    int age = 5;
    String color;

    void voice(){
//        Task 18
//        System.out.println(name + " " + name + " " + name);
//        Task 19
//        System.out.println("Dog name: " + name);
//        System.out.println("Dog age: " + age);

//        Task 20
//        System.out.println(name + " " + name + " " + name);
//        System.out.println("Dog age is: " + age);

        //Task 21
        System.out.println("Dog name: " + name);
        System.out.println("Dog age is: " + age);
        System.out.println("Dog color is: " + color);
    }

    void happyBirthday(){
        this.age = age + 1;
    }

    public Dog(String color){
        this.color = color;
    }
}
