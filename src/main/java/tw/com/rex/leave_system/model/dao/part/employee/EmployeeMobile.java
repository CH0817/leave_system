package tw.com.rex.leave_system.model.dao.part.employee;

import lombok.Getter;
import lombok.Setter;
import tw.com.rex.leave_system.model.dao.Employee;
import tw.com.rex.leave_system.model.dao.base.Mobile;

import java.util.Objects;

@Getter
@Setter
public class EmployeeMobile extends Mobile {

    private String mobile;
    private Employee employee;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof EmployeeMobile)) {
            return false;
        }
        EmployeeMobile that = (EmployeeMobile) o;
        return mobile.equals(that.mobile) && employee.equals(that.employee);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mobile, employee);
    }
}