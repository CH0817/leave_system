package tw.com.rex.leave_system.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;
import tw.com.rex.leave_system.model.dao.Company;

import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@MybatisTest
@Sql({"/db/data/data-dev-company.sql"})
public class CompanyMapperTest {

    @Autowired
    private CompanyMapper mapper;

    @Test
    public void insertSelective() {
        Company entity = new Company();
        entity.setName("測試");
        entity.setCreateDate(new Date());
        assertEquals(1, mapper.insertSelective(entity));
    }

    @Test
    public void deleteById() {
        assertEquals(1, mapper.deleteByPrimaryKey("a"));
    }

    @Test
    public void updateById() {
        Company entity = new Company();
        entity.setId("a");
        entity.setName("測試");
        entity.setUpdateDate(new Date());
        assertEquals(1, mapper.updateSelectiveByPrimaryKey(entity));
    }

    @Test
    public void selectById() {
        assertNotNull(mapper.selectByPrimaryKey("a"));
    }

    @Test
    public void selectAll() {
        assertEquals(2, mapper.selectAll().size());
    }

}
