package tw.com.rex.leave_system.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import tw.com.rex.leave_system.model.dao.part.company.CompanyEmail;

@Mapper
public interface CompanyEmailMapper {

    int deleteByPrimaryKey(String id);

    int insertSelective(CompanyEmail record);

    List<CompanyEmail> selectAll();

    int updateSelectiveByPrimaryKey(CompanyEmail record);

    CompanyEmail selectByPrimaryKey(String id);
}