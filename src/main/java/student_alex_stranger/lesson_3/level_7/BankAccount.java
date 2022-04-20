package student_alex_stranger.lesson_3.level_7;

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
