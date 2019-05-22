package tw.com.rex.leave_system.model.dao;

import java.util.Date;
import tw.com.rex.leave_system.model.dao.base.BaseDao;

public class EmployeeRole extends BaseDao {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee_role.employee_id
     *
     * @mbg.generated
     */
    private String employeeId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee_role.role_id
     *
     * @mbg.generated
     */
    private String roleId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee_role.create_date
     *
     * @mbg.generated
     */
    private Date createDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee_role.update_date
     *
     * @mbg.generated
     */
    private Date updateDate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee_role.employee_id
     *
     * @return the value of employee_role.employee_id
     *
     * @mbg.generated
     */
    public String getEmployeeId() {
        return employeeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee_role.employee_id
     *
     * @param employeeId the value for employee_role.employee_id
     *
     * @mbg.generated
     */
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee_role.role_id
     *
     * @return the value of employee_role.role_id
     *
     * @mbg.generated
     */
    public String getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee_role.role_id
     *
     * @param roleId the value for employee_role.role_id
     *
     * @mbg.generated
     */
    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee_role.create_date
     *
     * @return the value of employee_role.create_date
     *
     * @mbg.generated
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee_role.create_date
     *
     * @param createDate the value for employee_role.create_date
     *
     * @mbg.generated
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee_role.update_date
     *
     * @return the value of employee_role.update_date
     *
     * @mbg.generated
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee_role.update_date
     *
     * @param updateDate the value for employee_role.update_date
     *
     * @mbg.generated
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}