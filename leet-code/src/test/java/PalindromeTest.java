import effective.java.com.Palindrome;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalindromeTest {

    @Test
    public void shouldBePalindrome() {
        int x = 121;
        assertTrue(Palindrome.isPalindrome(x));
    }

    @Test
    public void shouldNotBePalindromeForNegative() {
        int x = -121;
        assertFalse(Palindrome.isPalindrome(x));
    }

    @Test
    public void shouldNotBePalindrome() {
        int x = 10;
        assertFalse(Palindrome.isPalindrome(x));
    }
}
