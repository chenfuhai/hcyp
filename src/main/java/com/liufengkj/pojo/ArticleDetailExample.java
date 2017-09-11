package com.liufengkj.pojo;

import java.util.ArrayList;
import java.util.List;

public class ArticleDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ArticleDetailExample() {
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

        public Criteria andAdIdIsNull() {
            addCriterion("AD_ID is null");
            return (Criteria) this;
        }

        public Criteria andAdIdIsNotNull() {
            addCriterion("AD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAdIdEqualTo(Integer value) {
            addCriterion("AD_ID =", value, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdNotEqualTo(Integer value) {
            addCriterion("AD_ID <>", value, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdGreaterThan(Integer value) {
            addCriterion("AD_ID >", value, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("AD_ID >=", value, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdLessThan(Integer value) {
            addCriterion("AD_ID <", value, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdLessThanOrEqualTo(Integer value) {
            addCriterion("AD_ID <=", value, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdIn(List<Integer> values) {
            addCriterion("AD_ID in", values, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdNotIn(List<Integer> values) {
            addCriterion("AD_ID not in", values, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdBetween(Integer value1, Integer value2) {
            addCriterion("AD_ID between", value1, value2, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdNotBetween(Integer value1, Integer value2) {
            addCriterion("AD_ID not between", value1, value2, "adId");
            return (Criteria) this;
        }

        public Criteria andAdArticleidIsNull() {
            addCriterion("AD_ArticleID is null");
            return (Criteria) this;
        }

        public Criteria andAdArticleidIsNotNull() {
            addCriterion("AD_ArticleID is not null");
            return (Criteria) this;
        }

        public Criteria andAdArticleidEqualTo(Integer value) {
            addCriterion("AD_ArticleID =", value, "adArticleid");
            return (Criteria) this;
        }

        public Criteria andAdArticleidNotEqualTo(Integer value) {
            addCriterion("AD_ArticleID <>", value, "adArticleid");
            return (Criteria) this;
        }

        public Criteria andAdArticleidGreaterThan(Integer value) {
            addCriterion("AD_ArticleID >", value, "adArticleid");
            return (Criteria) this;
        }

        public Criteria andAdArticleidGreaterThanOrEqualTo(Integer value) {
            addCriterion("AD_ArticleID >=", value, "adArticleid");
            return (Criteria) this;
        }

        public Criteria andAdArticleidLessThan(Integer value) {
            addCriterion("AD_ArticleID <", value, "adArticleid");
            return (Criteria) this;
        }

        public Criteria andAdArticleidLessThanOrEqualTo(Integer value) {
            addCriterion("AD_ArticleID <=", value, "adArticleid");
            return (Criteria) this;
        }

        public Criteria andAdArticleidIn(List<Integer> values) {
            addCriterion("AD_ArticleID in", values, "adArticleid");
            return (Criteria) this;
        }

        public Criteria andAdArticleidNotIn(List<Integer> values) {
            addCriterion("AD_ArticleID not in", values, "adArticleid");
            return (Criteria) this;
        }

        public Criteria andAdArticleidBetween(Integer value1, Integer value2) {
            addCriterion("AD_ArticleID between", value1, value2, "adArticleid");
            return (Criteria) this;
        }

        public Criteria andAdArticleidNotBetween(Integer value1, Integer value2) {
            addCriterion("AD_ArticleID not between", value1, value2, "adArticleid");
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