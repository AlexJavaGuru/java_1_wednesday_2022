package student_jekaterina_soldatova.lesson11.level_4_junior;

import java.util.List;

class FraudDetectorTest {
    public static void main(String[] args) {
        FraudDetectorTest test = new FraudDetectorTest();
        test.isTraderFraud();
        test.isTraderNotFraud();
        test.isAmountTooBig();
        test.isAmountNotTooBig();
        test.isCityFraudSydney();
        test.isCityNotFraud();
        test.isCountryFraudJamaica();
        test.isCountryNotFraud();
        test.isTraderGermanAmountFraud();

    }

    void isTraderFraud() {
        FraudRulesList fraudRulesList = new FraudRulesList();
        List<FraudRule> rules = fraudRulesList.getFraudRules();
        FraudDetector detector = new FraudDetector(rules);
        Transaction transaction = new Transaction(new Trader("Pokemon", "Riga"), 500);
        if (detector.isFraud(transaction)) {
            System.out.println("Trader is fraud test - ok");
        } else {
            System.out.println("Trader is fraud test - fail");
        }
    }

    void isTraderNotFraud() {
        Transaction transaction = new Transaction(new Trader("Someone", "Riga"), 500);
        FraudRulesList fraudRulesList = new FraudRulesList();
        List<FraudRule> rules = fraudRulesList.getFraudRules();
        FraudDetector detector = new FraudDetector(rules);
        if (!detector.isFraud(transaction)) {
            System.out.println("Trader is not fraud test - ok");
        } else {
            System.out.println("Trader is not fraud test - fail");
        }
    }

    void isAmountTooBig() {
        Transaction transaction = new Transaction(new Trader("Someone", "Riga"), 1000001);
        FraudRulesList fraudRulesList = new FraudRulesList();
        List<FraudRule> rules = fraudRulesList.getFraudRules();
        FraudDetector detector = new FraudDetector(rules);
        if (detector.isFraud(transaction)) {
            System.out.println("Amount too big test - ok");
        } else {
            System.out.println("Amount too big test - fail");
        }
    }

    void isAmountNotTooBig() {
        Transaction transaction = new Transaction(new Trader("Someone", "Riga"), 999999);
        FraudRulesList fraudRulesList = new FraudRulesList();
        List<FraudRule> rules = fraudRulesList.getFraudRules();
        FraudDetector detector = new FraudDetector(rules);
        if (!detector.isFraud(transaction)) {
            System.out.println("Amount not too big test - ok");
        } else {
            System.out.println("Amount not too big test - fail");
        }
    }

    void isCityFraudSydney() {
        Transaction transaction = new Transaction(new Trader("Someone", "Sydney"), 99);
        FraudRulesList fraudRulesList = new FraudRulesList();
        List<FraudRule> rules = fraudRulesList.getFraudRules();
        FraudDetector detector = new FraudDetector(rules);
        if (detector.isFraud(transaction)) {
            System.out.println("Is city fraud test Sydney- ok");
        } else {
            System.out.println("Is city fraud test Sydney - fail");
        }
    }

    void isCityNotFraud() {
        Transaction transaction = new Transaction(new Trader("Someone", "Riga"), 99);
        FraudRulesList fraudRulesList = new FraudRulesList();
        List<FraudRule> rules = fraudRulesList.getFraudRules();
        FraudDetector detector = new FraudDetector(rules);
        if (!detector.isFraud(transaction)) {
            System.out.println("Is city not fraud test - ok");
        } else {
            System.out.println("Is city not fraud test - fail");
        }
    }

    void isCountryFraudJamaica() {
        Transaction transaction = new Transaction(new Trader("Someone", "Kingston", "Jamaica"), 99);
        FraudRulesList fraudRulesList = new FraudRulesList();
        List<FraudRule> rules = fraudRulesList.getFraudRules();
        FraudDetector detector = new FraudDetector(rules);
        if (detector.isFraud(transaction)) {
            System.out.println("Is country fraud test Jamaica - ok");
        } else {
            System.out.println("Is country fraud test Jamaica - fail");
        }
    }

    void isCountryNotFraud() {
        Transaction transaction = new Transaction(new Trader("Someone", "Berlin", "Germany"), 99);
        FraudRulesList fraudRulesList = new FraudRulesList();
        List<FraudRule> rules = fraudRulesList.getFraudRules();
        FraudDetector detector = new FraudDetector(rules);
        if (!detector.isFraud(transaction)) {
            System.out.println("Is country not fraud test - ok");
        } else {
            System.out.println("Is country not fraud test - fail");
        }
    }

    void isTraderGermanAmountFraud() {
        Transaction transaction = new Transaction(new Trader("Someone", "Berlin", "Germany"), 2000);
        FraudRulesList fraudRulesList = new FraudRulesList();
        List<FraudRule> rules = fraudRulesList.getFraudRules();
        FraudDetector detector = new FraudDetector(rules);
        if (detector.isFraud(transaction)) {
            System.out.println("Is German amount fraud test - ok");
        } else {
            System.out.println("Is German amount fraud test - fail");
        }
    }
}
