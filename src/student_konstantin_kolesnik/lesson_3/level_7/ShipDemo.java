package student_konstantin_kolesnik.lesson_3.level_7;

class ShipDemo {

    public static void main(String[] args) {

        Ship everAce = new Ship("Ever Ace", 23.992, 2021, 400,"Samsung Heavy Industries in / South Korea");
        everAce.shipPrint();

        Ship hmmAlgeciras = new Ship("HMM Algeciras", 23.964, 2021, 399.9, "Daewoo Shipbuilding and Marine Engineering / South Korea");
        hmmAlgeciras.shipPrint();

        Ship hmmOslo = new Ship("HMM Oslo", 23.792, 2020, 400, "Samsung Heavy Industries / South Korea");
        hmmOslo.shipPrint();
    }
}
