package org.phcbest.multi.service;

import org.phcbest.multi.entity.MchCustomer;

import java.util.List;

/**
 * 客户档案(MchCustomer)表服务接口
 *
 * @author makejava
 * @since 2021-02-04 18:07:37
 */
public interface MchCustomerService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    MchCustomer queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<MchCustomer> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param mchCustomer 实例对象
     * @return 实例对象
     */
    MchCustomer insert(MchCustomer mchCustomer);

    /**
     * 修改数据
     *
     * @param mchCustomer 实例对象
     * @return 实例对象
     */
    MchCustomer update(MchCustomer mchCustomer);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}