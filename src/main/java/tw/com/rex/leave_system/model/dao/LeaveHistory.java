package tw.com.rex.leave_system.model.dao;

import lombok.Getter;
import lombok.Setter;
import tw.com.rex.leave_system.model.dao.base.BaseDao;

import java.util.Date;

@Getter
@Setter
public class LeaveHistory extends BaseDao {

    public Employee employee;
    public Date startTime;
    public Date endTime;
    public Employee approveEmployee;
    public Date approveDate;
    public String description;
    public String note;

}