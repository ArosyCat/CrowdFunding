package com.atguigu.crowd.mapper;

import com.atguigu.crowd.entity.po.TagPO;
import com.atguigu.crowd.entity.po.TagPOExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TagPOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_tag
     *
     * @mbggenerated Tue Dec 07 10:50:39 CST 2021
     */
    int countByExample(TagPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_tag
     *
     * @mbggenerated Tue Dec 07 10:50:39 CST 2021
     */
    int deleteByExample(TagPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_tag
     *
     * @mbggenerated Tue Dec 07 10:50:39 CST 2021
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_tag
     *
     * @mbggenerated Tue Dec 07 10:50:39 CST 2021
     */
    int insert(TagPO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_tag
     *
     * @mbggenerated Tue Dec 07 10:50:39 CST 2021
     */
    int insertSelective(TagPO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_tag
     *
     * @mbggenerated Tue Dec 07 10:50:39 CST 2021
     */
    List<TagPO> selectByExample(TagPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_tag
     *
     * @mbggenerated Tue Dec 07 10:50:39 CST 2021
     */
    TagPO selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_tag
     *
     * @mbggenerated Tue Dec 07 10:50:39 CST 2021
     */
    int updateByExampleSelective(@Param("record") TagPO record, @Param("example") TagPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_tag
     *
     * @mbggenerated Tue Dec 07 10:50:39 CST 2021
     */
    int updateByExample(@Param("record") TagPO record, @Param("example") TagPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_tag
     *
     * @mbggenerated Tue Dec 07 10:50:39 CST 2021
     */
    int updateByPrimaryKeySelective(TagPO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_tag
     *
     * @mbggenerated Tue Dec 07 10:50:39 CST 2021
     */
    int updateByPrimaryKey(TagPO record);
}