package student_aleksandrs_jakovenko.lesson_7.level_1;

import java.util.Locale;

class WordService {

    public String findMostFrequentWord(String text) {
        String[] words = textToArray(text);
        int[] countSameWords = countSameWords(words);
        return words[getMostFrequentWord(words, countSameWords)];
    }

    public String[] textToArray(String text) {
        String textToSplit = text.toLowerCase(Locale.ROOT);
        return textToSplit.split(" ");
    }

    public int[] countSameWords(String[] text) {
        int[] countSameWords = new int[text.length];
        for (int i = 0; i < text.length; i++) {
            int count = 0;
            for (int j = i + 1; j < text.length; j++) {
                if (text[i] != null && text[i].equals(text[j])) {
                    text[j] = null;
                    count++;
                    countSameWords[i] = count;
                }
            }
        }
        return countSameWords;
    }

    public int getMostFrequentWord(String[] text, int[] countSameWords) {
        int max = 0;
        int mostFrequentWord = 0;
        for (int i = 0; i < countSameWords.length; i++) {
            if (countSameWords[i] > max) {
                max = countSameWords[i];
                mostFrequentWord = i;
            }
        }
        return mostFrequentWord;
    }
}
