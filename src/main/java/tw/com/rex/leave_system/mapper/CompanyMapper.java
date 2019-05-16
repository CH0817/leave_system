package tw.com.rex.leave_system.mapper;

import org.apache.ibatis.annotations.Mapper;
import tw.com.rex.leave_system.model.dao.Company;

@Mapper
public interface CompanyMapper {

    int deleteByPrimaryKey(String id);

    int insert(Company record);

    int insertSelective(Company record);

    Company selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Company record);

    int updateByPrimaryKey(Company record);
}