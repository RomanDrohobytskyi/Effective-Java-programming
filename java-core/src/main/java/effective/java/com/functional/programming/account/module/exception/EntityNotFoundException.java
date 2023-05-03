package effective.java.com.functional.programming.account.module.exception;

public class EntityNotFoundException extends RuntimeException {
    public EntityNotFoundException(String message) {
        super(message);
    }
}
