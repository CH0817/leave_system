package tw.com.rex.leave_system.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;
import tw.com.rex.leave_system.mapper.base.BaseMapperTest;
import tw.com.rex.leave_system.model.dao.Employee;
import tw.com.rex.leave_system.model.dao.LeaveHistory;

import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@Sql({"/db/data/data-dev-company.sql", "/db/data/data-dev-employee.sql", "/db/data/data-dev-leave_history.sql"})
public class LeaveHistoryMapperTest extends BaseMapperTest {

    @Autowired
    private LeaveHistoryMapper mapper;

    @Test
    public void insertSelective() {
        LeaveHistory entity = new LeaveHistory();
        Employee employee = new Employee();
        employee.setId("a");
        entity.setEmployee(employee);
        entity.setStartTime(new Date());
        entity.setEndTime(new Date());
        entity.setDescription("test");
        entity.setCreateDate(new Date());
        assertEquals(1, mapper.insertSelective(entity));
    }

    @Test
    public void deleteById() {
        assertEquals(1, mapper.deleteByPrimaryKey("a"));
    }

    @Test
    public void updateById() {
        LeaveHistory entity = new LeaveHistory();
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
