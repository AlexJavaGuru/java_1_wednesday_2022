package student_alex_stranger.lesson_3.level_4;

public class BankAccount {

    String ownerFirstName;
    String ownerLastName;
    int moneyAmount;

    BankAccount (String ownerFirstName,
               String ownerLastName,
    int moneyAmount) {
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
  public int getMoneyAmount() {
        return this.moneyAmount;
    }

}
