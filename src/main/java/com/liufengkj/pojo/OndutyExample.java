package com.liufengkj.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OndutyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OndutyExample() {
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

        public Criteria andOdIdIsNull() {
            addCriterion("Od_ID is null");
            return (Criteria) this;
        }

        public Criteria andOdIdIsNotNull() {
            addCriterion("Od_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOdIdEqualTo(Integer value) {
            addCriterion("Od_ID =", value, "odId");
            return (Criteria) this;
        }

        public Criteria andOdIdNotEqualTo(Integer value) {
            addCriterion("Od_ID <>", value, "odId");
            return (Criteria) this;
        }

        public Criteria andOdIdGreaterThan(Integer value) {
            addCriterion("Od_ID >", value, "odId");
            return (Criteria) this;
        }

        public Criteria andOdIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Od_ID >=", value, "odId");
            return (Criteria) this;
        }

        public Criteria andOdIdLessThan(Integer value) {
            addCriterion("Od_ID <", value, "odId");
            return (Criteria) this;
        }

        public Criteria andOdIdLessThanOrEqualTo(Integer value) {
            addCriterion("Od_ID <=", value, "odId");
            return (Criteria) this;
        }

        public Criteria andOdIdIn(List<Integer> values) {
            addCriterion("Od_ID in", values, "odId");
            return (Criteria) this;
        }

        public Criteria andOdIdNotIn(List<Integer> values) {
            addCriterion("Od_ID not in", values, "odId");
            return (Criteria) this;
        }

        public Criteria andOdIdBetween(Integer value1, Integer value2) {
            addCriterion("Od_ID between", value1, value2, "odId");
            return (Criteria) this;
        }

        public Criteria andOdIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Od_ID not between", value1, value2, "odId");
            return (Criteria) this;
        }

        public Criteria andOdDutymanidIsNull() {
            addCriterion("Od_DutyManID is null");
            return (Criteria) this;
        }

        public Criteria andOdDutymanidIsNotNull() {
            addCriterion("Od_DutyManID is not null");
            return (Criteria) this;
        }

        public Criteria andOdDutymanidEqualTo(Integer value) {
            addCriterion("Od_DutyManID =", value, "odDutymanid");
            return (Criteria) this;
        }

        public Criteria andOdDutymanidNotEqualTo(Integer value) {
            addCriterion("Od_DutyManID <>", value, "odDutymanid");
            return (Criteria) this;
        }

        public Criteria andOdDutymanidGreaterThan(Integer value) {
            addCriterion("Od_DutyManID >", value, "odDutymanid");
            return (Criteria) this;
        }

        public Criteria andOdDutymanidGreaterThanOrEqualTo(Integer value) {
            addCriterion("Od_DutyManID >=", value, "odDutymanid");
            return (Criteria) this;
        }

        public Criteria andOdDutymanidLessThan(Integer value) {
            addCriterion("Od_DutyManID <", value, "odDutymanid");
            return (Criteria) this;
        }

        public Criteria andOdDutymanidLessThanOrEqualTo(Integer value) {
            addCriterion("Od_DutyManID <=", value, "odDutymanid");
            return (Criteria) this;
        }

        public Criteria andOdDutymanidIn(List<Integer> values) {
            addCriterion("Od_DutyManID in", values, "odDutymanid");
            return (Criteria) this;
        }

        public Criteria andOdDutymanidNotIn(List<Integer> values) {
            addCriterion("Od_DutyManID not in", values, "odDutymanid");
            return (Criteria) this;
        }

        public Criteria andOdDutymanidBetween(Integer value1, Integer value2) {
            addCriterion("Od_DutyManID between", value1, value2, "odDutymanid");
            return (Criteria) this;
        }

        public Criteria andOdDutymanidNotBetween(Integer value1, Integer value2) {
            addCriterion("Od_DutyManID not between", value1, value2, "odDutymanid");
            return (Criteria) this;
        }

        public Criteria andOdDateIsNull() {
            addCriterion("Od_Date is null");
            return (Criteria) this;
        }

        public Criteria andOdDateIsNotNull() {
            addCriterion("Od_Date is not null");
            return (Criteria) this;
        }

        public Criteria andOdDateEqualTo(Date value) {
            addCriterion("Od_Date =", value, "odDate");
            return (Criteria) this;
        }

        public Criteria andOdDateNotEqualTo(Date value) {
            addCriterion("Od_Date <>", value, "odDate");
            return (Criteria) this;
        }

        public Criteria andOdDateGreaterThan(Date value) {
            addCriterion("Od_Date >", value, "odDate");
            return (Criteria) this;
        }

        public Criteria andOdDateGreaterThanOrEqualTo(Date value) {
            addCriterion("Od_Date >=", value, "odDate");
            return (Criteria) this;
        }

        public Criteria andOdDateLessThan(Date value) {
            addCriterion("Od_Date <", value, "odDate");
            return (Criteria) this;
        }

        public Criteria andOdDateLessThanOrEqualTo(Date value) {
            addCriterion("Od_Date <=", value, "odDate");
            return (Criteria) this;
        }

        public Criteria andOdDateIn(List<Date> values) {
            addCriterion("Od_Date in", values, "odDate");
            return (Criteria) this;
        }

        public Criteria andOdDateNotIn(List<Date> values) {
            addCriterion("Od_Date not in", values, "odDate");
            return (Criteria) this;
        }

        public Criteria andOdDateBetween(Date value1, Date value2) {
            addCriterion("Od_Date between", value1, value2, "odDate");
            return (Criteria) this;
        }

        public Criteria andOdDateNotBetween(Date value1, Date value2) {
            addCriterion("Od_Date not between", value1, value2, "odDate");
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