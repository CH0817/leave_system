package tw.com.rex.leave_system.mapper;

import org.apache.ibatis.annotations.Mapper;
import tw.com.rex.leave_system.model.dao.Employee;

@Mapper
public interface EmployeeMapper {

    int deleteByPrimaryKey(String id);

    int insert(Employee record);

    int insertSelective(Employee record);

    Employee selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Employee record);

    int updateByPrimaryKey(Employee record);
}