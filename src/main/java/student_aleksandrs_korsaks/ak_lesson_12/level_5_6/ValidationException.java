package student_aleksandrs_korsaks.ak_lesson_12.level_5_6;

import java.util.Objects;

public class ValidationException extends Exception{

    private String ruleName;
    private String description;
    private String fieldName;

    public ValidationException(String ruleName, String description, String fieldName) {
        this.ruleName = ruleName;
        this.description = description;
        this.fieldName = fieldName;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ValidationException that)) return false;
        return getRuleName().equals(that.getRuleName()) && getDescription().equals(that.getDescription()) && getFieldName().equals(that.getFieldName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRuleName(), getDescription(), getFieldName());
    }
}
