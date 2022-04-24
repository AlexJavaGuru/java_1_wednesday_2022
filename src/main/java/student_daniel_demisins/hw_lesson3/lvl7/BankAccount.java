package student_daniel_demisins.hw_lesson3.lvl7;

public class BankAccount {
    String owner;
    int money;

    BankAccount(String owner, int money) {

        this.owner = owner;
        this.money = money;
    }

    String getOwner() {

        return this.owner;
    }

    int getMoney() {

        return this.money;
    }
}
