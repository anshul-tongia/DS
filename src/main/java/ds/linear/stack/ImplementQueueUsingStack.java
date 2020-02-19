package ds.linear.stack;

import java.util.Stack;

public class ImplementQueueUsingStack {

    private Stack<Integer> pushStack = new Stack<Integer>();
    private Stack<Integer> popStack = new Stack<Integer>();

    public static void main(String[] args) {
        ImplementQueueUsingStack queue = new ImplementQueueUsingStack();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        queue.offer(50);
        queue.offer(60);
        System.out.println(queue.poll());       // Should return 10
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        ;
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());        // Should return 60
        System.out.println(queue.poll());        // Should return -1
    }

    public void offer(int data) {
        pushStack.push(data);
    }

    public int poll() {
        if (!popStack.isEmpty())
            return popStack.pop();
        if (!pushStack.isEmpty()) {
            while (!pushStack.isEmpty())
                popStack.push(pushStack.pop());
            return popStack.pop();
        }
        return -1;
    }

}
