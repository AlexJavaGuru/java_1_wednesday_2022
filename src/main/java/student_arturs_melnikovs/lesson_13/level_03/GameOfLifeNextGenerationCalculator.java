package student_arturs_melnikovs.lesson_13.level_03;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Arrays;
import java.util.Random;

@Getter
@Setter
class GameOfLifeNextGenerationCalculator {

    public GameOfLifeNextGenerationCalculator() {

    }

    boolean[][] calculate(boolean[][] currentGeneration) {
        boolean[][] nextGeneration = new boolean[currentGeneration.length][currentGeneration[0].length];
        for (int i = 0; i < currentGeneration.length; i++) {
            for (int j = 0; j < currentGeneration[0].length; j++) {
                if (currentGeneration[i][j]) {
                    if (countAliveNeighbors(currentGeneration, i, j) < 2) {
                        nextGeneration[i][j] = false;
                    } else if (countAliveNeighbors(currentGeneration, i, j) > 3) {
                        nextGeneration[i][j] = false;
                    } else {
                        nextGeneration[i][j] = true;
                    }
                } else {
                    if (countAliveNeighbors(currentGeneration, i, j) == 3) {
                        nextGeneration[i][j] = true;
                    }
                }
            }
        }
        return nextGeneration;
    }


    private int countAliveNeighbors(boolean[][] currentGeneration, int x, int y) {
        if (x == 0 && y == 0) {
            return countAliveNeighborsVar1(currentGeneration, x, y);
        } else if (x == 0 && y + 1 == currentGeneration[x].length) {
            return countAliveNeighborsVar2(currentGeneration, x, y);
        } else if (x == 0) {
            return countAliveNeighborsVar3(currentGeneration, x, y);
        } else if (y == 0 && x + 1 == currentGeneration.length) {
            return countAliveNeighborsVar4(currentGeneration, x, y);
        } else if (y == 0) {
            return countAliveNeighborsVar5(currentGeneration, x, y);
        } else if (x + 1 == currentGeneration.length && y + 1 == currentGeneration[x].length) {
            return countAliveNeighborsVar6(currentGeneration, x, y);
        } else if (x + 1 == currentGeneration.length) {
            return countAliveNeighborsVar7(currentGeneration, x, y);
        } else if (y + 1 == currentGeneration[x].length) {
            return countAliveNeighborsVar8(currentGeneration, x, y);
        } else {
            return countAliveNeighborsVar9(currentGeneration, x, y);
        }
    }

    private int countAliveNeighborsVar9(boolean[][] currentGeneration, int x, int y) {
        int count = 0;
        if (currentGeneration[x - 1][y - 1]) {
            count++;
        }
        if (currentGeneration[x - 1][y]) {
            count++;
        }
        if (currentGeneration[x - 1][y + 1]) {
            count++;
        }
        if (currentGeneration[x][y - 1]) {
            count++;
        }
        if (currentGeneration[x][y + 1]) {
            count++;
        }
        if (currentGeneration[x + 1][y - 1]) {
            count++;
        }
        if (currentGeneration[x + 1][y]) {
            count++;
        }
        if (currentGeneration[x + 1][y + 1]) {
            count++;
        }
        return count;
    }

    private int countAliveNeighborsVar8(boolean[][] currentGeneration, int x, int y) {
        int count = 0;
        if (currentGeneration[x - 1][y - 1]) {
            count++;
        }
        if (currentGeneration[x - 1][y]) {
            count++;
        }
        if (currentGeneration[x][y - 1]) {
            count++;
        }
        if (currentGeneration[x + 1][y - 1]) {
            count++;
        }
        if (currentGeneration[x + 1][y]) {
            count++;
        }
        return count;
    }

    private int countAliveNeighborsVar7(boolean[][] currentGeneration, int x, int y) {
        int count = 0;
        if (currentGeneration[x - 1][y - 1]) {
            count++;
        }
        if (currentGeneration[x - 1][y]) {
            count++;
        }
        if (currentGeneration[x][y - 1]) {
            count++;
        }
        if (currentGeneration[x - 1][y + 1]) {
            count++;
        }
        if (currentGeneration[x][y + 1]) {
            count++;
        }
        return count;
    }

    private int countAliveNeighborsVar6(boolean[][] currentGeneration, int x, int y) {
        int count = 0;
        if (currentGeneration[x - 1][y - 1]) {
            count++;
        }
        if (currentGeneration[x - 1][y]) {
            count++;
        }
        if (currentGeneration[x][y - 1]) {
            count++;
        }
        return count;
    }

    private int countAliveNeighborsVar5(boolean[][] currentGeneration, int x, int y) {
        int count = 0;
        if (currentGeneration[x - 1][y]) {
            count++;
        }
        if (currentGeneration[x - 1][y + 1]) {
            count++;
        }
        if (currentGeneration[x][y + 1]) {
            count++;
        }
        if (currentGeneration[x + 1][y]) {
            count++;
        }
        if (currentGeneration[x + 1][y + 1]) {
            count++;
        }
        return count;
    }

    private int countAliveNeighborsVar4(boolean[][] currentGeneration, int x, int y) {
        int count = 0;
        if (currentGeneration[x - 1][y]) {
            count++;
        }
        if (currentGeneration[x - 1][y + 1]) {
            count++;
        }
        if (currentGeneration[x][y + 1]) {
            count++;
        }
        return count;
    }

    private int countAliveNeighborsVar3(boolean[][] currentGeneration, int x, int y) {
        int count = 0;
        if (currentGeneration[x][y - 1]) {
            count++;
        }
        if (currentGeneration[x][y + 1]) {
            count++;
        }
        if (currentGeneration[x + 1][y - 1]) {
            count++;
        }
        if (currentGeneration[x + 1][y]) {
            count++;
        }
        if (currentGeneration[x + 1][y + 1]) {
            count++;
        }
        return count;
    }

    private int countAliveNeighborsVar2(boolean[][] currentGeneration, int x, int y) {
        int count = 0;
        if (currentGeneration[x][y - 1]) {
            count++;
        }
        if (currentGeneration[x + 1][y - 1]) {
            count++;
        }
        if (currentGeneration[x + 1][y]) {
            count++;
        }
        return count;
    }

    private int countAliveNeighborsVar1(boolean[][] currentGeneration, int x, int y) {
        int count = 0;
        if (currentGeneration[x][y + 1]) {
            count++;
        }
        if (currentGeneration[x + 1][y]) {
            count++;
        }
        if (currentGeneration[x + 1][y + 1]) {
            count++;
        }
        return count;
    }

}
