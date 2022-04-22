package teacher.lesson_11_srp.lessoncode.newversion;

import java.util.ArrayList;
import java.util.List;

//- Rule 1: трейдер по имени "Pokemon" является мошенником, все его транзакции должны быть отклонены.
//- Rule 2: все транзакции на сумму больше 1000000 должны быть отклонены.
//- Rule 3: все транзакции трейдеров из города "Сидней" должны быть отклонены.
//- Rule 4: все транзакции от трейдеров из страны Ямайка должны быть отклонены.
//- Rule 5: все транзакции трейдеров из Германии на сумму больше 1000 должны быть отклонены.
public class FraudDetector {

    private final FraudRule[] fraudRules;

    public FraudDetector(FraudRule[] fraudRules) {
        this.fraudRules = fraudRules;
    }

    FraudDetectionResult isFraud(Transaction t) {
        List<String> triggeredRules = new ArrayList<>();
        boolean isFraud = false;
        for (FraudRule rule : fraudRules) {
            if (rule.isFraud(t)) {
                triggeredRules.add(rule.getRuleName());
                isFraud = true;
            }
        }
        return new FraudDetectionResult(isFraud, triggeredRules, t);
    }
}
