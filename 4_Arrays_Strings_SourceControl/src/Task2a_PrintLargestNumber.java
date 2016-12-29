
import java.util.Scanner;

public class Task2a_PrintLargestNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] arr = new int[size];
        int largestNum = 0;

        for (int i = 0; i < arr.length; i++) {
            int numbers = input.nextInt();
            if (largestNum < numbers) {
                largestNum = numbers;
            }
        }
        System.out.println(largestNum);

    }
}
