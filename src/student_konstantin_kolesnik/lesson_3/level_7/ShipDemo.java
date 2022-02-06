package student_konstantin_kolesnik.lesson_3.level_7;

class ShipDemo {

    public static void main(String[] args) {

        Ship cargoShip = new Ship();
        cargoShip.veselPrint();

        Ship cargoShipOne = new Ship();
        cargoShipOne.shipPrint();

        Ship cargoShipTwo = new Ship("HMM Algeciras", 23.964, 2021, 399.9, "Daewoo Shipbuilding and Marine Engineering / South Korea");
        cargoShipTwo.shipPrint();

        Ship cargoShipThree = new Ship("HMM Oslo", 2020, 23.792, 400, "Samsung Heavy Industries / South Korea");
        cargoShipThree.shipPrint();
    }
}
