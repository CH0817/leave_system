package tw.com.rex.leave_system.mapper;

import java.util.List;
import tw.com.rex.leave_system.model.dao.Company;

public interface CompanyMapper {
    int deleteByPrimaryKey(String id);

    int insert(Company record);

    Company selectByPrimaryKey(String id);

    List<Company> selectAll();

    int updateByPrimaryKey(Company record);
}