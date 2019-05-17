package tw.com.rex.leave_system.model.dao.part;

import lombok.Getter;
import lombok.Setter;
import tw.com.rex.leave_system.model.dao.Company;
import tw.com.rex.leave_system.model.dao.base.Mobile;

@Getter
@Setter
public class CompanyMobile extends Mobile {

    public Company company;

}