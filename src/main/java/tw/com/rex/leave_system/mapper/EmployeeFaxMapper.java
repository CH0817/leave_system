package tw.com.rex.leave_system.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import tw.com.rex.leave_system.model.dao.EmployeeFax;

public interface EmployeeFaxMapper {
    int deleteByPrimaryKey(@Param("fax") String fax, @Param("employeeId") String employeeId);

    int insert(EmployeeFax record);

    List<EmployeeFax> selectAll();
}