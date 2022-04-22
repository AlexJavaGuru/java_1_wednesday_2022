package student_aleksandrs_jakovenko.lesson_6.TicTacToe;

import java.util.Scanner;

class TicTacToe {

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.play();
    }

    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (playerToCheck != field[i][j]) {
                    break;
                } else if (j == field[j].length - 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (playerToCheck != field[j][i]) {
                    break;
                } else if (j == field[j].length - 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isWinPositionForDiagonalsFirst(int[][] field, int playerToCheck) {
        for (int i = 0; i < field.length; i++) {
            if (playerToCheck != field[i][i]) {
                break;
            } else if (i == field.length - 1) {
                return true;
            }
        }
        return false;
    }

    public boolean isWinPositionForDiagonalsSecond(int[][] field, int playerToCheck) {
        for (int i = 0; i < field.length; i++) {
            if (playerToCheck != field[i][field.length - 1 - i]) {
                break;
            } else if (i == field.length - 1) {
                return true;
            }
        }
        return false;
    }

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {
        if (isWinPositionForDiagonalsFirst(field, playerToCheck) || isWinPositionForDiagonalsSecond(field, playerToCheck)) {
            return true;
        } else return false;
    }

    public boolean isWinPosition(int[][] field, int playerToCheck) {
        if (isWinPositionForHorizontals(field, playerToCheck) || isWinPositionForVerticals(field, playerToCheck) || isWinPositionForDiagonals(field, playerToCheck)) {
            return true;
        } else return false;
    }

    public boolean isDrawPosition(int[][] field) {
        if (isWinPosition(field, 0) || isWinPosition(field, 1)) {
            return false;
        } else {
            for (int i = 0; i < field.length; i++) {
                for (int j = 0; j < field[i].length; j++) {
                    if (field[i][j] == -1) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public int[][] createField() {
        int[][] array = new int[3][3];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = -1;
            }
        }
        return array;
    }

    public Move getNextMove() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter X:");
        int x = scanner.nextInt();
        System.out.println("Enter Y:");
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
    }

    public void play() {
        int[][] field = createField();
        printFieldToConsole(field);

        while(true) {
            Move move0 = getNextMove();
            while (field[move0.getX()][move0.getY()] != -1) {
                System.out.println("Choose another!");
                move0 = getNextMove();
            }
            field[move0.getX()][move0.getY()] = 0;
            printFieldToConsole(field);
            if (isWinPosition(field, 0)) {
                System.out.println("Player 0 WINS!");
                break;
            }
            if (isDrawPosition(field)) {
                System.out.println("DRAW!");
                break;
            }

//            printFieldToConsole(field);
            Move move1 = getNextMove();
            while (field[move1.getX()][move1.getY()] != -1) {
                System.out.println("Choose another!");
                move1 = getNextMove();
            }
            field[move1.getX()][move1.getY()] = 1;
            printFieldToConsole(field);
            if (isWinPosition(field, 1)) {
                System.out.println("Player 1 WINS!");
                break;
            }
            if (isDrawPosition(field)) {
                System.out.println("DRAW!");
                break;
            }
        }
    }
}