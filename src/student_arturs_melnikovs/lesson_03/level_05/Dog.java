package student_arturs_melnikovs.lesson_03.level_05;

class Dog {
    String dogName;
    int age;
    String color;

    Dog(String dogName, int age, String color){
        this.dogName = dogName;
        this.age = age;
        this.color = color;
    }

    public void voice() {
        System.out.println("Кличка: " + this.dogName);
        System.out.println("Возраст: " + this.age);
        System.out.println("Цвет: " + this.color);
    }
    public void happyBirthday() {
        age++;
    }

    public void changeColor(String newColor) {
        color = newColor;
    }
}
