package student_aleksandrs_korsaks.ak_lesson_12.level_5_6;

import student_aleksandrs_korsaks.ak_lesson_12.level_5_6.validation_rules.*;

import java.util.ArrayList;
import java.util.List;

class ProductPriceValidationRule implements FieldValidationRule {

    List<ValidationRule> rules = new ArrayList<>();

    @Override
    public void validate(Product product) throws ValidationException {
        rules.add(new ValidationRule5());
        rules.add(new ValidationRule6());
        for (ValidationRule rule : rules) {
            rule.validate(product);
        }
    }
}
