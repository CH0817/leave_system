package tw.com.rex.leave_system.mapper;

import java.util.List;
import tw.com.rex.leave_system.model.dao.LeaveHistory;

public interface LeaveHistoryMapper {
    int deleteByPrimaryKey(String id);

    int insert(LeaveHistory record);

    LeaveHistory selectByPrimaryKey(String id);

    List<LeaveHistory> selectAll();

    int updateByPrimaryKey(LeaveHistory record);
}