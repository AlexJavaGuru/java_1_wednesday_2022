package student_alex_stranger.lesson_4.level_6;

class Stock {

    String companyName;
    int currentPrice;
    int maxPrice;
    int minPrice;

    public Stock(String companyName, int currentPrice) {
        this.companyName = companyName;
        this.currentPrice = currentPrice;
        maxPrice = currentPrice;
        minPrice = currentPrice;
    }
    void updatePrice(int newPrice) {
        currentPrice = newPrice;
        if (newPrice > maxPrice) {
            maxPrice = newPrice;
        } else if (newPrice < minPrice) {
            minPrice = newPrice;
        }
    }
        void getPriceInformation() {
            System.out.println("Company name = " + companyName);
            System.out.println("Current price = " + currentPrice);
            System.out.println("Max price = " + maxPrice);
            System.out.println("Min price = " + minPrice);

        }

    String getCompanyName() {
        return companyName;
    }
    int getCurrentPrice() {
        return currentPrice;
    }
    int getMaxPrice() {
        return maxPrice;
    }
    int getMinPrice() {
        return minPrice;
    }

}
