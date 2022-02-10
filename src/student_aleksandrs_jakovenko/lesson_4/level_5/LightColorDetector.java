package student_aleksandrs_jakovenko.lesson_4.level_5;

import java.util.Scanner;

class LightColorDetector {
    public String detect(int wavelength) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter wavelength: ");
//        wavelength = scanner.nextInt();
        if (wavelength >= 380 && wavelength <= 449){
            return "Violet";
        }
        else if (wavelength >= 450 && wavelength <= 494) {
            return "Blue";
        }
        else if (wavelength >= 495 && wavelength <= 569) {
            return "Green";
        }
        else if (wavelength >= 570 && wavelength <= 589) {
            return "Yellow";
        }
        else if (wavelength >= 590 && wavelength <= 619) {
            return "Orange";
        }
        else if (wavelength >= 620 && wavelength <= 750) {
            return "Red";
        }
        else return "Invisible Light";
    }
}
