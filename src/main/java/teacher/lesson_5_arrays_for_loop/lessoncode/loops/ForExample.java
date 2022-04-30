package teacher.lesson_5_arrays_for_loop.lessoncode.loops;

import student_arturs_melnikovs.lesson_03.level_05.Dog;

public class ForExample {

    public static void main(String[] args) {
        Dog myDog = new Dog("test", 12, "Black");

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}
