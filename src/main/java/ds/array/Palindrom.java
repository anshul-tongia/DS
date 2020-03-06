package ds.array;

public class Palindrom {
    public static void main(String[] args) {
        String s = "!!!!!@@@@#####aaA man, a plan, #$@$@#$a canal: #@#@@#Panam@#$@#$$#aAA";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        char[] array = s.toCharArray();
        int first = 0;
        int last = array.length - 1;
        while (first < last) {
            if (!Character.isLetterOrDigit(array[first])) {
                first++;
                continue;
            }
            if (!Character.isLetterOrDigit(array[last])) {
                last--;
                continue;
            }
            if (Character.toLowerCase(array[first]) != Character.toLowerCase(array[last])) return false;

            first++;
            last--;
        }

        return true;
    }
}
