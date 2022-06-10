package student_arturs_melnikovs.lesson_14.level_03;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

class TransactionAnalysisService {

    public List<Transaction> getTransactions(List<Transaction> transactions, int year) {
        return transactions.stream()
                .filter(transaction -> transaction.getYear() == year)
                .collect(Collectors.toList());
    }

    public List<Transaction> getTransactionsByYear(List<Transaction> transactions, int year) {
        return transactions.stream()
                .filter(transaction -> transaction.getYear() == year)
                .sorted(Comparator.comparing(Transaction::getValue))
                .collect(Collectors.toList());
    }

    public List<Transaction> sortByValueAsc(List<Transaction> transactions) {
        return transactions.stream()
                .sorted(Comparator.comparing(Transaction::getValue))
                .collect(Collectors.toList());
    }

    public List<Transaction> sortByValueDesc(List<Transaction> transactions) {
        return transactions.stream()
                .sorted(Comparator.comparing(Transaction::getValue).reversed())
                .collect(Collectors.toList());
    }

    public List<Integer> getAllTransactionYears(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getYear)
                .collect(Collectors.toList());
    }

    public Set<Integer> getUniqueTransactionYears(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getYear)
                .collect(Collectors.toSet());
    }

    public Set<String> getAllTraderNames(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getName)
                .collect(Collectors.toSet());
    }

    public Set<String> getAllTraderCities(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getCity)
                .collect(Collectors.toSet());
    }

    public Set<String> getTraderByCity(List<Transaction> transactions, String city) {
        return transactions.stream()
                .map(Transaction::getTrader)
                .filter(trader -> trader.getCity().equals(city))
                .map(Trader::getName)
                .collect(Collectors.toSet());
    }

    public boolean ifCityHasTrader(List<Transaction> transactions, String city) {
        return transactions.stream()
                .map(Transaction::getTrader)
                .anyMatch(trader -> trader.getCity().equals(city));
    }

    public Optional<Integer> getMaxValue(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getValue)
                .max(Comparator.comparing(Integer::intValue));
    }

    public Optional<Integer> getMinValue(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getValue)
                .min(Comparator.comparing(Integer::intValue));
    }

    public String getTraderNames(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getName)
                .distinct()
                .sorted()
                .collect(Collectors.joining(","));
    }

    public String getTraderCities(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getCity)
                .distinct()
                .sorted()
                .collect(Collectors.joining(","));
    }

}
