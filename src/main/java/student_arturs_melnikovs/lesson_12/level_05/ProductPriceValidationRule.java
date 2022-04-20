package student_arturs_melnikovs.lesson_12.level_05;

import java.util.ArrayList;
import java.util.List;

class ProductPriceValidationRule implements FieldValidationRule{

    List<ValidationRule> rules = new ArrayList<>();

    @Override
    public void validate(Product product) throws ValidationException {
        ValidationRule6 validationRule6 = new ValidationRule6();
        rules.add(validationRule6);
        for (ValidationRule rule : rules) {
            rule.validate(product);
        }
    }
}
