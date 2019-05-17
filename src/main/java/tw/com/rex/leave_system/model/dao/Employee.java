package tw.com.rex.leave_system.model.dao;

import lombok.Getter;
import lombok.Setter;
import tw.com.rex.leave_system.model.dao.base.*;

import java.util.Date;
import java.util.Set;

@Getter
@Setter
public class Employee extends BaseDao {

    public String name;
    public Set<Mobile> emails;
    public String password;
    public Address address;
    public Set<Mobile> mobiles;
    public Set<Phone> phones;
    public Set<Fax> faxes;
    public Company company;
    public Company workSpace;
    public Employee manager;
    public Date arriveDate;
    public Date leaveDate;
    public Set<Role> roles;
    public String note;

}