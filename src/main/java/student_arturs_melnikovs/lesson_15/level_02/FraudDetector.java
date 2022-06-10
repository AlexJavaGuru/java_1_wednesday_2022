package student_arturs_melnikovs.lesson_15.level_02;

import teacher.lesson_11_srp.lessoncode.newversion.Trader;

class FraudDetector {

    boolean isFraud(Trader trader) {
        return isTraderNameFraud(trader)
                ||
                (isTraderCityFraud(trader));
    }

    private boolean isTraderNameFraud (Trader trader) {
        String traderName = trader.getFullName();
        return traderName.equals("Pokemon");
    }

    private boolean isTraderCityFraud(Trader trader) {
        String cityName = trader.getCity();
        return cityName.equals("Sidney");
    }

}
