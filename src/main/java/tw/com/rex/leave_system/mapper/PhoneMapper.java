package tw.com.rex.leave_system.mapper;

import org.apache.ibatis.annotations.Mapper;
import tw.com.rex.leave_system.model.dao.Phone;

@Mapper
public interface PhoneMapper {

    int deleteByPrimaryKey(String id);

    int insert(Phone record);

    int insertSelective(Phone record);

    Phone selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Phone record);

    int updateByPrimaryKey(Phone record);
}