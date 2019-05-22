package tw.com.rex.leave_system.mapper;

import java.util.List;
import tw.com.rex.leave_system.model.dao.part.employee.EmployeePhone;

public interface EmployeePhoneMapper {
    int deleteByPrimaryKey(String phone);

    int insert(EmployeePhone record);

    EmployeePhone selectByPrimaryKey(String phone);

    List<EmployeePhone> selectAll();

    int updateByPrimaryKey(EmployeePhone record);
}