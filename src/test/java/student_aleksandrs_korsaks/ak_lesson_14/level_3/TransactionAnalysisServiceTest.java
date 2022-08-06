package student_aleksandrs_korsaks.ak_lesson_14.level_3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

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
    void findTransactionsIn2011() {
        expectedResultTRX.add(one);
        expectedResultTRX.add(three);
        assertEquals(expectedResultTRX, transactionAnalysisService.findTransactionsIn2011(transactionTestData.getTransactions()));
    }
}