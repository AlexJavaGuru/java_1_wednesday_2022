package student_aleksandr_zuk.lesson_11.level_1;

class SafeV2Demo {

    public static void main(String[] args) {

        SafeV2 safeV2 = new SafeV2("alex", 100);
        safeV2.getMoney("alex", 50);
        safeV2.putMoney("alex", 100);
        System.out.println(safeV2.getMoneyAmount());
    }
}
