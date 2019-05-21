package tw.com.rex.leave_system.model.dao;

import tw.com.rex.leave_system.model.dao.base.BaseDao;

public class CompanyMobile extends BaseDao {
    private String mobile;

    private String companyId;

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }
}