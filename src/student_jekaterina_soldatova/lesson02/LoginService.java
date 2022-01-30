package student_jekaterina_soldatova.lesson02;

class LoginService {
    boolean CheckLength(String input, int i) {
        return input.length() < i;
    }

    boolean CheckChars(String input) {
        for (int i = 0; i < input.length(); i++){
            if ((int) input.charAt(i) <= 90 || ((int) input.charAt(i) > 122 && (int) input.charAt(i) < 192) || ((int) input.charAt(i) > 90 && (int) input.charAt(i) < 97)) {
                return false;
            }
        }
        return true;
    }
}
