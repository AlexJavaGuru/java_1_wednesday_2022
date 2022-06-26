package student_aleksandrs_korsaks.ak_lesson_11.level_4;

import java.util.Objects;

class Trader {

    private String fullName;
    private String city;
    private String country;

    public Trader(String fullName, String city, String country) {
        this.fullName = fullName;
        this.city = city;
        this.country = country;
    }

    public String getFullName() {
        return fullName;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Trader trader)) return false;
        return getFullName().equals(trader.getFullName()) && getCity().equals(trader.getCity()) && getCountry().equals(trader.getCountry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFullName(), getCity(), getCountry());
    }

    @Override
    public String toString() {
        return "Trader{" +
                "fullName = '" + fullName + '\'' +
                ", city = '" + city + '\'' +
                ", country = '" + country + '\'' +
                '}';
    }
}
