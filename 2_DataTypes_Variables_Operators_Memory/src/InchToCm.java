
import java.util.Scanner;

public class InchToCm {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double inch = scan.nextInt();

        double cm = 2.54;
        double inchToCm = inch * cm;
        System.out.println(inchToCm);
    }
}
