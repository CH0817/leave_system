package tw.com.rex.leave_system.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import tw.com.rex.leave_system.model.dao.CompanyEmail;

public interface CompanyEmailMapper {
    int deleteByPrimaryKey(@Param("email") String email, @Param("companyId") String companyId);

    int insert(CompanyEmail record);

    List<CompanyEmail> selectAll();
}