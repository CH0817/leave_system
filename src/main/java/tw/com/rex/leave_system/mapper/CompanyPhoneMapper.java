package tw.com.rex.leave_system.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import tw.com.rex.leave_system.model.dao.CompanyPhone;

public interface CompanyPhoneMapper {
    int deleteByPrimaryKey(@Param("phone") String phone, @Param("companyId") String companyId);

    int insert(CompanyPhone record);

    List<CompanyPhone> selectAll();
}