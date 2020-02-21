package ds.array;

import org.junit.Assert;
import org.junit.Test;

public class TestKthLargestInArray {

    @Test
    public void test() {
        int result = KthLargestInArray.kthLargestInGivenArray(new int[]{10, 10, 9}, 2);
        Assert.assertEquals(9, result);
    }
}
