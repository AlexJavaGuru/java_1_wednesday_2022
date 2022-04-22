package student_konstantin_kolesnik.lesson4.level_6;

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
        if (newPrice < minPrice){
            minPrice = newPrice;
        } else if (newPrice > maxPrice){
            maxPrice = newPrice;
        }
    }
    String getPriceInformation(){
        return ("Company name = " + companyName + ", " + "Current price = " + currentPrice + ", " + "Min price = " + minPrice + ", " + "Max price = " + maxPrice);
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