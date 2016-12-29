
import java.util.Scanner;

public class Task3c_PrintChristmasTree {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
            
        for(int i = 0; i < number - 2; i++){
            for(int j = 0; j <= number - 4 - i; j++){
                System.out.print(" ");
            }
            for(int j = 0; j <= 2 * i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
            for(int i = 0; i <= number - 4; i++){
                System.out.print(" ");
            }
            System.out.println("*");
            for(int i = 0; i <= number - 5; i++){
                System.out.print(" ");
            }
            System.out.println("***");
    }
}
