/*

380 ... 449 - Фиолетовый ("Violet")
450 ... 494 - Синий ("Blue")
495 ... 569 - Зеленый ("Green")
570 ... 589 - Желтый ("Yellow")
590 ... 619 - Оранжевый ("Orange")
620 ... 750 - Красный ("Red")
 */
package student_jekaterina_soldatova.lesson_4.middle;

class LightColorDetector {
    String detect(int wavelength) {
        if (wavelength >= 380 && wavelength <= 750) {
            if (wavelength <= 449) {
                return "Violet";
            } else if (wavelength <= 494) {
                return "Blue";
            } else if (wavelength <= 569) {
                return "Green";
            } else if (wavelength <= 589) {
                return "Yellow";
            } else if (wavelength <= 619) {
                return "Orange";
            } else return "Red";
        } else return "Invisible";
    }
}
