//please run internTask08

package student_jekaterina_soldatova.lesson02;

class NameCheck {
    int letterCode = 0;
    boolean CheckChars(String name) {
        for (int i = 0; i < name.length(); i++){
            letterCode = name.charAt(i);
            if (letterCode < 65 || (letterCode > 90 && letterCode < 97) || letterCode > 122) {
                return true;
            }
        }
        return false;
    }
}
