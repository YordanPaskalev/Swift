
import java.util.Scanner;

public class Task2c_PrintOnlyEvenNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numberCount = sc.nextInt();
        String result = "";

        for (int i = 0; i < numberCount; i++) {
            int numbers = sc.nextInt();
            if (numbers % 2 == 0) {
                result = result + numbers + " ";
            }
        }

        System.out.println(result);
    }
}
