package org.phcbest.multi.dao;

import org.apache.ibatis.annotations.Param;
import org.phcbest.multi.entity.MchCustomer;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 客户档案(MchCustomer)表数据库访问层
 *
 * @author makejava
 * @since 2021-02-04 18:07:37
 */
@Repository
public interface MchCustomerDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    MchCustomer queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<MchCustomer> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param mchCustomer 实例对象
     * @return 对象列表
     */
    List<MchCustomer> queryAll(MchCustomer mchCustomer);

    /**
     * 新增数据
     *
     * @param mchCustomer 实例对象
     * @return 影响行数
     */
    int insert(MchCustomer mchCustomer);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<MchCustomer> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<MchCustomer> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<MchCustomer> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<MchCustomer> entities);

    /**
     * 修改数据
     *
     * @param mchCustomer 实例对象
     * @return 影响行数
     */
    int update(MchCustomer mchCustomer);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}