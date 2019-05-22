package tw.com.rex.leave_system.mapper;

import java.util.List;
import tw.com.rex.leave_system.model.dao.part.employee.EmployeeMobile;

public interface EmployeeMobileMapper {
    int deleteByPrimaryKey(String mobile);

    int insert(EmployeeMobile record);

    EmployeeMobile selectByPrimaryKey(String mobile);

    List<EmployeeMobile> selectAll();

    int updateByPrimaryKey(EmployeeMobile record);
}