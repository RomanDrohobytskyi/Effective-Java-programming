import org.junit.jupiter.api.Test;


import static effective.java.com.TwoSum.twoSum;
import static org.assertj.core.api.Assertions.assertThat;

public class TwoSumTest {

    @Test
    public void shouldResolveForTargetNine() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        assertThat(twoSum(nums, target)).containsExactly(0, 1);
    }

    @Test
    public void shouldResolveForTargetSix() {
        int[] nums = {3, 2, 4};
        int target = 6;
        assertThat(twoSum(nums, target)).containsExactly(1, 2);
    }


    @Test
    public void shouldResolveForTargetSixForTwoSameNums() {
        int[] nums = {3, 3};
        int target = 6;
        assertThat(twoSum(nums, target)).containsExactly(0, 1);
    }

}
