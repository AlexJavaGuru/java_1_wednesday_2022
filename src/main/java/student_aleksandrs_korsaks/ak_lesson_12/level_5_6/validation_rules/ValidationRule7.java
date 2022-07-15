package student_aleksandrs_korsaks.ak_lesson_12.level_5_6.validation_rules;

import student_aleksandrs_korsaks.ak_lesson_12.level_5_6.Product;
import student_aleksandrs_korsaks.ak_lesson_12.level_5_6.ValidationException;

public class ValidationRule7 extends student_aleksandrs_korsaks.ak_lesson_12.level_5_6.ValidationRule {
    @Override
    protected void validate(Product product) throws ValidationException {
        if (product.getDescription().length() > 2000) {
            throw new ValidationException("RULE-7", "Description should not contain more than 2000 symbols", "description");
        }
    }
}
