package org.phcbest.multi.controller;

import org.phcbest.multi.entity.MchCustomer;
import org.phcbest.multi.service.MchCustomerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 客户档案(MchCustomer)表控制层
 *
 * @author makejava
 * @since 2021-02-04 18:07:37
 */
@RestController
@RequestMapping("/mchCustomer")
public class MchCustomerController {
    /**
     * 服务对象
     */
    @Resource
    private MchCustomerService mchCustomerService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/selectOne")
    public MchCustomer selectOne(Long id) {
        return this.mchCustomerService.queryById(id);
    }

}