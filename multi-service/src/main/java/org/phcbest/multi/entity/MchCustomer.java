package org.phcbest.multi.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 客户档案(MchCustomer)实体类
 * 实现了序列化
 *
 * @author makejava
 * @since 2021-02-04 18:07:36
 */
public class MchCustomer implements Serializable {
    private static final long serialVersionUID = 121177702309590728L;
    /**
     * 主键
     */
    private Long id;
    /**
     * 创建日期
     */
    private Date createTime;
    /**
     * 更新人
     */
    private String updateBy;
    /**
     * 更新日期
     */
    private Date updateTime;
    /**
     * 创建人
     */
    private String createBy;
    /**
     * 是否删除
     */
    private String delFlag;
    /**
     * 名称
     */
    private String name;
    /**
     * 客户编号
     */
    private String customerNo;
    /**
     * 地址
     */
    private String address;
    /**
     * 联系电话
     */
    private String contactPhone;
    /**
     * 经营范围
     */
    private String customerIndustry;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCustomerNo() {
        return customerNo;
    }

    public void setCustomerNo(String customerNo) {
        this.customerNo = customerNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getCustomerIndustry() {
        return customerIndustry;
    }

    public void setCustomerIndustry(String customerIndustry) {
        this.customerIndustry = customerIndustry;
    }

}