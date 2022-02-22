package student_konstantin_kolesnik.lesson_3.level_7;

class BankAccount {

    String owner;
    int money;

    BankAccount(String ownerFirstName,int moneyAmount) {
        this.owner = ownerFirstName;
        this.money = moneyAmount;
    }

    String getOwner() {
        return this.owner;
    }

    int getMoney() {
        return this.money;
    }

}

