package student_nadezda_travkina.lesson3.level7;

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

