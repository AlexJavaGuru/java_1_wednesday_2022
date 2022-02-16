package student_aleksejs_iljins.lesson_04.level_5;

class LightColorDetector {
    public String color (int number) {
        if (number >= 380 && number <=449){
            return "Violet";
        } else if (number >= 450 && number <=494) {
            return "Blue";
        } else if (number >= 495 && number <=569) {
            return "Green";
        } else if (number >= 570 && number <=589) {
            return "Yellow";
        } else if (number >= 590 && number <=619) {
            return "Orange";
        } else if (number >= 620 && number <=750) {
            return "Red";
        } else return "Invisible Light";
    }
}
