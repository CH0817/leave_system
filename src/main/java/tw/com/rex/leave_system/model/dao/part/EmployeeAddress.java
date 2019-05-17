package tw.com.rex.leave_system.model.dao.part;

import lombok.Getter;
import lombok.Setter;
import tw.com.rex.leave_system.model.dao.Employee;
import tw.com.rex.leave_system.model.dao.base.Address;

@Getter
@Setter
public class EmployeeAddress extends Address {

    public Employee employee;

}