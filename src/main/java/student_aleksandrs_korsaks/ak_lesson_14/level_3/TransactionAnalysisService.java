package student_aleksandrs_korsaks.ak_lesson_14.level_3;

import java.util.List;
import java.util.stream.Collectors;

public class TransactionAnalysisService {

    public List<Transaction> findTransactionsIn2011(List<Transaction> transactions) {
        return transactions.stream()
                .filter(trx -> trx.getYear() == 2011)
                .collect(Collectors.toList());
    }
}
