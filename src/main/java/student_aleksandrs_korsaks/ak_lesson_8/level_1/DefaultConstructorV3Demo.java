package student_aleksandrs_korsaks.ak_lesson_8.level_1;

class DefaultConstructorV3Demo {
    public static void main(String[] args) {
        DefaultConstructorV3 defaultConstructorV3 = new DefaultConstructorV3();

        System.out.println("FullName - " + defaultConstructorV3.getFullName());
        System.out.println("Age - " + defaultConstructorV3.getAge());
        System.out.println("Is male? - " + defaultConstructorV3.isMale());
        System.out.println("Is female? - " + defaultConstructorV3.getFemale());
    }
}
