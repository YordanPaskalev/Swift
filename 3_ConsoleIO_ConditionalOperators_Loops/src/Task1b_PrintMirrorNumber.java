
import java.util.Scanner;

public class Task1b_PrintMirrorNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int newNumber = 0;

        while (number != 0) {
            newNumber = newNumber * 10;
            newNumber = newNumber + number % 10;
            number = number / 10;
        }
        System.out.println(newNumber);

    }
}
