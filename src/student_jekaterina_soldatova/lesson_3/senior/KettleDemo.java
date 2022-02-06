package student_jekaterina_soldatova.lesson_3.senior;

class KettleDemo {
    public static void main(String[] args) throws InterruptedException {
        Kettle kettle = new Kettle(false, 100, false);

        kettle.addWater();
        kettle.changeKettleMode();
        kettle.takeWater();
    }
}
