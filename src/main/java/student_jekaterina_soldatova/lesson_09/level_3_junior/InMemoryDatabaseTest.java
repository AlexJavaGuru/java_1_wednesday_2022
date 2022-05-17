package student_jekaterina_soldatova.lesson_09.level_3_junior;

import java.util.Optional;

class InMemoryDatabaseTest {
    public static void main(String[] args) {
        InMemoryDatabaseTest test = new InMemoryDatabaseTest();

        test.AddNewProduct();
        test.FindTitle();
        test.TitleNotFound();
    }

    void AddNewProduct() {
        Product[] expectedResult = {new Product("smth")};
        Product[] realResult = new Product[0];
        InMemoryDatabase database = new InMemoryDatabase(realResult);
        database.save(new Product("smth"));

        if (compareArrays(expectedResult, realResult)) {
            System.out.println("add new - ok");
        } else {
            System.out.println("add new - fail");
        }
    }

    void FindTitle() {
        Product[] testArray = {new Product("blah"), new Product("sMth"), new Product("blah-blah")};
        InMemoryDatabase database = new InMemoryDatabase(testArray);
        String expectedResult = "smth";
        String realResult = database.findByTitle("smth").get().getTitle();

        if (expectedResult.equalsIgnoreCase(realResult)) {
            System.out.println("find - ok");
        } else {
            System.out.println("find - fail, result is " + realResult);
        }
    }

    void TitleNotFound() {
        Product[] testArray = {new Product("blah"), new Product("SmTh"), new Product("blah-blah")};
        InMemoryDatabase database = new InMemoryDatabase(testArray);
        Optional<Product> realResult = database.findByTitle("not there");

        if (realResult.isEmpty()) {
            System.out.println("not found - ok");
        } else {
            System.out.println("not found - fail  " +  realResult.toString());
        }
    }

    static Boolean compareArrays(Product[] expected, Product[] real) {
        for (int i = 0; i < real.length; i++) {
            if (!(expected[i].getTitle().equals(real[i].getTitle()))) {
                return false;
            }
        }
        return true;
    }
}
