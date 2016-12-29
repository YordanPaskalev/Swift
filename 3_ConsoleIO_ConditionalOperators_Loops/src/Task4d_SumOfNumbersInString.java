
import java.util.Scanner;

public class Task4d_SumOfNumbersInString {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        int sum = 0;
        int number = 0;

        for (char c : str.toCharArray()) {
            if ('0' <= c && c <= '9') {
                number = number * 10 + (c - '0');
            } else {
                sum = sum + number;
                number = 0;
            }
        }
        sum = sum + number;
        System.out.println(sum);
    }
}
