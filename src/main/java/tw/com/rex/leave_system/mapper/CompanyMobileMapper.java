package tw.com.rex.leave_system.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import tw.com.rex.leave_system.model.dao.part.company.CompanyMobile;

@Mapper
public interface CompanyMobileMapper {

    int deleteByPrimaryKey(String mobile);

    int insert(CompanyMobile record);

    CompanyMobile selectByPrimaryKey(String mobile);

    List<CompanyMobile> selectAll();

    int updateByPrimaryKey(CompanyMobile record);
}