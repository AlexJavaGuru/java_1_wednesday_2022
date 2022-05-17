package student_daniel_demisins.hw_lesson3.lvl4;

public class BankAccount {
    String ownerFirstName;
    String ownerLastName;
    int moneyAmount;

    BankAccount(String ownerFirstName, String ownerLastName, int moneyAmount) {
        this.ownerFirstName = ownerFirstName;
        this.ownerLastName = ownerLastName;
        this.moneyAmount = moneyAmount;
    }
    String getOwnerFirstName() {

        return this.ownerFirstName;
    }

    String getOwnerLastName() {

        return this.ownerLastName;
    }

    int getMoneyAmount() {

        return this.moneyAmount;
    }
}
