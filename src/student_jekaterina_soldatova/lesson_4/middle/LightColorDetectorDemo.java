package student_jekaterina_soldatova.lesson_4.middle;

import java.util.Scanner;

class LightColorDetectorDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wavelength = scanner.nextInt();
        LightColorDetector lightColorDetector = new LightColorDetector();
        System.out.println(lightColorDetector.detect(wavelength));
    }

}
