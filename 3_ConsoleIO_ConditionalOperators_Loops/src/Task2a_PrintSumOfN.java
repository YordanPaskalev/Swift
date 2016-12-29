
import java.util.Scanner;

public class Task2a_PrintSumOfN {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberCount = input.nextInt();
        int sum = 0;

        for (int i = 0; i < numberCount; i++) {
            int numbers = input.nextInt();
            sum = sum + numbers;
        }
        System.out.println(sum);
    }

}
