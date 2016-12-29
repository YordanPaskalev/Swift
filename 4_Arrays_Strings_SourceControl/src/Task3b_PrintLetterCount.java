
import java.util.Arrays;
import java.util.Scanner;

public class Task3b_PrintLetterCount {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        
        String lowerCase = text.toLowerCase();
        char[] arr = lowerCase.toCharArray();
        
        Arrays.sort(arr);
        int counter = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                counter++;
            } else {
                System.out.println(arr[i] + "(" + counter + ")");
                counter = 1;
            }
        }
    }
}
