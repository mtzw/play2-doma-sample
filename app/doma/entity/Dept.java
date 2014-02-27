package doma.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;
import org.seasar.doma.Version;

/**
 */
@Entity(listener = DeptListener.class)
@Table(name = "dept")
public class Dept {

    /** */
    @Id
    @Column(name = "id")
    Integer id;

    /** */
    @Column(name = "dept_no")
    Integer deptNo;

    /** */
    @Column(name = "dept_name")
    String deptName;

    /** */
    @Column(name = "loc")
    String loc;

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
     * Returns the deptNo.
     * 
     * @return the deptNo
     */
    public Integer getDeptNo() {
        return deptNo;
    }

    /** 
     * Sets the deptNo.
     * 
     * @param deptNo the deptNo
     */
    public void setDeptNo(Integer deptNo) {
        this.deptNo = deptNo;
    }

    /** 
     * Returns the deptName.
     * 
     * @return the deptName
     */
    public String getDeptName() {
        return deptName;
    }

    /** 
     * Sets the deptName.
     * 
     * @param deptName the deptName
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    /** 
     * Returns the loc.
     * 
     * @return the loc
     */
    public String getLoc() {
        return loc;
    }

    /** 
     * Sets the loc.
     * 
     * @param loc the loc
     */
    public void setLoc(String loc) {
        this.loc = loc;
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