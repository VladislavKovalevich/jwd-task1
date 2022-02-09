package by.vlad.task1.exception;

public class ParserException extends Exception {
    public ParserException() {
    }

    public ParserException(String message) {
        super(message);
    }

    public ParserException(String message, Exception e) {
        super(message, e);
    }

    public ParserException(Exception e) {
        super(e);
    }
}
