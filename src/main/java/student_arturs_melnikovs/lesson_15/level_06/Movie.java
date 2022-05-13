package student_arturs_melnikovs.lesson_15.level_06;

class Movie {

    public static final String REGULAR = "REGULAR";
    public static final String NEW_RELEASE = "NEW_RELEASE";
    public static final String CHILDRENS = "CHILDRENS";

    private final String title;
    private final String priceCode;

    public Movie(String title, String priceCode) {
        this.title = title;
        this.priceCode = priceCode;
    }

    public String getTitle() {
        return title;
    }

    public String getPriceCode() {
        return priceCode;
    }
}