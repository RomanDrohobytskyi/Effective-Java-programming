package effective.java.com.chain.of.responsibility.validation;

import static java.util.Objects.isNull;

public class SpecialCharacterValidator implements Validator {
    private Validator nextValidator;

    @Override
    public boolean isValid(String input) {
        if (input.matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\",.<>/?].*")) {
            System.out.println("SpecialCharacterValidator: Input contains special characters.");
            return isNull(nextValidator) || nextValidator.isValid(input);
        } else {
            System.out.println("SpecialCharacterValidator: Input does not contain special characters.");
            return false;
        }
    }

    @Override
    public void setNextValidator(Validator nextValidator) {
        this.nextValidator = nextValidator;
    }
}

