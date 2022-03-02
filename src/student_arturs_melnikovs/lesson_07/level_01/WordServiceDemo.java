package student_arturs_melnikovs.lesson_07.level_01;

import java.util.Arrays;

class WordServiceDemo {
    public static void main(String[] args) {
        WordService wordService = new WordService();
        String test = "mouse cat cat dog dog cat dog";
        System.out.println(wordService.findMostFrequentWord(test));

    }
}
