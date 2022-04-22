package student_nadezda_travkina.lesson3.level1;

import student_nadezda_travkina.lesson3.level1.RobotDemo;

 class Robot {
    String sayHello;
    String sayYourName;
    String name;

     Robot(String robotName) {
        this.name = robotName;
            }

     Robot(String sayHello, String sayYourName) {
        this.sayHello = sayHello;
        this.sayYourName = sayYourName;
    }

    public void sayHello() {
        System.out.println("Hello!");
    }

    public void sayYourname() {
        System.out.println(name);
    }
}

