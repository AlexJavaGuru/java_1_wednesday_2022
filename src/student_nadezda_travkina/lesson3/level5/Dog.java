package student_nadezda_travkina.lesson3.level5;

class Dog {
    String dogName = "Reks";
    int dogAge;
    String dogColor;

    Dog(String dogName, int dogAge, String dogColor) {
        this.dogName = dogName;
        this.dogAge = dogAge;
        this.dogColor = dogColor;
    }

    void voice() {
        System.out.println(dogName + dogName + dogName + "\n" + dogName + "is " + dogAge + "years old " + "\n" + dogName + " colour " + dogColor);
    }

    void happyBirthday() {
        dogAge++;
    }

    void changeColor(String newColor) {
        dogColor = newColor;
    }

    public String getDogColor() {
        return dogColor;
    }

    public void setDogAge(int dogAge) {
        this.dogAge = dogAge;
    }
}