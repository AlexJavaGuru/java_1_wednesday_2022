package student_jekaterina_soldatova.lesson06.level_5_middle;

import java.util.Scanner;

class TicTacToe {
    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.play();
    }

    void play() {
        int[][] field = createField();
        printFieldToConsole(field);

        while(true) {
            System.out.print("Player1! ");
            Move move1 = getNextMove();
            while (field[move1.getX()][move1.getY()] != 0) {
                System.out.println("It's occupied! Choose another");
                move1 = getNextMove();
            }
            field[move1.getX()][move1.getY()] = 1;
            printFieldToConsole(field);
            if (isWinPosition(field, 1)) {
                System.out.println("Player 1 WIN!");
                break;
            }
            if (isDrawPosition(field)) {
                System.out.println("DRAW!");
                break;
            }

            System.out.print("Player2! ");
            Move move2 = getNextMove();
            while (field[move2.getX()][move2.getY()] != 0) {
                System.out.println("It's occupied! Choose another");
                move2 = getNextMove();
            }
            field[move2.getX()][move2.getY()] = 2;
            printFieldToConsole(field);
            if (isWinPosition(field, 2)) {
                System.out.println("Player 2 WIN!");
                break;
            }
            if (isDrawPosition(field)) {
                System.out.println("DRAW!");
                break;
            }
        }
    }

    int[][] createField() {
        int[][] field = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                field[i][j] = 0;
            }
        }
        return field;
    }

    Move getNextMove() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter row index and column index for your move");
        int row = scanner.nextInt();
        int column = scanner.nextInt();
        return new Move(row, column);
    }

    void printFieldToConsole(int[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[0].length; j++) {
                System.out.print(field[i][j] + ", ");
            }
            System.out.println();
        }
    }

    boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
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

    boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {
        for (int i = 0; i < field[0].length; i++) {
            for (int j = 0; j < field.length; j++) {
                if (playerToCheck != field[j][i]) {
                    break;
                } else if (j == field.length - 1) {
                    return true;
                }
            }
        }
        return false;
    }

    boolean isWinPositionForDiagonalsDown(int[][] field, int playerToCheck) {
        for (int i = 0; i < field.length; i++) {
            if (playerToCheck != field[i][i]) {
                break;
            } else if (i == field.length - 1) {
                return true;
            }
        }
        return false;
    }

    boolean isWinPositionForDiagonalsUp(int[][] field, int playerToCheck) {
        int length = field.length - 1;
        for (int i = 0; i < field.length; i++) {
            if (playerToCheck != field[i][length - i]) {
                break;
            } else if (i == field.length - 1) {
                return true;
            }
        }
        return false;
    }

    boolean isWinPosition(int[][] field, int playerToCheck) {
        return (isWinPositionForHorizontals(field, playerToCheck) ||
                isWinPositionForVerticals(field, playerToCheck) ||
                isWinPositionForDiagonalsDown(field, playerToCheck) ||
                isWinPositionForDiagonalsUp(field, playerToCheck));
    }

    boolean isDrawPosition(int[][] field) {
        if (!(isWinPosition(field, 1) || isWinPosition(field, 2))) {
            for (int i = 0; i < field.length; i++) {
                for (int j = 0; j < field[0].length; j++) {
                    if (field[i][j] == 0) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
