package tw.com.rex.leave_system.model.dao;

import lombok.Getter;
import lombok.Setter;
import tw.com.rex.leave_system.model.dao.base.BaseDao;

import java.util.Objects;
import java.util.Set;

@Getter
@Setter
public class Company extends BaseDao {

    private String name;
    private Employee principal;
    private CompanyAddress address;
    private Set<CompanyMobile> mobiles;
    private Set<CompanyPhone> phones;
    private Set<CompanyFax> faxes;
    private Set<CompanyEmail> emails;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Company)) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        Company company = (Company) o;
        return name.equals(company.name) && Objects.equals(principal, company.principal) && Objects.equals(address,
                                                                                                           company.address)
               && Objects.equals(mobiles, company.mobiles) && Objects.equals(phones, company.phones) && Objects.equals(
                faxes, company.faxes) && Objects.equals(emails, company.emails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name, principal, address, mobiles, phones, faxes, emails);
    }
}