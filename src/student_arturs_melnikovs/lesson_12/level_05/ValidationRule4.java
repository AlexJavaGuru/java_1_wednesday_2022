package student_arturs_melnikovs.lesson_12.level_05;

import java.util.regex.Pattern;

class ValidationRule4 extends ValidationRule{


    public void validate(Product product) throws ValidationException {
        String title = product.getTitle().trim();
        String ruleName = "RULE-4";
        String description = "Title can only contain English letters and digits";
        String fieldName = "title";
        Pattern p = Pattern.compile("[^a-zA-Z0-9 ]");
        if (p.matcher(title).find()) {
            throw new ValidationException(ruleName, description, fieldName);
        }
    }
}
