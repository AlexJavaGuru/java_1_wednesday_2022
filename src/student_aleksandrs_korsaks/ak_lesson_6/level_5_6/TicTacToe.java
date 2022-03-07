package student_aleksandrs_korsaks.ak_lesson_6.level_5_6;

import java.util.Scanner;

class TicTacToe {
    public static void main(String[] args) {

        TicTacToe game = new TicTacToe();
        game.play();

    }

    public void play() {
        int[][] field = createField();
        while (true) {
            printFieldToConsole(field);
            Move move0 = getNextMove();
            field[move0.getX()][move0.getY()] = 0;
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
        }
    }

    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
        for (int i = 0; i < field.length; i++) {
            int j = 0;
            while (j < field[i].length) {
                if (field[i][j] != playerToCheck) {
                    break;
                } else if (j == field[j].length - 1) {
                    return true;
                }
                j++;
            }
        }
        return false;
    }

    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {
        for (int i = 0; i < field.length; i++) {
            int j = 0;
            while (j < field[i].length) {
                if (field[j][i] != playerToCheck) {
                    break;
                } else if (j == field[j].length - 1) {
                    return true;
                }
                j++;
            }
        }
        return false;
    }

    public boolean isWinPositionForDiagonalDown(int[][] field, int playerToCheck) {
        int i = 0;
        while (i < field.length) {
            if (field[i][i] != playerToCheck) {
                break;
            } else if (i == field.length - 1) {
                return true;
            }
            i++;
        }
        return false;
    }

    public boolean isWinPositionForDiagonalUp(int[][] field, int playerToCheck) {
        int i = 0;
        while (i < field.length) {
            if (field[i][field.length - i - 1] != playerToCheck) {
                break;
            } else if (i == field.length - 1) {
                return true;
            }
            i++;
        }
        return false;
    }

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {
        return isWinPositionForDiagonalDown(field, playerToCheck) || isWinPositionForDiagonalUp(field, playerToCheck);
    }

    public boolean isWinPosition(int[][] field, int playerToCheck) {
        return isWinPositionForHorizontals(field, playerToCheck) || isWinPositionForVerticals(field, playerToCheck) || isWinPositionForDiagonals(field, playerToCheck);
    }

    public boolean isDrawPosition(int[][] field) {
        return isAllMovesDone(field) && !isWinPosition(field, 1) && !isWinPosition(field, 0);
    }

    public boolean isAllMovesDone(int[][] field) {
        for (int[] cells : field) {
            for (int cell : cells) {
                if (cell == -1) {
                    return false;
                }
            }
        }
        return true;
    }

    public int[][] createField() {
        int[][] field = new int[3][3];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                field[i][j] = -1;
            }
        }
        return field;
    }

    public Move getNextMove() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the X coordinate of your move");
        int x = scanner.nextInt();
        System.out.println("Please enter the Y coordinate of your move");
        int y = scanner.nextInt();
        return new Move(x, y);
    }

    public void printFieldToConsole(int[][] field) {
        for (int i = 0; i < field.length; i++) {
            System.out.print("|");
            for (int j = 0; j < field[i].length; j++) {
                System.out.print(field[i][j] + "|");
            }
            System.out.println();
        }
    }
}



