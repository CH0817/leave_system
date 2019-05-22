package tw.com.rex.leave_system.mapper;

import java.util.List;
import tw.com.rex.leave_system.model.dao.EmployeeAddress;

public interface EmployeeAddressMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employee_address
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String employeeId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employee_address
     *
     * @mbg.generated
     */
    int insert(EmployeeAddress record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employee_address
     *
     * @mbg.generated
     */
    EmployeeAddress selectByPrimaryKey(String employeeId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employee_address
     *
     * @mbg.generated
     */
    List<EmployeeAddress> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employee_address
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EmployeeAddress record);
}