
import java.util.Scanner;

public class Task2h_PrintOddFrequencyNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int result = 0;

        for (int i = 0; i < size; i++) {
            result ^= input.nextInt();
        }
        System.out.println(result);
    }
}
