package ds.array;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class FrequencySort {
    public static String sortCharacterByFrequency(String str) {
        char[] charArray = str.toCharArray();
        Map<Character, Integer> charFrequency = new HashMap<>();
        for (char c : charArray)
            charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);

        PriorityQueue<Map.Entry<Character, Integer>> queue = new PriorityQueue<>((e1, e2) -> e2.getValue() - e1.getValue());

        for (Map.Entry<Character, Integer> entry : charFrequency.entrySet()) {
            int count = entry.getValue();
            while (count != 0) {
                queue.offer(entry);
                count--;
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!queue.isEmpty())
            sb.append(queue.poll().getKey());
        return sb.toString();
    }

    public static void main(String[] args) {
        String result = FrequencySort.sortCharacterByFrequency("Programming");
        System.out.println("Here is the given string after sorting characters by frequency: " + result);

        result = FrequencySort.sortCharacterByFrequency("abcbab");
        System.out.println("Here is the given string after sorting characters by frequency: " + result);
    }
}
