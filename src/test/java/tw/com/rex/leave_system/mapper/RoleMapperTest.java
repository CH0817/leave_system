package tw.com.rex.leave_system.mapper;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.jdbc.Sql;
import tw.com.rex.leave_system.mapper.base.BaseMapperTest;
import tw.com.rex.leave_system.model.dao.Employee;
import tw.com.rex.leave_system.model.dao.LeaveHistory;
import tw.com.rex.leave_system.model.dao.Role;

import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@Sql({"/db/data/data-dev-role.sql"})
public class RoleMapperTest extends BaseMapperTest {

    @Autowired
    private RoleMapper mapper;

    @Test
    public void insertSelective() {
        Role entity = new Role();
        entity.setName("test");
        entity.setDescription("測試");
        entity.setCreateDate(new Date());
        assertEquals(1, mapper.insertSelective(entity));
    }

    @Test
    public void deleteById() {
        assertEquals(1, mapper.deleteByPrimaryKey("a"));
    }

    @Test
    public void updateById() {
        Role entity = new Role();
        entity.setId("a");
        entity.setDescription("測試");
        entity.setUpdateDate(new Date());
        assertEquals(1, mapper.updateSelectiveByPrimaryKey(entity));
    }

    @Test
    public void selectById() {
        assertNotNull(mapper.selectByPrimaryKey("a"));
    }

    @Test
    public void selectAll() {
        assertEquals(1, mapper.selectAll().size());
    }

}
