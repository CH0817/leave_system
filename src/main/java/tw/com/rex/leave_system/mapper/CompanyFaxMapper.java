package tw.com.rex.leave_system.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import tw.com.rex.leave_system.model.dao.CompanyFax;

public interface CompanyFaxMapper {
    int deleteByPrimaryKey(@Param("fax") String fax, @Param("companyId") String companyId);

    int insert(CompanyFax record);

    List<CompanyFax> selectAll();
}