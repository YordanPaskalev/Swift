
import java.util.Scanner;

public class Task1e_IsPrime {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int number2 = 0;

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                number2 = 1;
                break;
            }
        }
        if (number2 == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
