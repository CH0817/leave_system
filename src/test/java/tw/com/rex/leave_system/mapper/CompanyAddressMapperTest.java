package tw.com.rex.leave_system.mapper;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.jdbc.Sql;
import tw.com.rex.leave_system.mapper.base.BaseMapperTest;
import tw.com.rex.leave_system.model.dao.Company;
import tw.com.rex.leave_system.model.dao.part.company.CompanyAddress;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@Sql({"/db/data/data-dev-company.sql", "/db/data/data-dev-company_address.sql"})
public class CompanyAddressMapperTest extends BaseMapperTest {

    @Autowired
    private CompanyAddressMapper mapper;

    @Test
    public void insertSelective() {
        CompanyAddress entity = new CompanyAddress();
        Company company = new Company();
        company.setId("a");
        entity.setCompany(company);
        entity.setZip("234");
        entity.setAddress("地址");
        assertEquals(1, mapper.insertSelective(entity));
    }

    @Test
    public void deleteById() {
        assertEquals(1, mapper.deleteByPrimaryKey("a"));
    }

    @Test
    public void updateById() {
        CompanyAddress entity = new CompanyAddress();
        entity.setId("a");
        entity.setZip("456");
        entity.setAddress("地址3333");
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
