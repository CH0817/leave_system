package tw.com.rex.leave_system.model.dao;

import lombok.Getter;
import lombok.Setter;
import tw.com.rex.leave_system.model.dao.base.BaseDao;

@Getter
@Setter
public class Role extends BaseDao {

    public String name;
    public String description;

}