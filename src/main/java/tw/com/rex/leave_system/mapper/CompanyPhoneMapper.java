package tw.com.rex.leave_system.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import tw.com.rex.leave_system.model.dao.CompanyPhone;

@Mapper
public interface CompanyPhoneMapper {

    int deleteByPrimaryKey(String phone);

    int insert(CompanyPhone record);

    CompanyPhone selectByPrimaryKey(String phone);

    List<CompanyPhone> selectAll();

    int updateByPrimaryKey(CompanyPhone record);
}