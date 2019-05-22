package tw.com.rex.leave_system.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import tw.com.rex.leave_system.model.dao.EmployeeRole;

public interface EmployeeRoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employee_role
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(@Param("employeeId") String employeeId, @Param("roleId") String roleId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employee_role
     *
     * @mbg.generated
     */
    int insert(EmployeeRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employee_role
     *
     * @mbg.generated
     */
    EmployeeRole selectByPrimaryKey(@Param("employeeId") String employeeId, @Param("roleId") String roleId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employee_role
     *
     * @mbg.generated
     */
    List<EmployeeRole> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employee_role
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EmployeeRole record);
}