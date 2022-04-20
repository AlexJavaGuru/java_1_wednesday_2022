package student_darja_soroka.lesson_03.level_5;

public class Dog {

    String dogName;
    int dogAge;
    String color;

    public Dog(String dogName, int dogAge, String color) {
        this.dogName = dogName;
        this.dogAge = dogAge;
        this.color = color;
    }

    public void voice() {
        System.out.println("Кличка: " + this.dogName);
        System.out.println("Возраст: " + this.dogAge);
        System.out.println("Цвет: " + this.color);
    }

    public void happyBirthday() {
        this.dogAge ++;
    }
    public void changeColor(String newColor) {
        this.color = newColor;
    }
}
