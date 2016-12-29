
import java.util.Scanner;

public class Task1f_ToBinaryAndHexa {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int changeHex;
        String hexNumber = " ";
        int remainder;
        String newNumber = " ";

        int number = input.nextInt();
        int copyOfTheNumber = number;

        while (number != 0) {
            remainder = number % 2;
            newNumber = remainder + newNumber;
            number /= 2;
        }
        System.out.print(newNumber);

        char hex[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        while (copyOfTheNumber > 0) {
            changeHex = copyOfTheNumber % 16;
            hexNumber = hex[changeHex] + hexNumber;
            copyOfTheNumber = copyOfTheNumber / 16;
        }
        System.out.print(hexNumber);
    }
}
