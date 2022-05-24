package student_aleksandr_zuk.lesson_11.level_1;

class SafeV2 {

    private final String password;
    private int moneyAmount;

    public SafeV2(String password, int moneyAmount) {
        this.password = password;
        this.moneyAmount = moneyAmount;
    }

    public int getMoney(String password, int moneyAmount) {
        if (this.password.equals(password) && this.moneyAmount >= moneyAmount) {
            this.moneyAmount = this.moneyAmount - moneyAmount;
        } else System.out.println("Password is incorrect or invalid amount value");
        return moneyAmount;
    }

    public int putMoney(String password, int moneyAmount) {
        if (this.password.equals(password)) {
            this.moneyAmount = this.moneyAmount + moneyAmount;
        } else System.out.println("Password is incorrect");
        return moneyAmount;
    }

    public int getMoneyAmount() {
        return moneyAmount;
    }
}


