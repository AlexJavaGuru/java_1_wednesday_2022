package student_arturs_melnikovs.lesson_10.level_04;

import java.util.*;

class UniqueWordFinder {

    public Set<String> find(String text) {
        Set<String> uniqueWords = new HashSet<>();
        List<String> words = convertToList(text);
        for (String word : words) {
            uniqueWords.add(word);
        }
        return uniqueWords;
    }

    private List<String> convertToList(String text) {
        String reg = "[\\W|\\d]";
        String[] allWords = text.toLowerCase(Locale.ROOT).split(reg);
        List<String> words = new ArrayList<>(Arrays.asList(allWords));
        words.removeAll(Arrays.asList("", null));
        return words;
    }

}
