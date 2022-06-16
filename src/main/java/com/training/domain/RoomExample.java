package com.training.domain;

import java.util.ArrayList;
import java.util.List;

public class RoomExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RoomExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andRoomidIsNull() {
            addCriterion("RoomID is null");
            return (Criteria) this;
        }

        public Criteria andRoomidIsNotNull() {
            addCriterion("RoomID is not null");
            return (Criteria) this;
        }

        public Criteria andRoomidEqualTo(Integer value) {
            addCriterion("RoomID =", value, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidNotEqualTo(Integer value) {
            addCriterion("RoomID <>", value, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidGreaterThan(Integer value) {
            addCriterion("RoomID >", value, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidGreaterThanOrEqualTo(Integer value) {
            addCriterion("RoomID >=", value, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidLessThan(Integer value) {
            addCriterion("RoomID <", value, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidLessThanOrEqualTo(Integer value) {
            addCriterion("RoomID <=", value, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidIn(List<Integer> values) {
            addCriterion("RoomID in", values, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidNotIn(List<Integer> values) {
            addCriterion("RoomID not in", values, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidBetween(Integer value1, Integer value2) {
            addCriterion("RoomID between", value1, value2, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidNotBetween(Integer value1, Integer value2) {
            addCriterion("RoomID not between", value1, value2, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomtypeIsNull() {
            addCriterion("RoomType is null");
            return (Criteria) this;
        }

        public Criteria andRoomtypeIsNotNull() {
            addCriterion("RoomType is not null");
            return (Criteria) this;
        }

        public Criteria andRoomtypeEqualTo(String value) {
            addCriterion("RoomType =", value, "roomtype");
            return (Criteria) this;
        }

        public Criteria andRoomtypeNotEqualTo(String value) {
            addCriterion("RoomType <>", value, "roomtype");
            return (Criteria) this;
        }

        public Criteria andRoomtypeGreaterThan(String value) {
            addCriterion("RoomType >", value, "roomtype");
            return (Criteria) this;
        }

        public Criteria andRoomtypeGreaterThanOrEqualTo(String value) {
            addCriterion("RoomType >=", value, "roomtype");
            return (Criteria) this;
        }

        public Criteria andRoomtypeLessThan(String value) {
            addCriterion("RoomType <", value, "roomtype");
            return (Criteria) this;
        }

        public Criteria andRoomtypeLessThanOrEqualTo(String value) {
            addCriterion("RoomType <=", value, "roomtype");
            return (Criteria) this;
        }

        public Criteria andRoomtypeLike(String value) {
            addCriterion("RoomType like", value, "roomtype");
            return (Criteria) this;
        }

        public Criteria andRoomtypeNotLike(String value) {
            addCriterion("RoomType not like", value, "roomtype");
            return (Criteria) this;
        }

        public Criteria andRoomtypeIn(List<String> values) {
            addCriterion("RoomType in", values, "roomtype");
            return (Criteria) this;
        }

        public Criteria andRoomtypeNotIn(List<String> values) {
            addCriterion("RoomType not in", values, "roomtype");
            return (Criteria) this;
        }

        public Criteria andRoomtypeBetween(String value1, String value2) {
            addCriterion("RoomType between", value1, value2, "roomtype");
            return (Criteria) this;
        }

        public Criteria andRoomtypeNotBetween(String value1, String value2) {
            addCriterion("RoomType not between", value1, value2, "roomtype");
            return (Criteria) this;
        }

        public Criteria andRoompriceIsNull() {
            addCriterion("RoomPrice is null");
            return (Criteria) this;
        }

        public Criteria andRoompriceIsNotNull() {
            addCriterion("RoomPrice is not null");
            return (Criteria) this;
        }

        public Criteria andRoompriceEqualTo(Float value) {
            addCriterion("RoomPrice =", value, "roomprice");
            return (Criteria) this;
        }

        public Criteria andRoompriceNotEqualTo(Float value) {
            addCriterion("RoomPrice <>", value, "roomprice");
            return (Criteria) this;
        }

        public Criteria andRoompriceGreaterThan(Float value) {
            addCriterion("RoomPrice >", value, "roomprice");
            return (Criteria) this;
        }

        public Criteria andRoompriceGreaterThanOrEqualTo(Float value) {
            addCriterion("RoomPrice >=", value, "roomprice");
            return (Criteria) this;
        }

        public Criteria andRoompriceLessThan(Float value) {
            addCriterion("RoomPrice <", value, "roomprice");
            return (Criteria) this;
        }

        public Criteria andRoompriceLessThanOrEqualTo(Float value) {
            addCriterion("RoomPrice <=", value, "roomprice");
            return (Criteria) this;
        }

        public Criteria andRoompriceIn(List<Float> values) {
            addCriterion("RoomPrice in", values, "roomprice");
            return (Criteria) this;
        }

        public Criteria andRoompriceNotIn(List<Float> values) {
            addCriterion("RoomPrice not in", values, "roomprice");
            return (Criteria) this;
        }

        public Criteria andRoompriceBetween(Float value1, Float value2) {
            addCriterion("RoomPrice between", value1, value2, "roomprice");
            return (Criteria) this;
        }

        public Criteria andRoompriceNotBetween(Float value1, Float value2) {
            addCriterion("RoomPrice not between", value1, value2, "roomprice");
            return (Criteria) this;
        }

        public Criteria andRoomstateIsNull() {
            addCriterion("RoomState is null");
            return (Criteria) this;
        }

        public Criteria andRoomstateIsNotNull() {
            addCriterion("RoomState is not null");
            return (Criteria) this;
        }

        public Criteria andRoomstateEqualTo(String value) {
            addCriterion("RoomState =", value, "roomstate");
            return (Criteria) this;
        }

        public Criteria andRoomstateNotEqualTo(String value) {
            addCriterion("RoomState <>", value, "roomstate");
            return (Criteria) this;
        }

        public Criteria andRoomstateGreaterThan(String value) {
            addCriterion("RoomState >", value, "roomstate");
            return (Criteria) this;
        }

        public Criteria andRoomstateGreaterThanOrEqualTo(String value) {
            addCriterion("RoomState >=", value, "roomstate");
            return (Criteria) this;
        }

        public Criteria andRoomstateLessThan(String value) {
            addCriterion("RoomState <", value, "roomstate");
            return (Criteria) this;
        }

        public Criteria andRoomstateLessThanOrEqualTo(String value) {
            addCriterion("RoomState <=", value, "roomstate");
            return (Criteria) this;
        }

        public Criteria andRoomstateLike(String value) {
            addCriterion("RoomState like", value, "roomstate");
            return (Criteria) this;
        }

        public Criteria andRoomstateNotLike(String value) {
            addCriterion("RoomState not like", value, "roomstate");
            return (Criteria) this;
        }

        public Criteria andRoomstateIn(List<String> values) {
            addCriterion("RoomState in", values, "roomstate");
            return (Criteria) this;
        }

        public Criteria andRoomstateNotIn(List<String> values) {
            addCriterion("RoomState not in", values, "roomstate");
            return (Criteria) this;
        }

        public Criteria andRoomstateBetween(String value1, String value2) {
            addCriterion("RoomState between", value1, value2, "roomstate");
            return (Criteria) this;
        }

        public Criteria andRoomstateNotBetween(String value1, String value2) {
            addCriterion("RoomState not between", value1, value2, "roomstate");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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