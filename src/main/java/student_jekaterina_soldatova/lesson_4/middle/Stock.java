package student_jekaterina_soldatova.lesson_4.middle;

class Stock {
    String company;
    int currentPrice;
    int minPrice;
    int maxPrice;

    Stock(String company, int currentPrice) {
        this.company = company;
        this.currentPrice = currentPrice;
        minPrice = currentPrice;
        maxPrice = currentPrice;
    }

    String getPriceInformation() {
        return "Company = \"" + company + "\", Current Price = " + currentPrice + ", Min Price = " + minPrice + ", Max Price = " + maxPrice;
    }

    void updatePrice(int newPrice) {
        if (newPrice > maxPrice) {
            maxPrice = newPrice;
        } else if (newPrice < minPrice) {
            minPrice = newPrice;
        }
        currentPrice = newPrice;
    }
}
