package student_igors.lesson_3.level_3;

public class RobotDemo {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);


        Robot robotDemo = new Robot("Demo"); // пусть этого робота зовут "Demo"
        robotDemo.sayGoodDay();
        robotDemo.sayYourName();

        Robot robotOne = new Robot("Rider"); // пусть этого робота зовут "Rider"
        robotOne.sayGoodDay();
        robotOne.sayYourName();

        Robot robotTwo = new Robot("John"); // а этого робота зовут "John"
        robotTwo.sayGoodDay();
        robotTwo.sayYourName();

    }
}