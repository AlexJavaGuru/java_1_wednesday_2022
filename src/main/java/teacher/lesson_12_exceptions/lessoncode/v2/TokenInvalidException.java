package teacher.lesson_12_exceptions.lessoncode.v2;

public class TokenInvalidException extends RuntimeException {

    public TokenInvalidException(String message) {
        super(message);
    }
}
