package studen_natalja_isajeva.lesson_7.level_1;

import java.util.Locale;

class WordService {

    public String findMostFrequentWord(String text) {
        String[] words = createArrayWords(text);
        int[] countWords = countWords(words);
        return words[getMostFrequentWord(words, countWords)];
    }

    public String[] createArrayWords(String text) {
        String textToSplit = text.toLowerCase(Locale.ROOT);
        return textToSplit.split(" ");
    }

    public int[] countWords(String[] text) {
        int[] countWords = new int[text.length];
        for (int i = 0; i < text.length; i++) {
            int count = 0;
            for (int j = i + 1; j < text.length; j++) {
                if (text[i] != null && text[i].equals(text[j])) {
                    text[j] = null;
                    count++;
                    countWords[i] = count;
                }
            }
        }
        return countWords;
    }

    public int getMostFrequentWord(String[] text, int[] countWords) {
        int max = 0;
        int mostFrequentWord = 0;
        for (int i = 0; i < countWords.length; i++) {
            if(countWords[i] > max) {
                max = countWords[i];
                mostFrequentWord = i;
            }
        }
        return mostFrequentWord;
    }
}
