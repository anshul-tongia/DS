package ds.array;

import org.junit.Assert;
import org.junit.Test;

public class TestConnectRopes {

    @Test
    public void test() {
        int result = ConnectRopes.minimumCostToConnectRopes(new int[]{1, 3, 11, 5});
        Assert.assertEquals(result, 33);
        result = ConnectRopes.minimumCostToConnectRopes(new int[]{3, 4, 5, 6});
        Assert.assertEquals(result, 36);
        result = ConnectRopes.minimumCostToConnectRopes(new int[]{1, 3, 11, 5, 2});
        Assert.assertEquals(result, 42);

    }
}
