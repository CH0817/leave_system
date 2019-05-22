package tw.com.rex.leave_system.model.dao;

import tw.com.rex.leave_system.model.dao.base.BaseDao;

public class CompanyAddress extends BaseDao {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company_address.company_id
     *
     * @mbg.generated
     */
    private String companyId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company_address.zip
     *
     * @mbg.generated
     */
    private String zip;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company_address.address
     *
     * @mbg.generated
     */
    private String address;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company_address.company_id
     *
     * @return the value of company_address.company_id
     *
     * @mbg.generated
     */
    public String getCompanyId() {
        return companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company_address.company_id
     *
     * @param companyId the value for company_address.company_id
     *
     * @mbg.generated
     */
    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company_address.zip
     *
     * @return the value of company_address.zip
     *
     * @mbg.generated
     */
    public String getZip() {
        return zip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company_address.zip
     *
     * @param zip the value for company_address.zip
     *
     * @mbg.generated
     */
    public void setZip(String zip) {
        this.zip = zip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company_address.address
     *
     * @return the value of company_address.address
     *
     * @mbg.generated
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company_address.address
     *
     * @param address the value for company_address.address
     *
     * @mbg.generated
     */
    public void setAddress(String address) {
        this.address = address;
    }
}