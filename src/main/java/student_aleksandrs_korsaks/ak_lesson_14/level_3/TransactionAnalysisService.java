package student_aleksandrs_korsaks.ak_lesson_14.level_3;

import java.util.List;
import java.util.stream.Collectors;

public class TransactionAnalysisService {

    public List<Transaction> findTransactionsByYear(List<Transaction> transactions, int year) {
        return transactions.stream()
                .filter(trx -> trx.getYear() == year)
                .collect(Collectors.toList());
    }
}
