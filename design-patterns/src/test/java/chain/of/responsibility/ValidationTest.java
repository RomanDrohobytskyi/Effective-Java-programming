package chain.of.responsibility;

import effective.java.com.chain.of.responsibility.validation.AlphanumericValidator;
import effective.java.com.chain.of.responsibility.validation.LengthValidator;
import effective.java.com.chain.of.responsibility.validation.SpecialCharacterValidator;
import effective.java.com.chain.of.responsibility.validation.Validator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidationTest {

    @Test
    public void testValidInput() {
        // given
        Validator lengthValidator = new LengthValidator();
        Validator alphanumericValidator = new AlphanumericValidator();
        Validator specialCharacterValidator = new SpecialCharacterValidator();

        lengthValidator.setNextValidator(alphanumericValidator);
        alphanumericValidator.setNextValidator(specialCharacterValidator);

        String validInput = "abc123@";

        // when
        boolean isValid = lengthValidator.isValid(validInput);

        // then
        assertTrue(isValid, "Valid input should pass validation");
    }

    @Test
    public void testInvalidInput() {
        Validator lengthValidator = new LengthValidator();
        Validator alphanumericValidator = new AlphanumericValidator();
        Validator specialCharacterValidator = new SpecialCharacterValidator();

        lengthValidator.setNextValidator(alphanumericValidator);
        alphanumericValidator.setNextValidator(specialCharacterValidator);

        String invalidInput = "abc123";
        boolean isValid = lengthValidator.isValid(invalidInput);

        assertFalse(isValid, "Invalid input should fail validation");
    }
}
