

import java.util.Scanner;

public class DateDifference {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        SwiftDate firstDate = new SwiftDate(input.nextInt(), input.nextInt(), input.nextInt());
        SwiftDate secondDate = new SwiftDate(input.nextInt(), input.nextInt(), input.nextInt());

        if ((firstDate.year < secondDate.year)
                || ((firstDate.year == secondDate.year) && firstDate.month < secondDate.month)
                || ((firstDate.year == secondDate.year) && firstDate.month == secondDate.month)
                && (firstDate.day < secondDate.day)) {
            System.out.println(firstDate.getDaysDifference(secondDate) + " Last day included");
        } else {
            System.out.println(secondDate.getDaysDifference(firstDate) + " Last day included");
        }
        firstDate.printInfo();
        secondDate.printInfo();

    }
}
