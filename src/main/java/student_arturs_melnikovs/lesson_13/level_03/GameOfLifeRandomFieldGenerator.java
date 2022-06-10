package student_arturs_melnikovs.lesson_13.level_03;

import java.util.Random;

class GameOfLifeRandomFieldGenerator {

    boolean[][] generate(int width, int height) {
        Random random = new Random();
        boolean[][] field = new boolean[width][height];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                field[i][j] = random.nextBoolean();
            }
        }
        return field;
    }
}
