package student_aleksandrs_korsaks.ak_lesson_7.level_7;

class WordService {

    public String findMostFrequentWord(String text) {

        String[] wordsArray = createArrayOfWordsFromText(text);

        int[] wordsRepetitionsArray = countWordRepetitions(wordsArray);

        return findMaxRepeatedWord(wordsArray, wordsRepetitionsArray);
    }

    private String[] createArrayOfWordsFromText(String text) {
        String[] wordsArray;
        wordsArray = text.split(" ");
        return wordsArray;
    }

    private int[] countWordRepetitions(String[] wordsArray) {
        int[] wordsRepetitionsArray;
        wordsRepetitionsArray = new int[wordsArray.length];

        int wordCounter = 0;
        for (int wordCount = 0; wordCount < wordsArray.length; wordCount++) {
            for (String word : wordsArray) {
                if (wordsArray[wordCount].equals(word)) {
                    wordCounter++;
                }
            }
            wordsRepetitionsArray[wordCount] = wordCounter;
            wordCounter = 0;
        }
        return wordsRepetitionsArray;
    }

    private String findMaxRepeatedWord(String[] wordsArray, int[] wordsRepetitionsArray) {
        int max = 0;
        for (int count = 0; count < wordsRepetitionsArray.length; count++) {
            if (wordsRepetitionsArray[count] > wordsRepetitionsArray[max]) {
                max = count;
            }
        }
        return wordsArray[max];
    }
}
