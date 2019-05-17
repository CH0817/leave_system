package tw.com.rex.leave_system.model.dao.part;

import lombok.Getter;
import lombok.Setter;
import tw.com.rex.leave_system.model.dao.Company;
import tw.com.rex.leave_system.model.dao.base.Address;

@Getter
@Setter
public class CompanyAddress extends Address {

    public Company company;

}