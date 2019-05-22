package tw.com.rex.leave_system.service;

import tw.com.rex.leave_system.model.dao.Employee;

import java.util.List;

public interface EmployeeService {

    Employee register(Employee employee);

    boolean deleteById(String id);

    boolean updateById(Employee employee);

    Employee selectById(String id);

    List<Employee> selectAll();
}
