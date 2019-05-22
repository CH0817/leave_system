package tw.com.rex.leave_system.mapper;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.jdbc.Sql;
import tw.com.rex.leave_system.mapper.base.BaseMapperTest;
import tw.com.rex.leave_system.model.dao.Company;
import tw.com.rex.leave_system.model.dao.part.company.CompanyMobile;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@Sql({"/db/data/data-dev-company.sql", "/db/data/data-dev-company_mobile.sql"})
public class CompanyMobileMapperTest extends BaseMapperTest {

    @Autowired
    private CompanyMobileMapper mapper;

    @Test
    public void insertSelective() {
        CompanyMobile entity = new CompanyMobile();
        Company company = new Company();
        company.setId("a");
        entity.setCompany(company);
        entity.setMobile("0912345678");
        assertEquals(1, mapper.insertSelective(entity));
    }

    @Test
    public void deleteById() {
        assertEquals(1, mapper.deleteByPrimaryKey("a"));
    }

    @Test
    public void updateById() {
        CompanyMobile entity = new CompanyMobile();
        entity.setId("a");
        entity.setMobile("0987654321");
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
