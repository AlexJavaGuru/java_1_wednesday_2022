package student_aleksejs_iljins.lesson_03.level_7;
//Task32
public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Viktor", 100000);
        String owner = bankAccount.getOwner();

        int money = bankAccount.getMoney();

        System.out.println("Owner = " + owner);
        System.out.println("Money = " + money);
    }
}
