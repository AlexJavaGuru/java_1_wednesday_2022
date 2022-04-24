package student_nadezda_travkina.lesson3.level4;

class BankAccount {

    String ownerFirstName;
    String ownerLastName;
    int moneyAmount;

    BankAccount(String ownerFirstName, String ownerLastName, int moneyAmount) {
        this.ownerFirstName = ownerFirstName;
        this.ownerLastName = ownerLastName;
        this.moneyAmount = moneyAmount();
    }

    private int moneyAmount() {
        int moneyAmount = this.moneyAmount;
        return moneyAmount;

    }

    void AccountInfo() {
        System.out.println(ownerFirstName + "\n" + "Owner last name is: " + ownerLastName + "\n" + "Amount of money is: "+ moneyAmount);
    }

}

