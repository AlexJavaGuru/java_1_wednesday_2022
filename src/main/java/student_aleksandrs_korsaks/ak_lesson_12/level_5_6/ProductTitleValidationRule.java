package student_aleksandrs_korsaks.ak_lesson_12.level_5_6;

import student_aleksandrs_korsaks.ak_lesson_12.level_5_6.validation_rules.ValidationRule1;
import student_aleksandrs_korsaks.ak_lesson_12.level_5_6.validation_rules.ValidationRule2;
import student_aleksandrs_korsaks.ak_lesson_12.level_5_6.validation_rules.ValidationRule3;
import student_aleksandrs_korsaks.ak_lesson_12.level_5_6.validation_rules.ValidationRule4;

import java.util.ArrayList;
import java.util.List;

class ProductTitleValidationRule implements FieldValidationRule {

    List<ValidationRule> rules = new ArrayList<>();

    @Override
    public void validate(Product product) throws ValidationException {
        rules.add(new ValidationRule1());
        rules.add(new ValidationRule2());
        rules.add(new ValidationRule3());
        rules.add(new ValidationRule4());
        for (ValidationRule rule : rules) {
            rule.validate(product);
        }
    }
}
