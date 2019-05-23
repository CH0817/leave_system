package tw.com.rex.leave_system.mapper;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.jdbc.Sql;
import tw.com.rex.leave_system.mapper.base.BaseMapperTest;
import tw.com.rex.leave_system.model.dao.Company;
import tw.com.rex.leave_system.model.dao.part.company.CompanyFax;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@Sql({"/db/data/data-dev-company.sql", "/db/data/data-dev-company_fax.sql"})
public class CompanyFaxMapperTest extends BaseMapperTest {

    @Autowired
    private CompanyFaxMapper mapper;

    @Test
    public void insertSelective() {
        CompanyFax entity = new CompanyFax();
        Company company = new Company();
        company.setId("a");
        entity.setCompany(company);
        entity.setAreaCode("02");
        entity.setFax("24244242");
        assertEquals(1, mapper.insertSelective(entity));
    }

    @Test
    public void deleteById() {
        assertEquals(1, mapper.deleteByPrimaryKey("a"));
    }

    @Test
    public void updateById() {
        CompanyFax entity = new CompanyFax();
        entity.setId("a");
        entity.setAreaCode("08");
        entity.setFax("38887887");
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
