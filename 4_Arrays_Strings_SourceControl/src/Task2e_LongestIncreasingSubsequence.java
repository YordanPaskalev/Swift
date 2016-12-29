
import java.util.Scanner;

public class Task2e_LongestIncreasingSubsequence {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int size = input.nextInt();
        int[] arr = new int[size];

        arr[0] = input.nextInt();
        int currentIdx = 0;
        int currentLength = 1;
        int longestSeqIdx = 0;
        int longestLength = 1;

        for (int i = 1; i < arr.length; i++) {
            arr[i] = input.nextInt();

            if (arr[i] > arr[i - 1]) {
                currentLength++;
            } else {
                if (longestLength < currentLength) {
                    longestSeqIdx = currentIdx;
                    longestLength = currentLength;
                }

                currentIdx = i;
                currentLength = 1;
            }
        }

        if (longestLength < currentLength) {
            longestSeqIdx = currentIdx;
            longestLength = currentLength;
        }

        for (int i = 0; i < longestLength; i++) {
            System.out.print(arr[longestSeqIdx + i] + " ");
        }
    }
}
