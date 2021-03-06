package com.android.app.entity;

import java.util.Date;

public class FriendRelation {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column friend_relation.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column friend_relation.user_from
     *
     * @mbg.generated
     */
    private Long userFrom;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column friend_relation.user_to
     *
     * @mbg.generated
     */
    private Long userTo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column friend_relation.gmt_create
     *
     * @mbg.generated
     */
    private Date gmtCreate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column friend_relation.gmt_update
     *
     * @mbg.generated
     */
    private Date gmtUpdate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column friend_relation.id
     *
     * @return the value of friend_relation.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column friend_relation.id
     *
     * @param id the value for friend_relation.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column friend_relation.user_from
     *
     * @return the value of friend_relation.user_from
     *
     * @mbg.generated
     */
    public Long getUserFrom() {
        return userFrom;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column friend_relation.user_from
     *
     * @param userFrom the value for friend_relation.user_from
     *
     * @mbg.generated
     */
    public void setUserFrom(Long userFrom) {
        this.userFrom = userFrom;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column friend_relation.user_to
     *
     * @return the value of friend_relation.user_to
     *
     * @mbg.generated
     */
    public Long getUserTo() {
        return userTo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column friend_relation.user_to
     *
     * @param userTo the value for friend_relation.user_to
     *
     * @mbg.generated
     */
    public void setUserTo(Long userTo) {
        this.userTo = userTo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column friend_relation.gmt_create
     *
     * @return the value of friend_relation.gmt_create
     *
     * @mbg.generated
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column friend_relation.gmt_create
     *
     * @param gmtCreate the value for friend_relation.gmt_create
     *
     * @mbg.generated
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column friend_relation.gmt_update
     *
     * @return the value of friend_relation.gmt_update
     *
     * @mbg.generated
     */
    public Date getGmtUpdate() {
        return gmtUpdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column friend_relation.gmt_update
     *
     * @param gmtUpdate the value for friend_relation.gmt_update
     *
     * @mbg.generated
     */
    public void setGmtUpdate(Date gmtUpdate) {
        this.gmtUpdate = gmtUpdate;
    }
}