package student_jekaterina_soldatova.lesson_7.level_1_intern;

import java.util.Scanner;

class WordService {
    static String getString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a sentence");
        return scanner.nextLine();
    }

    static String[] stringToArray(String sentence) {
        sentence = WordService.removeSpecialChars(sentence).toLowerCase();
        return sentence.split("\\s+");
    }

    static String removeSpecialChars(String sentence) {
            return sentence.replaceAll("[^\s\\w]", "");
    }

    static String findMostFrequentWord(String[] arrayOfWords) {
        String mostFrequentWord = "";
        int maxNumberOfTimes = 0;
        for (String word: arrayOfWords) {
            int countOfTimes = 0;
            for (String wordToCheck : arrayOfWords) {
                if (word.equals(wordToCheck)) {
                    countOfTimes++;
                }
            }
            if (countOfTimes > maxNumberOfTimes) {
                mostFrequentWord = word;
                maxNumberOfTimes = countOfTimes;
            }
        }
        return mostFrequentWord;
    }

    static void printResult(String mostFrequentWord) {
        System.out.println("Most frequent word in your string is " + mostFrequentWord);
    }
}
