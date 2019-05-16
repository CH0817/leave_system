package tw.com.rex.leave_system.mapper;

import org.apache.ibatis.annotations.Mapper;
import tw.com.rex.leave_system.model.dao.Role;

@Mapper
public interface RoleMapper {

    int deleteByPrimaryKey(String id);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);
}