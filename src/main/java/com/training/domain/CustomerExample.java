package com.training.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CustomerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomerExample() {
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

        public Criteria andCustomeridIsNull() {
            addCriterion("CustomerID is null");
            return (Criteria) this;
        }

        public Criteria andCustomeridIsNotNull() {
            addCriterion("CustomerID is not null");
            return (Criteria) this;
        }

        public Criteria andCustomeridEqualTo(Integer value) {
            addCriterion("CustomerID =", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotEqualTo(Integer value) {
            addCriterion("CustomerID <>", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridGreaterThan(Integer value) {
            addCriterion("CustomerID >", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridGreaterThanOrEqualTo(Integer value) {
            addCriterion("CustomerID >=", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridLessThan(Integer value) {
            addCriterion("CustomerID <", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridLessThanOrEqualTo(Integer value) {
            addCriterion("CustomerID <=", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridIn(List<Integer> values) {
            addCriterion("CustomerID in", values, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotIn(List<Integer> values) {
            addCriterion("CustomerID not in", values, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridBetween(Integer value1, Integer value2) {
            addCriterion("CustomerID between", value1, value2, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotBetween(Integer value1, Integer value2) {
            addCriterion("CustomerID not between", value1, value2, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomernameIsNull() {
            addCriterion("CustomerName is null");
            return (Criteria) this;
        }

        public Criteria andCustomernameIsNotNull() {
            addCriterion("CustomerName is not null");
            return (Criteria) this;
        }

        public Criteria andCustomernameEqualTo(String value) {
            addCriterion("CustomerName =", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotEqualTo(String value) {
            addCriterion("CustomerName <>", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameGreaterThan(String value) {
            addCriterion("CustomerName >", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameGreaterThanOrEqualTo(String value) {
            addCriterion("CustomerName >=", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameLessThan(String value) {
            addCriterion("CustomerName <", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameLessThanOrEqualTo(String value) {
            addCriterion("CustomerName <=", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameLike(String value) {
            addCriterion("CustomerName like", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotLike(String value) {
            addCriterion("CustomerName not like", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameIn(List<String> values) {
            addCriterion("CustomerName in", values, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotIn(List<String> values) {
            addCriterion("CustomerName not in", values, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameBetween(String value1, String value2) {
            addCriterion("CustomerName between", value1, value2, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotBetween(String value1, String value2) {
            addCriterion("CustomerName not between", value1, value2, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomersexIsNull() {
            addCriterion("CustomerSex is null");
            return (Criteria) this;
        }

        public Criteria andCustomersexIsNotNull() {
            addCriterion("CustomerSex is not null");
            return (Criteria) this;
        }

        public Criteria andCustomersexEqualTo(String value) {
            addCriterion("CustomerSex =", value, "customersex");
            return (Criteria) this;
        }

        public Criteria andCustomersexNotEqualTo(String value) {
            addCriterion("CustomerSex <>", value, "customersex");
            return (Criteria) this;
        }

        public Criteria andCustomersexGreaterThan(String value) {
            addCriterion("CustomerSex >", value, "customersex");
            return (Criteria) this;
        }

        public Criteria andCustomersexGreaterThanOrEqualTo(String value) {
            addCriterion("CustomerSex >=", value, "customersex");
            return (Criteria) this;
        }

        public Criteria andCustomersexLessThan(String value) {
            addCriterion("CustomerSex <", value, "customersex");
            return (Criteria) this;
        }

        public Criteria andCustomersexLessThanOrEqualTo(String value) {
            addCriterion("CustomerSex <=", value, "customersex");
            return (Criteria) this;
        }

        public Criteria andCustomersexLike(String value) {
            addCriterion("CustomerSex like", value, "customersex");
            return (Criteria) this;
        }

        public Criteria andCustomersexNotLike(String value) {
            addCriterion("CustomerSex not like", value, "customersex");
            return (Criteria) this;
        }

        public Criteria andCustomersexIn(List<String> values) {
            addCriterion("CustomerSex in", values, "customersex");
            return (Criteria) this;
        }

        public Criteria andCustomersexNotIn(List<String> values) {
            addCriterion("CustomerSex not in", values, "customersex");
            return (Criteria) this;
        }

        public Criteria andCustomersexBetween(String value1, String value2) {
            addCriterion("CustomerSex between", value1, value2, "customersex");
            return (Criteria) this;
        }

        public Criteria andCustomersexNotBetween(String value1, String value2) {
            addCriterion("CustomerSex not between", value1, value2, "customersex");
            return (Criteria) this;
        }

        public Criteria andCustomeridnumberIsNull() {
            addCriterion("CustomerIDNumber is null");
            return (Criteria) this;
        }

        public Criteria andCustomeridnumberIsNotNull() {
            addCriterion("CustomerIDNumber is not null");
            return (Criteria) this;
        }

        public Criteria andCustomeridnumberEqualTo(String value) {
            addCriterion("CustomerIDNumber =", value, "customeridnumber");
            return (Criteria) this;
        }

        public Criteria andCustomeridnumberNotEqualTo(String value) {
            addCriterion("CustomerIDNumber <>", value, "customeridnumber");
            return (Criteria) this;
        }

        public Criteria andCustomeridnumberGreaterThan(String value) {
            addCriterion("CustomerIDNumber >", value, "customeridnumber");
            return (Criteria) this;
        }

        public Criteria andCustomeridnumberGreaterThanOrEqualTo(String value) {
            addCriterion("CustomerIDNumber >=", value, "customeridnumber");
            return (Criteria) this;
        }

        public Criteria andCustomeridnumberLessThan(String value) {
            addCriterion("CustomerIDNumber <", value, "customeridnumber");
            return (Criteria) this;
        }

        public Criteria andCustomeridnumberLessThanOrEqualTo(String value) {
            addCriterion("CustomerIDNumber <=", value, "customeridnumber");
            return (Criteria) this;
        }

        public Criteria andCustomeridnumberLike(String value) {
            addCriterion("CustomerIDNumber like", value, "customeridnumber");
            return (Criteria) this;
        }

        public Criteria andCustomeridnumberNotLike(String value) {
            addCriterion("CustomerIDNumber not like", value, "customeridnumber");
            return (Criteria) this;
        }

        public Criteria andCustomeridnumberIn(List<String> values) {
            addCriterion("CustomerIDNumber in", values, "customeridnumber");
            return (Criteria) this;
        }

        public Criteria andCustomeridnumberNotIn(List<String> values) {
            addCriterion("CustomerIDNumber not in", values, "customeridnumber");
            return (Criteria) this;
        }

        public Criteria andCustomeridnumberBetween(String value1, String value2) {
            addCriterion("CustomerIDNumber between", value1, value2, "customeridnumber");
            return (Criteria) this;
        }

        public Criteria andCustomeridnumberNotBetween(String value1, String value2) {
            addCriterion("CustomerIDNumber not between", value1, value2, "customeridnumber");
            return (Criteria) this;
        }

        public Criteria andCustomertypeIsNull() {
            addCriterion("CustomerType is null");
            return (Criteria) this;
        }

        public Criteria andCustomertypeIsNotNull() {
            addCriterion("CustomerType is not null");
            return (Criteria) this;
        }

        public Criteria andCustomertypeEqualTo(String value) {
            addCriterion("CustomerType =", value, "customertype");
            return (Criteria) this;
        }

        public Criteria andCustomertypeNotEqualTo(String value) {
            addCriterion("CustomerType <>", value, "customertype");
            return (Criteria) this;
        }

        public Criteria andCustomertypeGreaterThan(String value) {
            addCriterion("CustomerType >", value, "customertype");
            return (Criteria) this;
        }

        public Criteria andCustomertypeGreaterThanOrEqualTo(String value) {
            addCriterion("CustomerType >=", value, "customertype");
            return (Criteria) this;
        }

        public Criteria andCustomertypeLessThan(String value) {
            addCriterion("CustomerType <", value, "customertype");
            return (Criteria) this;
        }

        public Criteria andCustomertypeLessThanOrEqualTo(String value) {
            addCriterion("CustomerType <=", value, "customertype");
            return (Criteria) this;
        }

        public Criteria andCustomertypeLike(String value) {
            addCriterion("CustomerType like", value, "customertype");
            return (Criteria) this;
        }

        public Criteria andCustomertypeNotLike(String value) {
            addCriterion("CustomerType not like", value, "customertype");
            return (Criteria) this;
        }

        public Criteria andCustomertypeIn(List<String> values) {
            addCriterion("CustomerType in", values, "customertype");
            return (Criteria) this;
        }

        public Criteria andCustomertypeNotIn(List<String> values) {
            addCriterion("CustomerType not in", values, "customertype");
            return (Criteria) this;
        }

        public Criteria andCustomertypeBetween(String value1, String value2) {
            addCriterion("CustomerType between", value1, value2, "customertype");
            return (Criteria) this;
        }

        public Criteria andCustomertypeNotBetween(String value1, String value2) {
            addCriterion("CustomerType not between", value1, value2, "customertype");
            return (Criteria) this;
        }

        public Criteria andCustomerphoneIsNull() {
            addCriterion("CustomerPhone is null");
            return (Criteria) this;
        }

        public Criteria andCustomerphoneIsNotNull() {
            addCriterion("CustomerPhone is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerphoneEqualTo(String value) {
            addCriterion("CustomerPhone =", value, "customerphone");
            return (Criteria) this;
        }

        public Criteria andCustomerphoneNotEqualTo(String value) {
            addCriterion("CustomerPhone <>", value, "customerphone");
            return (Criteria) this;
        }

        public Criteria andCustomerphoneGreaterThan(String value) {
            addCriterion("CustomerPhone >", value, "customerphone");
            return (Criteria) this;
        }

        public Criteria andCustomerphoneGreaterThanOrEqualTo(String value) {
            addCriterion("CustomerPhone >=", value, "customerphone");
            return (Criteria) this;
        }

        public Criteria andCustomerphoneLessThan(String value) {
            addCriterion("CustomerPhone <", value, "customerphone");
            return (Criteria) this;
        }

        public Criteria andCustomerphoneLessThanOrEqualTo(String value) {
            addCriterion("CustomerPhone <=", value, "customerphone");
            return (Criteria) this;
        }

        public Criteria andCustomerphoneLike(String value) {
            addCriterion("CustomerPhone like", value, "customerphone");
            return (Criteria) this;
        }

        public Criteria andCustomerphoneNotLike(String value) {
            addCriterion("CustomerPhone not like", value, "customerphone");
            return (Criteria) this;
        }

        public Criteria andCustomerphoneIn(List<String> values) {
            addCriterion("CustomerPhone in", values, "customerphone");
            return (Criteria) this;
        }

        public Criteria andCustomerphoneNotIn(List<String> values) {
            addCriterion("CustomerPhone not in", values, "customerphone");
            return (Criteria) this;
        }

        public Criteria andCustomerphoneBetween(String value1, String value2) {
            addCriterion("CustomerPhone between", value1, value2, "customerphone");
            return (Criteria) this;
        }

        public Criteria andCustomerphoneNotBetween(String value1, String value2) {
            addCriterion("CustomerPhone not between", value1, value2, "customerphone");
            return (Criteria) this;
        }

        public Criteria andCustomercreatedateIsNull() {
            addCriterion("CustomerCreateDate is null");
            return (Criteria) this;
        }

        public Criteria andCustomercreatedateIsNotNull() {
            addCriterion("CustomerCreateDate is not null");
            return (Criteria) this;
        }

        public Criteria andCustomercreatedateEqualTo(Date value) {
            addCriterionForJDBCDate("CustomerCreateDate =", value, "customercreatedate");
            return (Criteria) this;
        }

        public Criteria andCustomercreatedateNotEqualTo(Date value) {
            addCriterionForJDBCDate("CustomerCreateDate <>", value, "customercreatedate");
            return (Criteria) this;
        }

        public Criteria andCustomercreatedateGreaterThan(Date value) {
            addCriterionForJDBCDate("CustomerCreateDate >", value, "customercreatedate");
            return (Criteria) this;
        }

        public Criteria andCustomercreatedateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CustomerCreateDate >=", value, "customercreatedate");
            return (Criteria) this;
        }

        public Criteria andCustomercreatedateLessThan(Date value) {
            addCriterionForJDBCDate("CustomerCreateDate <", value, "customercreatedate");
            return (Criteria) this;
        }

        public Criteria andCustomercreatedateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CustomerCreateDate <=", value, "customercreatedate");
            return (Criteria) this;
        }

        public Criteria andCustomercreatedateIn(List<Date> values) {
            addCriterionForJDBCDate("CustomerCreateDate in", values, "customercreatedate");
            return (Criteria) this;
        }

        public Criteria andCustomercreatedateNotIn(List<Date> values) {
            addCriterionForJDBCDate("CustomerCreateDate not in", values, "customercreatedate");
            return (Criteria) this;
        }

        public Criteria andCustomercreatedateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CustomerCreateDate between", value1, value2, "customercreatedate");
            return (Criteria) this;
        }

        public Criteria andCustomercreatedateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CustomerCreateDate not between", value1, value2, "customercreatedate");
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