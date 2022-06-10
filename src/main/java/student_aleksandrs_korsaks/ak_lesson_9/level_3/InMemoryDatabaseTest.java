package student_aleksandrs_korsaks.ak_lesson_9.level_3;

import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;

public class InMemoryDatabaseTest {
    public static void main(String[] args) {
        InMemoryDatabaseTest inMemoryDatabaseTest = new InMemoryDatabaseTest();
        inMemoryDatabaseTest.saveProductTest();
        inMemoryDatabaseTest.findByTitleProductPositiveTest();
        inMemoryDatabaseTest.findByTitleProductNegativeTest();

    }

    public void saveProductTest() {
        ProductDatabase productDatabase = new InMemoryDatabase();
        Product one = new Product("Banana");
        Product two = new Product("Orange");
        productDatabase.save(one);
        productDatabase.save(two);
        Product[] expectedResult = {one, two};
        Product[] realResult = productDatabase.getArrayOfProducts();
        checkTestResult("saveProductTest", Arrays.equals(expectedResult, realResult));
    }

    public void findByTitleProductPositiveTest() {
        ProductDatabase productDatabase = new InMemoryDatabase();
        Product one = new Product("Banana");
        Product two = new Product("Orange");
        productDatabase.save(one);
        productDatabase.save(two);
        Optional<Product> realResult = productDatabase.findByTitle("Orange");
        checkTestResult("findByTitleProductPositiveTest", Objects.equals(Optional.of(two), realResult));
    }

    public void findByTitleProductNegativeTest() {
        ProductDatabase productDatabase = new InMemoryDatabase();
        Product one = new Product("Banana");
        Product two = new Product("Orange");
        productDatabase.save(one);
        productDatabase.save(two);
        Optional<Product> realResult = productDatabase.findByTitle("Apple");
        checkTestResult("findByTitleProductNegativeTest", Objects.equals(Optional.empty(), realResult));
    }

    public void checkTestResult(String testName, boolean condition) {
        if (condition) {
            System.out.println("'" + testName + "'" + " test is OK");
        } else {
            System.out.println("'" + testName + "'" + " test is FAIL");
        }
    }
}
