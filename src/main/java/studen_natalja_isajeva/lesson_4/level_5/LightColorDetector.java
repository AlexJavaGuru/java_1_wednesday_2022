package studen_natalja_isajeva.lesson_4.level_5;

public class LightColorDetector {

    public static String detect(int wavelength) {

        if (380 <= wavelength && wavelength <= 449) {
            return "Violet";
        } else if (450 <= wavelength && wavelength <= 494) {
            return "Blue";
        } else if (495 <= wavelength && wavelength <= 569) {
            return "Green";
        } else if (570 <= wavelength && wavelength <= 589) {
            return "Yellow";
        } else if (590 <= wavelength && wavelength <= 619) {
            return "Orange";
        } else if (620 <= wavelength && wavelength <= 750) {
            return "Red";
        } else return "Invisible Light";
    }
}
