package student_igors.lesson_3.level_5;

public class Dog {
    String name;
    int age;
    String color;

    public Dog() {

    }
    public Dog(String name, int age, String color) {
    this.name = name;
    this.age = age;
    this.color = color;
    }


    public void voice(){
System.out.println("Cika Cika Cika 5 Years old" + color);
}

    public  void happyBirthday() {
        int sum =age +1;
        System.out.println("Happy Birthday! " + sum + " Years old");
    }

}

   // Создайте собаку,
    //заставьте её подать голос,
   // заставте её поменять цвет,
   // заставьте её подать голос снова и убедитесь в том,
    //    что собака изменила свой цвет.

