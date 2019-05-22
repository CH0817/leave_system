package tw.com.rex.leave_system.model.dao;

import lombok.Getter;
import lombok.Setter;
import tw.com.rex.leave_system.model.dao.base.Phone;

import java.util.Objects;

@Getter
@Setter
public class CompanyPhone extends Phone {

    private String phone;
    private Company company;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CompanyPhone)) {
            return false;
        }
        CompanyPhone that = (CompanyPhone) o;
        return phone.equals(that.phone) && company.equals(that.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phone, company);
    }
}