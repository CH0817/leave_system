package tw.com.rex.leave_system.mapper;

import org.apache.ibatis.annotations.Mapper;
import tw.com.rex.leave_system.model.dao.Mobile;

@Mapper
public interface MobileMapper {

    int deleteByPrimaryKey(String id);

    int insert(Mobile record);

    int insertSelective(Mobile record);

    Mobile selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Mobile record);

    int updateByPrimaryKey(Mobile record);
}