package student_arturs_melnikovs.lesson_14.level_03;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class TransactionAnalysisServiceTest {
    TransactionAnalysisService service;
    TransactionTestData testData = new TransactionTestData();
    List<Transaction> transactions;

    @BeforeEach
    void setUp() {
        service = new TransactionAnalysisService();
        transactions = testData.getTransactions();
    }

    @Test
    void testShouldReturnUniqueCitiesJoinedWithComa() {
        String expected = "Cambridge,Milan";
        String actual = service.getTraderCities(transactions);
        assertEquals(expected, actual);
    }

    @Test
    void testShouldReturnNamesJoinedWithComa() {
        String expected = "Alan,Brian,Mario,Raoul";
        String actual = service.getTraderNames(transactions);
        assertEquals(expected, actual);
    }

    @Test
    void testShouldReturnValue1000() {
        Optional<Integer> expected = Optional.of(1000);
        Optional<Integer> actual = service.getMaxValue(transactions);
        assertEquals(expected, actual);
    }

    @Test
    void testShouldReturnValue300() {
        Optional<Integer> expected = Optional.of(300);
        Optional<Integer> actual = service.getMinValue(transactions);
        assertEquals(expected, actual);
    }


    @Test
    void testShouldReturnFalseWhenCheckingForTradersInRiga() {
        boolean result = service.ifCityHasTrader(transactions, "Riga");
        assertFalse(result);
    }

    @Test
    void testShouldReturnTrueWhenCheckingForTradersInMilan() {
        boolean result = service.ifCityHasTrader(transactions, "Milan");
        assertTrue(result);
    }

    @Test
    void testShouldReturnAllTraderNamesFromCambridge() {
        Set<String> expected = new HashSet<>();
        expected.add("Raoul");
        expected.add("Alan");
        expected.add("Brian");
        Set<String> actual = service.getTraderByCity(transactions, "Cambridge");
        assertEquals(expected, actual);
    }

    @Test
    void testShouldReturnAllTraderNamesFromMilan() {
        Set<String> expected = new HashSet<>();
        expected.add("Mario");
        Set<String> actual = service.getTraderByCity(transactions, "Milan");
        assertEquals(expected, actual);
    }

    @Test
    void testShouldReturnAllUniqueTraderNames() {
        Set<String> expected = new HashSet<>();
        expected.add("Raoul");
        expected.add("Mario");
        expected.add("Alan");
        expected.add("Brian");
        Set<String> actual = service.getAllTraderNames(transactions);
        assertEquals(expected, actual);
    }

    @Test
    void testShouldReturnAllUniqueTraderCities() {
        Set<String> expected = new HashSet<>();
        expected.add("Cambridge");
        expected.add("Milan");
        Set<String> actual = service.getAllTraderCities(transactions);
        assertEquals(expected, actual);
    }

    @Test
    void testShouldReturnAllTransactionYears() {
        List<Integer> expected = Arrays.asList(2011, 2012, 2011, 2012, 2012, 2012);
        List<Integer> actual = service.getAllTransactionYears(transactions);
        assertEquals(expected, actual);
    }

    @Test
    void testShouldReturnUniqueTransactionYears() {
        Set<Integer> expected = new HashSet<>();
        expected.add(2011);
        expected.add(2012);
        Set<Integer> actual = service.getUniqueTransactionYears(transactions);
        assertEquals(expected, actual);
    }

    @Test
    void testShouldReturnTransactionsSortedByValueAsc() {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");
        List<Transaction> expected = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 700),
                new Transaction(mario, 2012, 710),
                new Transaction(alan, 2012, 950),
                new Transaction(raoul, 2012, 1000)
        );
        List<Transaction> actual = service.sortByValueAsc(transactions);
        assertEquals(expected, actual);
    }

    @Test
    void testShouldReturnTransactionsFrom2011SortedByValuesAsc() {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader brian = new Trader("Brian","Cambridge");
        List<Transaction> expected = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2011, 400)
        );
        List<Transaction> actual = service.getTransactionsByYear(transactions, 2011);
        assertEquals(expected, actual);
    }
    @Test
    void testShouldReturnTransactionsSortedByValueDesc() {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");
        List<Transaction> expected = Arrays.asList(
                new Transaction(raoul, 2012, 1000),
                new Transaction(alan, 2012, 950),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(raoul, 2011, 400),
                new Transaction(brian, 2011, 300)
        );
        List<Transaction> actual = service.sortByValueDesc(transactions);
        assertEquals(expected, actual);
    }

    @Test
    void testShouldReturnTransactionsFrom2012() {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        List<Transaction> expected = Arrays.asList(
                new Transaction(raoul, 2012, 1000),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );
        List<Transaction> actual = service.getTransactions(transactions, 2012);
        assertEquals(expected, actual);
    }
    @Test
    void testShouldReturnTransactionsFrom2011() {
        Trader brian = new Trader("Brian","Cambridge");
        Trader raoul = new Trader("Raoul", "Cambridge");
        List<Transaction> expected = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2011, 400)
        );
        List<Transaction> actual = service.getTransactions(transactions, 2011);
        assertEquals(expected, actual);
    }
}