package com.qzy.springboot.entity;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table app_version
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class AppVersion implements Serializable{

    private static final long serialVersionUID = 4224328140295406417L;
    /**
     * Database Column Remarks:
     *   id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_version.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     * Database Column Remarks:
     *   app版本号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_version.version_code
     *
     * @mbg.generated
     */
    private String versionCode;

    /**
     * Database Column Remarks:
     *   创建时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_version.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     * Database Column Remarks:
     *   更新时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_version.update_time
     *
     * @mbg.generated
     */
    private Date updateTime;

    /**
     * Database Column Remarks:
     *   是否删除(0:否1:是)
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_version.is_deleted
     *
     * @mbg.generated
     */
    private Byte isDeleted;



    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_version.id
     *
     * @return the value of app_version.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_version.id
     *
     * @param id the value for app_version.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_version.version_code
     *
     * @return the value of app_version.version_code
     *
     * @mbg.generated
     */
    public String getVersionCode() {
        return versionCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_version.version_code
     *
     * @param versionCode the value for app_version.version_code
     *
     * @mbg.generated
     */
    public void setVersionCode(String versionCode) {
        this.versionCode = versionCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_version.create_time
     *
     * @return the value of app_version.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_version.create_time
     *
     * @param createTime the value for app_version.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_version.update_time
     *
     * @return the value of app_version.update_time
     *
     * @mbg.generated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_version.update_time
     *
     * @param updateTime the value for app_version.update_time
     *
     * @mbg.generated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_version.is_deleted
     *
     * @return the value of app_version.is_deleted
     *
     * @mbg.generated
     */
    public Byte getIsDeleted() {
        return isDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_version.is_deleted
     *
     * @param isDeleted the value for app_version.is_deleted
     *
     * @mbg.generated
     */
    public void setIsDeleted(Byte isDeleted) {
        this.isDeleted = isDeleted;
    }
}