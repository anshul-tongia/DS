package ds.array;

import java.util.*;

public class TopKFrequentNumbers {
    public static List<Integer> findTopKFrequentNumbers(int[] nums, int k) {
        List<Integer> topNumbers = new ArrayList<>(k);

        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int n : nums) {
            frequencyMap.put(n, frequencyMap.getOrDefault(n, 0) + 1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>((e1, e2) -> e1.getValue() - e2.getValue());

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            queue.add(entry);
            if (queue.size() > k)
                queue.poll();
        }
        while (!queue.isEmpty())
            topNumbers.add(queue.poll().getKey());
        return topNumbers;
    }

    public static void main(String[] args) {
        List<Integer> result = TopKFrequentNumbers.findTopKFrequentNumbers(new int[]{1, 3, 5, 12, 11, 12, 11}, 3);
        System.out.println("Here are the K frequent numbers: " + result);

        result = TopKFrequentNumbers.findTopKFrequentNumbers(new int[]{5, 12, 11, 3, 11}, 2);
        System.out.println("Here are the K frequent numbers: " + result);
    }
}
