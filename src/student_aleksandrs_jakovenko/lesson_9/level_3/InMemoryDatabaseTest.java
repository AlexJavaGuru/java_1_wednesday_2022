package student_aleksandrs_jakovenko.lesson_9.level_3;

import java.util.Arrays;
import java.util.Optional;

class InMemoryDatabaseTest {

    public static void main(String[] args) {

        InMemoryDatabaseTest test = new InMemoryDatabaseTest();
        test.saveTest();
        test.findTest();
    }

    public void saveTest() {
        InMemoryDatabase inMemoryDatabase = new InMemoryDatabase();
        Product bmw = new Product("BMW");
        inMemoryDatabase.save(bmw);
        Product[] expectedResult = {bmw};
        Product[] actualResult = inMemoryDatabase.getProducts();
        checkResult(actualResult, expectedResult, "Save test");
    }

    public void findTest() {
        InMemoryDatabase inMemoryDatabase = new InMemoryDatabase();
        Product bmw = new Product("BMW");
        Product audi = new Product("AUDI");
        inMemoryDatabase.save(bmw);
        inMemoryDatabase.save(audi);
        Optional <Product> expectedResult = Optional.of(bmw);
        Optional<Product> actualResult = inMemoryDatabase.findByTitle("BMW");
        checkResult(actualResult, expectedResult, "Find test");
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
