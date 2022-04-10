package hw22.exception;

/**
 * Исключение, когда параметр appId не указан
 */
public class MandatoryParametrException extends RuntimeException {

    public MandatoryParametrException(String message) {
        super(message);
    }
}
