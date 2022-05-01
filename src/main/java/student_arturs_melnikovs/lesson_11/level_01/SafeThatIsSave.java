package student_arturs_melnikovs.lesson_11.level_01;

class SafeThatIsSave {
    private final String password;
    private int moneyBalance;

    public SafeThatIsSave(String password, int moneyBalance) {
        this.password = password;
        this.moneyBalance = moneyBalance;
    }

    public int getMoney(String password) {
        if (password.equals(this.password)) {
            return moneyBalance;
        } else {
            return 0;
        }
    }

    public void putMoney(String password, int moneyToPut) {
        if (password.equals(this.password)) {
            this.moneyBalance += moneyToPut;
        } else {
            System.out.println("Wrong password");
        }
    }
}
