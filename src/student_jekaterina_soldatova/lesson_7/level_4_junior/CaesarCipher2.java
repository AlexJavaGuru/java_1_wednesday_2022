package student_jekaterina_soldatova.lesson_7.level_4_junior;

import java.util.Scanner;


class CaesarCipher2 {
    //get string
    //replace letters
    //print
    Pair getString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a string to cipher and an offset (number)");
        String stringFromUser = scanner.nextLine();
        int offsetFromUser = scanner.nextInt();
        return new Pair(stringFromUser, offsetFromUser);
    }


    static String goThroughSentence(Pair pair) {
        String oldString = pair.getString();
        String newString = "";
        int offset = pair.getOffset();

        for (int i = 0; i < oldString.length(); i++) {
            char letter = newString.charAt(i);
            newString += replaceLetter(letter);

        }
    }

    static char replaceLetter(char letter) {
        if ("[\b]".contains(Character.toString(letter))) {



        }
    }
}
