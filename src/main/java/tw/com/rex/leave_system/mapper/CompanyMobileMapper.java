package tw.com.rex.leave_system.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import tw.com.rex.leave_system.model.dao.CompanyMobile;

public interface CompanyMobileMapper {
    int deleteByPrimaryKey(@Param("mobile") String mobile, @Param("companyId") String companyId);

    int insert(CompanyMobile record);

    List<CompanyMobile> selectAll();
}