package student_aleksandr_zuk.lesson_12.level_5;

import java.util.List;

class ProductValidatorImplTest {

    private ProductValidator validator = new ProductValidatorImpl();

    public static void main(String[] args) {

        ProductValidatorImplTest test = new ProductValidatorImplTest();
        test.rule1_v1();
        test.rule1_v2();
        test.rule1_v3();
        test.rule1_v4();
        test.rule1_v5();
        test.rule1_v6();
        test.rule2_v1();
        test.rule2_v2();
        test.rule3_v1();
        test.rule3_v2();

    }

    public void rule1_v1() {
        Product product = new Product(null, 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule1");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-1"), "rule1");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule1");
        checkResult(exceptions.get(0).getDescription().equals("Title can not be empty"), "rule1");
    }

    public void rule1_v2() {
        Product product = new Product("", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule1");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-1"), "rule1");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule1");
        checkResult(exceptions.get(0).getDescription().equals("Title can not be empty"), "rule1");
    }

    public void rule1_v3() {
        Product product = new Product("AA", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule1");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-1"), "rule1");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule1");
        checkResult(exceptions.get(0).getDescription().equals("Must be 3 or more symbols"), "rule1");
    }

    public void rule1_v4() {
        Product product = new Product("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule1");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-1"), "rule1");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule1");
        checkResult(exceptions.get(0).getDescription().equals("Can not be more than 100 symbols"), "rule1");
    }

    public void rule1_v5() {
        Product product = new Product("продукт", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule1");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-1"), "rule1");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule1");
        checkResult(exceptions.get(0).getDescription().equals("Only english symbols allowed"), "rule1");
    }
    public void rule1_v6() {
        Product product = new Product("A?A", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule1");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-1"), "rule1");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule1");
        checkResult(exceptions.get(0).getDescription().equals("Special symbols not allowed"), "rule1");
    }

    public void rule2_v1() {
        Product product = new Product("Title", null, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule2");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-2"), "rule2");
        checkResult(exceptions.get(0).getFieldName().equals("price"), "rule2");
        checkResult(exceptions.get(0).getDescription().equals("Price can not be empty"), "rule1");
    }

    public void rule2_v2() {
        Product product = new Product("Title", 0, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule2");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-2"), "rule2");
        checkResult(exceptions.get(0).getFieldName().equals("price"), "rule2");
        checkResult(exceptions.get(0).getDescription().equals("Price can not be 0"), "rule1");
    }

    public void rule3_v1() {
        Product product = new Product("Title", 1, "описание");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule3");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-3"), "rule3");
        checkResult(exceptions.get(0).getFieldName().equals("description"), "rule3");
        checkResult(exceptions.get(0).getDescription().equals("Only english symbols allowed in description"), "rule1");
    }

    public void rule3_v2() {
        Product product = new Product("Title", 1, "0пис@ние");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule3");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-3"), "rule3");
        checkResult(exceptions.get(0).getFieldName().equals("description"), "rule3");
        checkResult(exceptions.get(0).getDescription().equals("Special symbols not allowed in description"), "rule1");
    }


    private void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
}
