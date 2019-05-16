package tw.com.rex.leave_system.mapper;

import org.apache.ibatis.annotations.Mapper;
import tw.com.rex.leave_system.model.dao.Fax;

@Mapper
public interface FaxMapper {

    int deleteByPrimaryKey(String id);

    int insert(Fax record);

    int insertSelective(Fax record);

    Fax selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Fax record);

    int updateByPrimaryKey(Fax record);
}