package student_arturs_melnikovs.lesson_13.level_03;

class GameOfLifeNextGenerationCalculator {
    GameOfLifeGeneration lifeGeneration;


    public boolean[][] calculate(boolean[][] currentGeneration) {
       lifeGeneration = new GameOfLifeGeneration();

       return lifeGeneration.calculate(currentGeneration);
    }

}
