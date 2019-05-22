package tw.com.rex.leave_system.mapper;

import java.util.List;
import tw.com.rex.leave_system.model.dao.part.company.CompanyAddress;

public interface CompanyAddressMapper {
    int deleteByPrimaryKey(String companyId);

    int insert(CompanyAddress record);

    CompanyAddress selectByPrimaryKey(String companyId);

    List<CompanyAddress> selectAll();

    int updateByPrimaryKey(CompanyAddress record);
}