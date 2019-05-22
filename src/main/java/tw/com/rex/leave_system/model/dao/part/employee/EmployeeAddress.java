package tw.com.rex.leave_system.model.dao.part.employee;

import tw.com.rex.leave_system.model.dao.base.BaseDao;

public class EmployeeAddress extends BaseDao {
    private String employeeId;

    private String zip;

    private String address;

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}