package student_aleksandrs_korsaks.ak_lesson_12.level_5_6.validation_rules;

import student_aleksandrs_korsaks.ak_lesson_12.level_5_6.Product;
import student_aleksandrs_korsaks.ak_lesson_12.level_5_6.ValidationException;
import student_aleksandrs_korsaks.ak_lesson_12.level_5_6.ValidationRule;

public class ValidationRule5 extends ValidationRule {

    @Override
    protected void validate(Product product) throws ValidationException {
        if (product.getPrice() == null) {
            throw new ValidationException("RULE-5", "Price can not be empty", "price");
        }
    }
}
