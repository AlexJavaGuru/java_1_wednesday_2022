package student_aleksandrs_korsaks.ak_lesson_14.level_3;

import java.util.Arrays;
import java.util.List;

class TransactionTestData {

    public List<Transaction> getTransactions() {

        List<Transaction> transactions = Arrays.asList(
                new Transaction(new Trader("Brian", "Cambridge"), 2011, 300),
                new Transaction(new Trader("Raoul", "Cambridge"), 2012, 1000),
                new Transaction(new Trader("Raoul", "Cambridge"), 2011, 400),
                new Transaction(new Trader("Mario", "Milan"), 2012, 710),
                new Transaction(new Trader("Mario", "Milan"), 2012, 700),
                new Transaction(new Trader("Alan", "Cambridge"), 2012, 950)
        );
        return transactions;
    }
}
