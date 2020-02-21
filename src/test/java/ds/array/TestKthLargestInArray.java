package ds.array;

import org.junit.Assert;
import org.junit.Test;

public class TestKthLargestInArray {

    @Test
    public void test1() {
        int result = KthLargestInArray.kthLargestInGivenArray(new int[]{10, 10, 9}, 2);
        Assert.assertEquals(9, result);
    }

    @Test
    public void test2() {
        int result = KthLargestInArray.kthLargestInGivenArray(new int[]{1, 5, 12, 2, 11, 5}, 3);
        Assert.assertEquals(5, result);
    }

    @Test
    public void test3() {
        int result = KthLargestInArray.kthLargestInGivenArray(new int[]{1, 5, 12, 2, 11, 5}, 4);
        Assert.assertEquals(2, result);
    }

    @Test
    public void test4() {
        int result = KthLargestInArray.kthLargestInGivenArray(new int[]{5, 12, 11, -1, 12}, 3);
        Assert.assertEquals(5, result);
    }
}
