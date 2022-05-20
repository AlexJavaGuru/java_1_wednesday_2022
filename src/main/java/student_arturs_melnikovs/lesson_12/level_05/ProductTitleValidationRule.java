package student_arturs_melnikovs.lesson_12.level_05;

import java.util.ArrayList;
import java.util.List;


class ProductTitleValidationRule implements FieldValidationRule {

    List<ValidationRule> rules = new ArrayList<>();

    @Override
    public void validate(Product product) throws ValidationException {
        ValidationRule1 rule1 = new ValidationRule1();
        ValidationRule2 rule2 = new ValidationRule2();
        ValidationRule3 rule3 = new ValidationRule3();
        ValidationRule4 rule4 = new ValidationRule4();
        rules.add(rule1);
        rules.add(rule2);
        rules.add(rule3);
        rules.add(rule4);
        for (ValidationRule rule : rules) {
            rule.validate(product);
        }
    }
}
