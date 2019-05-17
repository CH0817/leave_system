package tw.com.rex.leave_system.model.dao.part;

import lombok.Getter;
import lombok.Setter;
import tw.com.rex.leave_system.model.dao.Company;
import tw.com.rex.leave_system.model.dao.base.Email;

@Getter
@Setter
public class CompanyEmail extends Email {

    public Company company;

}