package tw.com.rex.leave_system.mapper;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.jdbc.Sql;
import tw.com.rex.leave_system.mapper.base.BaseMapperTest;
import tw.com.rex.leave_system.model.dao.Company;
import tw.com.rex.leave_system.model.dao.part.company.CompanyPhone;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@Sql({"/db/data/data-dev-company.sql", "/db/data/data-dev-company_phone.sql"})
public class CompanyPhoneMapperTest extends BaseMapperTest {

    @Autowired
    private CompanyPhoneMapper mapper;

    @Test
    public void insertSelective() {
        CompanyPhone entity = new CompanyPhone();
        Company company = new Company();
        company.setId("a");
        entity.setCompany(company);
        entity.setAreaCode("02");
        entity.setPhone("24244242");
        assertEquals(1, mapper.insertSelective(entity));
    }

    @Test
    public void deleteById() {
        assertEquals(1, mapper.deleteByPrimaryKey("a"));
    }

    @Test
    public void updateById() {
        CompanyPhone entity = new CompanyPhone();
        entity.setId("a");
        entity.setAreaCode("08");
        entity.setPhone("38887887");
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
