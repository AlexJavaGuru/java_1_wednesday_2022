package student_aleksandrs_jakovenko.lesson_11.level_4_5_6;

class Transaction {

    private Trader trader;
    private int amount;

    public Transaction(Trader trader) {
        this.trader = trader;
    }

    public Transaction(Trader trader, int amount) {
        this.trader = trader;
        this.amount = amount;
    }

    public Trader getTrader() {
        return trader;
    }

    public int getAmount() {
        return amount;
    }
}