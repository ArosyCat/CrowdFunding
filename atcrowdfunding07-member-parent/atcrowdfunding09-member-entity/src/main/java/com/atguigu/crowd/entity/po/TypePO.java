package com.atguigu.crowd.entity.po;

public class TypePO {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_type.id
     *
     * @mbggenerated Tue Dec 07 10:50:39 CST 2021
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_type.name
     *
     * @mbggenerated Tue Dec 07 10:50:39 CST 2021
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_type.remark
     *
     * @mbggenerated Tue Dec 07 10:50:39 CST 2021
     */
    private String remark;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_type.id
     *
     * @return the value of t_type.id
     *
     * @mbggenerated Tue Dec 07 10:50:39 CST 2021
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_type.id
     *
     * @param id the value for t_type.id
     *
     * @mbggenerated Tue Dec 07 10:50:39 CST 2021
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_type.name
     *
     * @return the value of t_type.name
     *
     * @mbggenerated Tue Dec 07 10:50:39 CST 2021
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_type.name
     *
     * @param name the value for t_type.name
     *
     * @mbggenerated Tue Dec 07 10:50:39 CST 2021
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_type.remark
     *
     * @return the value of t_type.remark
     *
     * @mbggenerated Tue Dec 07 10:50:39 CST 2021
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_type.remark
     *
     * @param remark the value for t_type.remark
     *
     * @mbggenerated Tue Dec 07 10:50:39 CST 2021
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}