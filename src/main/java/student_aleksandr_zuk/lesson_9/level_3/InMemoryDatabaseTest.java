package student_aleksandr_zuk.lesson_9.level_3;

import java.util.Arrays;
import java.util.Optional;

class InMemoryDatabaseTest {

    public static void main(String[] args) {

        InMemoryDatabaseTest test = new InMemoryDatabaseTest();
        test.findTest();
        test.saveTest();
    }

    public void saveTest() {
        InMemoryDatabase inMemoryDatabase = new InMemoryDatabase();
        Product apple = new Product("Apple");
        inMemoryDatabase.save(apple);
        Product[] expectedResult = {apple};
        Product[] actualResult = inMemoryDatabase.getProducts();
        checkResult(actualResult, expectedResult, "Save test");
    }

    public void findTest() {
        InMemoryDatabase inMemoryDatabase = new InMemoryDatabase();
        Product apple = new Product("Apple");
        Product cherry = new Product("Cherry");
        inMemoryDatabase.save(apple);
        inMemoryDatabase.save(cherry);
        Optional<Product> expectedResult = Optional.of(apple);
        Optional<Product> actualResult = inMemoryDatabase.findByTitle("Apple");
        checkResult(actualResult, expectedResult, "Find Test");
    }

    public void checkResult(Product[] actualResult, Product[] expectedResult, String testName) {
        if (Arrays.equals(actualResult, expectedResult)) {
            System.out.println(testName + " = OK");
        } else System.out.println(testName + " = FAIL");
    }

    public void checkResult(Optional actualResult, Optional expectedResult, String testName) {
        if (actualResult.equals(expectedResult)) {
            System.out.println(testName + " = OK");
        } else System.out.println(testName + " = FAIL");
    }
}
