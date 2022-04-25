package student_jekaterina_soldatova.lesson11.level_4_junior;

class FraudDetectorTest {
    public static void main(String[] args) {
        FraudDetectorTest test = new FraudDetectorTest();
        test.IsTraderFraud();
        test.IsTraderNotFraud();
        test.IsAmountTooBig();
        test.IsAmountNotTooBig();


    }

    void IsTraderFraud() {
        Transaction transaction = new Transaction(new Trader("Pokemon", "Riga"), 500);
        FraudDetector detector = new FraudDetector();
        if (detector.isFraud(transaction)) {
            System.out.println("Trader is fraud test - ok");
        } else {
            System.out.println("Trader is fraud test - fail");
        }
    }

    void IsTraderNotFraud() {
        Transaction transaction = new Transaction(new Trader("Someone", "Riga"), 500);
        FraudDetector detector = new FraudDetector();
        if (!detector.isFraud(transaction)) {
            System.out.println("Trader is not fraud test - ok");
        } else {
            System.out.println("Trader is not fraud test - fail");
        }
    }

    void IsAmountTooBig() {
        Transaction transaction = new Transaction(new Trader("Someone", "Riga"), 1000001);
        FraudDetector detector = new FraudDetector();
        if (detector.isFraud(transaction)) {
            System.out.println("Amount too big test - ok");
        } else {
            System.out.println("Amount too big test - fail");
        }
    }

    void IsAmountNotTooBig() {
        Transaction transaction = new Transaction(new Trader("Someone", "Riga"), 999999);
        FraudDetector detector = new FraudDetector();
        if (!detector.isFraud(transaction)) {
            System.out.println("Amount not too big test - ok");
        } else {
            System.out.println("Amount not too big test - fail");
        }
    }
}
