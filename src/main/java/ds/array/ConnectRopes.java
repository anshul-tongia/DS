package ds.array;

import java.util.PriorityQueue;

public class ConnectRopes {
    public static void main(String[] args) {
        System.out.println(minimumCostToConnectRopes(new int[]{1, 3, 11, 5}));
    }

    public static int minimumCostToConnectRopes(int[] ints) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (int i = 0; i < ints.length; i++) {
            queue.add(ints[i]);
        }
        int maxSum = 0;
        while (queue.size() != 1) {
            int first = queue.poll();
            int second = queue.poll();
            int result = first + second;
            maxSum += result;
            queue.add(result);
        }
        return maxSum;
    }
}
