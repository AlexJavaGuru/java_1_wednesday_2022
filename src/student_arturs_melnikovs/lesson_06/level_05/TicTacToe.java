package student_arturs_melnikovs.lesson_06.level_05;

import java.util.Scanner;

class TicTacToe {

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.play();
    }

    public void play() {
        int[][] field = createField(3, 3);
        while(true) {
            printFieldToConsole(field);
            Move move0 = getNextMove();
            while(true) {
                if(field[move0.getX()][move0.getY()] == -1) {
                    field[move0.getX()][move0.getY()] = 0;
                    break;
                } else {
                    System.out.println("Illegal move, try again!");
                    move0 = getNextMove();
                }
            }
            printFieldToConsole(field);
            if (isWinPosition(field, 0)) {
                System.out.println("Player 0 WIN!");
                break;
            }
            if (isDrawPosition(field)) {
                System.out.println("DRAW!");
                break;
            }

            printFieldToConsole(field);
            Move move1 = getNextMove();
            while(true) {
                if(field[move1.getX()][move1.getY()] == -1) {
                    field[move1.getX()][move1.getY()] = 1;
                    break;
                } else {
                    System.out.println("Illegal move, try again!");
                    move1 = getNextMove();
                }
            }
            printFieldToConsole(field);
            if (isWinPosition(field, 1)) {
                System.out.println("Player 1 WIN!");
                break;
            }
            if (isDrawPosition(field)) {
                System.out.println("DRAW!");
                break;
            }
        }
    }

    public boolean isWinPosition(int[][] field, int playerToCheck) {
        return isWinPositionForDiagonals(field, playerToCheck) || isWinPositionForVerticals(field, playerToCheck) || isWinPositionForHorizontals(field, playerToCheck);
    }

    public boolean isDrawPosition(int[][] field) {
        if(isWinPosition(field, 0) || isWinPosition(field, 1)){
            return false;
        } else {
            for (int i = 0; i < field.length; i++) {
                for (int j = 0; j < field[0].length; j++) {
                    if (field[i][j] == -1) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public int[][] createField(int rows, int columns) {
        int[][] field = new int[rows][columns];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[0].length; j++) {
                field[i][j] = -1;
            }
        }
        return field;
    }

    public Move getNextMove() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координаты X");
        int x = scanner.nextInt();
        System.out.println("Введите координаты Y");
        int y = scanner.nextInt();
        return new Move(x, y);
    }

    public void printFieldToConsole(int[][] field) {
        for (int i = 0; i < field.length; i++) {
            System.out.print(" | ");
            for (int j = 0; j < field[0].length; j++) {
                System.out.print(field[i][j]);
                if (j < field[i].length - 1) {
                    System.out.print(" | ");
                }
            }
            System.out.println(" | ");
        }
        System.out.println(" ");
    }



    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck){
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[0].length; j++) {
                if (playerToCheck != field[i][j]) {
                    break;
                } else if (j == field[j].length - 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck){
        for (int i = 0; i < field[0].length; i++) {
            for (int j = 0; j < field.length; j++) {
                if (playerToCheck != field[j][i]) {
                    break;
                } else if (j == field[j].length - 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck){
        return isWinPositionForDiagonalsFirst(field, playerToCheck) || isWinPositionForDiagonalsSecond(field, playerToCheck);
    }

    public boolean isWinPositionForDiagonalsFirst(int[][] field, int playerToCheck) {
        for (int i = 0; i < field.length; i++) {
            if (field[i][i] != playerToCheck) {
                return false;
            } else if (i == field.length - 1) {
                return true;
            }
        }
        return false;
    }

    public boolean isWinPositionForDiagonalsSecond(int[][] field, int playerToCheck) {
        for (int i = 0; i < field.length; i++) {
            if (field[i][field[i].length - 1 - i] != playerToCheck) {
                return false;
            } else if (i == field.length - 1) {
                return true;
            }
        }
        return false;
    }

}
