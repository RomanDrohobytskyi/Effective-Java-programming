package effective.java.com.chain.of.responsibility.validation;

public interface Validator {
    boolean isValid(String input);
    void setNextValidator(Validator nextValidator);
}
