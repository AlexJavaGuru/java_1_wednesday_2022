package student_jelena_boicova.lesson_4_homerwork;

public class Stock {
    String companyName;
    int currentPrice;
    int minPrice;
    int maxPrice;

    public Stock(String companyName, int currentPrice) {
        this.companyName = companyName;
        this.currentPrice = currentPrice;
        minPrice = currentPrice;
        maxPrice = currentPrice;
    }

    String getPriceInformation() {
        String getInfo = ("Company:" + companyName + ", currentPrice =" + currentPrice + ", maxPrice=" + maxPrice +", minPrice=" + minPrice);
        return getInfo;
    }

    void updatePrice(int newPrice){
        currentPrice = newPrice;
        if(newPrice < minPrice){
            minPrice = newPrice;
        } else if(newPrice > maxPrice){
            maxPrice = newPrice;
        }
    }

    public int getCurrentPrice(){
        return currentPrice;
    }

    public int getMinPrice(){
        return minPrice;
    }

    public int getMaxPrice(){
        return maxPrice;
    }
}