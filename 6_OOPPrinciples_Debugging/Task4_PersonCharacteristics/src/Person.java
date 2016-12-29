
import java.time.LocalDate;

public class Person {

    private char gender;
    private String firstName;
    private String lastName;
    LocalDate birthDate;
    private double weight;
    private int height;
    private String profession;
    private int age;
    SecondaryEducation secondary;

    public Person(char gender, String firstName, String lastName, LocalDate birthDate, int age, int height, SecondaryEducation secondary) {
        this.gender = gender;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.height = height;
        this.age = age;
        this.secondary = secondary;
    }

    char getGender() {
        return gender;
    }

    String getFirstName() {
        return firstName;
    }

    String getLastName() {
        return lastName;
    }

    LocalDate getBirthDate() {
        return birthDate;
    }

    void setBirthDate(LocalDate date) {
        this.birthDate = date;
    }

    int getHeight() {
        return height;
    }

    int getAge() {
        return age;
    }

}
