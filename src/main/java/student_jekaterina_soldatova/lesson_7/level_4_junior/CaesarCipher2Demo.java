package student_jekaterina_soldatova.lesson_7.level_4_junior;

class CaesarCipher2Demo {
    public static void main(String[] args) {
        CaesarCipher2 cipher = new CaesarCipher2();
        Pair pair = cipher.getString();
        String result = cipher.goThroughSentence(pair);
        cipher.printResult(result);
    }
}
