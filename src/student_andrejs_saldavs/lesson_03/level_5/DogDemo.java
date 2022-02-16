package student_andrejs_saldavs.lesson_03.level_5;

public class DogDemo {

    public static void main(String[] args) {


        Dog dogRequirements = new Dog("Kobe", 10, "Black");

        String dogVoiceText = dogRequirements.voice();
        System.out.println(dogVoiceText);

        int dogVoiceTextAge = dogRequirements.voiceAge();
        System.out.println(dogVoiceTextAge);

        int dogAgeAfter = dogRequirements.happyBirthday();
        System.out.println("New age is: " + dogAgeAfter);

        String dogVoiceColor = dogRequirements.voiceColor();
        System.out.println(dogVoiceColor);

        String dogChangeColor = dogRequirements.changeColor("White");
        System.out.println("New color is: " + dogChangeColor);

    }

}
