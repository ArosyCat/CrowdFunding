package com.atguigu.crowd.entity.po;

public class MemberConfirmInfoPO {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_member_confirm_info.id
     *
     * @mbggenerated Tue Dec 07 10:50:39 CST 2021
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_member_confirm_info.memberid
     *
     * @mbggenerated Tue Dec 07 10:50:39 CST 2021
     */
    private Integer memberid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_member_confirm_info.paynum
     *
     * @mbggenerated Tue Dec 07 10:50:39 CST 2021
     */
    private String paynum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_member_confirm_info.cardnum
     *
     * @mbggenerated Tue Dec 07 10:50:39 CST 2021
     */
    private String cardnum;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_member_confirm_info.id
     *
     * @return the value of t_member_confirm_info.id
     *
     * @mbggenerated Tue Dec 07 10:50:39 CST 2021
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_member_confirm_info.id
     *
     * @param id the value for t_member_confirm_info.id
     *
     * @mbggenerated Tue Dec 07 10:50:39 CST 2021
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_member_confirm_info.memberid
     *
     * @return the value of t_member_confirm_info.memberid
     *
     * @mbggenerated Tue Dec 07 10:50:39 CST 2021
     */
    public Integer getMemberid() {
        return memberid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_member_confirm_info.memberid
     *
     * @param memberid the value for t_member_confirm_info.memberid
     *
     * @mbggenerated Tue Dec 07 10:50:39 CST 2021
     */
    public void setMemberid(Integer memberid) {
        this.memberid = memberid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_member_confirm_info.paynum
     *
     * @return the value of t_member_confirm_info.paynum
     *
     * @mbggenerated Tue Dec 07 10:50:39 CST 2021
     */
    public String getPaynum() {
        return paynum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_member_confirm_info.paynum
     *
     * @param paynum the value for t_member_confirm_info.paynum
     *
     * @mbggenerated Tue Dec 07 10:50:39 CST 2021
     */
    public void setPaynum(String paynum) {
        this.paynum = paynum == null ? null : paynum.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_member_confirm_info.cardnum
     *
     * @return the value of t_member_confirm_info.cardnum
     *
     * @mbggenerated Tue Dec 07 10:50:39 CST 2021
     */
    public String getCardnum() {
        return cardnum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_member_confirm_info.cardnum
     *
     * @param cardnum the value for t_member_confirm_info.cardnum
     *
     * @mbggenerated Tue Dec 07 10:50:39 CST 2021
     */
    public void setCardnum(String cardnum) {
        this.cardnum = cardnum == null ? null : cardnum.trim();
    }
}