package teacher.lesson_7_encapsulation.lessoncode.equalsExample;

import java.util.Objects;

public class Engine {

    public String type;
    public int power;

    public Engine(String type, int power) {
        this.type = type;
        this.power = power;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engine engine = (Engine) o;
        return power == engine.power &&
                Objects.equals(type, engine.type);
    }

    @Override
    public String toString() {
        return "Engine{" +
                "type='" + type + '\'' +
                ", power=" + power +
                '}';
    }
}
