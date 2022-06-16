package com.training.domain;

import java.util.ArrayList;
import java.util.List;

public class WorkerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WorkerExample() {
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

        public Criteria andWorkeridIsNull() {
            addCriterion("WorkerID is null");
            return (Criteria) this;
        }

        public Criteria andWorkeridIsNotNull() {
            addCriterion("WorkerID is not null");
            return (Criteria) this;
        }

        public Criteria andWorkeridEqualTo(Integer value) {
            addCriterion("WorkerID =", value, "workerid");
            return (Criteria) this;
        }

        public Criteria andWorkeridNotEqualTo(Integer value) {
            addCriterion("WorkerID <>", value, "workerid");
            return (Criteria) this;
        }

        public Criteria andWorkeridGreaterThan(Integer value) {
            addCriterion("WorkerID >", value, "workerid");
            return (Criteria) this;
        }

        public Criteria andWorkeridGreaterThanOrEqualTo(Integer value) {
            addCriterion("WorkerID >=", value, "workerid");
            return (Criteria) this;
        }

        public Criteria andWorkeridLessThan(Integer value) {
            addCriterion("WorkerID <", value, "workerid");
            return (Criteria) this;
        }

        public Criteria andWorkeridLessThanOrEqualTo(Integer value) {
            addCriterion("WorkerID <=", value, "workerid");
            return (Criteria) this;
        }

        public Criteria andWorkeridIn(List<Integer> values) {
            addCriterion("WorkerID in", values, "workerid");
            return (Criteria) this;
        }

        public Criteria andWorkeridNotIn(List<Integer> values) {
            addCriterion("WorkerID not in", values, "workerid");
            return (Criteria) this;
        }

        public Criteria andWorkeridBetween(Integer value1, Integer value2) {
            addCriterion("WorkerID between", value1, value2, "workerid");
            return (Criteria) this;
        }

        public Criteria andWorkeridNotBetween(Integer value1, Integer value2) {
            addCriterion("WorkerID not between", value1, value2, "workerid");
            return (Criteria) this;
        }

        public Criteria andWorkernameIsNull() {
            addCriterion("WorkerName is null");
            return (Criteria) this;
        }

        public Criteria andWorkernameIsNotNull() {
            addCriterion("WorkerName is not null");
            return (Criteria) this;
        }

        public Criteria andWorkernameEqualTo(String value) {
            addCriterion("WorkerName =", value, "workername");
            return (Criteria) this;
        }

        public Criteria andWorkernameNotEqualTo(String value) {
            addCriterion("WorkerName <>", value, "workername");
            return (Criteria) this;
        }

        public Criteria andWorkernameGreaterThan(String value) {
            addCriterion("WorkerName >", value, "workername");
            return (Criteria) this;
        }

        public Criteria andWorkernameGreaterThanOrEqualTo(String value) {
            addCriterion("WorkerName >=", value, "workername");
            return (Criteria) this;
        }

        public Criteria andWorkernameLessThan(String value) {
            addCriterion("WorkerName <", value, "workername");
            return (Criteria) this;
        }

        public Criteria andWorkernameLessThanOrEqualTo(String value) {
            addCriterion("WorkerName <=", value, "workername");
            return (Criteria) this;
        }

        public Criteria andWorkernameLike(String value) {
            addCriterion("WorkerName like", value, "workername");
            return (Criteria) this;
        }

        public Criteria andWorkernameNotLike(String value) {
            addCriterion("WorkerName not like", value, "workername");
            return (Criteria) this;
        }

        public Criteria andWorkernameIn(List<String> values) {
            addCriterion("WorkerName in", values, "workername");
            return (Criteria) this;
        }

        public Criteria andWorkernameNotIn(List<String> values) {
            addCriterion("WorkerName not in", values, "workername");
            return (Criteria) this;
        }

        public Criteria andWorkernameBetween(String value1, String value2) {
            addCriterion("WorkerName between", value1, value2, "workername");
            return (Criteria) this;
        }

        public Criteria andWorkernameNotBetween(String value1, String value2) {
            addCriterion("WorkerName not between", value1, value2, "workername");
            return (Criteria) this;
        }

        public Criteria andWorkersexIsNull() {
            addCriterion("WorkerSex is null");
            return (Criteria) this;
        }

        public Criteria andWorkersexIsNotNull() {
            addCriterion("WorkerSex is not null");
            return (Criteria) this;
        }

        public Criteria andWorkersexEqualTo(String value) {
            addCriterion("WorkerSex =", value, "workersex");
            return (Criteria) this;
        }

        public Criteria andWorkersexNotEqualTo(String value) {
            addCriterion("WorkerSex <>", value, "workersex");
            return (Criteria) this;
        }

        public Criteria andWorkersexGreaterThan(String value) {
            addCriterion("WorkerSex >", value, "workersex");
            return (Criteria) this;
        }

        public Criteria andWorkersexGreaterThanOrEqualTo(String value) {
            addCriterion("WorkerSex >=", value, "workersex");
            return (Criteria) this;
        }

