package tw.com.rex.leave_system.model.dao.part;

import lombok.Getter;
import lombok.Setter;
import tw.com.rex.leave_system.model.dao.Employee;
import tw.com.rex.leave_system.model.dao.base.Phone;

@Getter
@Setter
public class EmployeePhone extends Phone {

    public Employee employee;

}