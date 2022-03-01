package student_jekaterina_soldatova.lesson06.level_5_middle;

class TicTacToe {
    public static void main(String[] args) {

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
