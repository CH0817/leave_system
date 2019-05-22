package tw.com.rex.leave_system.mapper;

import java.util.List;
import tw.com.rex.leave_system.model.dao.EmployeeAddress;

public interface EmployeeAddressMapper {
    int deleteByPrimaryKey(String employeeId);

    int insert(EmployeeAddress record);

    EmployeeAddress selectByPrimaryKey(String employeeId);

    List<EmployeeAddress> selectAll();

    int updateByPrimaryKey(EmployeeAddress record);
}