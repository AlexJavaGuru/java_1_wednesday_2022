package student_andrejs_saldavs.lesson_07.level_1;

import java.util.Locale;

class WordService {

    public String findMostFrequentWord(String text) {
        String[] words = createArray(text);
        int[] numberOfDuplicates = duplicateCounter(words);
        return words[mostFrequentWordPlace(words, numberOfDuplicates)];
    }

    public String[] createArray(String text) {
        String textToSplit = text.toLowerCase(Locale.ROOT);
        return textToSplit.split(" ");
    }

    public int[] duplicateCounter(String[] words) {
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

    public int mostFrequentWordPlace(String[] arrayWords, int[] duplicateCount) {
        int mostFrequentWordIndex = 0;
        int duplicateMax = 0;
        for (int i = 0; i < duplicateCount.length ; i++) {
            if (duplicateCount[i] > duplicateMax) {
                duplicateMax = duplicateCount[i];
                mostFrequentWordIndex = i;
            }
        }
        return mostFrequentWordIndex;
    }

}