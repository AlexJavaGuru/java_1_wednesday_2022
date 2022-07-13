package student_aleksandrs_korsaks.ak_lesson_12.level_5_6.validation_rules;

import student_aleksandrs_korsaks.ak_lesson_12.level_5_6.Product;
import student_aleksandrs_korsaks.ak_lesson_12.level_5_6.ValidationException;
import student_aleksandrs_korsaks.ak_lesson_12.level_5_6.ValidationRule;

public class ValidationRule6 extends ValidationRule {

    @Override
    protected void validate(Product product) throws ValidationException {
        if (product.getPrice() > 0) {
            throw new ValidationException("RULE-6", "Price should be more than zero", "price");
        }
    }
}
