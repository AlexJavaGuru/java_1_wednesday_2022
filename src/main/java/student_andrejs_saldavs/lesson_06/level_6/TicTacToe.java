package student_andrejs_saldavs.lesson_06.level_6;

import java.util.Scanner;

class TicTacToe {

    public int[][] createField() {
        int[][] field = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                field[i][j] = -1;
                System.out.print(field[i][j]);
                System.out.print("   ");
            }
            System.out.println();
            System.out.println();
        }
        return field;
    }

//    public Move getNextMove() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("");
//    }


}
