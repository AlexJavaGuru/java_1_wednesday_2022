package student_jekaterina_soldatova.lesson11.level_5_middle;

class Trader {

    private String fullName;
    private String city;
    private String country;

    public Trader(String fullName, String city) {
        this.fullName = fullName;
        this.city = city;
    }

    public Trader(String fullName, String city, String country) {
        this.fullName = fullName;
        this.city = city;
        this.country = country;
    }

    String getFullName() {
        return fullName;
    }

    String getCity() {
        return city;
    }

    String getCountry() {
        return country;
    }

    }
