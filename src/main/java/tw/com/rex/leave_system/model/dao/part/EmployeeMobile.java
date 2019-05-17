package tw.com.rex.leave_system.model.dao.part;

import lombok.Getter;
import lombok.Setter;
import tw.com.rex.leave_system.model.dao.Employee;
import tw.com.rex.leave_system.model.dao.base.Mobile;

@Getter
@Setter
public class EmployeeMobile extends Mobile {

    public Employee employee;

}