package student_jekaterina_soldatova.lesson02;

class NameCheck {
    boolean CheckChars(String name) {
        for (int i = 0; i < name.length(); i++){
            if ((int) name.charAt(i) < 65) {
                return false;
            }
        }
        return true;
    }
}
