package tw.com.rex.leave_system.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import tw.com.rex.leave_system.model.dao.part.employee.EmployeeEmail;

public interface EmployeeEmailMapper {
    int deleteByPrimaryKey(@Param("email") String email, @Param("employeeId") String employeeId);

    int insert(EmployeeEmail record);

    List<EmployeeEmail> selectAll();
}