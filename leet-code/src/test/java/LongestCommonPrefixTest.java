import effective.java.com.LongestCommonPrefix;
import effective.java.com.Palindrome;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LongestCommonPrefixTest {

    @Test
    public void shouldFindLongestPrefix() {
        String[] strs = {"flower", "flow", "flight"};
        assertThat(LongestCommonPrefix.longestCommonPrefix(strs)).isEqualTo("fl");
    }

    @Test
    public void shouldFindLongestPrefixForSingleChar() {
        String[] strsSingleChar = {"ab", "a"};
        assertThat(LongestCommonPrefix.longestCommonPrefix(strsSingleChar)).isEqualTo("a");
    }
}
