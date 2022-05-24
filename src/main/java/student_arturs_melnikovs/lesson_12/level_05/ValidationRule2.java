package student_arturs_melnikovs.lesson_12.level_05;

class ValidationRule2 extends ValidationRule{


    public void validate(Product product) throws ValidationException {
        String title = product.getTitle().trim();
        String ruleName = "RULE-2";
        String description = "Title can not be shorter than 3 characters";
        String fieldName = "title";
        if (title.length() < 3) {
            throw new ValidationException(ruleName, description, fieldName);
        }
    }
}
