package student_aleksandrs_korsaks.ak_lesson_12.level_5_6.validation_rules;

import student_aleksandrs_korsaks.ak_lesson_12.level_5_6.Product;
import student_aleksandrs_korsaks.ak_lesson_12.level_5_6.ValidationException;
import student_aleksandrs_korsaks.ak_lesson_12.level_5_6.ValidationRule;

public class ValidationRule1 extends ValidationRule {

    @Override
    protected void validate(Product product) throws ValidationException {
        if (product.getTitle() == null || product.getTitle().equals("")) {
            throw new ValidationException("RULE-1", "Title can not be empty", "title");
        }
    }
}
