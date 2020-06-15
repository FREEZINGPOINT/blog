package com.foodsite.food.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TuijianFoodExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tuijian_food
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tuijian_food
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tuijian_food
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tuijian_food
     *
     * @mbg.generated
     */
    public TuijianFoodExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tuijian_food
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tuijian_food
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tuijian_food
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tuijian_food
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tuijian_food
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tuijian_food
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tuijian_food
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tuijian_food
     *
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tuijian_food
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tuijian_food
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tuijian_food
     *
     * @mbg.generated
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTuiIdIsNull() {
            addCriterion("tui_id is null");
            return (Criteria) this;
        }

        public Criteria andTuiIdIsNotNull() {
            addCriterion("tui_id is not null");
            return (Criteria) this;
        }

        public Criteria andTuiIdEqualTo(Long value) {
            addCriterion("tui_id =", value, "tuiId");
            return (Criteria) this;
        }

        public Criteria andTuiIdNotEqualTo(Long value) {
            addCriterion("tui_id <>", value, "tuiId");
            return (Criteria) this;
        }

        public Criteria andTuiIdGreaterThan(Long value) {
            addCriterion("tui_id >", value, "tuiId");
            return (Criteria) this;
        }

        public Criteria andTuiIdGreaterThanOrEqualTo(Long value) {
            addCriterion("tui_id >=", value, "tuiId");
            return (Criteria) this;
        }

        public Criteria andTuiIdLessThan(Long value) {
            addCriterion("tui_id <", value, "tuiId");
            return (Criteria) this;
        }

        public Criteria andTuiIdLessThanOrEqualTo(Long value) {
            addCriterion("tui_id <=", value, "tuiId");
            return (Criteria) this;
        }

        public Criteria andTuiIdIn(List<Long> values) {
            addCriterion("tui_id in", values, "tuiId");
            return (Criteria) this;
        }

        public Criteria andTuiIdNotIn(List<Long> values) {
            addCriterion("tui_id not in", values, "tuiId");
            return (Criteria) this;
        }

        public Criteria andTuiIdBetween(Long value1, Long value2) {
            addCriterion("tui_id between", value1, value2, "tuiId");
            return (Criteria) this;
        }

        public Criteria andTuiIdNotBetween(Long value1, Long value2) {
            addCriterion("tui_id not between", value1, value2, "tuiId");
            return (Criteria) this;
        }

        public Criteria andFoodNameIsNull() {
            addCriterion("food_name is null");
            return (Criteria) this;
        }

        public Criteria andFoodNameIsNotNull() {
            addCriterion("food_name is not null");
            return (Criteria) this;
        }

        public Criteria andFoodNameEqualTo(String value) {
            addCriterion("food_name =", value, "foodName");
            return (Criteria) this;
        }

        public Criteria andFoodNameNotEqualTo(String value) {
            addCriterion("food_name <>", value, "foodName");
            return (Criteria) this;
        }

        public Criteria andFoodNameGreaterThan(String value) {
            addCriterion("food_name >", value, "foodName");
            return (Criteria) this;
        }

        public Criteria andFoodNameGreaterThanOrEqualTo(String value) {
            addCriterion("food_name >=", value, "foodName");
            return (Criteria) this;
        }

        public Criteria andFoodNameLessThan(String value) {
            addCriterion("food_name <", value, "foodName");
            return (Criteria) this;
        }

        public Criteria andFoodNameLessThanOrEqualTo(String value) {
            addCriterion("food_name <=", value, "foodName");
            return (Criteria) this;
        }

        public Criteria andFoodNameLike(String value) {
            addCriterion("food_name like", value, "foodName");
            return (Criteria) this;
        }

        public Criteria andFoodNameNotLike(String value) {
            addCriterion("food_name not like", value, "foodName");
            return (Criteria) this;
        }

        public Criteria andFoodNameIn(List<String> values) {
            addCriterion("food_name in", values, "foodName");
            return (Criteria) this;
        }

        public Criteria andFoodNameNotIn(List<String> values) {
            addCriterion("food_name not in", values, "foodName");
            return (Criteria) this;
        }

        public Criteria andFoodNameBetween(String value1, String value2) {
            addCriterion("food_name between", value1, value2, "foodName");
            return (Criteria) this;
        }

        public Criteria andFoodNameNotBetween(String value1, String value2) {
            addCriterion("food_name not between", value1, value2, "foodName");
            return (Criteria) this;
        }

        public Criteria andFoodPhotoIsNull() {
            addCriterion("food_photo is null");
            return (Criteria) this;
        }

        public Criteria andFoodPhotoIsNotNull() {
            addCriterion("food_photo is not null");
            return (Criteria) this;
        }

        public Criteria andFoodPhotoEqualTo(String value) {
            addCriterion("food_photo =", value, "foodPhoto");
            return (Criteria) this;
        }

        public Criteria andFoodPhotoNotEqualTo(String value) {
            addCriterion("food_photo <>", value, "foodPhoto");
            return (Criteria) this;
        }

        public Criteria andFoodPhotoGreaterThan(String value) {
            addCriterion("food_photo >", value, "foodPhoto");
            return (Criteria) this;
        }

        public Criteria andFoodPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("food_photo >=", value, "foodPhoto");
            return (Criteria) this;
        }

        public Criteria andFoodPhotoLessThan(String value) {
            addCriterion("food_photo <", value, "foodPhoto");
            return (Criteria) this;
        }

        public Criteria andFoodPhotoLessThanOrEqualTo(String value) {
            addCriterion("food_photo <=", value, "foodPhoto");
            return (Criteria) this;
        }

        public Criteria andFoodPhotoLike(String value) {
            addCriterion("food_photo like", value, "foodPhoto");
            return (Criteria) this;
        }

        public Criteria andFoodPhotoNotLike(String value) {
            addCriterion("food_photo not like", value, "foodPhoto");
            return (Criteria) this;
        }

        public Criteria andFoodPhotoIn(List<String> values) {
            addCriterion("food_photo in", values, "foodPhoto");
            return (Criteria) this;
        }

        public Criteria andFoodPhotoNotIn(List<String> values) {
            addCriterion("food_photo not in", values, "foodPhoto");
            return (Criteria) this;
        }

        public Criteria andFoodPhotoBetween(String value1, String value2) {
            addCriterion("food_photo between", value1, value2, "foodPhoto");
            return (Criteria) this;
        }

        public Criteria andFoodPhotoNotBetween(String value1, String value2) {
            addCriterion("food_photo not between", value1, value2, "foodPhoto");
            return (Criteria) this;
        }

        public Criteria andFoodUidIsNull() {
            addCriterion("food_uid is null");
            return (Criteria) this;
        }

        public Criteria andFoodUidIsNotNull() {
            addCriterion("food_uid is not null");
            return (Criteria) this;
        }

        public Criteria andFoodUidEqualTo(Integer value) {
            addCriterion("food_uid =", value, "foodUid");
            return (Criteria) this;
        }

        public Criteria andFoodUidNotEqualTo(Integer value) {
            addCriterion("food_uid <>", value, "foodUid");
            return (Criteria) this;
        }

        public Criteria andFoodUidGreaterThan(Integer value) {
            addCriterion("food_uid >", value, "foodUid");
            return (Criteria) this;
        }

        public Criteria andFoodUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("food_uid >=", value, "foodUid");
            return (Criteria) this;
        }

        public Criteria andFoodUidLessThan(Integer value) {
            addCriterion("food_uid <", value, "foodUid");
            return (Criteria) this;
        }

        public Criteria andFoodUidLessThanOrEqualTo(Integer value) {
            addCriterion("food_uid <=", value, "foodUid");
            return (Criteria) this;
        }

        public Criteria andFoodUidIn(List<Integer> values) {
            addCriterion("food_uid in", values, "foodUid");
            return (Criteria) this;
        }

        public Criteria andFoodUidNotIn(List<Integer> values) {
            addCriterion("food_uid not in", values, "foodUid");
            return (Criteria) this;
        }

        public Criteria andFoodUidBetween(Integer value1, Integer value2) {
            addCriterion("food_uid between", value1, value2, "foodUid");
            return (Criteria) this;
        }

        public Criteria andFoodUidNotBetween(Integer value1, Integer value2) {
            addCriterion("food_uid not between", value1, value2, "foodUid");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNull() {
            addCriterion("gmt_create is null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNotNull() {
            addCriterion("gmt_create is not null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateEqualTo(Date value) {
            addCriterionForJDBCDate("gmt_create =", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotEqualTo(Date value) {
            addCriterionForJDBCDate("gmt_create <>", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThan(Date value) {
            addCriterionForJDBCDate("gmt_create >", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("gmt_create >=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThan(Date value) {
            addCriterionForJDBCDate("gmt_create <", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("gmt_create <=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIn(List<Date> values) {
            addCriterionForJDBCDate("gmt_create in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotIn(List<Date> values) {
            addCriterionForJDBCDate("gmt_create not in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("gmt_create between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("gmt_create not between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtUpdateIsNull() {
            addCriterion("gmt_update is null");
            return (Criteria) this;
        }

        public Criteria andGmtUpdateIsNotNull() {
            addCriterion("gmt_update is not null");
            return (Criteria) this;
        }

        public Criteria andGmtUpdateEqualTo(Date value) {
            addCriterionForJDBCDate("gmt_update =", value, "gmtUpdate");
            return (Criteria) this;
        }

        public Criteria andGmtUpdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("gmt_update <>", value, "gmtUpdate");
            return (Criteria) this;
        }

        public Criteria andGmtUpdateGreaterThan(Date value) {
            addCriterionForJDBCDate("gmt_update >", value, "gmtUpdate");
            return (Criteria) this;
        }

        public Criteria andGmtUpdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("gmt_update >=", value, "gmtUpdate");
            return (Criteria) this;
        }

        public Criteria andGmtUpdateLessThan(Date value) {
            addCriterionForJDBCDate("gmt_update <", value, "gmtUpdate");
            return (Criteria) this;
        }

        public Criteria andGmtUpdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("gmt_update <=", value, "gmtUpdate");
            return (Criteria) this;
        }

        public Criteria andGmtUpdateIn(List<Date> values) {
            addCriterionForJDBCDate("gmt_update in", values, "gmtUpdate");
            return (Criteria) this;
        }

        public Criteria andGmtUpdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("gmt_update not in", values, "gmtUpdate");
            return (Criteria) this;
        }

        public Criteria andGmtUpdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("gmt_update between", value1, value2, "gmtUpdate");
            return (Criteria) this;
        }

        public Criteria andGmtUpdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("gmt_update not between", value1, value2, "gmtUpdate");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tuijian_food
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tuijian_food
     *
     * @mbg.generated
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}