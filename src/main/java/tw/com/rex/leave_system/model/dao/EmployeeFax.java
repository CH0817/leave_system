package tw.com.rex.leave_system.model.dao;

import tw.com.rex.leave_system.model.dao.base.BaseDao;

public class EmployeeFax extends BaseDao {
    private String fax;

    private String employeeId;

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
}