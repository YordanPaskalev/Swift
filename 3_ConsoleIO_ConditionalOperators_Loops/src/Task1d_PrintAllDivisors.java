
import java.util.Scanner;

public class Task1d_PrintAllDivisors {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i + " ");
            }
        }
    }
}
