package ds.linear.stack;

import org.junit.Assert;
import org.junit.Test;

public class TestImplementQueueUsingStack {
    @Test
    public void test() {
        ImplementQueueUsingStack queue = new ImplementQueueUsingStack();
        Assert.assertEquals(queue.poll(), -1);
        queue.offer(10);
        Assert.assertEquals(queue.poll(), 10);
        Assert.assertEquals(queue.poll(), -1);
        queue.offer(10);
        queue.offer(20);
        Assert.assertEquals(queue.poll(), 10);
        queue.offer(30);
        Assert.assertEquals(queue.poll(), 20);
        Assert.assertEquals(queue.poll(), 30);
    }


}
