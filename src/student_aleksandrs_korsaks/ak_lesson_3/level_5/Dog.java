package student_aleksandrs_korsaks.ak_lesson_3.level_5;

public class Dog {
    private final String dogName;
    String colour;
    int dogAge;

    public Dog(String dogName, int dogAge, String colour) {
        this.dogName = dogName;
        this.dogAge = dogAge;
        this.colour = colour;
    }

    void voice() {
        int i = 0;
        while (i < 3) {
            System.out.print(dogName + "! ");
            i++;
        }
        System.out.println();
        System.out.println(dogName + " is " + dogAge + " years old");
        System.out.println(dogName + "`s colour is " + colour);
    }

    void happyBirthday() {
        dogAge++;
    }

    void changeColor(String newColor) {
        colour = newColor;
    }
}
