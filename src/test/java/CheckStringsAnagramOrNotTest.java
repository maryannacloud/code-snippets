import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CheckStringsAnagramOrNotTest {

    CheckStringsAnagramOrNot checkStrings = new CheckStringsAnagramOrNot();

    @DataProvider(name = "testData")
    public Object[][] testData() {
        return new Object[][]{
                {"anagram", "nagaram", true},
                {"rat", "car", false},
                {" ", " ", true},
                {"", "non-empty", false},
                {"non-empty", "", false}
        };
    }

    @Test(dataProvider = "testData")
    public void testStringIdAnagram (String str1, String str2, boolean expectedResult){
        boolean result = checkStrings.isAnagram(str1, str2);
        Assert.assertEquals(result, expectedResult, "Anagram check failed for inputs: " + str1 + " and " + str2);
    }
}