package ds.array;

import org.junit.Assert;
import org.junit.Test;

public class TestSecondLargestInArray {

    @Test
    public void testMethod() {
        int[] arr = {3, 1, 15, 12, 12, 11};
        int result = SecondLargestInArray.findSecondLargestInArray(arr);
        Assert.assertEquals(12, result);
    }
}
