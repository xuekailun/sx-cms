package com.moon.sxcms.pojo;

import java.util.ArrayList;
import java.util.List;

public class LoginUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LoginUserExample() {
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

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(Integer value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(Integer value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(Integer value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(Integer value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(Integer value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(Integer value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<Integer> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<Integer> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(Integer value1, Integer value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(Integer value1, Integer value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andUsablenessIsNull() {
            addCriterion("usableness is null");
            return (Criteria) this;
        }

        public Criteria andUsablenessIsNotNull() {
            addCriterion("usableness is not null");
            return (Criteria) this;
        }

        public Criteria andUsablenessEqualTo(Integer value) {
            addCriterion("usableness =", value, "usableness");
            return (Criteria) this;
        }

        public Criteria andUsablenessNotEqualTo(Integer value) {
            addCriterion("usableness <>", value, "usableness");
            return (Criteria) this;
        }

        public Criteria andUsablenessGreaterThan(Integer value) {
            addCriterion("usableness >", value, "usableness");
            return (Criteria) this;
        }

        public Criteria andUsablenessGreaterThanOrEqualTo(Integer value) {
            addCriterion("usableness >=", value, "usableness");
            return (Criteria) this;
        }

        public Criteria andUsablenessLessThan(Integer value) {
            addCriterion("usableness <", value, "usableness");
            return (Criteria) this;
        }

        public Criteria andUsablenessLessThanOrEqualTo(Integer value) {
            addCriterion("usableness <=", value, "usableness");
            return (Criteria) this;
        }

        public Criteria andUsablenessIn(List<Integer> values) {
            addCriterion("usableness in", values, "usableness");
            return (Criteria) this;
        }

        public Criteria andUsablenessNotIn(List<Integer> values) {
            addCriterion("usableness not in", values, "usableness");
            return (Criteria) this;
        }

        public Criteria andUsablenessBetween(Integer value1, Integer value2) {
            addCriterion("usableness between", value1, value2, "usableness");
            return (Criteria) this;
        }

        public Criteria andUsablenessNotBetween(Integer value1, Integer value2) {
            addCriterion("usableness not between", value1, value2, "usableness");
            return (Criteria) this;
        }

        public Criteria andImgsrcIsNull() {
            addCriterion("imgsrc is null");
            return (Criteria) this;
        }

        public Criteria andImgsrcIsNotNull() {
            addCriterion("imgsrc is not null");
            return (Criteria) this;
        }

        public Criteria andImgsrcEqualTo(String value) {
            addCriterion("imgsrc =", value, "imgsrc");
            return (Criteria) this;
        }

        public Criteria andImgsrcNotEqualTo(String value) {
            addCriterion("imgsrc <>", value, "imgsrc");
            return (Criteria) this;
        }

        public Criteria andImgsrcGreaterThan(String value) {
            addCriterion("imgsrc >", value, "imgsrc");
            return (Criteria) this;
        }

        public Criteria andImgsrcGreaterThanOrEqualTo(String value) {
            addCriterion("imgsrc >=", value, "imgsrc");
            return (Criteria) this;
        }

        public Criteria andImgsrcLessThan(String value) {
            addCriterion("imgsrc <", value, "imgsrc");
            return (Criteria) this;
        }

        public Criteria andImgsrcLessThanOrEqualTo(String value) {
            addCriterion("imgsrc <=", value, "imgsrc");
            return (Criteria) this;
        }

        public Criteria andImgsrcLike(String value) {
            addCriterion("imgsrc like", value, "imgsrc");
            return (Criteria) this;
        }

        public Criteria andImgsrcNotLike(String value) {
            addCriterion("imgsrc not like", value, "imgsrc");
            return (Criteria) this;
        }

        public Criteria andImgsrcIn(List<String> values) {
            addCriterion("imgsrc in", values, "imgsrc");
            return (Criteria) this;
        }

        public Criteria andImgsrcNotIn(List<String> values) {
            addCriterion("imgsrc not in", values, "imgsrc");
            return (Criteria) this;
        }

        public Criteria andImgsrcBetween(String value1, String value2) {
            addCriterion("imgsrc between", value1, value2, "imgsrc");
            return (Criteria) this;
        }

        public Criteria andImgsrcNotBetween(String value1, String value2) {
            addCriterion("imgsrc not between", value1, value2, "imgsrc");
            return (Criteria) this;
        }

        public Criteria andLoginnameIsNull() {
            addCriterion("loginname is null");
            return (Criteria) this;
        }

        public Criteria andLoginnameIsNotNull() {
            addCriterion("loginname is not null");
            return (Criteria) this;
        }

        public Criteria andLoginnameEqualTo(String value) {
            addCriterion("loginname =", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameNotEqualTo(String value) {
            addCriterion("loginname <>", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameGreaterThan(String value) {
            addCriterion("loginname >", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameGreaterThanOrEqualTo(String value) {
            addCriterion("loginname >=", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameLessThan(String value) {
            addCriterion("loginname <", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameLessThanOrEqualTo(String value) {
            addCriterion("loginname <=", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameLike(String value) {
            addCriterion("loginname like", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameNotLike(String value) {
            addCriterion("loginname not like", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameIn(List<String> values) {
            addCriterion("loginname in", values, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameNotIn(List<String> values) {
            addCriterion("loginname not in", values, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameBetween(String value1, String value2) {
            addCriterion("loginname between", value1, value2, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameNotBetween(String value1, String value2) {
            addCriterion("loginname not between", value1, value2, "loginname");
            return (Criteria) this;
        }

        public Criteria andUnlockingkeyIsNull() {
            addCriterion("unlockingkey is null");
            return (Criteria) this;
        }

        public Criteria andUnlockingkeyIsNotNull() {
            addCriterion("unlockingkey is not null");
            return (Criteria) this;
        }

        public Criteria andUnlockingkeyEqualTo(String value) {
            addCriterion("unlockingkey =", value, "unlockingkey");
            return (Criteria) this;
        }

        public Criteria andUnlockingkeyNotEqualTo(String value) {
            addCriterion("unlockingkey <>", value, "unlockingkey");
            return (Criteria) this;
        }

        public Criteria andUnlockingkeyGreaterThan(String value) {
            addCriterion("unlockingkey >", value, "unlockingkey");
            return (Criteria) this;
        }

        public Criteria andUnlockingkeyGreaterThanOrEqualTo(String value) {
            addCriterion("unlockingkey >=", value, "unlockingkey");
            return (Criteria) this;
        }

        public Criteria andUnlockingkeyLessThan(String value) {
            addCriterion("unlockingkey <", value, "unlockingkey");
            return (Criteria) this;
        }

        public Criteria andUnlockingkeyLessThanOrEqualTo(String value) {
            addCriterion("unlockingkey <=", value, "unlockingkey");
            return (Criteria) this;
        }

        public Criteria andUnlockingkeyLike(String value) {
            addCriterion("unlockingkey like", value, "unlockingkey");
            return (Criteria) this;
        }

        public Criteria andUnlockingkeyNotLike(String value) {
            addCriterion("unlockingkey not like", value, "unlockingkey");
            return (Criteria) this;
        }

        public Criteria andUnlockingkeyIn(List<String> values) {
            addCriterion("unlockingkey in", values, "unlockingkey");
            return (Criteria) this;
        }

        public Criteria andUnlockingkeyNotIn(List<String> values) {
            addCriterion("unlockingkey not in", values, "unlockingkey");
            return (Criteria) this;
        }

        public Criteria andUnlockingkeyBetween(String value1, String value2) {
            addCriterion("unlockingkey between", value1, value2, "unlockingkey");
            return (Criteria) this;
        }

        public Criteria andUnlockingkeyNotBetween(String value1, String value2) {
            addCriterion("unlockingkey not between", value1, value2, "unlockingkey");
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