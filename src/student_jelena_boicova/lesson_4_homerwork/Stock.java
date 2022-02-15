package student_jelena_boicova.lesson_4_homerwork;

import java.math.BigDecimal;

public class Stock {

    String companyName;
    int currentPrice;
    int minPrice;
    int maxPrice;

    public Stock() {
    }

    public String getPriceInformation() {
        return "Company:" + companyName + ", currentPrice =" + currentPrice + ", maxPrice=" + maxPrice +", minPrice=" + minPrice;
    }
    public void updatePrice(int newPrice){
        currentPrice = newPrice;
        if(newPrice < minPrice){
        minPrice = newPrice;
    }
        else if(newPrice > maxPrice){
        maxPrice = newPrice;
    }

}

