package student_jekaterina_soldatova.lesson11.level_4_junior;

public class Transaction {

    private Trader trader;
    private int amount;

    Transaction(Trader trader, int amount) {
        this.trader = trader;
        this.amount = amount;
    }

    Trader getTrader() {
        return trader;
    }

    int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Trader:\n" + trader + "\n" + "amount:\n" + amount;
    }
}
