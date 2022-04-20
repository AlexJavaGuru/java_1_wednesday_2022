package student_arturs_melnikovs.lesson_12.level_05;

import java.util.List;
import java.util.Random;

class ProductValidatorImplTest {
    private final ProductTitleValidationRule titleValidationRule = new ProductTitleValidationRule();
    private final ProductPriceValidationRule priceValidationRule = new ProductPriceValidationRule();
    private final ProductDescriptionValidationRule descriptionValidationRule = new ProductDescriptionValidationRule();
    private final ProductValidator validator = new ProductValidatorImpl(titleValidationRule, priceValidationRule, descriptionValidationRule);

    public static void main(String[] args) {
        ProductValidatorImplTest test = new ProductValidatorImplTest();
        test.rule1_v1();
        test.rule1_v2();
        test.rule2_v1();
        test.rule3_v1();
        test.rule4_v1();
        test.rule4_v2();
        test.rule6_v1();
        test.rule6_v2();
        test.rule7_v1();
        test.rule8_v1();
        test.rule8_v2();
        test.rule4plus8();
        test.rule2plus6plus8();
    }

    private void rule2plus6plus8() {
        Product product = new Product("T", 0, "описание");
        ValidationException rule2 = new ValidationException("RULE-2", "Title can not be shorter than 3 characters", "title");
        ValidationException rule6 = new ValidationException("RULE-6", "Price can not be 0", "price");
        ValidationException rule8 = new ValidationException("RULE-8", "Description can only contain English letters and digits", "description");
        List<ValidationException> result = validator.validate(product);
        boolean bool = result.contains(rule2) && result.contains(rule8) && result.contains(rule6);
        checkResult(result.size() == 3, "rule 2 + 6 + 8");
        checkResult(bool, "rule 2 + 6 + 8");

    }

    private void rule4plus8() {
        Product product = new Product("!!!!", 1, "описание");
        ValidationException rule4 = new ValidationException("RULE-4", "Title can only contain English letters and digits", "title");
        ValidationException rule8 = new ValidationException("RULE-8", "Description can only contain English letters and digits", "description");
        List<ValidationException> result = validator.validate(product);
        boolean bool = result.contains(rule4) && result.contains(rule8);
        checkResult(result.size() == 2, "rule 4 + 8");
        checkResult(bool, "rule 4 + 8");
    }

    private void rule8_v2() {
        Product product = new Product("Test", 1, "описание");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule8");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-8"), "rule8");
        checkResult(exceptions.get(0).getFieldName().equals("description"), "rule8");
        checkResult(exceptions.get(0).getDescription().equals("Description can only contain English letters and digits"), "rule8");
    }

    private void rule8_v1() {
        Product product = new Product("Test", 1, "description!!");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule8");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-8"), "rule8");
        checkResult(exceptions.get(0).getFieldName().equals("description"), "rule8");
        checkResult(exceptions.get(0).getDescription().equals("Description can only contain English letters and digits"), "rule8");
    }

    private void rule7_v1() {
        Random random = new Random();
        String generatedString = random.ints(100,101)
                .limit(2001)
                .collect((StringBuilder::new), StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
        Product product = new Product("Test", 1, generatedString);
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule7");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-7"), "rule7");
        checkResult(exceptions.get(0).getFieldName().equals("description"), "rule7");
        checkResult(exceptions.get(0).getDescription().equals("Description can not be longer than 2000 characters"), "rule7");
    }

    private void rule6_v2() {
        Product product = new Product("Test", -1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule6");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-6"), "rule6");
        checkResult(exceptions.get(0).getFieldName().equals("price"), "rule6");
        checkResult(exceptions.get(0).getDescription().equals("Price can not be 0"), "rule6");
    }

    private void rule6_v1() {
        Product product = new Product("Test", 0, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule6");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-6"), "rule6");
        checkResult(exceptions.get(0).getFieldName().equals("price"), "rule6");
        checkResult(exceptions.get(0).getDescription().equals("Price can not be 0"), "rule6");
    }

    private void rule4_v2() {
        Product product = new Product("Тест", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule4");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-4"), "rule4");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule4");
        checkResult(exceptions.get(0).getDescription().equals("Title can only contain English letters and digits"), "rule4");
    }

    private void rule4_v1() {
        Product product = new Product("Test!@#", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule4");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-4"), "rule4");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule4");
        checkResult(exceptions.get(0).getDescription().equals("Title can only contain English letters and digits"), "rule4");
    }

    private void rule3_v1() {
        Random random = new Random();
        String generatedString = random.ints(100,101)
                .limit(101)
                .collect((StringBuilder::new), StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
        Product product = new Product(generatedString, 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule3");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-3"), "rule3");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule3");
        checkResult(exceptions.get(0).getDescription().equals("Title can not be longer than 100 characters"), "rule3");
    }

    private void rule2_v1() {
        Product product = new Product("Te", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule2");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-2"), "rule2");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule2");
        checkResult(exceptions.get(0).getDescription().equals("Title can not be shorter than 3 characters"), "rule2");
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


    private void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }

}
