package ds.array;

public class SecondLargestInArray {
    public static void main(String[] args) {
        int[] arr = {3, 1, 15, 12, 12, 11};
        System.out.println(findSecondLargestInArray(arr));
    }

    public static int findSecondLargestInArray(int[] arr) {
        int fMax = Integer.MIN_VALUE;
        int sMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > fMax) {
                if (fMax > sMax) {
                    sMax = fMax;
                }
                fMax = arr[i];
            } else {
                if (arr[i] > sMax && arr[i] != fMax) {
                    sMax = arr[i];
                }
            }
        }
        return sMax;
    }
}
