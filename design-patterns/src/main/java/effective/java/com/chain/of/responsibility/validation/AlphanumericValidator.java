package effective.java.com.chain.of.responsibility.validation;

import static java.util.Objects.isNull;

public class AlphanumericValidator implements Validator {
    private static final String CONTAINS_LETTER_AND_DIGIT = "^(?=.*[a-zA-Z])(?=.*\\d).*$";
    private Validator nextValidator;

    @Override
    public boolean isValid(String input) {
        if (input.matches(CONTAINS_LETTER_AND_DIGIT)) {
            System.out.println("AlphanumericValidator: Input is alphanumeric.");
            return isNull(nextValidator) || nextValidator.isValid(input);
        } else {
            System.out.println("AlphanumericValidator: Input is not alphanumeric.");
            return false;
        }
    }

    @Override
    public void setNextValidator(Validator nextValidator) {
        this.nextValidator = nextValidator;
    }
}
