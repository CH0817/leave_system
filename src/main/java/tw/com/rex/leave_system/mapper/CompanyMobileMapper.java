package tw.com.rex.leave_system.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import tw.com.rex.leave_system.model.dao.Company;
import tw.com.rex.leave_system.model.dao.part.company.CompanyMobile;

@Mapper
public interface CompanyMobileMapper {

    int deleteByPrimaryKey(String id);

    int insertSelective(CompanyMobile record);

    CompanyMobile selectByPrimaryKey(String id);

    List<CompanyMobile> selectAll();

    int updateSelectiveByPrimaryKey(CompanyMobile record);
}