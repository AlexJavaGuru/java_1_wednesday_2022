package student_aleksandrs_korsaks.ak_lesson_14.level_3_4_5_6;

import java.util.*;
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

    public List<Integer> getTransactionsYears(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getYear)
                .collect(Collectors.toList());
    }

    public Set<Integer> getTransactionsUniqueYears(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getYear)
                .collect(Collectors.toSet());
    }

    public Set<String> getUniqueTradersNames(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getName)
                .collect(Collectors.toSet());
    }

    public Set<String> getUniqueTradersCities(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getCity)
                .collect(Collectors.toSet());
    }

    public Set<String> findTraderNamesFromCity(List<Transaction> transactions, String city) {
        return transactions.stream()
                .map(Transaction::getTrader)
                .filter(trader -> trader.getCity().equals(city))
                .map(Trader::getName)
                .collect(Collectors.toSet());
    }

    public Boolean isAnyTraderBasedOnCity(List<Transaction> transactions, String cityToCheck) {
        return transactions.stream()
                .map(Transaction::getTrader)
                .anyMatch(trd -> trd.getCity().equals(cityToCheck));
    }

//    public boolean isAnyTraderBasedOnMilan2(List<Transaction> transactions) {
//        return transactions.stream()
//                .anyMatch(transaction -> transaction.getTrader().getCity().equals("Milan"));
//    }

    Optional<Integer> findMaxTransactionValue(List<Transaction> transactions) {
        return Optional.ofNullable(transactions).stream()
                .flatMap(Collection::stream)
                .map(Transaction::getValue)
                .max(Comparator.comparing(Integer::intValue));
    }

    Optional<Integer> findMinTransactionValue(List<Transaction> transactions) {
        return Optional.ofNullable(transactions).stream()
                .flatMap(Collection::stream)
                .map(Transaction::getValue)
                .min(Comparator.comparing(Integer::intValue));
    }
}
