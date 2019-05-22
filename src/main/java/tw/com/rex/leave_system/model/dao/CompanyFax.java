package tw.com.rex.leave_system.model.dao;

import lombok.Getter;
import lombok.Setter;
import tw.com.rex.leave_system.model.dao.base.Fax;

import java.util.Objects;

@Getter
@Setter
public class CompanyFax extends Fax {

    private String fax;
    private Company company;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CompanyFax)) {
            return false;
        }
        CompanyFax that = (CompanyFax) o;
        return fax.equals(that.fax) && company.equals(that.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fax, company);
    }
}