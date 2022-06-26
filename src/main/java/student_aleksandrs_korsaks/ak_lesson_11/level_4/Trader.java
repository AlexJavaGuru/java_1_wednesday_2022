package student_aleksandrs_korsaks.ak_lesson_11.level_4;

import java.util.Objects;

class Trader {

    private String fullName;
    private String city;

    public Trader(String fullName, String city) {
        this.fullName = fullName;
        this.city = city;
    }

    public String getFullName() {
        return fullName;
    }

    public String getCity() {
        return city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Trader trader)) return false;
        return getFullName().equals(trader.getFullName()) && getCity().equals(trader.getCity());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFullName(), getCity());
    }

    @Override
    public String toString() {
        return "Trader{" +
                "fullName = '" + fullName + '\'' +
                ", city = '" + city + '\'' +
                '}';
    }
}
