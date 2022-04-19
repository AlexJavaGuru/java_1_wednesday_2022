package student_arturs_melnikovs.lesson_12.level_05;

class ValidationException extends Exception{

    private String ruleName;
    private String description;
    private String fieldName;

    public ValidationException(String ruleName, String description, String fieldName) {
        this.description = description;
        this.fieldName = fieldName;
        this.ruleName = ruleName;
    }

    public String getRuleName() {
        return ruleName;
    }

    public String getDescription() {
        return description;
    }

    public String getFieldName() {
        return fieldName;
    }
}
