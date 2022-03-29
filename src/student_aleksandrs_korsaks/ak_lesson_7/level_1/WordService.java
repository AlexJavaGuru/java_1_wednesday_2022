package student_aleksandrs_korsaks.ak_lesson_7.level_1;

import java.util.Scanner;

class WordService {
    public static void main(String[] args) {

        WordService wordService = new WordService();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter the text:");
        String text = scanner.nextLine();
        scanner.close();

        String mostFrequentWord = wordService.findMostFrequentWord(text);
        System.out.println("The most frequent word in the text is - \"" + mostFrequentWord + "\"");
    }

    public String prepareText(String text) {
        return text.replaceAll("[^a-zA-Z\s]", " ").toLowerCase();
    }

    public String[] separateTextToWords(String text) {
        return prepareText(text).split("\s+");
    }

    public String findMostFrequentWord(String text) {
        String[] words = separateTextToWords(text);
        int maxNumberOfWordRepetitions = 0;
        String mostFrequentWord = "";

        for (String word : words) {
            int numberOfWordRepetitions = 0;

            for (String wordToCompare : words) {
                if (word.equals(wordToCompare)) {
                    numberOfWordRepetitions++;
                }
            }

            if (numberOfWordRepetitions > maxNumberOfWordRepetitions) {
                maxNumberOfWordRepetitions = numberOfWordRepetitions;
                mostFrequentWord = word;
            }
        }
        return mostFrequentWord;
    }
}

