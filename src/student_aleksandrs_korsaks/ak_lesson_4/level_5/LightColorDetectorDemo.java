package student_aleksandrs_korsaks.ak_lesson_4.level_5;

import java.util.Scanner;

public class LightColorDetectorDemo {
    public static void main(String[] args) {
        LightColorDetector caseOne = new LightColorDetector();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter yhe wave length from 380 to 750 included");
        int waveLength = scanner.nextInt();

        System.out.println("The colour of the light is " + caseOne.detect(waveLength));
    }
}
