package tw.com.rex.leave_system.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
import tw.com.rex.leave_system.mapper.EmployeeMapper;
import tw.com.rex.leave_system.model.dao.Company;
import tw.com.rex.leave_system.model.dao.Employee;

import java.util.Date;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
@Transactional
@Sql({"/db/data/data-dev-company.sql", "/db/data/data-dev-employee.sql"})
public class EmployeeServiceTest {

    @Autowired
    private EmployeeService service;
    @Autowired
    private EmployeeMapper mapper;

    @Test
    public void register() {
        Employee entity = new Employee();
        entity.setPassword("11111111");
        entity.setName("測試");
        Company company = new Company();
        company.setId("a");
        entity.setCompany(company);
        entity.setArriveDate(new Date());
        Employee result = service.register(entity);
        assertNotNull(mapper.selectByPrimaryKey(result.getId()));
    }

    @Test
    public void deleteById() {
        assertTrue(service.deleteById("a"));
    }

    @Test
    public void updateById() {
        Employee entity = new Employee();
        entity.setId("a");
        entity.setName("測試");
        assertTrue(service.updateById(entity));
        assertEquals(entity.getName(), mapper.selectByPrimaryKey("a").getName());
    }

    @Test
    public void selectById() {
        assertNotNull(service.selectById("a"));
    }

    @Test
    public void selectAll() {
        assertEquals(1, service.selectAll().size());
    }

}
