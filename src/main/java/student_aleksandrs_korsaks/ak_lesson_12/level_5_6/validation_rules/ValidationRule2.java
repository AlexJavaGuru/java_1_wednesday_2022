package student_aleksandrs_korsaks.ak_lesson_12.level_5_6.validation_rules;

import student_aleksandrs_korsaks.ak_lesson_12.level_5_6.Product;
import student_aleksandrs_korsaks.ak_lesson_12.level_5_6.ValidationException;
import student_aleksandrs_korsaks.ak_lesson_12.level_5_6.ValidationRule;

public class ValidationRule2 extends ValidationRule {

    @Override
    protected void validate(Product product) throws ValidationException {
        if (product.getTitle().length() <= 3) {
            throw new ValidationException("RULE-2", "Title should contain at least 3 symbols", "title");
        }
    }
}
