
import java.util.Scanner;

public class Task3b_PrintZFigure {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        for (int rows = 0; rows < number; rows++) {
            System.out.print("* ");
        }
        System.out.println();
        for (int cols = 1; cols < number - 1; cols++) {
            for (int i = 0; i < number; i++) {
                if (i == number - cols - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for(int i = 0; i < number; i++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}
