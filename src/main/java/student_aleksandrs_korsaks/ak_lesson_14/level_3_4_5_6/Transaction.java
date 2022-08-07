package student_aleksandrs_korsaks.ak_lesson_14.level_3_4_5_6;

import java.util.Objects;

public class Transaction {

    private Trader trader;
    private int year;
    private int value;

    public Transaction(Trader trader, int year, int value) {
        this.trader = trader;
        this.year = year;
        this.value = value;
    }

    public Trader getTrader() {
        return trader;
    }

    public int getYear() {
        return year;
    }

    public int getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Transaction that)) return false;
        return getYear() == that.getYear() && getValue() == that.getValue() && getTrader().equals(that.getTrader());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTrader(), getYear(), getValue());
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "trader = " + trader +
                ", year = " + year +
                ", value = " + value +
                '}';
    }
}
