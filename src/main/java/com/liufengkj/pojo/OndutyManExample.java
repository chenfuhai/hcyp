package com.liufengkj.pojo;

import java.util.ArrayList;
import java.util.List;

public class OndutyManExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OndutyManExample() {
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

        public Criteria andOmIdIsNull() {
            addCriterion("OM_ID is null");
            return (Criteria) this;
        }

        public Criteria andOmIdIsNotNull() {
            addCriterion("OM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOmIdEqualTo(Integer value) {
            addCriterion("OM_ID =", value, "omId");
            return (Criteria) this;
        }

        public Criteria andOmIdNotEqualTo(Integer value) {
            addCriterion("OM_ID <>", value, "omId");
            return (Criteria) this;
        }

        public Criteria andOmIdGreaterThan(Integer value) {
            addCriterion("OM_ID >", value, "omId");
            return (Criteria) this;
        }

        public Criteria andOmIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("OM_ID >=", value, "omId");
            return (Criteria) this;
        }

        public Criteria andOmIdLessThan(Integer value) {
            addCriterion("OM_ID <", value, "omId");
            return (Criteria) this;
        }

        public Criteria andOmIdLessThanOrEqualTo(Integer value) {
            addCriterion("OM_ID <=", value, "omId");
            return (Criteria) this;
        }

        public Criteria andOmIdIn(List<Integer> values) {
            addCriterion("OM_ID in", values, "omId");
            return (Criteria) this;
        }

        public Criteria andOmIdNotIn(List<Integer> values) {
            addCriterion("OM_ID not in", values, "omId");
            return (Criteria) this;
        }

        public Criteria andOmIdBetween(Integer value1, Integer value2) {
            addCriterion("OM_ID between", value1, value2, "omId");
            return (Criteria) this;
        }

        public Criteria andOmIdNotBetween(Integer value1, Integer value2) {
            addCriterion("OM_ID not between", value1, value2, "omId");
            return (Criteria) this;
        }

        public Criteria andOmNameIsNull() {
            addCriterion("OM_Name is null");
            return (Criteria) this;
        }

        public Criteria andOmNameIsNotNull() {
            addCriterion("OM_Name is not null");
            return (Criteria) this;
        }

        public Criteria andOmNameEqualTo(String value) {
            addCriterion("OM_Name =", value, "omName");
            return (Criteria) this;
        }

        public Criteria andOmNameNotEqualTo(String value) {
            addCriterion("OM_Name <>", value, "omName");
            return (Criteria) this;
        }

        public Criteria andOmNameGreaterThan(String value) {
            addCriterion("OM_Name >", value, "omName");
            return (Criteria) this;
        }

        public Criteria andOmNameGreaterThanOrEqualTo(String value) {
            addCriterion("OM_Name >=", value, "omName");
            return (Criteria) this;
        }

        public Criteria andOmNameLessThan(String value) {
            addCriterion("OM_Name <", value, "omName");
            return (Criteria) this;
        }

        public Criteria andOmNameLessThanOrEqualTo(String value) {
            addCriterion("OM_Name <=", value, "omName");
            return (Criteria) this;
        }

        public Criteria andOmNameLike(String value) {
            addCriterion("OM_Name like", value, "omName");
            return (Criteria) this;
        }

        public Criteria andOmNameNotLike(String value) {
            addCriterion("OM_Name not like", value, "omName");
            return (Criteria) this;
        }

        public Criteria andOmNameIn(List<String> values) {
            addCriterion("OM_Name in", values, "omName");
            return (Criteria) this;
        }

        public Criteria andOmNameNotIn(List<String> values) {
            addCriterion("OM_Name not in", values, "omName");
            return (Criteria) this;
        }

        public Criteria andOmNameBetween(String value1, String value2) {
            addCriterion("OM_Name between", value1, value2, "omName");
            return (Criteria) this;
        }

        public Criteria andOmNameNotBetween(String value1, String value2) {
            addCriterion("OM_Name not between", value1, value2, "omName");
            return (Criteria) this;
        }

        public Criteria andOmMobilephoneIsNull() {
            addCriterion("OM_MobilePhone is null");
            return (Criteria) this;
        }

        public Criteria andOmMobilephoneIsNotNull() {
            addCriterion("OM_MobilePhone is not null");
            return (Criteria) this;
        }

        public Criteria andOmMobilephoneEqualTo(String value) {
            addCriterion("OM_MobilePhone =", value, "omMobilephone");
            return (Criteria) this;
        }

        public Criteria andOmMobilephoneNotEqualTo(String value) {
            addCriterion("OM_MobilePhone <>", value, "omMobilephone");
            return (Criteria) this;
        }

        public Criteria andOmMobilephoneGreaterThan(String value) {
            addCriterion("OM_MobilePhone >", value, "omMobilephone");
            return (Criteria) this;
        }

        public Criteria andOmMobilephoneGreaterThanOrEqualTo(String value) {
            addCriterion("OM_MobilePhone >=", value, "omMobilephone");
            return (Criteria) this;
        }

        public Criteria andOmMobilephoneLessThan(String value) {
            addCriterion("OM_MobilePhone <", value, "omMobilephone");
            return (Criteria) this;
        }

        public Criteria andOmMobilephoneLessThanOrEqualTo(String value) {
            addCriterion("OM_MobilePhone <=", value, "omMobilephone");
            return (Criteria) this;
        }

        public Criteria andOmMobilephoneLike(String value) {
            addCriterion("OM_MobilePhone like", value, "omMobilephone");
            return (Criteria) this;
        }

