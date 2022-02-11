package student_aleksejs_iljins.lesson_03.level_4;

class BankAccountDemo {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount("John", "Travolta", 100000);

        String ownerFirstName = bankAccount.getOwnerFirstName();
        String ownerLastName = bankAccount.getOwnerLastName();

        int moneyAmount = bankAccount.moneyAmount();

        System.out.println("Owner first name = " + ownerFirstName);
        System.out.println("Owner last name = " + ownerLastName);
        System.out.println("Money amount = " + moneyAmount + " EUR");
    }
}
