package student_andrejs_saldavs.lesson_03.level_5;

public class Dog {

    String dogName;;
    int dogAge;
    String dogColor;
    String newColor;

    public String voice() {
        return dogName + "\n" + dogName + "\n" +dogName;
    }

    public int voiceAge() {
        return dogAge;
    }

    public String voiceColor() {
        return dogColor;
    }

    public Dog() {

    }

    public Dog(String dogName, int dogAge, String dogColor) {
        this.dogName = dogName;
        this.dogAge = dogAge;
        this.dogColor = dogColor;
    }

     public int happyBirthday () {
        dogAge = dogAge + 1;
        return dogAge;
    }

    public String changeColor(String newColor) {
        this.newColor = newColor;
        return newColor;
    }

}
