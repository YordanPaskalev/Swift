
import java.util.Scanner;


public class Task2f_LargestSumOfKSubsequence {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int size = input.nextInt();
        int[] arr = new int[size];
        int k = input.nextInt();
        
        int sum = 0;
        int largestSum = Integer.MIN_VALUE;
        int largestSumIndex = 0;
        
            for(int i = 0; i < arr.length; i++) {
                arr[i] = input.nextInt();
                
                sum = sum + arr[i];
                
                if(i >= k){
                    sum = sum - arr[i - k];
                    
                    if(largestSum < sum) {
                        largestSum = sum;
                        largestSumIndex = i - k + 1;
                    }
                }
            }
            for(int i = 0; i < k; i++) {
                System.out.print(arr[i + largestSumIndex] + " ");
            }
            System.out.println();
    }
}
