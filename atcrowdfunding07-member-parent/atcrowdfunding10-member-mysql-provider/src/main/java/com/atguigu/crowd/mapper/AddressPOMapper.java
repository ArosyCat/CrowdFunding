package com.atguigu.crowd.mapper;

import com.atguigu.crowd.entity.po.AddressPO;
import com.atguigu.crowd.entity.po.AddressPOExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface AddressPOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_address
     *
     * @mbggenerated Thu Dec 09 17:11:25 CST 2021
     */
    int countByExample(AddressPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_address
     *
     * @mbggenerated Thu Dec 09 17:11:25 CST 2021
     */
    int deleteByExample(AddressPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_address
     *
     * @mbggenerated Thu Dec 09 17:11:25 CST 2021
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_address
     *
     * @mbggenerated Thu Dec 09 17:11:25 CST 2021
     */
    int insert(AddressPO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_address
     *
     * @mbggenerated Thu Dec 09 17:11:25 CST 2021
     */
    int insertSelective(AddressPO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_address
     *
     * @mbggenerated Thu Dec 09 17:11:25 CST 2021
     */
    List<AddressPO> selectByExample(AddressPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_address
     *
     * @mbggenerated Thu Dec 09 17:11:25 CST 2021
     */
    AddressPO selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_address
     *
     * @mbggenerated Thu Dec 09 17:11:25 CST 2021
     */
    int updateByExampleSelective(@Param("record") AddressPO record, @Param("example") AddressPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_address
     *
     * @mbggenerated Thu Dec 09 17:11:25 CST 2021
     */
    int updateByExample(@Param("record") AddressPO record, @Param("example") AddressPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_address
     *
     * @mbggenerated Thu Dec 09 17:11:25 CST 2021
     */
    int updateByPrimaryKeySelective(AddressPO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_address
     *
     * @mbggenerated Thu Dec 09 17:11:25 CST 2021
     */
    int updateByPrimaryKey(AddressPO record);
}