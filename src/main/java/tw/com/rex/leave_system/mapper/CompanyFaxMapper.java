package tw.com.rex.leave_system.mapper;

import java.util.List;
import tw.com.rex.leave_system.model.dao.CompanyFax;

public interface CompanyFaxMapper {
    int deleteByPrimaryKey(String fax);

    int insert(CompanyFax record);

    CompanyFax selectByPrimaryKey(String fax);

    List<CompanyFax> selectAll();

    int updateByPrimaryKey(CompanyFax record);
}