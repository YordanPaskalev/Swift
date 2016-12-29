
import java.util.Scanner;

public class Task2b_PrintSortedNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter how many numbers: ");
        int size = input.nextInt();
        int[] array = new int[size];
        for (int b = 0; b < array.length; b++) {
            System.out.println("Enter number: " + (b + 1));
            array[b] = input.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            for (int k = i; k < array.length; k++) {
                if (array[i] > array[k]) {

                    int temp = array[k];
                    array[k] = array[i];
                    array[i] = temp;
                }
            }
        }
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
