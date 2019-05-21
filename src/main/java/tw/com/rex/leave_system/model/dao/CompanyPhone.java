package tw.com.rex.leave_system.model.dao;

import tw.com.rex.leave_system.model.dao.base.BaseDao;

public class CompanyPhone extends BaseDao {
    private String phone;

    private String companyId;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }
}