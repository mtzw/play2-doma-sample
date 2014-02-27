package doma.dao;

import doma.DomaConfig;
import doma.entity.Emp;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = DomaConfig.class)
public interface EmpDao {

    /**
     * @param id
     * @return the Emp entity
     */
    @Select
    Emp selectById(Integer id);

    /**
     * @param id
     * @param versionNo
     * @return the Emp entity
     */
    @Select(ensureResult = true)
    Emp selectByIdAndVersion(Integer id, Integer versionNo);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(Emp entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(Emp entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(Emp entity);
}