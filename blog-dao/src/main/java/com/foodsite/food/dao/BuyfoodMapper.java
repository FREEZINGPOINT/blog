package com.foodsite.food.dao;

import java.util.List;

import com.foodsite.food.entity.Buyfood;
import com.foodsite.food.entity.BuyfoodExample;
import org.apache.ibatis.annotations.Param;

public interface BuyfoodMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table buyfood
     *
     * @mbg.generated
     */
    long countByExample(BuyfoodExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table buyfood
     *
     * @mbg.generated
     */
    int deleteByExample(BuyfoodExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table buyfood
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table buyfood
     *
     * @mbg.generated
     */
    int insert(Buyfood record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table buyfood
     *
     * @mbg.generated
     */
    int insertSelective(Buyfood record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table buyfood
     *
     * @mbg.generated
     */
    List<Buyfood> selectByExampleWithBLOBs(BuyfoodExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table buyfood
     *
     * @mbg.generated
     */
    List<Buyfood> selectByExample(BuyfoodExample example);


    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table buyfood
     *
     * @mbg.generated
     */
    Buyfood selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table buyfood
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Buyfood record, @Param("example") BuyfoodExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table buyfood
     *
     * @mbg.generated
     */
    int updateByExampleWithBLOBs(@Param("record") Buyfood record, @Param("example") BuyfoodExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table buyfood
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Buyfood record, @Param("example") BuyfoodExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table buyfood
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Buyfood record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table buyfood
     *
     * @mbg.generated
     */
    int updateByPrimaryKeyWithBLOBs(Buyfood record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table buyfood
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Buyfood record);


    /**
     * 查询商品的信息
     *
     * @param start
     * @param size
     * @return
     */
    List<Buyfood> selectByStartAndSize(@Param("userId") Integer userId, @Param("start") int start,
                                       @Param("size") int size,@Param("foodType") String foodType);

    /**
     * 统计
     *
     * @return
     */
    int selectAllCount(@Param("userId") Integer userId,@Param("foodType") String foodType);
}