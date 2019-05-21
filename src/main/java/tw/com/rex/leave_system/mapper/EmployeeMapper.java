package tw.com.rex.leave_system.mapper;

import java.util.List;
import tw.com.rex.leave_system.model.dao.Employee;

public interface EmployeeMapper {
    int deleteByPrimaryKey(String id);

    int insert(Employee record);

    Employee selectByPrimaryKey(String id);

    List<Employee> selectAll();

    int updateByPrimaryKey(Employee record);
}