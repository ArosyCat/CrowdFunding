package com.atguigu.crowd.mapper;

import com.atguigu.crowd.entity.Auth;
import com.atguigu.crowd.entity.AuthExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuthMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_auth
     *
     * @mbggenerated Sat Nov 20 16:22:43 CST 2021
     */
    int countByExample(AuthExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_auth
     *
     * @mbggenerated Sat Nov 20 16:22:43 CST 2021
     */
    int deleteByExample(AuthExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_auth
     *
     * @mbggenerated Sat Nov 20 16:22:43 CST 2021
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_auth
     *
     * @mbggenerated Sat Nov 20 16:22:43 CST 2021
     */
    int insert(Auth record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_auth
     *
     * @mbggenerated Sat Nov 20 16:22:43 CST 2021
     */
    int insertSelective(Auth record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_auth
     *
     * @mbggenerated Sat Nov 20 16:22:43 CST 2021
     */
    List<Auth> selectByExample(AuthExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_auth
     *
     * @mbggenerated Sat Nov 20 16:22:43 CST 2021
     */
    Auth selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_auth
     *
     * @mbggenerated Sat Nov 20 16:22:43 CST 2021
     */
    int updateByExampleSelective(@Param("record") Auth record, @Param("example") AuthExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_auth
     *
     * @mbggenerated Sat Nov 20 16:22:43 CST 2021
     */
    int updateByExample(@Param("record") Auth record, @Param("example") AuthExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_auth
     *
     * @mbggenerated Sat Nov 20 16:22:43 CST 2021
     */
    int updateByPrimaryKeySelective(Auth record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_auth
     *
     * @mbggenerated Sat Nov 20 16:22:43 CST 2021
     */
    int updateByPrimaryKey(Auth record);

    List<Integer> selectAssignedAuthIdByRoleId(Integer roleId);

    void deleteOldRelationship(Integer roleId);

    void insertNewRelationship(@Param("roleId") Integer roleId, @Param("authIdList") List<Integer> authIdList);

    List<String> selectAssignedAuthNameByAdminId(Integer adminId);
}