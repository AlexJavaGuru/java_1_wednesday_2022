package student_jekaterina_soldatova.lesson02;

class NameCheck {
    boolean CheckChars(String name) {
        for (int i = 0; i < name.length(); i++){
            if ((int) name.charAt(i) < 65 || ((int) name.charAt(i) > 90 && (int) name.charAt(i) > 97) || (int) name.charAt(i) > 122) {
                return true;
            }
        }
        return false;
    }
}
