package student_aleksandrs_korsaks.ak_lesson_11.level_1;

class Safe_v2Demo {
    public static void main(String[] args) {
        Safe_v2 safe_v2 = new Safe_v2(1234, 100);
        System.out.println("From beginning " + safe_v2 + " eur");
        safe_v2.putMoneyAmount(1234, 100);
        System.out.println("After putting 100 eur: " + safe_v2 + " eur");
        safe_v2.putMoneyAmount(123, 100);
        System.out.println("After not putting 100 eur (wrong pin): " + safe_v2 + " eur");

        System.out.print("After getting 50 eur:");
        System.out.println(safe_v2.getMoneyAmount(1234, 50));

        System.out.println(safe_v2.getMoneyAmount(123, 50));
        System.out.println("After not getting 50 eur (wrong pin): " + safe_v2 + " eur");
    }
}
