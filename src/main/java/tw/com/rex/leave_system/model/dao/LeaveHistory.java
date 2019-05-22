package tw.com.rex.leave_system.model.dao;

import java.util.Date;
import tw.com.rex.leave_system.model.dao.base.BaseDao;

public class LeaveHistory extends BaseDao {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column leave_history.id
     *
     * @mbg.generated
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column leave_history.start_time
     *
     * @mbg.generated
     */
    private Date startTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column leave_history.end_time
     *
     * @mbg.generated
     */
    private Date endTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column leave_history.create_date
     *
     * @mbg.generated
     */
    private Date createDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column leave_history.update_date
     *
     * @mbg.generated
     */
    private Date updateDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column leave_history.employee_id
     *
     * @mbg.generated
     */
    private String employeeId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column leave_history.approve_manager_id
     *
     * @mbg.generated
     */
    private String approveManagerId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column leave_history.approve_date
     *
     * @mbg.generated
     */
    private Date approveDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column leave_history.description
     *
     * @mbg.generated
     */
    private String description;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column leave_history.id
     *
     * @return the value of leave_history.id
     *
     * @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column leave_history.id
     *
     * @param id the value for leave_history.id
     *
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column leave_history.start_time
     *
     * @return the value of leave_history.start_time
     *
     * @mbg.generated
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column leave_history.start_time
     *
     * @param startTime the value for leave_history.start_time
     *
     * @mbg.generated
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column leave_history.end_time
     *
     * @return the value of leave_history.end_time
     *
     * @mbg.generated
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column leave_history.end_time
     *
     * @param endTime the value for leave_history.end_time
     *
     * @mbg.generated
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column leave_history.create_date
     *
     * @return the value of leave_history.create_date
     *
     * @mbg.generated
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column leave_history.create_date
     *
     * @param createDate the value for leave_history.create_date
     *
     * @mbg.generated
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column leave_history.update_date
     *
     * @return the value of leave_history.update_date
     *
     * @mbg.generated
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column leave_history.update_date
     *
     * @param updateDate the value for leave_history.update_date
     *
     * @mbg.generated
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column leave_history.employee_id
     *
     * @return the value of leave_history.employee_id
     *
     * @mbg.generated
     */
    public String getEmployeeId() {
        return employeeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column leave_history.employee_id
     *
     * @param employeeId the value for leave_history.employee_id
     *
     * @mbg.generated
     */
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column leave_history.approve_manager_id
     *
     * @return the value of leave_history.approve_manager_id
     *
     * @mbg.generated
     */
    public String getApproveManagerId() {
        return approveManagerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column leave_history.approve_manager_id
     *
     * @param approveManagerId the value for leave_history.approve_manager_id
     *
     * @mbg.generated
     */
    public void setApproveManagerId(String approveManagerId) {
        this.approveManagerId = approveManagerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column leave_history.approve_date
     *
     * @return the value of leave_history.approve_date
     *
     * @mbg.generated
     */
    public Date getApproveDate() {
        return approveDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column leave_history.approve_date
     *
     * @param approveDate the value for leave_history.approve_date
     *
     * @mbg.generated
     */
    public void setApproveDate(Date approveDate) {
        this.approveDate = approveDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column leave_history.description
     *
     * @return the value of leave_history.description
     *
     * @mbg.generated
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column leave_history.description
     *
     * @param description the value for leave_history.description
     *
     * @mbg.generated
     */
    public void setDescription(String description) {
        this.description = description;
    }
}