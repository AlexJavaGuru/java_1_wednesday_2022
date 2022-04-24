package student_aleksejs_iljins.lesson_03.level_7;
//Task32
public class BankAccount {

    String owner;
    int money;

    BankAccount(String owner,int money) {
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
