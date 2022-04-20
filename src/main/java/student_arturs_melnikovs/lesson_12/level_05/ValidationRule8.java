package student_arturs_melnikovs.lesson_12.level_05;

import java.util.regex.Pattern;

class ValidationRule8 extends ValidationRule{

    public void validate(Product product) throws ValidationException {
        String ruleName = "RULE-8";
        String description = "Description can only contain English letters and digits";
        String fieldName = "description";
        Pattern p = Pattern.compile("[^a-zA-Z0-9 ]");
        if (p.matcher(product.getDescription()).find()) {
            throw new ValidationException(ruleName, description, fieldName);
        }
    }
}
