package tw.com.rex.leave_system.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import tw.com.rex.leave_system.model.dao.EmployeeMobile;

public interface EmployeeMobileMapper {
    int deleteByPrimaryKey(@Param("mobile") String mobile, @Param("employeeId") String employeeId);

    int insert(EmployeeMobile record);

    List<EmployeeMobile> selectAll();
}