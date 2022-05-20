package student_arturs_melnikovs.lesson_12.level_05;

import java.util.ArrayList;
import java.util.List;

class ProductDescriptionValidationRule implements FieldValidationRule{

    List<ValidationRule> rules = new ArrayList<>();

    @Override
    public void validate(Product product) throws ValidationException {
        ValidationRule7 rule7 = new ValidationRule7();
        ValidationRule8 rule8 = new ValidationRule8();
        rules.add(rule7);
        rules.add(rule8);
        for (ValidationRule rule : rules) {
            rule.validate(product);
        }
    }
}
