package student_aleksejs_iljins.lesson_03.level_1;

class RobotDemo {
    public static void main(String[] args) {

        Robot robot = new Robot("Roy Batty.", "N6MAA10816.");
        robot.sayHello();
        robot.sayYourName();
        robot.modelNumber();

        Robot robotTwo = new Robot("Zora.", "N6FAB61216.");
        robotTwo.sayHello();
        robotTwo.sayYourName();
        robotTwo.modelNumber();

        Robot robotThree = new Robot("Leon Kowalski.", "N6MAC41717.");
        robotThree.sayHello();
        robotThree.sayYourName();
        robotThree.modelNumber();
    }
}
