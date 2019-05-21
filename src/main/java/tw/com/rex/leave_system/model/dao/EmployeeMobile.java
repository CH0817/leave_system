package tw.com.rex.leave_system.model.dao;

import tw.com.rex.leave_system.model.dao.base.BaseDao;

public class EmployeeMobile extends BaseDao {
    private String mobile;

    private String employeeId;

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
}