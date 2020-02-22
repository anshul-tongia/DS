package ds.array;

public class Anagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("ABB", "BAB"));
    }

    public static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) return false;

        int[] letters = new int[1 << 8];
        for (char c : str1.toCharArray()) {
            letters[c]++;
        }
        for (char c : str2.toCharArray()) {
            letters[c]--;
        }
        for (int i : letters) {
            if (i != 0) return false;
        }
        return true;
    }

}
