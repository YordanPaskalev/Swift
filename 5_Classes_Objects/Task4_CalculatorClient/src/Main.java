
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Calculator calculator = new Calculator("", 0, 0);
        String operation = input.nextLine();
        double numberOne = input.nextDouble();
        double numberTwo = input.nextDouble();
        String strOne = String.format("%.3f", numberOne);
        String strTwo = String.format("%.3f", numberTwo);
        String multiply = String.format("%.3f", calculator.multiply(numberOne, numberTwo));
        String sum = String.format("%.3f", calculator.sum(numberOne, numberTwo));
        String divide = String.format("%.3f", calculator.divide(numberOne, numberTwo));
        String percentage = String.format("%.3f", calculator.percentage(numberOne, numberTwo));
        String substract = String.format("%.3f", calculator.subtract(numberOne, numberTwo));

        switch (operation) {
            case "SUM":
                System.out.println("SUM" + strOne + " " + strTwo + " " + sum);
                break;
            case "MUL":
                System.out.println("MUL" + strOne + " " + strTwo + " " + multiply);
                break;
            case "DIV":
                System.out.println("DIV" + strOne + " " + strTwo + " " + divide);
                break;
            case "SUB":
                System.out.println("SUB" + strOne + " " + strTwo + " " + substract);
                break;
            case "PER":
                System.out.println("PER" + strOne + " " + strTwo + " " + percentage);
                break;
        }
    }
}
