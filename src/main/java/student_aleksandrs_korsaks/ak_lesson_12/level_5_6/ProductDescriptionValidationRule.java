package student_aleksandrs_korsaks.ak_lesson_12.level_5_6;

import student_aleksandrs_korsaks.ak_lesson_12.level_5_6.validation_rules.ValidationRule5;
import student_aleksandrs_korsaks.ak_lesson_12.level_5_6.validation_rules.ValidationRule6;
import student_aleksandrs_korsaks.ak_lesson_12.level_5_6.validation_rules.ValidationRule7;
import student_aleksandrs_korsaks.ak_lesson_12.level_5_6.validation_rules.ValidationRule8;

import java.util.ArrayList;
import java.util.List;

class ProductDescriptionValidationRule implements FieldValidationRule {

    List<ValidationRule> rules = new ArrayList<>();

    @Override
    public void validate(Product product) throws ValidationException {
        rules.add(new ValidationRule7());
        rules.add(new ValidationRule8());
        for (ValidationRule rule : rules) {
            rule.validate(product);
        }
    }
}
