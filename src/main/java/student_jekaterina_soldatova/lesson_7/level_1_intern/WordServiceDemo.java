package student_jekaterina_soldatova.lesson_7.level_1_intern;

class WordServiceDemo {
    public static void main(String[] args) {
        String sentence = WordService.getString(); //get string
        String[] arrayFromString = WordService.stringToArray(sentence); //string to array
        String mostFrequentWord = WordService.findMostFrequentWord(arrayFromString); //find most frequent word
        WordService.printResult(mostFrequentWord); //print results
    }
}
