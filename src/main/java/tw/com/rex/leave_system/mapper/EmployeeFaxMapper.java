package tw.com.rex.leave_system.mapper;

import java.util.List;
import tw.com.rex.leave_system.model.dao.part.employee.EmployeeFax;

public interface EmployeeFaxMapper {
    int deleteByPrimaryKey(String fax);

    int insert(EmployeeFax record);

    EmployeeFax selectByPrimaryKey(String fax);

    List<EmployeeFax> selectAll();

    int updateByPrimaryKey(EmployeeFax record);
}