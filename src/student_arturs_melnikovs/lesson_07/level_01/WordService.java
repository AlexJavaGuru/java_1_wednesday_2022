package student_arturs_melnikovs.lesson_07.level_01;

import java.util.Locale;

class WordService {

    public String findMostFrequentWord(String text) {
        String[] words = createArrayOfWords(text);
        int[] numberOfDuplicates = countDuplicates(words);
        return words[locateMostFrequentWord(words, numberOfDuplicates)];
    }

    public String[] createArrayOfWords(String text) {
        String textToSplit = text.toLowerCase(Locale.ROOT);
        return textToSplit.split(" ");
    }

    public int[] countDuplicates(String[] words) {
        int[] countOfDuplicates = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            int count = 0;
            for (int j = i + 1; j < words.length; j++) {
                if (words[i] != null && words[i].equals(words[j])) {
                    words[j] = null;
                    count++;
                    countOfDuplicates[i] = count;
                }
            }
        }
        return countOfDuplicates;
    }

    public int locateMostFrequentWord(String[] words, int[] numbersOfDuplicates) {
        int indexOfMostFrequentWord = 0;
        int maxDuplicates = 0;
        for (int i = 0; i < numbersOfDuplicates.length ; i++) {
            if (numbersOfDuplicates[i] > maxDuplicates) {
                maxDuplicates = numbersOfDuplicates[i];
                indexOfMostFrequentWord = i;
            }
        }
        return indexOfMostFrequentWord;
    }

}
