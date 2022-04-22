/*
        - У собаки должна быть кличка.
        - Кличку собаке дают в момент создания и потом ее изменить нельзя.
        - Собака должна уметь выполнять команду голос (voice()),
        при выполнении этой команды на консоль должно выводиться
        кличка собаки три раза.

        Создать отдельный класс DogDemo,
        объявить в нём main() метод и продемонстрировать
        использование класса собака (Dog).
 */


package student_jekaterina_soldatova.lesson_3.middle;

class Dog {
    String dogName;
    int dogAge;
    String dogColor;

    Dog(String dogName, int dogAge, String dogColor) {
        this.dogName = dogName;
        this.dogAge = dogAge;
        this.dogColor = dogColor;
    }

    void voice() {
        System.out.println(dogName + ": " + dogAge + " years, " + dogColor);
        for (int i = 0; i < 3; i++) {
            System.out.print("Ruff! ");
        }
        System.out.println("");
    }

    void happyBirthday() {
        dogAge += 1;
        System.out.println("Happy Birthday, " + dogName + "!");
    }

    void changeColor(String newColor) {
        dogColor = newColor;
    }

}