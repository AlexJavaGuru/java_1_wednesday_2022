package student_igors.lesson_3;


public record RobotDemo() {

    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);


        Robot RobotDemo = new Robot("ROBO");
        RobotDemo.sayHello("Hello!");
        RobotDemo.sayYourName("ROBO");

        Robot robotOne = new Robot("GARRY");
        robotOne.sayHello("Hello!");
        robotOne.sayYourName("GARRY");

        Robot robotTwo = new Robot("FELIX");
        robotTwo.sayHello("Hello!");
        robotTwo.sayYourName("FELIX");


        // создайте экземпляр класса Robot вызвав конструктор класса
        // сохраните ссылку (указатель) на только, что созданный
        // виртуальный обьект класса Robot в переменную,
        // она нам понадобиться для дальнейшего использования.
    }

}
