package com.training.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InExample() {
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

        public Criteria andInidIsNull() {
            addCriterion("InID is null");
            return (Criteria) this;
        }

        public Criteria andInidIsNotNull() {
            addCriterion("InID is not null");
            return (Criteria) this;
        }

        public Criteria andInidEqualTo(Integer value) {
            addCriterion("InID =", value, "inid");
            return (Criteria) this;
        }

        public Criteria andInidNotEqualTo(Integer value) {
            addCriterion("InID <>", value, "inid");
            return (Criteria) this;
        }

        public Criteria andInidGreaterThan(Integer value) {
            addCriterion("InID >", value, "inid");
            return (Criteria) this;
        }

        public Criteria andInidGreaterThanOrEqualTo(Integer value) {
            addCriterion("InID >=", value, "inid");
            return (Criteria) this;
        }

        public Criteria andInidLessThan(Integer value) {
            addCriterion("InID <", value, "inid");
            return (Criteria) this;
        }

        public Criteria andInidLessThanOrEqualTo(Integer value) {
            addCriterion("InID <=", value, "inid");
            return (Criteria) this;
        }

        public Criteria andInidIn(List<Integer> values) {
            addCriterion("InID in", values, "inid");
            return (Criteria) this;
        }

        public Criteria andInidNotIn(List<Integer> values) {
            addCriterion("InID not in", values, "inid");
            return (Criteria) this;
        }

        public Criteria andInidBetween(Integer value1, Integer value2) {
            addCriterion("InID between", value1, value2, "inid");
            return (Criteria) this;
        }

        public Criteria andInidNotBetween(Integer value1, Integer value2) {
            addCriterion("InID not between", value1, value2, "inid");
            return (Criteria) this;
        }

        public Criteria andCostomernameIsNull() {
            addCriterion("CostomerName is null");
            return (Criteria) this;
        }

        public Criteria andCostomernameIsNotNull() {
            addCriterion("CostomerName is not null");
            return (Criteria) this;
        }

        public Criteria andCostomernameEqualTo(String value) {
            addCriterion("CostomerName =", value, "costomername");
            return (Criteria) this;
        }

        public Criteria andCostomernameNotEqualTo(String value) {
            addCriterion("CostomerName <>", value, "costomername");
            return (Criteria) this;
        }

        public Criteria andCostomernameGreaterThan(String value) {
            addCriterion("CostomerName >", value, "costomername");
            return (Criteria) this;
        }

        public Criteria andCostomernameGreaterThanOrEqualTo(String value) {
            addCriterion("CostomerName >=", value, "costomername");
            return (Criteria) this;
        }

        public Criteria andCostomernameLessThan(String value) {
            addCriterion("CostomerName <", value, "costomername");
            return (Criteria) this;
        }

        public Criteria andCostomernameLessThanOrEqualTo(String value) {
            addCriterion("CostomerName <=", value, "costomername");
            return (Criteria) this;
        }

        public Criteria andCostomernameLike(String value) {
            addCriterion("CostomerName like", value, "costomername");
            return (Criteria) this;
        }

        public Criteria andCostomernameNotLike(String value) {
            addCriterion("CostomerName not like", value, "costomername");
            return (Criteria) this;
        }

        public Criteria andCostomernameIn(List<String> values) {
            addCriterion("CostomerName in", values, "costomername");
            return (Criteria) this;
        }

        public Criteria andCostomernameNotIn(List<String> values) {
            addCriterion("CostomerName not in", values, "costomername");
            return (Criteria) this;
        }

        public Criteria andCostomernameBetween(String value1, String value2) {
            addCriterion("CostomerName between", value1, value2, "costomername");
            return (Criteria) this;
        }

        public Criteria andCostomernameNotBetween(String value1, String value2) {
            addCriterion("CostomerName not between", value1, value2, "costomername");
            return (Criteria) this;
        }

        public Criteria andCostomertypeIsNull() {
            addCriterion("CostomerType is null");
            return (Criteria) this;
        }

        public Criteria andCostomertypeIsNotNull() {
            addCriterion("CostomerType is not null");
            return (Criteria) this;
        }

        public Criteria andCostomertypeEqualTo(String value) {
            addCriterion("CostomerType =", value, "costomertype");
            return (Criteria) this;
        }

        public Criteria andCostomertypeNotEqualTo(String value) {
            addCriterion("CostomerType <>", value, "costomertype");
            return (Criteria) this;
        }

        public Criteria andCostomertypeGreaterThan(String value) {
            addCriterion("CostomerType >", value, "costomertype");
            return (Criteria) this;
        }

        public Criteria andCostomertypeGreaterThanOrEqualTo(String value) {
            addCriterion("CostomerType >=", value, "costomertype");
            return (Criteria) this;
        }

        public Criteria andCostomertypeLessThan(String value) {
            addCriterion("CostomerType <", value, "costomertype");
            return (Criteria) this;
        }

        public Criteria andCostomertypeLessThanOrEqualTo(String value) {
            addCriterion("CostomerType <=", value, "costomertype");
            return (Criteria) this;
        }

        public Criteria andCostomertypeLike(String value) {
            addCriterion("CostomerType like", value, "costomertype");
            return (Criteria) this;
        }

        public Criteria andCostomertypeNotLike(String value) {
            addCriterion("CostomerType not like", value, "costomertype");
            return (Criteria) this;
        }

        public Criteria andCostomertypeIn(List<String> values) {
            addCriterion("CostomerType in", values, "costomertype");
            return (Criteria) this;
        }

        public Criteria andCostomertypeNotIn(List<String> values) {
            addCriterion("CostomerType not in", values, "costomertype");
            return (Criteria) this;
        }

        public Criteria andCostomertypeBetween(String value1, String value2) {
            addCriterion("CostomerType between", value1, value2, "costomertype");
            return (Criteria) this;
        }

        public Criteria andCostomertypeNotBetween(String value1, String value2) {
            addCriterion("CostomerType not between", value1, value2, "costomertype");
            return (Criteria) this;
        }

        public Criteria andCostomerindateIsNull() {
            addCriterion("CostomerInDate is null");
            return (Criteria) this;
        }

        public Criteria andCostomerindateIsNotNull() {
            addCriterion("CostomerInDate is not null");
            return (Criteria) this;
        }

        public Criteria andCostomerindateEqualTo(Date value) {
            addCriterion("CostomerInDate =", value, "costomerindate");
            return (Criteria) this;
        }

        public Criteria andCostomerindateNotEqualTo(Date value) {
            addCriterion("CostomerInDate <>", value, "costomerindate");
            return (Criteria) this;
        }

        public Criteria andCostomerindateGreaterThan(Date value) {
            addCriterion("CostomerInDate >", value, "costomerindate");
            return (Criteria) this;
        }

        public Criteria andCostomerindateGreaterThanOrEqualTo(Date value) {
            addCriterion("CostomerInDate >=", value, "costomerindate");
            return (Criteria) this;
        }

        public Criteria andCostomerindateLessThan(Date value) {
            addCriterion("CostomerInDate <", value, "costomerindate");
            return (Criteria) this;
        }

        public Criteria andCostomerindateLessThanOrEqualTo(Date value) {
            addCriterion("CostomerInDate <=", value, "costomerindate");
            return (Criteria) this;
        }

        public Criteria andCostomerindateIn(List<Date> values) {
            addCriterion("CostomerInDate in", values, "costomerindate");
            return (Criteria) this;
        }

        public Criteria andCostomerindateNotIn(List<Date> values) {
            addCriterion("CostomerInDate not in", values, "costomerindate");
            return (Criteria) this;
        }

        public Criteria andCostomerindateBetween(Date value1, Date value2) {
            addCriterion("CostomerInDate between", value1, value2, "costomerindate");
            return (Criteria) this;
        }

        public Criteria andCostomerindateNotBetween(Date value1, Date value2) {
            addCriterion("CostomerInDate not between", value1, value2, "costomerindate");
            return (Criteria) this;
        }

        public Criteria andCostomeroutdate0IsNull() {
            addCriterion("CostomerOutDate0 is null");
            return (Criteria) this;
        }

        public Criteria andCostomeroutdate0IsNotNull() {
            addCriterion("CostomerOutDate0 is not null");
            return (Criteria) this;
        }

        public Criteria andCostomeroutdate0EqualTo(Date value) {
            addCriterion("CostomerOutDate0 =", value, "costomeroutdate0");
            return (Criteria) this;
        }

        public Criteria andCostomeroutdate0NotEqualTo(Date value) {
            addCriterion("CostomerOutDate0 <>", value, "costomeroutdate0");
            return (Criteria) this;
        }

        public Criteria andCostomeroutdate0GreaterThan(Date value) {
            addCriterion("CostomerOutDate0 >", value, "costomeroutdate0");
            return (Criteria) this;
        }

        public Criteria andCostomeroutdate0GreaterThanOrEqualTo(Date value) {
            addCriterion("CostomerOutDate0 >=", value, "costomeroutdate0");
            return (Criteria) this;
        }

        public Criteria andCostomeroutdate0LessThan(Date value) {
            addCriterion("CostomerOutDate0 <", value, "costomeroutdate0");
            return (Criteria) this;
        }

        public Criteria andCostomeroutdate0LessThanOrEqualTo(Date value) {
            addCriterion("CostomerOutDate0 <=", value, "costomeroutdate0");
            return (Criteria) this;
        }

        public Criteria andCostomeroutdate0In(List<Date> values) {
            addCriterion("CostomerOutDate0 in", values, "costomeroutdate0");
            return (Criteria) this;
        }

        public Criteria andCostomeroutdate0NotIn(List<Date> values) {
            addCriterion("CostomerOutDate0 not in", values, "costomeroutdate0");
            return (Criteria) this;
        }

        public Criteria andCostomeroutdate0Between(Date value1, Date value2) {
            addCriterion("CostomerOutDate0 between", value1, value2, "costomeroutdate0");
            return (Criteria) this;
        }

        public Criteria andCostomeroutdate0NotBetween(Date value1, Date value2) {
            addCriterion("CostomerOutDate0 not between", value1, value2, "costomeroutdate0");
            return (Criteria) this;
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

        public Criteria andWorkeridIsNull() {
            addCriterion("WorkerID is null");
            return (Criteria) this;
        }

        public Criteria andWorkeridIsNotNull() {
            addCriterion("WorkerID is not null");
            return (Criteria) this;
        }

        public Criteria andWorkeridEqualTo(String value) {
            addCriterion("WorkerID =", value, "workerid");
            return (Criteria) this;
        }

        public Criteria andWorkeridNotEqualTo(String value) {
            addCriterion("WorkerID <>", value, "workerid");
            return (Criteria) this;
        }

        public Criteria andWorkeridGreaterThan(String value) {
            addCriterion("WorkerID >", value, "workerid");
            return (Criteria) this;
        }

        public Criteria andWorkeridGreaterThanOrEqualTo(String value) {
            addCriterion("WorkerID >=", value, "workerid");
            return (Criteria) this;
        }

        public Criteria andWorkeridLessThan(String value) {
            addCriterion("WorkerID <", value, "workerid");
            return (Criteria) this;
        }

        public Criteria andWorkeridLessThanOrEqualTo(String value) {
            addCriterion("WorkerID <=", value, "workerid");
            return (Criteria) this;
        }

        public Criteria andWorkeridLike(String value) {
            addCriterion("WorkerID like", value, "workerid");
            return (Criteria) this;
        }

        public Criteria andWorkeridNotLike(String value) {
            addCriterion("WorkerID not like", value, "workerid");
            return (Criteria) this;
        }

        public Criteria andWorkeridIn(List<String> values) {
            addCriterion("WorkerID in", values, "workerid");
            return (Criteria) this;
        }

        public Criteria andWorkeridNotIn(List<String> values) {
            addCriterion("WorkerID not in", values, "workerid");
            return (Criteria) this;
        }

        public Criteria andWorkeridBetween(String value1, String value2) {
            addCriterion("WorkerID between", value1, value2, "workerid");
            return (Criteria) this;
        }

        public Criteria andWorkeridNotBetween(String value1, String value2) {
            addCriterion("WorkerID not between", value1, value2, "workerid");
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