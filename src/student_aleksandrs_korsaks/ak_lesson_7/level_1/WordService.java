package student_aleksandrs_korsaks.ak_lesson_7.level_1;

import java.util.Arrays;
import java.util.Scanner;

class WordService {

    public static void main(String[] args) {

        WordService wordService = new WordService();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter the text:");
        String text = scanner.nextLine();
        scanner.close();

        System.out.println(wordService.findMostFrequentWord(text));

    }

    public String findMostFrequentWord(String text) {

        String[] filteredWords = filterAndSeparateTextToWords(text);
        int[] quantityOfWordsRepetitions = countRepeatedWordsQuantity(filteredWords);
        System.out.println(Arrays.toString(quantityOfWordsRepetitions));
        return findMostRepeatedWord(filteredWords, quantityOfWordsRepetitions);

    }

    public String[] filterAndSeparateTextToWords(String text) {

        String[] words = text.replaceAll("[^a-z^A-Z^\s]", "").toLowerCase().split(" ");
        int filteredWordsArraySize = 0;

        for (String word : words) {
            if (!word.isEmpty()) {
                filteredWordsArraySize++;
            }
        }

        String[] filteredWords = new String[filteredWordsArraySize];
        int k = 0;
        int i = 0;
        while (i < words.length) {
            if (!words[i].isEmpty()) {
                filteredWords[k] = words[i];
                i++;
                k++;
            } else {
                i++;
            }
        }
        return filteredWords;

    }

    public int[] countRepeatedWordsQuantity(String[] words) {

        int[] quantityOfWordsRepetitions = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    quantityOfWordsRepetitions[i]++;
                }
            }
        }
        return quantityOfWordsRepetitions;

    }

    private String findMostRepeatedWord(String[] words, int[] counter) {

        int max = counter[0];
        int indexOfMostRepeatedWord = 0;
        for (int i = 0; i < counter.length; i++) {
            if (counter[i] > max) {
                max = counter[i];
                indexOfMostRepeatedWord = i;
            }
        }
        return words[indexOfMostRepeatedWord];

    }
}
