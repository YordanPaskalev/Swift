
import java.util.Scanner;

public class Task3a_IsPalindrome {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        String reverse = "";
        int length = word.length();

        for (int i = 0; i < length / 2; i++) {
            if (word.charAt(i) != word.charAt(length - i - 1)) {
                System.out.println(word + " is not palindrome.");
                break;
            } else {
                System.out.println(word + " is palindrome.");
                break;
            }
        }

    }
}