        public Criteria andOmMobilephoneNotLike(String value) {
            addCriterion("OM_MobilePhone not like", value, "omMobilephone");
            return (Criteria) this;
        }

        public Criteria andOmMobilephoneIn(List<String> values) {
            addCriterion("OM_MobilePhone in", values, "omMobilephone");
            return (Criteria) this;
        }

        public Criteria andOmMobilephoneNotIn(List<String> values) {
            addCriterion("OM_MobilePhone not in", values, "omMobilephone");
            return (Criteria) this;
        }

        public Criteria andOmMobilephoneBetween(String value1, String value2) {
            addCriterion("OM_MobilePhone between", value1, value2, "omMobilephone");
            return (Criteria) this;
        }

        public Criteria andOmMobilephoneNotBetween(String value1, String value2) {
            addCriterion("OM_MobilePhone not between", value1, value2, "omMobilephone");
            return (Criteria) this;
        }

        public Criteria andOmShortphoneIsNull() {
            addCriterion("OM_ShortPhone is null");
            return (Criteria) this;
        }

        public Criteria andOmShortphoneIsNotNull() {
            addCriterion("OM_ShortPhone is not null");
            return (Criteria) this;
        }

        public Criteria andOmShortphoneEqualTo(String value) {
            addCriterion("OM_ShortPhone =", value, "omShortphone");
            return (Criteria) this;
        }

        public Criteria andOmShortphoneNotEqualTo(String value) {
            addCriterion("OM_ShortPhone <>", value, "omShortphone");
            return (Criteria) this;
        }

        public Criteria andOmShortphoneGreaterThan(String value) {
            addCriterion("OM_ShortPhone >", value, "omShortphone");
            return (Criteria) this;
        }

        public Criteria andOmShortphoneGreaterThanOrEqualTo(String value) {
            addCriterion("OM_ShortPhone >=", value, "omShortphone");
            return (Criteria) this;
        }

        public Criteria andOmShortphoneLessThan(String value) {
            addCriterion("OM_ShortPhone <", value, "omShortphone");
            return (Criteria) this;
        }

        public Criteria andOmShortphoneLessThanOrEqualTo(String value) {
            addCriterion("OM_ShortPhone <=", value, "omShortphone");
            return (Criteria) this;
        }

        public Criteria andOmShortphoneLike(String value) {
            addCriterion("OM_ShortPhone like", value, "omShortphone");
            return (Criteria) this;
        }

        public Criteria andOmShortphoneNotLike(String value) {
            addCriterion("OM_ShortPhone not like", value, "omShortphone");
            return (Criteria) this;
        }

        public Criteria andOmShortphoneIn(List<String> values) {
            addCriterion("OM_ShortPhone in", values, "omShortphone");
            return (Criteria) this;
        }

        public Criteria andOmShortphoneNotIn(List<String> values) {
            addCriterion("OM_ShortPhone not in", values, "omShortphone");
            return (Criteria) this;
        }

        public Criteria andOmShortphoneBetween(String value1, String value2) {
            addCriterion("OM_ShortPhone between", value1, value2, "omShortphone");
            return (Criteria) this;
        }

        public Criteria andOmShortphoneNotBetween(String value1, String value2) {
            addCriterion("OM_ShortPhone not between", value1, value2, "omShortphone");
            return (Criteria) this;
        }

        public Criteria andOmUserimgIsNull() {
            addCriterion("OM_UserImg is null");
            return (Criteria) this;
        }

        public Criteria andOmUserimgIsNotNull() {
            addCriterion("OM_UserImg is not null");
            return (Criteria) this;
        }

        public Criteria andOmUserimgEqualTo(String value) {
            addCriterion("OM_UserImg =", value, "omUserimg");
            return (Criteria) this;
        }

        public Criteria andOmUserimgNotEqualTo(String value) {
            addCriterion("OM_UserImg <>", value, "omUserimg");
            return (Criteria) this;
        }

        public Criteria andOmUserimgGreaterThan(String value) {
            addCriterion("OM_UserImg >", value, "omUserimg");
            return (Criteria) this;
        }

        public Criteria andOmUserimgGreaterThanOrEqualTo(String value) {
            addCriterion("OM_UserImg >=", value, "omUserimg");
            return (Criteria) this;
        }

        public Criteria andOmUserimgLessThan(String value) {
            addCriterion("OM_UserImg <", value, "omUserimg");
            return (Criteria) this;
        }

        public Criteria andOmUserimgLessThanOrEqualTo(String value) {
            addCriterion("OM_UserImg <=", value, "omUserimg");
            return (Criteria) this;
        }

        public Criteria andOmUserimgLike(String value) {
            addCriterion("OM_UserImg like", value, "omUserimg");
            return (Criteria) this;
        }

        public Criteria andOmUserimgNotLike(String value) {
            addCriterion("OM_UserImg not like", value, "omUserimg");
            return (Criteria) this;
        }

        public Criteria andOmUserimgIn(List<String> values) {
            addCriterion("OM_UserImg in", values, "omUserimg");
            return (Criteria) this;
        }

        public Criteria andOmUserimgNotIn(List<String> values) {
            addCriterion("OM_UserImg not in", values, "omUserimg");
            return (Criteria) this;
        }

        public Criteria andOmUserimgBetween(String value1, String value2) {
            addCriterion("OM_UserImg between", value1, value2, "omUserimg");
            return (Criteria) this;
        }

        public Criteria andOmUserimgNotBetween(String value1, String value2) {
            addCriterion("OM_UserImg not between", value1, value2, "omUserimg");
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