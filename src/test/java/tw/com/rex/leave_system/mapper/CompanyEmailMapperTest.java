package tw.com.rex.leave_system.mapper;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.jdbc.Sql;
import tw.com.rex.leave_system.mapper.base.BaseMapperTest;
import tw.com.rex.leave_system.model.dao.Company;
import tw.com.rex.leave_system.model.dao.part.company.CompanyEmail;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@Sql({"/db/data/data-dev-company.sql", "/db/data/data-dev-company_email.sql"})
public class CompanyEmailMapperTest extends BaseMapperTest {

    @Autowired
    private CompanyEmailMapper mapper;

    @Test
    public void insertSelective() {
        CompanyEmail entity = new CompanyEmail();
        Company company = new Company();
        company.setId("a");
        entity.setCompany(company);
        entity.setEmail("test@test.com");
        assertEquals(1, mapper.insertSelective(entity));
    }

    @Test
    public void deleteById() {
        assertEquals(1, mapper.deleteByPrimaryKey("a"));
    }

    @Test
    public void updateById() {
        CompanyEmail entity = new CompanyEmail();
        entity.setId("a");
        entity.setEmail("tt@tt.com");
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
