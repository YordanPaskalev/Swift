
import java.util.Scanner;

public class Task1a_PrintFirstDigit {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int firstDigit = number;

        while (firstDigit > 9) {
            firstDigit = firstDigit / 10;

        }
        System.out.println(firstDigit);
    }
}
