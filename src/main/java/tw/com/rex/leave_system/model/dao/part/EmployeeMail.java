package tw.com.rex.leave_system.model.dao.part;

import lombok.Getter;
import lombok.Setter;
import tw.com.rex.leave_system.model.dao.Employee;
import tw.com.rex.leave_system.model.dao.base.Email;

@Getter
@Setter
public class EmployeeMail extends Email {

    public Employee employee;

}