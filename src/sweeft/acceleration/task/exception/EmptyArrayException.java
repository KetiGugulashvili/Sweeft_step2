package sweeft.acceleration.task.exception;

public class EmptyArrayException extends RuntimeException {
    public EmptyArrayException() {
        this("Array should not be empty.");
    }

    public EmptyArrayException(String message) {
        super(message);
    }
}
