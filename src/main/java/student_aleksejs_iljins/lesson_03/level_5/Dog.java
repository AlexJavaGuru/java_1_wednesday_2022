package student_aleksejs_iljins.lesson_03.level_5;

class Dog {

    String name;
    int age;
    String color;

    public Dog(String name, int age, String color){
        this.name = name;
        this.age = age;
        this.color = color;
    }
    void voice(){
        System.out.println(name + " " + name + " " + name);
    }
    void getAge(){
        System.out.println("Кличка собаки - " + name + ".");
        System.out.println("Возраст собаки - " + age + " лет.");
    }
    void happyBirthday(){
        System.out.println("Сегодня у Арчи день рождения!");
        System.out.println("Теперь собаке " + (age + 1) + " лет.");
    }
    void setColor(){
        System.out.println("Цвет собаки - " + color + ".");
    }
    void changeColor(String newColor){
        this.color = newColor;
    }
}
