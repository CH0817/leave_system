package tw.com.rex.leave_system.model.dao;

import lombok.Getter;
import lombok.Setter;
import tw.com.rex.leave_system.model.dao.base.*;

import java.util.Set;

@Getter
@Setter
public class Company extends BaseDao {

    public String name;
    public Address address;
    public Set<Mobile> mobiles;
    public Set<Phone> phones;
    public Set<Fax> faxes;
    public Set<Email> emails;
    public Employee principal;
    public String note;

}