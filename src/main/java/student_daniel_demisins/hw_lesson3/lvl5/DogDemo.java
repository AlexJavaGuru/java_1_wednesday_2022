package student_daniel_demisins.hw_lesson3.lvl5;

public class DogDemo {
    public static void main(String[] args) {
        Dog myDog = new Dog("Beethoven", 5, "White");

        myDog.getVoice();
        myDog.happyBirthday();
        myDog.changeColor("Black");
        myDog.getVoice();
    }
}
