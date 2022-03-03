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

    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck){
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
}
