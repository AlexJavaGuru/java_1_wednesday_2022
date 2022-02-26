package student_aleksejs_iljins.lesson_04.level_6;

class Stock {

    String name;
    int currentPrice;
    int maxPrice;
    int minPrice;

    public Stock (String name, int currentPrice){
        this.name = name;
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
        return ("Company: " + name + ", " + "Current Price: " + currentPrice + ", " + "Maximal Price: " + maxPrice + ", " + "Minimal Price: " + minPrice);
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
