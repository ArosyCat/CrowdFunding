package com.atguigu.crowd.mapper;

import com.atguigu.crowd.entity.po.MemberLaunchInfoPO;
import com.atguigu.crowd.entity.po.MemberLaunchInfoPOExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface MemberLaunchInfoPOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_member_launch_info
     *
     * @mbggenerated Tue Dec 07 10:50:39 CST 2021
     */
    int countByExample(MemberLaunchInfoPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_member_launch_info
     *
     * @mbggenerated Tue Dec 07 10:50:39 CST 2021
     */
    int deleteByExample(MemberLaunchInfoPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_member_launch_info
     *
     * @mbggenerated Tue Dec 07 10:50:39 CST 2021
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_member_launch_info
     *
     * @mbggenerated Tue Dec 07 10:50:39 CST 2021
     */
    int insert(MemberLaunchInfoPO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_member_launch_info
     *
     * @mbggenerated Tue Dec 07 10:50:39 CST 2021
     */
    int insertSelective(MemberLaunchInfoPO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_member_launch_info
     *
     * @mbggenerated Tue Dec 07 10:50:39 CST 2021
     */
    List<MemberLaunchInfoPO> selectByExample(MemberLaunchInfoPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_member_launch_info
     *
     * @mbggenerated Tue Dec 07 10:50:39 CST 2021
     */
    MemberLaunchInfoPO selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_member_launch_info
     *
     * @mbggenerated Tue Dec 07 10:50:39 CST 2021
     */
    int updateByExampleSelective(@Param("record") MemberLaunchInfoPO record, @Param("example") MemberLaunchInfoPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_member_launch_info
     *
     * @mbggenerated Tue Dec 07 10:50:39 CST 2021
     */
    int updateByExample(@Param("record") MemberLaunchInfoPO record, @Param("example") MemberLaunchInfoPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_member_launch_info
     *
     * @mbggenerated Tue Dec 07 10:50:39 CST 2021
     */
    int updateByPrimaryKeySelective(MemberLaunchInfoPO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_member_launch_info
     *
     * @mbggenerated Tue Dec 07 10:50:39 CST 2021
     */
    int updateByPrimaryKey(MemberLaunchInfoPO record);
}