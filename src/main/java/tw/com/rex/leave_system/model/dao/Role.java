package tw.com.rex.leave_system.model.dao;

import lombok.Getter;
import lombok.Setter;
import tw.com.rex.leave_system.model.dao.base.BaseDao;

import java.util.Date;
import java.util.Objects;

@Getter
@Setter
public class Role extends BaseDao {

    private String name;
    private String description;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Role)) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        Role role = (Role) o;
        return name.equals(role.name) && Objects.equals(description, role.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name, description);
    }
}