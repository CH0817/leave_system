package tw.com.rex.leave_system.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import tw.com.rex.leave_system.model.dao.LeaveHistory;

@Mapper
public interface LeaveHistoryMapper {

    int deleteByPrimaryKey(String id);

    int insertSelective(LeaveHistory record);

    LeaveHistory selectByPrimaryKey(String id);

    List<LeaveHistory> selectAll();

    int updateSelectiveByPrimaryKey(LeaveHistory record);
}