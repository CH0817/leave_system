package tw.com.rex.leave_system.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import tw.com.rex.leave_system.model.dao.Role;

@Mapper
public interface RoleMapper {

    int deleteByPrimaryKey(String id);

    int insertSelective(Role record);

    Role selectByPrimaryKey(String id);

    List<Role> selectAll();

    int updateSelectiveByPrimaryKey(Role record);
}