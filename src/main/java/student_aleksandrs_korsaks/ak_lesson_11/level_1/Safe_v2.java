package student_aleksandrs_korsaks.ak_lesson_11.level_1;

class Safe_v2 {
    private final int pinCode;
    private int moneyAmount;

    public Safe_v2(int pinCode, int moneyAmount) {
        this.pinCode = pinCode;
        this.moneyAmount = moneyAmount;
    }

    public int getMoneyAmount(int pinCodeToCheck, int moneyAmountToGet) {
        if (isPinCodeCorrect(pinCodeToCheck)) {
            subtractMoneyFromSafe(moneyAmountToGet);
            return moneyAmount;
        }
        return 0;
    }

    public void putMoneyAmount(int pinCodeToCheck, int moneyAmount) {
        if (isPinCodeCorrect(pinCodeToCheck)) {
            this.moneyAmount += moneyAmount;
        } else {
            System.out.println("Wrong password");
        }
    }

    private boolean isPinCodeCorrect(int pinCodeToCheck) {
        return pinCodeToCheck == pinCode;
    }

    private void subtractMoneyFromSafe(int moneyAmount) {
        this.moneyAmount -= moneyAmount;
    }

    @Override
    public String toString() {
        return "moneyAmount = " + moneyAmount;
    }
}
