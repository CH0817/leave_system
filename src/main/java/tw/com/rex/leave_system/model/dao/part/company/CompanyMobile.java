package tw.com.rex.leave_system.model.dao.part.company;

import lombok.Getter;
import lombok.Setter;
import tw.com.rex.leave_system.model.dao.Company;
import tw.com.rex.leave_system.model.dao.base.Mobile;

import java.util.Objects;

@Getter
@Setter
public class CompanyMobile extends Mobile {

    private String mobile;
    private Company company;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CompanyMobile)) {
            return false;
        }
        CompanyMobile that = (CompanyMobile) o;
        return mobile.equals(that.mobile) && company.equals(that.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mobile, company);
    }
}