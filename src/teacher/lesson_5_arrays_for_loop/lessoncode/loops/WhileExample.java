package teacher.lesson_5_arrays_for_loop.lessoncode.loops;

import student_arturs_melnikovs.lesson_03.level_05.Dog;

public class WhileExample {

    public static void main(String[] args) {
        Dog myDog = new Dog("test", 12, "Black");
        int result = 0;
        int i = 5;
        while (i != 0) {
            myDog.voice();
//            System.out.print(result + " + " + 5 + " = ");
//            result = result + 5;
//            System.out.println(result);
            i = i - 1; // i++ OR i--;
        }
        //0 + 5 = 5
        //5 + 5 = 10
        //10 + 5 = 15
        //15 + 5 = 20
        //20 + 5 = 25
//        System.out.println(result);
    }
}
