package tw.com.rex.leave_system.model.dao.part.employee;

import java.util.Date;
import tw.com.rex.leave_system.model.dao.base.BaseDao;

public class EmployeeRole extends BaseDao {
    private String employeeId;

    private String roleId;

    private Date createDate;

    private Date updateDate;

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}