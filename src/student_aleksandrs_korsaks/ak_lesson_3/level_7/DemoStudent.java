package student_aleksandrs_korsaks.ak_lesson_3.level_7;

class DemoStudent {
    public static void main(String[] args) {
        Student studentOne = new Student("Krist Novoselic", 35, 25669997);
        Student studentTwo = new Student("Peter Parker", 22, 25598989);

        System.out.println(studentOne);


        studentOne.changeStudentActivityStatus(false);
        System.out.println(studentOne);

        studentOne.changeStudentActivityStatus(true);
        System.out.println(studentOne);
        System.out.println();

        System.out.println(studentTwo);
        studentTwo.setStudentName("Aleksej Ivanov");
        studentTwo.setStudentAge(130);
        studentTwo.setPhoneNumber(11111111);
        System.out.println(studentTwo);

    }
}
