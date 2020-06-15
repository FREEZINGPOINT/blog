package com.foodsite.food.dao;

import java.util.List;

import com.foodsite.food.entity.DiscussFood;
import com.foodsite.food.entity.DiscussFoodExample;
import org.apache.ibatis.annotations.Param;

public interface DiscussFoodMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table discuss_food
     *
     * @mbg.generated
     */
    long countByExample(DiscussFoodExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table discuss_food
     *
     * @mbg.generated
     */
    int deleteByExample(DiscussFoodExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table discuss_food
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table discuss_food
     *
     * @mbg.generated
     */
    int insert(DiscussFood record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table discuss_food
     *
     * @mbg.generated
     */
    int insertSelective(DiscussFood record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table discuss_food
     *
     * @mbg.generated
     */
    List<DiscussFood> selectByExampleWithBLOBs(DiscussFoodExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table discuss_food
     *
     * @mbg.generated
     */
    List<DiscussFood> selectByExample(DiscussFoodExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table discuss_food
     *
     * @mbg.generated
     */
    DiscussFood selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table discuss_food
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") DiscussFood record, @Param("example") DiscussFoodExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table discuss_food
     *
     * @mbg.generated
     */
    int updateByExampleWithBLOBs(@Param("record") DiscussFood record, @Param("example") DiscussFoodExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table discuss_food
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") DiscussFood record, @Param("example") DiscussFoodExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table discuss_food
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(DiscussFood record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table discuss_food
     *
     * @mbg.generated
     */
    int updateByPrimaryKeyWithBLOBs(DiscussFood record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table discuss_food
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DiscussFood record);
}