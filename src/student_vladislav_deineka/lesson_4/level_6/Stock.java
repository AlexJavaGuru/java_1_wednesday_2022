package student_vladislav_deineka.lesson_4.level_6;

class Stock {
    String companyName;
    int actualPrice;
    int minPrice;
    int maxPrice;

    Stock(String companyName, int actualPrice) {
        this.companyName = companyName;
        this.actualPrice = actualPrice;
        minPrice = actualPrice;
        maxPrice = actualPrice;
    }

    void updatePrice(int newPrice) {
        actualPrice = newPrice;
        if (newPrice > maxPrice) {
            maxPrice = newPrice;
        } else if (newPrice < minPrice) {
            minPrice = newPrice;
        }
    }

    void getPriceInformation() {
        System.out.println("Company: " + companyName);
        System.out.println("Actual price: " + actualPrice);
        System.out.println("Min price: " + minPrice);
        System.out.println("Max price: " + maxPrice);
    }
}