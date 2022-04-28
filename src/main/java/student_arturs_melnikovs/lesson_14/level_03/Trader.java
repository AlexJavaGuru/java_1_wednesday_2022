package student_arturs_melnikovs.lesson_14.level_03;

import java.util.Objects;

class Trader {
    private String name;
    private String city;

    public Trader(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return this.name;
    }

    public String getCity() {
        return this.city;
    }

    public String toString() {
        return "Trader:"+this.name + " in " + this.city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trader trader = (Trader) o;
        return Objects.equals(name, trader.name) && Objects.equals(city, trader.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, city);
    }
}
