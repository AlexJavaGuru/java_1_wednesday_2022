package student_andrejs_saldavs.lesson_04.level_6;

class Stock {

    String companyName;
    int currentPrice;
    int minPrice;
    int maxPrice;

    public Stock(String companyName, int currentPrice, int minPrice, int maxPrice) {
        this.companyName = companyName;
        this.currentPrice = currentPrice;
        this.minPrice = minPrice;
        this.maxPrice = maxPrice;
    }

    public String getPriceInformation() {
        return "Company = " + companyName + ", Current Price = " + currentPrice + ", Min Price = " + minPrice + ", Max Price = " + maxPrice;
    }

    public int updatePrice(int newPrice) {
        currentPrice = newPrice;
        if (newPrice < minPrice) {
            minPrice = newPrice;
        } else if (newPrice > maxPrice) {
            maxPrice = newPrice;
        }
        return newPrice;
    }

}
