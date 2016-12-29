
import java.util.Scanner;

public class PersonCharacteristics {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String Fname = input.nextLine();
        String Lname = input.nextLine();
        String birthDate = input.nextLine();
        int weight = input.nextInt();
        int height = input.nextInt();
        input.nextLine();
        String proffession = input.nextLine();

        System.out.println(Fname);
        System.out.println(Lname);
        System.out.println(birthDate);
        System.out.println(weight);
        System.out.println(height);
        System.out.println(proffession);
    }
}
