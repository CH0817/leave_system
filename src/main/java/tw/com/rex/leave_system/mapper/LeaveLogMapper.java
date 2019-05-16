package tw.com.rex.leave_system.mapper;

import org.apache.ibatis.annotations.Mapper;
import tw.com.rex.leave_system.model.dao.LeaveLog;

@Mapper
public interface LeaveLogMapper {

    int deleteByPrimaryKey(String id);

    int insert(LeaveLog record);

    int insertSelective(LeaveLog record);

    LeaveLog selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(LeaveLog record);

    int updateByPrimaryKey(LeaveLog record);
}