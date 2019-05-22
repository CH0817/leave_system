package tw.com.rex.leave_system.model.dao.part.employee;

import lombok.Getter;
import lombok.Setter;
import tw.com.rex.leave_system.model.dao.Employee;
import tw.com.rex.leave_system.model.dao.base.Email;

import java.util.Objects;

@Getter
@Setter
public class EmployeeEmail extends Email {

    private String email;
    private Employee employee;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof EmployeeEmail)) {
            return false;
        }
        EmployeeEmail that = (EmployeeEmail) o;
        return email.equals(that.email) && employee.equals(that.employee);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, employee);
    }
}