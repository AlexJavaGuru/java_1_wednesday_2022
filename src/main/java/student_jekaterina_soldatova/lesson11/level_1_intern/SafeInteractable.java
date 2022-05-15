package student_jekaterina_soldatova.lesson11.level_1_intern;

class SafeInteractable {

    private double moneyInSafe;
    private String password;

    public SafeInteractable(String password, double moneyInSafe) {
        this.password = password;
        this.moneyInSafe = moneyInSafe;
    }

    public double getMoneyFromSafe(String password, double amountOfMoneyToGet) {
        if (passwordCheck(password) && amountOfMoneyToGet <= moneyInSafe) {
            moneyInSafe -= amountOfMoneyToGet;
            return amountOfMoneyToGet;
        } else {
            return 0.0;
        }
    }

    public void putMoneyInSafe(String password, double amountOfMoneyToPut) {
        if (passwordCheck(password)) {
            moneyInSafe += amountOfMoneyToPut;
        }
    }

    boolean passwordCheck(String password) {
        return password.equals(this.password);
    }
}