package tw.com.rex.leave_system.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import tw.com.rex.leave_system.model.dao.EmployeeRole;

public interface EmployeeRoleMapper {
    int deleteByPrimaryKey(@Param("employeeId") String employeeId, @Param("roleId") String roleId);

    int insert(EmployeeRole record);

    EmployeeRole selectByPrimaryKey(@Param("employeeId") String employeeId, @Param("roleId") String roleId);

    List<EmployeeRole> selectAll();

    int updateByPrimaryKey(EmployeeRole record);
}