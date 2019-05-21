package tw.com.rex.leave_system.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import tw.com.rex.leave_system.model.dao.EmployeePhone;

public interface EmployeePhoneMapper {
    int deleteByPrimaryKey(@Param("phone") String phone, @Param("employeeId") String employeeId);

    int insert(EmployeePhone record);

    List<EmployeePhone> selectAll();
}