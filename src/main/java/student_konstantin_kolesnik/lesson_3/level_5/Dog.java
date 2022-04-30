package student_konstantin_kolesnik.lesson_3.level_5;

class Dog {

    String dogName;
    int dogAge;
    String dogColor;

    Dog (String dogName, int dogAge, String dogColor) {
        this.dogName = dogName;
        this.dogAge = dogAge;
        this.dogColor = dogColor;
    }
    //Task18
    void voiceTask18() {
        System.out.println(dogName + ", " + dogName + ", " + dogName + "!");
        System.out.println();
    }
    //Task19
    void voiceTask19() {
        System.out.println("Dog name: " + dogName + "\n" + "Dog age: " + dogAge);
        System.out.println();
    }
    //Task20
    void happyBirthday() {
        System.out.println("Dog name: " + dogName + "\n" + "Dog age: " + dogAge);;
        this.dogAge ++;
        System.out.println("Happy Birthday " + dogName + "!!!" +  "\n" + "You are " + dogAge + " today");
        System.out.println("Dog name: " + dogName + "\n" + "Dog age: " + dogAge);
        System.out.println();
    }
    //Task21
    void voiceTask20() {
        System.out.println("Dog name: " + dogName + "\n" + "Dog age: " + dogAge + "\n" + "Dog color: " + dogColor);
        System.out.println();

    }
    //Task22
    void changeColor(String newColor) {
        System.out.println("Dog name: " + dogName + "\n" + "Dog color: " + dogColor);
        System.out.println("Dog name: " + dogName + "\n" + "Dog new color: " + newColor);
        System.out.println();
    }
    }