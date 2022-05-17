package student_arturs_melnikovs.lesson_09.level_03;

class FunctionalInterfaceExampleDemo {
    public static void main(String[] args) {
        FunctionalInterfaceExample demo = () -> System.out.println("Using functional interface");
        demo.print();
    }
}
