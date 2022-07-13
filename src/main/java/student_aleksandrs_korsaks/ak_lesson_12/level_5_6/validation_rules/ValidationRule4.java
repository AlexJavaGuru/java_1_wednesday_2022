package student_aleksandrs_korsaks.ak_lesson_12.level_5_6.validation_rules;

import student_aleksandrs_korsaks.ak_lesson_12.level_5_6.Product;
import student_aleksandrs_korsaks.ak_lesson_12.level_5_6.ValidationException;
import student_aleksandrs_korsaks.ak_lesson_12.level_5_6.ValidationRule;

public class ValidationRule4 extends ValidationRule {

    @Override
    protected void validate(Product product) throws ValidationException {
        if (!removeAllAllowedSymbols(product.getTitle()).isBlank()) {
            throw new ValidationException("RULE-4", "Title must only consist of eng characters and/or numbers", "title");
        }
    }

    private String removeAllAllowedSymbols(String productTitle) {
        return productTitle.replaceAll("[^a-zA-Z_0-9]", "");
    }
}