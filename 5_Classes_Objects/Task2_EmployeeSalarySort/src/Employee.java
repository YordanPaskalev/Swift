
public class Employee {

    String name;
    double salary;
    String position;
    String department;
    int age;
    String email;

    static int employeeCounter = 0;
    static Employee[] employee = new Employee[5];

    public Employee(String name, double salary, String position, String department, int age, String email) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
        this.age = age;
        this.email = email;
    }

    Employee(String name, double salary, String postition, String department) {
        this.name = name;
        this.salary = salary;
        this.position = postition;
        this.department = department;
    }

    Employee(String name, double salary, String position, String department, String email) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
        this.email = email;
    }

    Employee(String name, double salary, String position, String department, int age) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
        this.age = age;
    }

    public Employee() {
    }

    static void addEmployee(Employee newEmployee) {
        employee[employeeCounter] = newEmployee;
        employeeCounter++;
    }

    static void sortEmployee(Employee[] employee) {
        for (int rows = 1; rows < employee.length; rows++) {
            for (int cols = 0; cols < employee.length - rows; cols++) {
                if (employee[cols + 1] != null) {
                    if (employee[cols].salary < employee[cols + 1].salary) {
                        Employee temp = employee[cols];
                        employee[cols] = employee[cols + 1];
                        employee[cols + 1] = temp;
                    }
                } else {
                    break;
                }
            }
        }
    }
}
