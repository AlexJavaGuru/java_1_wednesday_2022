package student_igors.lesson_3.level_7;

public class BankAccount {
    String owner;
    int money;

    public BankAccount() {
    }
         public BankAccount(String owner, int moneyAmount) {
            this.owner = owner;
            this.money = moneyAmount;
        }

        String getOwner() {
            return this.owner;
        }

        int getMoney() {
            return this.money;
        }

    }



