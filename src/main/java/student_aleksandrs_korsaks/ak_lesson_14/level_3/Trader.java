package student_aleksandrs_korsaks.ak_lesson_14.level_3;

import java.util.Objects;

class Trader {

    private String name;
    private String city;

    public Trader(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Trader trader)) return false;
        return getName().equals(trader.getName()) && getCity().equals(trader.getCity());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getCity());
    }

    @Override
    public String toString() {
        return "Trader{" +
                "name = '" + name + '\'' +
                ", city = '" + city + '\'' +
                '}';
    }
}
