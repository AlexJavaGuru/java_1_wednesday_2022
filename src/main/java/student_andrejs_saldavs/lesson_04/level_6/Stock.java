package student_andrejs_saldavs.lesson_04.level_6;

class Stock {

    String companyName;
    int currentPrice;
    int minPrice;
    int maxPrice;

    Stock(String companyName, int currentPrice) {
        this.companyName = companyName;
        this.currentPrice = currentPrice;
        minPrice = currentPrice;
        maxPrice = currentPrice;
    }

    void updatePrice(int newPrice) {
        currentPrice = newPrice;
        if(newPrice > maxPrice) {
            maxPrice = newPrice;
        } else if(newPrice < minPrice) {
            minPrice = newPrice;
        }
    }
    void getPriceInformation() {
        System.out.println("Company: " + companyName);
        System.out.println("Current price: " + currentPrice);
        System.out.println("Min price: " + minPrice);
        System.out.println("Max price: " + maxPrice);
        System.out.println("");
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
