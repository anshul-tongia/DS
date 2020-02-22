package ds.hackerrank;

import java.io.IOException;
import java.util.Scanner;


public class RepeatedString {

    private static final Scanner scanner = new Scanner(System.in);

    static long repeatedString(String s, long n) {

        long total = n / s.length();
        int part = (int) (n % s.length());
        long count = 0;

        for (char ch : s.toCharArray()) {
            if (ch == 'a')
                count++;
        }
        count = count * total;

        if (part == 0) {
            return count;
        } else {
            String remainder = s.substring(0, part);
            for (char ch : remainder.toCharArray()) {
                if (ch == 'a')
                    count++;
            }
            return count;
        }


    }

    public static void main(String[] args) throws IOException {

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);
        System.out.println(result);

        scanner.close();
    }
}

