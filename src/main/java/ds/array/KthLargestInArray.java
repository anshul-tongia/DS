package ds.array;

import java.util.PriorityQueue;

public class KthLargestInArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 8, 8, 9, 9, 9, 9, 9, 10, 10, 10, 10};
        int k = 5;
        System.out.println(kthLargestInGivenArray(array, k));
    }

    public static int kthLargestInGivenArray(int[] array, int k) {

        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int i = 0; i < array.length; i++) {
            if (!queue.contains(array[i])) {
                queue.add(array[i]);
                if (queue.size() > k)
                    queue.poll();
            }
        }

        return queue.peek();
    }
}
