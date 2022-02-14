package student_aleksandrs_korsaks.ak_lesson_4.level_6;

class Stock {
    private final String companyName;
    private int currentPrice;
    private int minPrice;
    private int maxPrice;

    public Stock(String companyName, int currentPrice) {
        this.companyName = companyName;
        this.currentPrice = currentPrice;
        this.minPrice = currentPrice;
        this.maxPrice = currentPrice;
    }

    public void updatePrice(int newPrice) {
        currentPrice = newPrice;
        if (currentPrice > maxPrice) {
            maxPrice = currentPrice;
        }
        if (currentPrice < minPrice) {
            minPrice = currentPrice;
        }
    }

    public String getPriceInformation() {
        return "Company = '" + companyName + '\'' +
                ", Current Price = " + currentPrice +
                ", Min Price=" + minPrice +
                ", Max Price=" + maxPrice ;
    }

    public String getCompanyName() {
        return companyName;
    }

    public int getCurrentPrice() {
        return currentPrice;
    }

    public int getMinPrice() {
        return minPrice;
    }

    public int getMaxPrice() {
        return maxPrice;
    }
}