        public Criteria andWorkersexLessThan(String value) {
            addCriterion("WorkerSex <", value, "workersex");
            return (Criteria) this;
        }

        public Criteria andWorkersexLessThanOrEqualTo(String value) {
            addCriterion("WorkerSex <=", value, "workersex");
            return (Criteria) this;
        }

        public Criteria andWorkersexLike(String value) {
            addCriterion("WorkerSex like", value, "workersex");
            return (Criteria) this;
        }

        public Criteria andWorkersexNotLike(String value) {
            addCriterion("WorkerSex not like", value, "workersex");
            return (Criteria) this;
        }

        public Criteria andWorkersexIn(List<String> values) {
            addCriterion("WorkerSex in", values, "workersex");
            return (Criteria) this;
        }

        public Criteria andWorkersexNotIn(List<String> values) {
            addCriterion("WorkerSex not in", values, "workersex");
            return (Criteria) this;
        }

        public Criteria andWorkersexBetween(String value1, String value2) {
            addCriterion("WorkerSex between", value1, value2, "workersex");
            return (Criteria) this;
        }

        public Criteria andWorkersexNotBetween(String value1, String value2) {
            addCriterion("WorkerSex not between", value1, value2, "workersex");
            return (Criteria) this;
        }

        public Criteria andWorkeridnumberIsNull() {
            addCriterion("WorkerIDNumber is null");
            return (Criteria) this;
        }

        public Criteria andWorkeridnumberIsNotNull() {
            addCriterion("WorkerIDNumber is not null");
            return (Criteria) this;
        }

        public Criteria andWorkeridnumberEqualTo(Double value) {
            addCriterion("WorkerIDNumber =", value, "workeridnumber");
            return (Criteria) this;
        }

        public Criteria andWorkeridnumberNotEqualTo(Double value) {
            addCriterion("WorkerIDNumber <>", value, "workeridnumber");
            return (Criteria) this;
        }

        public Criteria andWorkeridnumberGreaterThan(Double value) {
            addCriterion("WorkerIDNumber >", value, "workeridnumber");
            return (Criteria) this;
        }

        public Criteria andWorkeridnumberGreaterThanOrEqualTo(Double value) {
            addCriterion("WorkerIDNumber >=", value, "workeridnumber");
            return (Criteria) this;
        }

        public Criteria andWorkeridnumberLessThan(Double value) {
            addCriterion("WorkerIDNumber <", value, "workeridnumber");
            return (Criteria) this;
        }

        public Criteria andWorkeridnumberLessThanOrEqualTo(Double value) {
            addCriterion("WorkerIDNumber <=", value, "workeridnumber");
            return (Criteria) this;
        }

        public Criteria andWorkeridnumberIn(List<Double> values) {
            addCriterion("WorkerIDNumber in", values, "workeridnumber");
            return (Criteria) this;
        }

        public Criteria andWorkeridnumberNotIn(List<Double> values) {
            addCriterion("WorkerIDNumber not in", values, "workeridnumber");
            return (Criteria) this;
        }

        public Criteria andWorkeridnumberBetween(Double value1, Double value2) {
            addCriterion("WorkerIDNumber between", value1, value2, "workeridnumber");
            return (Criteria) this;
        }

        public Criteria andWorkeridnumberNotBetween(Double value1, Double value2) {
            addCriterion("WorkerIDNumber not between", value1, value2, "workeridnumber");
            return (Criteria) this;
        }

        public Criteria andWorkerpositionIsNull() {
            addCriterion("WorkerPosition is null");
            return (Criteria) this;
        }

        public Criteria andWorkerpositionIsNotNull() {
            addCriterion("WorkerPosition is not null");
            return (Criteria) this;
        }

        public Criteria andWorkerpositionEqualTo(String value) {
            addCriterion("WorkerPosition =", value, "workerposition");
            return (Criteria) this;
        }

        public Criteria andWorkerpositionNotEqualTo(String value) {
            addCriterion("WorkerPosition <>", value, "workerposition");
            return (Criteria) this;
        }

        public Criteria andWorkerpositionGreaterThan(String value) {
            addCriterion("WorkerPosition >", value, "workerposition");
            return (Criteria) this;
        }

        public Criteria andWorkerpositionGreaterThanOrEqualTo(String value) {
            addCriterion("WorkerPosition >=", value, "workerposition");
            return (Criteria) this;
        }

        public Criteria andWorkerpositionLessThan(String value) {
            addCriterion("WorkerPosition <", value, "workerposition");
            return (Criteria) this;
        }

        public Criteria andWorkerpositionLessThanOrEqualTo(String value) {
            addCriterion("WorkerPosition <=", value, "workerposition");
            return (Criteria) this;
        }

        public Criteria andWorkerpositionLike(String value) {
            addCriterion("WorkerPosition like", value, "workerposition");
            return (Criteria) this;
        }

        public Criteria andWorkerpositionNotLike(String value) {
            addCriterion("WorkerPosition not like", value, "workerposition");
            return (Criteria) this;
        }

        public Criteria andWorkerpositionIn(List<String> values) {
            addCriterion("WorkerPosition in", values, "workerposition");
            return (Criteria) this;
        }

