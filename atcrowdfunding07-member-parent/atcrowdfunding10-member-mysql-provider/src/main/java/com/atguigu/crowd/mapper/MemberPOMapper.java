package com.atguigu.crowd.mapper;

import com.atguigu.crowd.entity.po.MemberPO;
import com.atguigu.crowd.entity.po.MemberPOExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MemberPOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_member
     *
     * @mbggenerated Mon Nov 29 16:36:03 CST 2021
     */
    int countByExample(MemberPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_member
     *
     * @mbggenerated Mon Nov 29 16:36:03 CST 2021
     */
    int deleteByExample(MemberPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_member
     *
     * @mbggenerated Mon Nov 29 16:36:03 CST 2021
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_member
     *
     * @mbggenerated Mon Nov 29 16:36:03 CST 2021
     */
    int insert(MemberPO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_member
     *
     * @mbggenerated Mon Nov 29 16:36:03 CST 2021
     */
    int insertSelective(MemberPO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_member
     *
     * @mbggenerated Mon Nov 29 16:36:03 CST 2021
     */
    List<MemberPO> selectByExample(MemberPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_member
     *
     * @mbggenerated Mon Nov 29 16:36:03 CST 2021
     */
    MemberPO selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_member
     *
     * @mbggenerated Mon Nov 29 16:36:03 CST 2021
     */
    int updateByExampleSelective(@Param("record") MemberPO record, @Param("example") MemberPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_member
     *
     * @mbggenerated Mon Nov 29 16:36:03 CST 2021
     */
    int updateByExample(@Param("record") MemberPO record, @Param("example") MemberPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_member
     *
     * @mbggenerated Mon Nov 29 16:36:03 CST 2021
     */
    int updateByPrimaryKeySelective(MemberPO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_member
     *
     * @mbggenerated Mon Nov 29 16:36:03 CST 2021
     */
    int updateByPrimaryKey(MemberPO record);
}