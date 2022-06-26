package student_aleksandrs_korsaks.ak_lesson_11.level_5.fraud_detector_v2;

import java.util.Objects;

class Transaction {

    private Trader trader;
    private int amount;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Transaction that)) return false;
        return getAmount() == that.getAmount() && getTrader().equals(that.getTrader());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTrader(), getAmount());
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "trader = " + trader +
                ", amount = " + amount +
                '}';
    }
}