        public Criteria andWorkerpositionNotIn(List<String> values) {
            addCriterion("WorkerPosition not in", values, "workerposition");
            return (Criteria) this;
        }

        public Criteria andWorkerpositionBetween(String value1, String value2) {
            addCriterion("WorkerPosition between", value1, value2, "workerposition");
            return (Criteria) this;
        }

        public Criteria andWorkerpositionNotBetween(String value1, String value2) {
            addCriterion("WorkerPosition not between", value1, value2, "workerposition");
            return (Criteria) this;
        }

        public Criteria andWorkerwageIsNull() {
            addCriterion("WorkerWage is null");
            return (Criteria) this;
        }

        public Criteria andWorkerwageIsNotNull() {
            addCriterion("WorkerWage is not null");
            return (Criteria) this;
        }

        public Criteria andWorkerwageEqualTo(String value) {
            addCriterion("WorkerWage =", value, "workerwage");
            return (Criteria) this;
        }

        public Criteria andWorkerwageNotEqualTo(String value) {
            addCriterion("WorkerWage <>", value, "workerwage");
            return (Criteria) this;
        }

        public Criteria andWorkerwageGreaterThan(String value) {
            addCriterion("WorkerWage >", value, "workerwage");
            return (Criteria) this;
        }

        public Criteria andWorkerwageGreaterThanOrEqualTo(String value) {
            addCriterion("WorkerWage >=", value, "workerwage");
            return (Criteria) this;
        }

        public Criteria andWorkerwageLessThan(String value) {
            addCriterion("WorkerWage <", value, "workerwage");
            return (Criteria) this;
        }

        public Criteria andWorkerwageLessThanOrEqualTo(String value) {
            addCriterion("WorkerWage <=", value, "workerwage");
            return (Criteria) this;
        }

        public Criteria andWorkerwageLike(String value) {
            addCriterion("WorkerWage like", value, "workerwage");
            return (Criteria) this;
        }

        public Criteria andWorkerwageNotLike(String value) {
            addCriterion("WorkerWage not like", value, "workerwage");
            return (Criteria) this;
        }

        public Criteria andWorkerwageIn(List<String> values) {
            addCriterion("WorkerWage in", values, "workerwage");
            return (Criteria) this;
        }

        public Criteria andWorkerwageNotIn(List<String> values) {
            addCriterion("WorkerWage not in", values, "workerwage");
            return (Criteria) this;
        }

        public Criteria andWorkerwageBetween(String value1, String value2) {
            addCriterion("WorkerWage between", value1, value2, "workerwage");
            return (Criteria) this;
        }

        public Criteria andWorkerwageNotBetween(String value1, String value2) {
            addCriterion("WorkerWage not between", value1, value2, "workerwage");
            return (Criteria) this;
        }

        public Criteria andWorkerpasswordIsNull() {
            addCriterion("WorkerPassword is null");
            return (Criteria) this;
        }

        public Criteria andWorkerpasswordIsNotNull() {
            addCriterion("WorkerPassword is not null");
            return (Criteria) this;
        }

        public Criteria andWorkerpasswordEqualTo(String value) {
            addCriterion("WorkerPassword =", value, "workerpassword");
            return (Criteria) this;
        }

        public Criteria andWorkerpasswordNotEqualTo(String value) {
            addCriterion("WorkerPassword <>", value, "workerpassword");
            return (Criteria) this;
        }

        public Criteria andWorkerpasswordGreaterThan(String value) {
            addCriterion("WorkerPassword >", value, "workerpassword");
            return (Criteria) this;
        }

        public Criteria andWorkerpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("WorkerPassword >=", value, "workerpassword");
            return (Criteria) this;
        }

        public Criteria andWorkerpasswordLessThan(String value) {
            addCriterion("WorkerPassword <", value, "workerpassword");
            return (Criteria) this;
        }

        public Criteria andWorkerpasswordLessThanOrEqualTo(String value) {
            addCriterion("WorkerPassword <=", value, "workerpassword");
            return (Criteria) this;
        }

        public Criteria andWorkerpasswordLike(String value) {
            addCriterion("WorkerPassword like", value, "workerpassword");
            return (Criteria) this;
        }

        public Criteria andWorkerpasswordNotLike(String value) {
            addCriterion("WorkerPassword not like", value, "workerpassword");
            return (Criteria) this;
        }

        public Criteria andWorkerpasswordIn(List<String> values) {
            addCriterion("WorkerPassword in", values, "workerpassword");
            return (Criteria) this;
        }

        public Criteria andWorkerpasswordNotIn(List<String> values) {
            addCriterion("WorkerPassword not in", values, "workerpassword");
            return (Criteria) this;
        }

        public Criteria andWorkerpasswordBetween(String value1, String value2) {
            addCriterion("WorkerPassword between", value1, value2, "workerpassword");
            return (Criteria) this;
        }

        public Criteria andWorkerpasswordNotBetween(String value1, String value2) {
            addCriterion("WorkerPassword not between", value1, value2, "workerpassword");
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