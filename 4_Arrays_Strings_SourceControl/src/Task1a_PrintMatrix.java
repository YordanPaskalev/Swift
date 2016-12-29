
import java.util.Scanner;

public class Task1a_PrintMatrix {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int[][] arr = new int[number][number];
        int counter = 1;

        for (int rows = 0; rows < arr.length; rows++) {
            for (int cols = 0; cols < arr.length; cols++) {
                arr[cols][rows] = counter++;
            }

        }
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr.length; col++) {
                System.out.printf("%4d", arr[row][col]);
            }
            System.out.println();
        }
    }
}
