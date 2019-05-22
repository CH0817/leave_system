package tw.com.rex.leave_system.model.dao;

import java.util.Date;
import java.util.Objects;

import lombok.Getter;
import lombok.Setter;
import tw.com.rex.leave_system.model.dao.base.BaseDao;

@Getter
@Setter
public class LeaveHistory extends BaseDao {

    private Date startTime;
    private Date endTime;
    private Employee employee;
    private Employee approveManager;
    private Date approveDate;
    private String description;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LeaveHistory)) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        LeaveHistory that = (LeaveHistory) o;
        return startTime.equals(that.startTime) && endTime.equals(that.endTime) && employee.equals(that.employee)
               && Objects.equals(approveManager, that.approveManager) && Objects.equals(approveDate, that.approveDate)
               && Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), startTime, endTime, employee, approveManager, approveDate, description);
    }
}