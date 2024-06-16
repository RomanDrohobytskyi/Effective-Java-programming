package effective.java.com.chain.of.responsibility.validation;

import static java.util.Objects.isNull;

public class LengthValidator implements Validator {
    private Validator nextValidator;

    @Override
    public boolean isValid(String input) {
        if (input.length() >= 6 && input.length() <= 20) {
            System.out.println("LengthValidator: Input length is valid.");
            return isNull(nextValidator) || nextValidator.isValid(input);
        } else {
            System.out.println("LengthValidator: Input length is invalid.");
            return false;
        }
    }

    @Override
    public void setNextValidator(Validator nextValidator) {
        this.nextValidator = nextValidator;
    }
}
