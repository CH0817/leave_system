package tw.com.rex.leave_system.model.dao;

import lombok.Getter;
import lombok.Setter;
import tw.com.rex.leave_system.model.dao.base.BaseDao;
import tw.com.rex.leave_system.model.dao.part.employee.*;

import java.util.Date;
import java.util.Objects;
import java.util.Set;

@Getter
@Setter
public class Employee extends BaseDao {

    private String name;
    private String password;
    private Company company;
    private Company workSpace;
    private Employee manager;
    private Date arriveDate;
    private Date leaveDate;
    private EmployeeAddress address;
    private Set<EmployeeMobile> mobiles;
    private Set<EmployeePhone> phones;
    private Set<EmployeeFax> faxes;
    private Set<EmployeeEmail> emails;
    private Set<Role> roles;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Employee)) {
            return false;
        }
        Employee employee = (Employee) o;
        return name.equals(employee.name) && Objects.equals(password, employee.password) && Objects.equals(company,
                                                                                                           employee.company)
               && Objects.equals(workSpace, employee.workSpace) && Objects.equals(manager, employee.manager)
               && Objects.equals(arriveDate, employee.arriveDate) && Objects.equals(leaveDate, employee.leaveDate)
               && Objects.equals(address, employee.address) && Objects.equals(mobiles, employee.mobiles)
               && Objects.equals(phones, employee.phones) && Objects.equals(faxes, employee.faxes) && Objects.equals(
                emails, employee.emails) && Objects.equals(roles, employee.roles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, password, company, workSpace, manager, arriveDate, leaveDate, address, mobiles,
                            phones, faxes, emails, roles);
    }
}