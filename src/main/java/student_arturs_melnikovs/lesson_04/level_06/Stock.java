package student_arturs_melnikovs.lesson_04.level_06;

class Stock {
    String nameOfCompany;
    int currentPrice;
    int minPrice;
    int maxPrice;

    Stock(String nameOfCompany, int currentPrice) {
        this.nameOfCompany = nameOfCompany;
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
        System.out.println("Company: " + nameOfCompany);
        System.out.println("Current price: " + currentPrice);
        System.out.println("Min price: " + minPrice);
        System.out.println("Max price: " + maxPrice);
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
