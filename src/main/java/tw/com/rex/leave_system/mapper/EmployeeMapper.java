package tw.com.rex.leave_system.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import tw.com.rex.leave_system.model.dao.Employee;

@Mapper
public interface EmployeeMapper {

    int deleteByPrimaryKey(String id);

    int insertSelective(Employee record);

    Employee selectByPrimaryKey(String id);

    List<Employee> selectAll();

    int updateSelectiveByPrimaryKey(Employee record);
}