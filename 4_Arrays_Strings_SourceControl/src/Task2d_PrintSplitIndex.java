
import java.util.Scanner;


public class Task2d_PrintSplitIndex {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        int size = input.nextInt();
        int[] arr = new int[size];
        
        int[] sums = new int[size];
        int sum = 0;
        
        for(int i = 0; i < size; i++){
            arr[i] = input.nextInt();
            sum = sum + arr[i];
            sums[i] = sum;
        }
       if(sum % 2 == 0) {
           for(int i = 0; i < size;i++){
               if(sums[i] * 2 == sum) { 
                   System.out.println(i);
                   return;
               }
           }
       }
        System.out.println("NO");
    }
}
