package tw.com.rex.leave_system.model.dao.part;

import lombok.Getter;
import lombok.Setter;
import tw.com.rex.leave_system.model.dao.Employee;
import tw.com.rex.leave_system.model.dao.base.Fax;

@Getter
@Setter
public class EmployeeFax extends Fax {

    public Employee employee;

}