package tw.com.rex.leave_system.model.dao;

import lombok.Getter;
import lombok.Setter;
import tw.com.rex.leave_system.model.dao.base.Address;

import java.util.Objects;

@Getter
@Setter
public class CompanyAddress extends Address {

    private Company company;
    private String zip;
    private String address;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CompanyAddress)) {
            return false;
        }
        CompanyAddress that = (CompanyAddress) o;
        return company.equals(that.company) && Objects.equals(zip, that.zip) && address.equals(that.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(company, zip, address);
    }
}