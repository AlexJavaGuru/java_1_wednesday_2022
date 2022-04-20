package student_arturs_melnikovs.lesson_12.level_05;

abstract class ValidationRule {
    abstract void validate(Product product) throws ValidationException;
}
