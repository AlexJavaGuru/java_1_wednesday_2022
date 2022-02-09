package student_aleksandrs_korsaks.ak_lesson_2.level_senior;

public class SuperTaskFive {
/*
      Following is the main method here,
      there we print out in console the compilation result
      of our program
 */

    public static void main(String[] args) {

        System.out.println(reverse("Hello World"));

    }

    public static String reverse(String input) {
        //Declaring a arrays named inputWords and outputWords
        String[] inputWords = input.split(" ");
        String[] outputWords = new String[inputWords.length];

        int i = 0;

        for (String inputWord : inputWords) {
        //creating new StringBuilder exemplar named "reverse"
            String reverse = new StringBuilder(inputWord).reverse().toString();
            outputWords[i] = reverse;
            i++;
        }
        // making separation between words by using String method "join" and delimiter " "
        return String.join(" ", outputWords);
    }
}
