
import java.util.regex.Pattern;

public class Person {

    String firstName;
    String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    void setFirstName(String firstN) {
        if (firstN.length() < 2 || firstN.length() > 30) {
            System.out.println("Expected length for <parameter> is between 2 and 30 symbols");
        }
        Pattern pat = Pattern.compile("[a-zA-Z]+");
        if (!pat.matcher(firstN).matches()) {
            System.out.println("Expected only letters in firstName");
        }
        if (!Character.isUpperCase(firstN.codePointAt(0))) {
            System.out.println("Expected upper case at first position of firstName");
        } else {
            this.firstName = firstN;
        }
    }

    String getFirstName() {
        return this.firstName;
    }

    void setLastName(String lastN) {
        if (lastN.length() < 2 || lastN.length() > 30) {
            System.out.println("Expected length <parameter> is between 2 and 30 symbols");
        }
        Pattern pat = Pattern.compile("[a - zA- Z]+");
        if (!pat.matcher(lastN).matches()) {
            System.out.println("Expected only letters in lastN");
        }
        if (!Character.isUpperCase(lastN.codePointAt(0))) {
            System.out.println("Expected uppercase letters in first position of lastName");
        } else {
            this.lastName = lastName;
        }

    }

    String getLastName() {
        return this.lastName;
    }
}
