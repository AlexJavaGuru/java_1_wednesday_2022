package student_aleksandrs_jakovenko.lesson_3.level_7;
// Task_32
class BankAccount {
    String owner;
    int money;

    BankAccount(String owner, int money) {
        this.owner = owner;
        this.money = money;
    }

    String getOwner() {
        return owner;
    }

    int getMoney() {
        return money;
    }
}
