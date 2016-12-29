
import java.time.LocalDate;

public class SecondaryEducation {

    private double finalGrade;
    private boolean graduated;
    private LocalDate enrollmentDate;
    private LocalDate graduationDate;
    private String institutionName;

    SecondaryEducation(double grade, LocalDate enrollment, LocalDate graduation, String institution) {
        this.finalGrade = grade;
        this.enrollmentDate = enrollment;
        this.graduationDate = graduation;
        this.institutionName = institution;
        if (graduation.compareTo(LocalDate.now()) > 0) {
            graduated = true;
        } else if (graduation.compareTo(LocalDate.now()) < 0) {
            graduated = false;
        }

    }

    void changeStatutGrade(boolean graduation) {
        this.graduated = graduation;
    }

    void changeStatutGrade(double mark) {
        this.finalGrade = mark;
    }

    LocalDate getEnrollment() {
        return enrollmentDate;
    }

    public String getInstitution() {
        return institutionName;
    }

    LocalDate getGraduation() {
        return graduationDate;
    }

    void setGraduationDate(LocalDate graduationDate) {
        this.graduationDate = graduationDate;
    }

    double getGrade() {
        return finalGrade;
    }

    void setGrade(double finalGrade) {
        this.finalGrade = finalGrade;
    }

    boolean getGraduated() {
        return graduated;
    }

}
