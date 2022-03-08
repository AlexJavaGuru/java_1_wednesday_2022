package student_jekaterina_soldatova.lesson_7.level_1_intern;

import java.util.Scanner;

class WordService {
    static String getString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a sentence");
        return scanner.nextLine();
    }

    static String[] stringToArray(String sentence) {
        String[] arrayFromString = sentence.split(" ", 0);
        WordService.removeSpecialChars(arrayFromString);
        return arrayFromString;
    }

    static void removeSpecialChars(String[] arrayToCheck) {
        for (int i = 0; i < arrayToCheck.length; i++) {
            arrayToCheck[i] = arrayToCheck[i].replaceAll("[^\\w]", "");
        }
        //return arrayToCheck;
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
