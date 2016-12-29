
import java.util.Scanner;


public class Task2b_PrintReversedSequence {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberCount = input.nextInt();
        String result = "";
            for(int i = 0; i < numberCount; i++){
                int numbers = input.nextInt();
                 result = numbers + " " + result;
            }
            System.out.println(result);
    }
}
