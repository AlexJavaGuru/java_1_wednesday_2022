package student_arturs_melnikovs.lesson_09.level_03;

import java.util.Arrays;

class InMemoryDatabaseTest {
    public static void main(String[] args) {
        InMemoryDatabaseTest tester = new InMemoryDatabaseTest();
        tester.testFindByTitle();
        tester.testSaving();
    }

    public void testFindByTitle() {
        ProductDatabase database = new InMemoryDatabase();
        Product apple = new Product("apple");
        Product banana = new Product("banana");
        database.save(apple);
        database.save(banana);
        Product actualResult = database.findByTitle("apple");
        checkResult(apple, actualResult);
    }

    public void testSaving() {
        ProductDatabase database = new InMemoryDatabase();
        Product apple = new Product("apple");
        Product banana = new Product("banana");
        database.save(apple);
        database.save(banana);
        Product[] expectedResult = {apple, banana};
        Product[] actualResult = database.getProducts;
        checkResult(expectedResult, actualResult);
    }

    private void checkResult(Product expectedResult, Product actualResult) {
        if (expectedResult.equals(actualResult)) {
            System.out.println("Test has passed");
        } else {
            System.out.println("Test has failed");
        }
    }
    private void checkResult(Product[] expectedResult, Product[] actualResult) {
        if (Arrays.equals(expectedResult, actualResult)) {
            System.out.println("Test has passed");
        } else {
            System.out.println("Test has failed");
        }
    }

}
