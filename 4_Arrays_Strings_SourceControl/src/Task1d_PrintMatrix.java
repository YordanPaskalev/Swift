
import java.util.Scanner;

public class Task1d_PrintMatrix {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter rows: ");
        int nRows = input.nextInt();
        System.out.println("Enter cols: ");
        int nCols = input.nextInt();
        int[][] array = new int[nRows][nCols];

        int rows1 = 0, rows2 = nRows - 1;
        int cols1 = 0, cols2 = nCols - 1;
        int n = 1;
        while (n <= nRows * nCols) {
            for (int i = cols1; i <= cols2; i++) {
                array[rows1][i] = n++;
            }
            for (int j = rows1 + 1; j <= rows2; j++) {
                array[j][cols2] = n++;
            }
            for (int i = cols2 - 1; i >= cols1; i--) {
                array[rows2][i] = n++;
            }
            for (int j = rows2 - 1; j >= rows1 + 1; j--) {
                array[j][cols1] = n++;
            }
            cols1++;
            cols2--;
            rows1++;
            rows2--;
        }
        for (int i = 0; i < nRows; i++) {
            for (int j = 0; j < nCols; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }
}