import java.util.Objects;

public class Employee {
    String firstName;
    String lastName;
    String departmentName;
    Double wage;

    Employee(String firstName, String lastName, String departmentName, Double wage) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.departmentName = departmentName;
        this.wage = wage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;
        return firstName == employee.firstName && lastName == employee.lastName;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}
