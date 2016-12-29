
import java.util.Scanner;


public class HoursMinutesSeconds {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int inputSeconds = input.nextInt(); //zadavame sekundi(input)
        int numberOfDays;
        int numberOfHours;
        int numberOfMinutes;
        int numberOfSeconds;

        numberOfDays = inputSeconds / 86400;
        numberOfHours = (inputSeconds % 86400) / 3600;
        numberOfMinutes = ((inputSeconds % 86400) % 3600) / 60;
        numberOfSeconds = ((inputSeconds % 86400) % 3600) % 60;

        System.out.println(numberOfDays + " Дни " + numberOfHours + " часа "
                + numberOfMinutes + " минути " + numberOfSeconds + " секунди ");

    }
}
