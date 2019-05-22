package tw.com.rex.leave_system.mapper;

import java.util.List;
import tw.com.rex.leave_system.model.dao.Role;

public interface RoleMapper {
    int deleteByPrimaryKey(String id);

    int insert(Role record);

    Role selectByPrimaryKey(String id);

    List<Role> selectAll();

    int updateByPrimaryKey(Role record);
}