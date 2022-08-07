package student_aleksandrs_korsaks.ak_lesson_14.level_3_4_5_6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TransactionAnalysisServiceTest {

    TransactionTestData transactionTestData;
    TransactionAnalysisService transactionAnalysisService;
    List<Transaction> expectedResultTRX;
    Transaction one;
    Transaction two;
    Transaction three;
    Transaction four;
    Transaction five;
    Transaction six;

    @BeforeEach
    void setUp() {
        transactionTestData = new TransactionTestData();
        transactionAnalysisService = new TransactionAnalysisService();
        expectedResultTRX = new ArrayList<>();
        one = new Transaction(new Trader("Brian", "Cambridge"), 2011, 300);
        two = new Transaction(new Trader("Raoul", "Cambridge"), 2012, 1000);
        three = new Transaction(new Trader("Raoul", "Cambridge"), 2011, 400);
        four = new Transaction(new Trader("Mario", "Milan"), 2012, 710);
        five = new Transaction(new Trader("Mario", "Milan"), 2012, 700);
        six = new Transaction(new Trader("Alan", "Cambridge"), 2012, 950);
    }

    @Test
    void shouldFindTransactionsIn2011() {
        expectedResultTRX.add(one);
        expectedResultTRX.add(three);
        assertEquals(expectedResultTRX, transactionAnalysisService.findTransactionsByYear(transactionTestData.getTransactions(),
                2011));
    }

    @Test
    void shouldFindTransactionsIn2012() {
        expectedResultTRX.add(two);
        expectedResultTRX.add(four);
        expectedResultTRX.add(five);
        expectedResultTRX.add(six);
        assertEquals(expectedResultTRX, transactionAnalysisService.findTransactionsByYear(transactionTestData.getTransactions(),
                2012));
    }

    @Test
    void shouldFindTransactionsIn2013() {
        assertEquals(expectedResultTRX, transactionAnalysisService.findTransactionsByYear(transactionTestData.getTransactions(),
                2013));
    }

    @Test
    void shouldSortTransactionsByValueAsc() {
        expectedResultTRX.add(one);
        expectedResultTRX.add(three);
        expectedResultTRX.add(five);
        expectedResultTRX.add(four);
        expectedResultTRX.add(six);
        expectedResultTRX.add(two);
        assertEquals(expectedResultTRX, transactionAnalysisService.sortTransactionsByValueAsc(transactionTestData.getTransactions()));
    }

    @Test
    void shouldSortTransactionsByValueDesc() {
        expectedResultTRX.add(two);
        expectedResultTRX.add(six);
        expectedResultTRX.add(four);
        expectedResultTRX.add(five);
        expectedResultTRX.add(three);
        expectedResultTRX.add(one);
        assertEquals(expectedResultTRX, transactionAnalysisService.sortTransactionsByValueDesc(transactionTestData.getTransactions()));
    }

    @Test
    void shouldFindTransactionsIn2011SortByValueAsc() {
        expectedResultTRX.add(one);
        expectedResultTRX.add(three);
        assertEquals(expectedResultTRX, transactionAnalysisService.findTransactionsIn2011SortByValueAsc(transactionTestData.getTransactions()));
    }

    @Test
    void shouldGetTransactionsYears() {
        List<Integer> expectedResult = List.of(2011, 2012, 2011, 2012, 2012, 2012);
        assertEquals(expectedResult, transactionAnalysisService.getTransactionsYears(transactionTestData.getTransactions()));
    }

    @Test
    void shouldGetTransactionsUniqueYears() {
        Set<Integer> expectedResult = Set.of(2011, 2012);
        assertEquals(expectedResult, transactionAnalysisService.getTransactionsUniqueYears(transactionTestData.getTransactions()));
    }

    @Test
    void shouldGetUniqueTradersNames() {
        Set<String> expectedResult = Set.of("Brian", "Raoul", "Mario", "Alan");
        assertEquals(expectedResult, transactionAnalysisService.getUniqueTradersNames(transactionTestData.getTransactions()));
    }

    @Test
    void shouldGetUniqueTradersCities() {
        Set<String> expectedResult = Set.of("Cambridge", "Milan");
        assertEquals(expectedResult, transactionAnalysisService.getUniqueTradersCities(transactionTestData.getTransactions()));
    }
}