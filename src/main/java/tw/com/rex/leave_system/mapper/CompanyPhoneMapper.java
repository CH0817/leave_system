package tw.com.rex.leave_system.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import tw.com.rex.leave_system.model.dao.part.company.CompanyPhone;

@Mapper
public interface CompanyPhoneMapper {

    int deleteByPrimaryKey(String id);

    int insertSelective(CompanyPhone record);

    CompanyPhone selectByPrimaryKey(String id);

    List<CompanyPhone> selectAll();

    int updateSelectiveByPrimaryKey(CompanyPhone record);
}