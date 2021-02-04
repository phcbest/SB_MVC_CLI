package org.phcbest.multi.service.impl;

import org.phcbest.multi.dao.MchCustomerDao;
import org.phcbest.multi.entity.MchCustomer;
import org.phcbest.multi.service.MchCustomerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 客户档案(MchCustomer)表服务实现类
 *
 * @author makejava
 * @since 2021-02-04 18:07:37
 */
@Service("mchCustomerService")
public class MchCustomerServiceImpl implements MchCustomerService {
    @Resource
    private MchCustomerDao mchCustomerDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public MchCustomer queryById(Long id) {
        return this.mchCustomerDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<MchCustomer> queryAllByLimit(int offset, int limit) {
        return this.mchCustomerDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param mchCustomer 实例对象
     * @return 实例对象
     */
    @Override
    public MchCustomer insert(MchCustomer mchCustomer) {
        this.mchCustomerDao.insert(mchCustomer);
        return mchCustomer;
    }

    /**
     * 修改数据
     *
     * @param mchCustomer 实例对象
     * @return 实例对象
     */
    @Override
    public MchCustomer update(MchCustomer mchCustomer) {
        this.mchCustomerDao.update(mchCustomer);
        return this.queryById(mchCustomer.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.mchCustomerDao.deleteById(id) > 0;
    }
}