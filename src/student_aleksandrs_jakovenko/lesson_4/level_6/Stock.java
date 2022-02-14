package student_aleksandrs_jakovenko.lesson_4.level_6;

class Stock {
    String companyName;
    int currentPrice;
    int minPrice;
    int maxPrice;

    public Stock (String companyName, int currentPrice){
        this.companyName = companyName;
        this.currentPrice = currentPrice;
        minPrice = currentPrice;
        maxPrice = currentPrice;
    }

    void updatePrice(int newPrice){
        currentPrice = newPrice;
        if (newPrice >= maxPrice){
            maxPrice = newPrice;
        } else if (newPrice <= minPrice){
            minPrice = newPrice;
        }
    }

    String getPriceInformation(){
        String getInfo = ("Company name = " + companyName + ", " + "Current price = " + currentPrice + ", " + "Min price = " + minPrice + ", " + "Max price = " + maxPrice);
        return getInfo;
    }

    int getMaxPrice() {
        return maxPrice;
    }
    int getMinPrice() {
        return minPrice;
    }
    int getCurrentPrice() {
        return currentPrice;
    }
}
