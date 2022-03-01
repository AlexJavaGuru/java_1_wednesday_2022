package student_aleksandrs_jakovenko.lesson_6.TicTacToe;

class TicTacToe {

    public static void main(String[] args) {

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
}