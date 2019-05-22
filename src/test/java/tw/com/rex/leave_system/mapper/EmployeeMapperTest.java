package tw.com.rex.leave_system.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;
import tw.com.rex.leave_system.model.dao.Company;
import tw.com.rex.leave_system.model.dao.Employee;

import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@MybatisTest
@Sql({"/db/data/data-dev-company.sql", "/db/data/data-dev-employee.sql"})
public class EmployeeMapperTest {

    @Autowired
    private EmployeeMapper mapper;

    @Test
    public void insertSelective() {
        Employee entity = new Employee();
        entity.setPassword("11111111");
        entity.setName("測試");
        Company company = new Company();
        company.setId("a");
        entity.setCompany(company);
        entity.setArriveDate(new Date());
        entity.setCreateDate(new Date());
        assertEquals(1, mapper.insertSelective(entity));
    }

    @Test
    public void deleteById() {
        assertEquals(1, mapper.deleteByPrimaryKey("a"));
    }

    @Test
    public void updateById() {
        Employee entity = new Employee();
        entity.setId("a");
        entity.setName("測試");
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
