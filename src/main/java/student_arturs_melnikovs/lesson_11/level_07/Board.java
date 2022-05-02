package student_arturs_melnikovs.lesson_11.level_07;

import java.util.Arrays;

class Board {
    int[][] board;

    Board() {
        this.board = new int[6][7];
        for (int[] ints : board) {
            Arrays.fill(ints, 0);
        }
    }

    void executeMove(Move move, int currentPlayer) {
        for (int i = board.length - 1; i >= 0; i--) {
            if (board[i][move.getColumnNum()] == 0) {
                board[i][move.getColumnNum()] = currentPlayer;
                break;
            }
        }
    }


    boolean isMoveLegal(Move move) {
        for (int i = board.length - 1; i >= 0; i--) {
            if (board[i][move.getColumnNum()] == 0) {
                return true;
            }
        }
        return false;
    }

    boolean isWinPosition(int currentPlayer) {
        return isWinPositionVertical(currentPlayer) || isWinPositionDiagonal(currentPlayer) || isWinPositionHorizontal(currentPlayer);
    }

    boolean isDrawPosition(){
        for (int[] ints : board) {
            for (int j = 0; j < ints.length; j++) {
                if (ints[j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    boolean isWinPositionHorizontal(int currentPlayer) {
        int countInRow = 0;
        for (int i = board.length - 1; i >= 0; i--) {
            int count = 0;
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == currentPlayer) {
                    count++;
                    countInRow = count;
                } else {
                    count = 0;
                }
                if (countInRow == 4) {
                    return true;
                }
            }
        }
        return false;
    }

    boolean isWinPositionVertical(int currentPlayer) {
        int countInRow = 0;
        for (int i = 0; i >= 0; i--) {
            int count = 0;
            for (int j = board.length - 1; j >= 0 ; j--) {
                if (board[j][i] == currentPlayer) {
                    count++;
                    countInRow = count;
                } else {
                    count = 0;
                }
                if (countInRow == 4) {
                    return true;
                }
            }
        }
        return false;
    }

    boolean isWinPositionDiagonal(int currentPlayer) {
        return isWinPositionDiagonal1(currentPlayer) || isWinPositionDiagonal2(currentPlayer) ||
                isWinPositionDiagonal3(currentPlayer) || isWinPositionDiagonal4(currentPlayer);
    }

    boolean isWinPositionDiagonal1(int currentPlayer) {
        int countInRow = 0;
        for (int i = 0; i < board.length; i++) {
            int count = 0;
            for (int j = 0; j + i < board.length; j++) {
                if (board[i + j][j] == currentPlayer) {
                    count++;
                    countInRow = count;
                } else {
                    count = 0;
                }
                if (countInRow == 4) {
                    return true;
                }
            }
        }
        return false;
    }

    boolean isWinPositionDiagonal2(int currentPlayer) {
        int countInRow = 0;
        for (int i = 0; i < board.length; i++) {
            int count = 0;
            for (int j = 0; j + i < board.length; j++) {
                if (board[j][j + i] == currentPlayer) {
                    count++;
                    countInRow = count;
                } else {
                    count = 0;
                }
                if (countInRow == 4) {
                    return true;
                }
            }
        }
        return false;
    }

    boolean isWinPositionDiagonal3(int currentPlayer) {
        int countInRow = 0;
        for (int i = board.length - 1; i >= 0; i--) {
            int count = 0;
            for (int j = 0; i - j >= 0; j++) {
                if (board[i - j][j] == currentPlayer) {
                    count++;
                    countInRow = count;
                } else {
                    count = 0;
                }
                if (countInRow == 4) {
                    return true;
                }
            }
        }
        return false;
    }

    boolean isWinPositionDiagonal4(int currentPlayer) {
        int countInRow = 0;
        for (int i = 0; i < board[0].length; i++) {
            int count = 0;
            for (int j = 0; board.length - 1 - j >= 0 && j + i < board[0].length; j++) {
                if (board[board.length - 1 - j][j + i] == currentPlayer) {
                    count++;
                    countInRow = count;
                } else {
                    count = 0;
                }
                if (countInRow == 4) {
                    return true;
                }
            }
        }
        return false;
    }

    void printBoard(){
        for (int[] ints : board) {
            System.out.println(Arrays.toString(ints));
        }
        System.out.println("\s");
    }

}
