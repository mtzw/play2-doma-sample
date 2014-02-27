package doma.entity;

import java.math.BigDecimal;
import java.sql.Date;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;
import org.seasar.doma.Version;

/**
 */
@Entity(listener = EmpListener.class)
@Table(name = "emp")
public class Emp {

    /** */
    @Id
    @Column(name = "id")
    Integer id;

    /** */
    @Column(name = "emp_no")
    Integer empNo;

    /** */
    @Column(name = "emp_name")
    String empName;

    /** */
    @Column(name = "mgr_id")
    Integer mgrId;

    /** */
    @Column(name = "hiredate")
    Date hiredate;

    /** */
    @Column(name = "sal")
    BigDecimal sal;

    /** */
    @Column(name = "dept_id")
    Integer deptId;

    /** */
    @Version
    @Column(name = "version_no")
    Integer versionNo;

    /** 
     * Returns the id.
     * 
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /** 
     * Sets the id.
     * 
     * @param id the id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /** 
     * Returns the empNo.
     * 
     * @return the empNo
     */
    public Integer getEmpNo() {
        return empNo;
    }

    /** 
     * Sets the empNo.
     * 
     * @param empNo the empNo
     */
    public void setEmpNo(Integer empNo) {
        this.empNo = empNo;
    }

    /** 
     * Returns the empName.
     * 
     * @return the empName
     */
    public String getEmpName() {
        return empName;
    }

    /** 
     * Sets the empName.
     * 
     * @param empName the empName
     */
    public void setEmpName(String empName) {
        this.empName = empName;
    }

    /** 
     * Returns the mgrId.
     * 
     * @return the mgrId
     */
    public Integer getMgrId() {
        return mgrId;
    }

    /** 
     * Sets the mgrId.
     * 
     * @param mgrId the mgrId
     */
    public void setMgrId(Integer mgrId) {
        this.mgrId = mgrId;
    }

    /** 
     * Returns the hiredate.
     * 
     * @return the hiredate
     */
    public Date getHiredate() {
        return hiredate;
    }

    /** 
     * Sets the hiredate.
     * 
     * @param hiredate the hiredate
     */
    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    /** 
     * Returns the sal.
     * 
     * @return the sal
     */
    public BigDecimal getSal() {
        return sal;
    }

    /** 
     * Sets the sal.
     * 
     * @param sal the sal
     */
    public void setSal(BigDecimal sal) {
        this.sal = sal;
    }

    /** 
     * Returns the deptId.
     * 
     * @return the deptId
     */
    public Integer getDeptId() {
        return deptId;
    }

    /** 
     * Sets the deptId.
     * 
     * @param deptId the deptId
     */
    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    /** 
     * Returns the versionNo.
     * 
     * @return the versionNo
     */
    public Integer getVersionNo() {
        return versionNo;
    }

    /** 
     * Sets the versionNo.
     * 
     * @param versionNo the versionNo
     */
    public void setVersionNo(Integer versionNo) {
        this.versionNo = versionNo;
    }
}