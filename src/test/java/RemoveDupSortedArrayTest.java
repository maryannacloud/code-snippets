import ArrayManipulations.RemoveDupSortedArray;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.util.Arrays;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class RemoveDupSortedArrayTest {

    RemoveDupSortedArray solution = new RemoveDupSortedArray();

    @DataProvider(name = "testCases")
    public Object[][] testCases() {
        return new Object[][]{
                {new int[]{1, 1, 2}, new int[]{1, 2}, 2},
                {new int[]{1, 1, 2, 2, 3}, new int[]{1, 2, 3}, 3},
                {new int[]{1, 2, 3, 4, 5}, new int[]{1, 2, 3, 4, 5}, 5},
                {new int[]{-2, -1, 0, 0, 1}, new int[]{-2, -1, 0, 1}, 4}
        };

    }

    @Test(dataProvider = "testCases")
    public void verifyOutput(int[] nums, int[] expectedNums, int expectedLength) {
        int k = solution.removeDuplicates(nums);

        assertEquals(k, expectedLength, "The length of unique elements does not match the expected length");

        int[] actualNums = Arrays.copyOf(nums, k);
        assertTrue(Arrays.equals(expectedNums, actualNums), "The unique elements do not match the expected elements");
    }
}
