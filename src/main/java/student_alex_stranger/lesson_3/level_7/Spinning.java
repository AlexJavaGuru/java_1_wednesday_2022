package student_alex_stranger.lesson_3.level_7;

public class Spinning {

    String name;
    double length;
    int weight;
    String test;
    String action;

    public Spinning(String name, double length, int weight, String test, String action) {
        this.name = name;
        this.length = length;
        this.weight = weight;
        this.test = test;
        this.action = action;

    }
    String getName() {
        return this.name;
    }
    double getLength() {
        return this.length;
    }
    int getWeight() {
        return this.weight;
    }
    String getTest() {
        return this.test;
    }
    String getAction() {
        return this.action;
    }

}
