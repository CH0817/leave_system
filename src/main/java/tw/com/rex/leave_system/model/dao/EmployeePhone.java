package tw.com.rex.leave_system.model.dao;

import lombok.Getter;
import lombok.Setter;
import tw.com.rex.leave_system.model.dao.base.Phone;

import java.util.Objects;

@Getter
@Setter
public class EmployeePhone extends Phone {

    private String phone;
    private Employee employee;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof EmployeePhone)) {
            return false;
        }
        EmployeePhone that = (EmployeePhone) o;
        return phone.equals(that.phone) && employee.equals(that.employee);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phone, employee);
    }
}