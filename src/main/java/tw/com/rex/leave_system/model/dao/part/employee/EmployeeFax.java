package tw.com.rex.leave_system.model.dao.part.employee;

import lombok.Getter;
import lombok.Setter;
import tw.com.rex.leave_system.model.dao.Employee;
import tw.com.rex.leave_system.model.dao.base.Fax;

import java.util.Objects;

@Getter
@Setter
public class EmployeeFax extends Fax {

    private String fax;
    private Employee employee;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof EmployeeFax)) {
            return false;
        }
        EmployeeFax that = (EmployeeFax) o;
        return fax.equals(that.fax) && employee.equals(that.employee);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fax, employee);
    }
}