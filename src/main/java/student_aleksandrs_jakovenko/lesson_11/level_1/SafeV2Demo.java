package student_aleksandrs_jakovenko.lesson_11.level_1;

class SafeV2Demo {

    public static void main(String[] args) {

        SafeV2 safeV2 = new SafeV2("qwe123", 1000);
        safeV2.getMoney("qwe123", 100);
        safeV2.putMoney("qwe123", 500);
        System.out.println(safeV2.getMoneyAmount());
    }
}
