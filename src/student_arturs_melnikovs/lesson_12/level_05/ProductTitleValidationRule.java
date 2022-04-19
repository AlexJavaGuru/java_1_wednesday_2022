package student_arturs_melnikovs.lesson_12.level_05;

class ProductTitleValidationRule implements FieldValidationRule {
    @Override
    public void validate(Product product) throws ValidationException {
        if (product.getTitle().equals(null) || product.getTitle().equals("")) {
            throw new ValidationException("RULE-1", "Title can not be empty", "title");
        }
        if (product.getTitle().length() < 3) {
            throw new ValidationException("RULE-2", "Title can not be shorter that 3 characters", "title");
        }
        if (product.getTitle().length() > 100) {
            throw new ValidationException("RULE-3", "Title can not be longer than 100 characters", "title");
        }
        if ()
    }
}
