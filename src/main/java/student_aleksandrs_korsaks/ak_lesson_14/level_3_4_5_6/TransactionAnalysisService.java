package student_aleksandrs_korsaks.ak_lesson_14.level_3_4_5_6;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TransactionAnalysisService {

    public List<Transaction> findTransactionsByYear(List<Transaction> transactions, int year) {
        return transactions.stream()
                .filter(trx -> trx.getYear() == year)
                .collect(Collectors.toList());
    }

    public List<Transaction> sortTransactionsByValueAsc(List<Transaction> transactions) {
        return transactions.stream()
                .sorted(Comparator.comparing(Transaction::getValue))
                .collect(Collectors.toList());
    }

    public List<Transaction> sortTransactionsByValueDesc(List<Transaction> transactions) {
        return transactions.stream()
                .sorted(Comparator.comparing(Transaction::getValue).reversed())
                .collect(Collectors.toList());
    }

    public List<Transaction> findTransactionsIn2011SortByValueAsc(List<Transaction> transactions) {
        return transactions.stream()
                .filter(trx -> trx.getYear() == 2011)
                .sorted(Comparator.comparing(Transaction::getValue))
                .collect(Collectors.toList());
    }
}
