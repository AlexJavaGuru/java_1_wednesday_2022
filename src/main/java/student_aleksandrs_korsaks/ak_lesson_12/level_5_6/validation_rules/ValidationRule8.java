package student_aleksandrs_korsaks.ak_lesson_12.level_5_6.validation_rules;

import student_aleksandrs_korsaks.ak_lesson_12.level_5_6.Product;
import student_aleksandrs_korsaks.ak_lesson_12.level_5_6.ValidationException;

import java.util.regex.Pattern;

public class ValidationRule8 extends student_aleksandrs_korsaks.ak_lesson_12.level_5_6.ValidationRule {
    @Override
    protected void validate(Product product) throws ValidationException {
        Pattern p = Pattern.compile("[^a-zA-Z_0-9]");
        if (p.matcher(product.getTitle()).find()) {
            throw new ValidationException("RULE-8", "Description must only consist of eng characters and/or numbers", "description");
        }
    }
}
