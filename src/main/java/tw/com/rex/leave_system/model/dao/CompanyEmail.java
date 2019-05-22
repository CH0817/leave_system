package tw.com.rex.leave_system.model.dao;

import lombok.Getter;
import lombok.Setter;
import tw.com.rex.leave_system.model.dao.base.Email;

import java.util.Objects;

@Getter
@Setter
public class CompanyEmail extends Email {

    private String email;
    private Company company;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CompanyEmail)) {
            return false;
        }
        CompanyEmail that = (CompanyEmail) o;
        return email.equals(that.email) && company.equals(that.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, company);
    }
}