package com.foodsite.food.dao;

import com.foodsite.food.entity.TuijianFood;
import com.foodsite.food.entity.TuijianFoodExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TuijianFoodMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tuijian_food
     *
     * @mbg.generated
     */
    long countByExample(TuijianFoodExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tuijian_food
     *
     * @mbg.generated
     */
    int deleteByExample(TuijianFoodExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tuijian_food
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tuijian_food
     *
     * @mbg.generated
     */
    int insert(TuijianFood record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tuijian_food
     *
     * @mbg.generated
     */
    int insertSelective(TuijianFood record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tuijian_food
     *
     * @mbg.generated
     */
    List<TuijianFood> selectByExampleWithBLOBs(TuijianFoodExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tuijian_food
     *
     * @mbg.generated
     */
    List<TuijianFood> selectByExample(TuijianFoodExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tuijian_food
     *
     * @mbg.generated
     */
    TuijianFood selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tuijian_food
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TuijianFood record, @Param("example") TuijianFoodExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tuijian_food
     *
     * @mbg.generated
     */
    int updateByExampleWithBLOBs(@Param("record") TuijianFood record, @Param("example") TuijianFoodExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tuijian_food
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TuijianFood record, @Param("example") TuijianFoodExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tuijian_food
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TuijianFood record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tuijian_food
     *
     * @mbg.generated
     */
    int updateByPrimaryKeyWithBLOBs(TuijianFood record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tuijian_food
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TuijianFood record);
}