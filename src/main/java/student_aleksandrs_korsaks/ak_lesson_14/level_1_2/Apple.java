package student_aleksandrs_korsaks.ak_lesson_14.level_1_2;

import java.util.Objects;

public class Apple {

    private String color;
    private int weight;

    public Apple(String color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Apple apple)) return false;
        return getWeight() == apple.getWeight() && getColor().equals(apple.getColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getColor(), getWeight());
    }

    @Override
    public String toString() {
        return "Apple{" +
                "color = '" + color + '\'' +
                ", weight = " + weight +
                '}';
    }
}
