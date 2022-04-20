package student_arturs_melnikovs.lesson_12.level_05;

class ValidationRule6 extends ValidationRule{

    public void validate(Product product) throws ValidationException {
        double price = product.getPrice();
        String ruleName = "RULE-6";
        String description = "Price can not be 0";
        String fieldName = "price";
        if (price <= 0) {
            throw new ValidationException(ruleName, description, fieldName);
        }
    }
}