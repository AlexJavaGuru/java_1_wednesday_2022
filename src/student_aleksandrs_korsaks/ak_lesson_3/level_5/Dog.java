package student_aleksandrs_korsaks.ak_lesson_3.level_5;

class Dog {
    private final String dogName;
    private String colour;
    private int dogAge;

    public Dog(String dogName, int dogAge, String colour) {
        this.dogName = dogName;
        this.dogAge = dogAge;
        this.colour = colour;
    }

    void voice() {
        int i = 0;
        while (i < 3) {
            System.out.print(dogName + "! ");
            i++;
        }
        System.out.println();
        System.out.println(dogName + " is " + dogAge + " years old");
        System.out.println(dogName + "`s colour is " + colour);
    }

    void happyBirthday() {
        dogAge++;
    }

    void changeColor(String newColor) {
        colour = newColor;
    }

    public String getColour() {
        return colour;
    }

    public int getDogAge() {
        return dogAge;
    }


    public void setDogAge(int dogAge) {
        this.dogAge = dogAge;
    }
}
