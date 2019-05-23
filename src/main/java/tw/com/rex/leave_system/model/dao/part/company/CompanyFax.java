package tw.com.rex.leave_system.model.dao.part.company;

import lombok.Getter;
import lombok.Setter;
import tw.com.rex.leave_system.model.dao.Company;
import tw.com.rex.leave_system.model.dao.base.Fax;

@Getter
@Setter
public class CompanyFax extends Fax {

    private Company company;

}