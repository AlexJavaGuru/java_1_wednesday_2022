package student_arturs_melnikovs.lesson_13.level_03;

import java.util.Arrays;

class GameOfLifeConsoleUI {

    public void show(boolean[][] field) {
        for (int i = 0; i < field.length; i++) {
            System.out.println(Arrays.toString(field[i]));
        }
        System.out.println();
    }

}
