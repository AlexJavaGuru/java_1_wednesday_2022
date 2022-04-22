package teacher.lesson_11_srp.lessoncode.oldversion;

//- Rule 1: трейдер по имени "Pokemon" является мошенником, все его транзакции должны быть отклонены.
//- Rule 2: все транзакции на сумму больше 1000000 должны быть отклонены.
//- Rule 3: все транзакции трейдеров из города "Сидней" должны быть отклонены.
//- Rule 4: все транзакции от трейдеров из страны Ямайка должны быть отклонены.
//- Rule 5: все транзакции трейдеров из Германии на сумму больше 1000 должны быть отклонены.
public class FraudDetector {



    boolean isFraud(Transaction t) {
        boolean result = false;
        if (t.getTrader().getFullName().equals("Pokemon") ||
                t.getAmount() > 100000 ||
                t.getTrader().getCity().equals("Sidney") ||
                t.getTrader().getCountry().equals("Ямайка") ||
                (t.getTrader().getCountry().equals("Germany") && t.getAmount() > 1000)) {
            result = true;
        }
        return result;
    }
}
