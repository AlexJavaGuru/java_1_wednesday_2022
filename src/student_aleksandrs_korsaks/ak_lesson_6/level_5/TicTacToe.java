package student_aleksandrs_korsaks.ak_lesson_6.level_5;

class TicTacToe {
    public static void main(String[] args) {

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
}

