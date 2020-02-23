package ds.string;

public class StringEncoding {

    public static void main(String[] args) {
        String sample = "aae";
        System.out.println(stringEncoding(sample));
    }

    private static String stringEncoding(String sample) {
        char[] str = sample.toCharArray();
        StringBuffer outputString = new StringBuffer();
        char last = str[0];
        int count = 1;

        for (int i = 1; i < str.length; i++) {
            if (str[i] == last) {
                count++;
            } else {
                outputString.append(last);
                outputString.append(count);
                last = str[i];
                count = 1;
            }
        }
        outputString.append(last);
        outputString.append(count);
        return outputString.toString();
    }


}
