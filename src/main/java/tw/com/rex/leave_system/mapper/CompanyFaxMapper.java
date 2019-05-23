package tw.com.rex.leave_system.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import tw.com.rex.leave_system.model.dao.part.company.CompanyFax;

@Mapper
public interface CompanyFaxMapper {

    int deleteByPrimaryKey(String id);

    int insertSelective(CompanyFax record);

    CompanyFax selectByPrimaryKey(String id);

    List<CompanyFax> selectAll();

    int updateSelectiveByPrimaryKey(CompanyFax record);
}