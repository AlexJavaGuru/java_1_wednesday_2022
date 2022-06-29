package student_aleksandrs_korsaks.ak_lesson_11.level_1;

class SafeDemo {
    public static void main(String[] args) {
        Safe safe = new Safe();
        safe.moneyAmount = 100;
        safe.pinCode = 1234;
        System.out.println("Pin code is - " + safe.pinCode);
        System.out.println("Money amount in safe is - " + safe.moneyAmount + " eur");
    }
}
