package com.atguigu.crowd.mapper;

import com.atguigu.crowd.entity.po.ProjectItemPicPO;
import com.atguigu.crowd.entity.po.ProjectItemPicPOExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface ProjectItemPicPOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_project_item_pic
     *
     * @mbggenerated Tue Dec 07 10:50:39 CST 2021
     */
    int countByExample(ProjectItemPicPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_project_item_pic
     *
     * @mbggenerated Tue Dec 07 10:50:39 CST 2021
     */
    int deleteByExample(ProjectItemPicPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_project_item_pic
     *
     * @mbggenerated Tue Dec 07 10:50:39 CST 2021
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_project_item_pic
     *
     * @mbggenerated Tue Dec 07 10:50:39 CST 2021
     */
    int insert(ProjectItemPicPO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_project_item_pic
     *
     * @mbggenerated Tue Dec 07 10:50:39 CST 2021
     */
    int insertSelective(ProjectItemPicPO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_project_item_pic
     *
     * @mbggenerated Tue Dec 07 10:50:39 CST 2021
     */
    List<ProjectItemPicPO> selectByExample(ProjectItemPicPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_project_item_pic
     *
     * @mbggenerated Tue Dec 07 10:50:39 CST 2021
     */
    ProjectItemPicPO selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_project_item_pic
     *
     * @mbggenerated Tue Dec 07 10:50:39 CST 2021
     */
    int updateByExampleSelective(@Param("record") ProjectItemPicPO record, @Param("example") ProjectItemPicPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_project_item_pic
     *
     * @mbggenerated Tue Dec 07 10:50:39 CST 2021
     */
    int updateByExample(@Param("record") ProjectItemPicPO record, @Param("example") ProjectItemPicPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_project_item_pic
     *
     * @mbggenerated Tue Dec 07 10:50:39 CST 2021
     */
    int updateByPrimaryKeySelective(ProjectItemPicPO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_project_item_pic
     *
     * @mbggenerated Tue Dec 07 10:50:39 CST 2021
     */
    int updateByPrimaryKey(ProjectItemPicPO record);

    void insertPathList(@Param("projectId") Integer projectId, @Param("detailPicturePathList") List<String> detailPicturePathList);
}