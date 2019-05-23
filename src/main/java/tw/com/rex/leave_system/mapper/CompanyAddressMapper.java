package tw.com.rex.leave_system.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import tw.com.rex.leave_system.model.dao.part.company.CompanyAddress;

@Mapper
public interface CompanyAddressMapper {

    int deleteByPrimaryKey(String companyId);

    int insertSelective(CompanyAddress record);

    CompanyAddress selectByPrimaryKey(String companyId);

    List<CompanyAddress> selectAll();

    int updateSelectiveByPrimaryKey(CompanyAddress record);
}