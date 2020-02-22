package ds.string;

public class ReverseAString {
    public static void main(String[] args) {
        String inputString = "ABCDEFG";
        System.out.println("Input String is    : " + inputString);
        System.out.println("Reversed String is : " + reverseAString(inputString));
    }

    private static String reverseAString(String str) {
        if (str == null || str.isEmpty())
            return "-NA-";
        char[] chars = str.toCharArray();
        int front = 0;
        int back = chars.length - 1;
        while (front < back) {
            // swap front & back values
            char temp = chars[front];
            chars[front] = chars[back];
            chars[back] = temp;
            // Close in the window
            front++;
            back--;
        }

        String returnString = new String(chars);
        return returnString;
    }


}
