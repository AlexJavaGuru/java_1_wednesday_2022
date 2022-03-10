package student_andrejs_saldavs.lesson_06.level_6;

import student_andrejs_saldavs.lesson_06.level_6.TicTacToe;

import java.util.Arrays;

public class TicTacToeDemo {

    public static void main(String[] args) {

        TicTacToe detector = new TicTacToe();
        int[][] array = detector.createField();
        System.out.println(Arrays.deepToString(array));

    }
}
