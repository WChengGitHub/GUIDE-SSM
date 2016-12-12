package com.guide.ssm.module.user.pojo;

import java.util.ArrayList;
import java.util.List;

public class TbSpotExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_spot
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_spot
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_spot
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_spot
     *
     * @mbggenerated
     */
    public TbSpotExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_spot
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_spot
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_spot
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_spot
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_spot
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_spot
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_spot
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_spot
     *
     * @mbggenerated
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
     * This method corresponds to the database table tb_spot
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_spot
     *
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tb_spot
     *
     * @mbggenerated
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

        public Criteria andSidIsNull() {
            addCriterion("Sid is null");
            return (Criteria) this;
        }

        public Criteria andSidIsNotNull() {
            addCriterion("Sid is not null");
            return (Criteria) this;
        }

        public Criteria andSidEqualTo(String value) {
            addCriterion("Sid =", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotEqualTo(String value) {
            addCriterion("Sid <>", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThan(String value) {
            addCriterion("Sid >", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThanOrEqualTo(String value) {
            addCriterion("Sid >=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThan(String value) {
            addCriterion("Sid <", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThanOrEqualTo(String value) {
            addCriterion("Sid <=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLike(String value) {
            addCriterion("Sid like", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotLike(String value) {
            addCriterion("Sid not like", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidIn(List<String> values) {
            addCriterion("Sid in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotIn(List<String> values) {
            addCriterion("Sid not in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidBetween(String value1, String value2) {
            addCriterion("Sid between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotBetween(String value1, String value2) {
            addCriterion("Sid not between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSpotIsNull() {
            addCriterion("Spot is null");
            return (Criteria) this;
        }

        public Criteria andSpotIsNotNull() {
            addCriterion("Spot is not null");
            return (Criteria) this;
        }

        public Criteria andSpotEqualTo(String value) {
            addCriterion("Spot =", value, "spot");
            return (Criteria) this;
        }

        public Criteria andSpotNotEqualTo(String value) {
            addCriterion("Spot <>", value, "spot");
            return (Criteria) this;
        }

        public Criteria andSpotGreaterThan(String value) {
            addCriterion("Spot >", value, "spot");
            return (Criteria) this;
        }

        public Criteria andSpotGreaterThanOrEqualTo(String value) {
            addCriterion("Spot >=", value, "spot");
            return (Criteria) this;
        }

        public Criteria andSpotLessThan(String value) {
            addCriterion("Spot <", value, "spot");
            return (Criteria) this;
        }

        public Criteria andSpotLessThanOrEqualTo(String value) {
            addCriterion("Spot <=", value, "spot");
            return (Criteria) this;
        }

        public Criteria andSpotLike(String value) {
            addCriterion("Spot like", value, "spot");
            return (Criteria) this;
        }

        public Criteria andSpotNotLike(String value) {
            addCriterion("Spot not like", value, "spot");
            return (Criteria) this;
        }

        public Criteria andSpotIn(List<String> values) {
            addCriterion("Spot in", values, "spot");
            return (Criteria) this;
        }

        public Criteria andSpotNotIn(List<String> values) {
            addCriterion("Spot not in", values, "spot");
            return (Criteria) this;
        }

        public Criteria andSpotBetween(String value1, String value2) {
            addCriterion("Spot between", value1, value2, "spot");
            return (Criteria) this;
        }

        public Criteria andSpotNotBetween(String value1, String value2) {
            addCriterion("Spot not between", value1, value2, "spot");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNull() {
            addCriterion("Longitude is null");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNotNull() {
            addCriterion("Longitude is not null");
            return (Criteria) this;
        }

        public Criteria andLongitudeEqualTo(String value) {
            addCriterion("Longitude =", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotEqualTo(String value) {
            addCriterion("Longitude <>", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThan(String value) {
            addCriterion("Longitude >", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThanOrEqualTo(String value) {
            addCriterion("Longitude >=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThan(String value) {
            addCriterion("Longitude <", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThanOrEqualTo(String value) {
            addCriterion("Longitude <=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLike(String value) {
            addCriterion("Longitude like", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotLike(String value) {
            addCriterion("Longitude not like", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeIn(List<String> values) {
            addCriterion("Longitude in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotIn(List<String> values) {
            addCriterion("Longitude not in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeBetween(String value1, String value2) {
            addCriterion("Longitude between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotBetween(String value1, String value2) {
            addCriterion("Longitude not between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNull() {
            addCriterion("Latitude is null");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNotNull() {
            addCriterion("Latitude is not null");
            return (Criteria) this;
        }

        public Criteria andLatitudeEqualTo(String value) {
            addCriterion("Latitude =", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotEqualTo(String value) {
            addCriterion("Latitude <>", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThan(String value) {
            addCriterion("Latitude >", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThanOrEqualTo(String value) {
            addCriterion("Latitude >=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThan(String value) {
            addCriterion("Latitude <", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThanOrEqualTo(String value) {
            addCriterion("Latitude <=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLike(String value) {
            addCriterion("Latitude like", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotLike(String value) {
            addCriterion("Latitude not like", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIn(List<String> values) {
            addCriterion("Latitude in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotIn(List<String> values) {
            addCriterion("Latitude not in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeBetween(String value1, String value2) {
            addCriterion("Latitude between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotBetween(String value1, String value2) {
            addCriterion("Latitude not between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andRadiusIsNull() {
            addCriterion("Radius is null");
            return (Criteria) this;
        }

        public Criteria andRadiusIsNotNull() {
            addCriterion("Radius is not null");
            return (Criteria) this;
        }

        public Criteria andRadiusEqualTo(Integer value) {
            addCriterion("Radius =", value, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusNotEqualTo(Integer value) {
            addCriterion("Radius <>", value, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusGreaterThan(Integer value) {
            addCriterion("Radius >", value, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusGreaterThanOrEqualTo(Integer value) {
            addCriterion("Radius >=", value, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusLessThan(Integer value) {
            addCriterion("Radius <", value, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusLessThanOrEqualTo(Integer value) {
            addCriterion("Radius <=", value, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusIn(List<Integer> values) {
            addCriterion("Radius in", values, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusNotIn(List<Integer> values) {
            addCriterion("Radius not in", values, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusBetween(Integer value1, Integer value2) {
            addCriterion("Radius between", value1, value2, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusNotBetween(Integer value1, Integer value2) {
            addCriterion("Radius not between", value1, value2, "radius");
            return (Criteria) this;
        }

        public Criteria andAridIsNull() {
            addCriterion("Arid is null");
            return (Criteria) this;
        }

        public Criteria andAridIsNotNull() {
            addCriterion("Arid is not null");
            return (Criteria) this;
        }

        public Criteria andAridEqualTo(String value) {
            addCriterion("Arid =", value, "arid");
            return (Criteria) this;
        }

        public Criteria andAridNotEqualTo(String value) {
            addCriterion("Arid <>", value, "arid");
            return (Criteria) this;
        }

        public Criteria andAridGreaterThan(String value) {
            addCriterion("Arid >", value, "arid");
            return (Criteria) this;
        }

        public Criteria andAridGreaterThanOrEqualTo(String value) {
            addCriterion("Arid >=", value, "arid");
            return (Criteria) this;
        }

        public Criteria andAridLessThan(String value) {
            addCriterion("Arid <", value, "arid");
            return (Criteria) this;
        }

        public Criteria andAridLessThanOrEqualTo(String value) {
            addCriterion("Arid <=", value, "arid");
            return (Criteria) this;
        }

        public Criteria andAridLike(String value) {
            addCriterion("Arid like", value, "arid");
            return (Criteria) this;
        }

        public Criteria andAridNotLike(String value) {
            addCriterion("Arid not like", value, "arid");
            return (Criteria) this;
        }

        public Criteria andAridIn(List<String> values) {
            addCriterion("Arid in", values, "arid");
            return (Criteria) this;
        }

        public Criteria andAridNotIn(List<String> values) {
            addCriterion("Arid not in", values, "arid");
            return (Criteria) this;
        }

        public Criteria andAridBetween(String value1, String value2) {
            addCriterion("Arid between", value1, value2, "arid");
            return (Criteria) this;
        }

        public Criteria andAridNotBetween(String value1, String value2) {
            addCriterion("Arid not between", value1, value2, "arid");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("Description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("Description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("Description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("Description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("Description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("Description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("Description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("Description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("Description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("Description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("Description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("Description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("Description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("Description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andVoiceIsNull() {
            addCriterion("Voice is null");
            return (Criteria) this;
        }

        public Criteria andVoiceIsNotNull() {
            addCriterion("Voice is not null");
            return (Criteria) this;
        }

        public Criteria andVoiceEqualTo(String value) {
            addCriterion("Voice =", value, "voice");
            return (Criteria) this;
        }

        public Criteria andVoiceNotEqualTo(String value) {
            addCriterion("Voice <>", value, "voice");
            return (Criteria) this;
        }

        public Criteria andVoiceGreaterThan(String value) {
            addCriterion("Voice >", value, "voice");
            return (Criteria) this;
        }

        public Criteria andVoiceGreaterThanOrEqualTo(String value) {
            addCriterion("Voice >=", value, "voice");
            return (Criteria) this;
        }

        public Criteria andVoiceLessThan(String value) {
            addCriterion("Voice <", value, "voice");
            return (Criteria) this;
        }

        public Criteria andVoiceLessThanOrEqualTo(String value) {
            addCriterion("Voice <=", value, "voice");
            return (Criteria) this;
        }

        public Criteria andVoiceLike(String value) {
            addCriterion("Voice like", value, "voice");
            return (Criteria) this;
        }

        public Criteria andVoiceNotLike(String value) {
            addCriterion("Voice not like", value, "voice");
            return (Criteria) this;
        }

        public Criteria andVoiceIn(List<String> values) {
            addCriterion("Voice in", values, "voice");
            return (Criteria) this;
        }

        public Criteria andVoiceNotIn(List<String> values) {
            addCriterion("Voice not in", values, "voice");
            return (Criteria) this;
        }

        public Criteria andVoiceBetween(String value1, String value2) {
            addCriterion("Voice between", value1, value2, "voice");
            return (Criteria) this;
        }

        public Criteria andVoiceNotBetween(String value1, String value2) {
            addCriterion("Voice not between", value1, value2, "voice");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tb_spot
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tb_spot
     *
     * @mbggenerated
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