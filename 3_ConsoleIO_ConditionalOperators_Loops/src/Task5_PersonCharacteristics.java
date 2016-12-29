
import java.util.Scanner;


public class Task5_PersonCharacteristics {

    public static void main(String[] args) {
        final short currentYear = 2016;

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        input.nextLine();

        for (int i = 0; i < n; i++) {

            String firstName = input.nextLine();

            String lastName = input.nextLine();

            short yearBorn;
            do {
                yearBorn = input.nextShort();
            } while (!(1800 <= yearBorn && yearBorn <= currentYear));

            float weight;
            do {
                weight = input.nextFloat();
            } while (!(30 < weight && weight < 600));

            short height;
            do {
                height = input.nextShort();
            } while (!(30 < height && height < 300));

            input.nextLine();

            String occupation = input.nextLine();

            short age = (short) (currentYear - yearBorn);

            System.out.printf("%s %s is %d years old. He was born in %d. "
                    + "His weight is %f and he is %d cm tall. He is a %s.%n",
                    firstName, lastName, age, yearBorn, weight, height, occupation);

            if (age < 18) {
                System.out.println(firstName + " " + lastName + " is under-aged.");
            }
        }
    }
}
