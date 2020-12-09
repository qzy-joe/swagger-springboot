package com.qzy.springboot.mapper;

import com.qzy.springboot.entity.AppVersion;
import com.qzy.springboot.entity.AppVersionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AppVersionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_version
     *
     * @mbg.generated
     */
    long countByExample(AppVersionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_version
     *
     * @mbg.generated
     */
    int deleteByExample(AppVersionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_version
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_version
     *
     * @mbg.generated
     */
    int insert(AppVersion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_version
     *
     * @mbg.generated
     */
    int insertSelective(AppVersion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_version
     *
     * @mbg.generated
     */
    List<AppVersion> selectByExample(AppVersionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_version
     *
     * @mbg.generated
     */
    AppVersion selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_version
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") AppVersion record, @Param("example") AppVersionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_version
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") AppVersion record, @Param("example") AppVersionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_version
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(AppVersion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_version
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(AppVersion record);
}