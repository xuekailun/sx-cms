package com.moon.sxcms.pojo;

import java.util.ArrayList;
import java.util.List;

public class WeaveConstructionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WeaveConstructionExample() {
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

        public Criteria andWIdIsNull() {
            addCriterion("w_id is null");
            return (Criteria) this;
        }

        public Criteria andWIdIsNotNull() {
            addCriterion("w_id is not null");
            return (Criteria) this;
        }

        public Criteria andWIdEqualTo(Integer value) {
            addCriterion("w_id =", value, "wId");
            return (Criteria) this;
        }

        public Criteria andWIdNotEqualTo(Integer value) {
            addCriterion("w_id <>", value, "wId");
            return (Criteria) this;
        }

        public Criteria andWIdGreaterThan(Integer value) {
            addCriterion("w_id >", value, "wId");
            return (Criteria) this;
        }

        public Criteria andWIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("w_id >=", value, "wId");
            return (Criteria) this;
        }

        public Criteria andWIdLessThan(Integer value) {
            addCriterion("w_id <", value, "wId");
            return (Criteria) this;
        }

        public Criteria andWIdLessThanOrEqualTo(Integer value) {
            addCriterion("w_id <=", value, "wId");
            return (Criteria) this;
        }

        public Criteria andWIdIn(List<Integer> values) {
            addCriterion("w_id in", values, "wId");
            return (Criteria) this;
        }

        public Criteria andWIdNotIn(List<Integer> values) {
            addCriterion("w_id not in", values, "wId");
            return (Criteria) this;
        }

        public Criteria andWIdBetween(Integer value1, Integer value2) {
            addCriterion("w_id between", value1, value2, "wId");
            return (Criteria) this;
        }

        public Criteria andWIdNotBetween(Integer value1, Integer value2) {
            addCriterion("w_id not between", value1, value2, "wId");
            return (Criteria) this;
        }

        public Criteria andWNameIsNull() {
            addCriterion("w_name is null");
            return (Criteria) this;
        }

        public Criteria andWNameIsNotNull() {
            addCriterion("w_name is not null");
            return (Criteria) this;
        }

        public Criteria andWNameEqualTo(String value) {
            addCriterion("w_name =", value, "wName");
            return (Criteria) this;
        }

        public Criteria andWNameNotEqualTo(String value) {
            addCriterion("w_name <>", value, "wName");
            return (Criteria) this;
        }

        public Criteria andWNameGreaterThan(String value) {
            addCriterion("w_name >", value, "wName");
            return (Criteria) this;
        }

        public Criteria andWNameGreaterThanOrEqualTo(String value) {
            addCriterion("w_name >=", value, "wName");
            return (Criteria) this;
        }

        public Criteria andWNameLessThan(String value) {
            addCriterion("w_name <", value, "wName");
            return (Criteria) this;
        }

        public Criteria andWNameLessThanOrEqualTo(String value) {
            addCriterion("w_name <=", value, "wName");
            return (Criteria) this;
        }

        public Criteria andWNameLike(String value) {
            addCriterion("w_name like", value, "wName");
            return (Criteria) this;
        }

        public Criteria andWNameNotLike(String value) {
            addCriterion("w_name not like", value, "wName");
            return (Criteria) this;
        }

        public Criteria andWNameIn(List<String> values) {
            addCriterion("w_name in", values, "wName");
            return (Criteria) this;
        }

        public Criteria andWNameNotIn(List<String> values) {
            addCriterion("w_name not in", values, "wName");
            return (Criteria) this;
        }

        public Criteria andWNameBetween(String value1, String value2) {
            addCriterion("w_name between", value1, value2, "wName");
            return (Criteria) this;
        }

        public Criteria andWNameNotBetween(String value1, String value2) {
            addCriterion("w_name not between", value1, value2, "wName");
            return (Criteria) this;
        }

        public Criteria andWPidIsNull() {
            addCriterion("w_pid is null");
            return (Criteria) this;
        }

        public Criteria andWPidIsNotNull() {
            addCriterion("w_pid is not null");
            return (Criteria) this;
        }

        public Criteria andWPidEqualTo(Integer value) {
            addCriterion("w_pid =", value, "wPid");
            return (Criteria) this;
        }

        public Criteria andWPidNotEqualTo(Integer value) {
            addCriterion("w_pid <>", value, "wPid");
            return (Criteria) this;
        }

        public Criteria andWPidGreaterThan(Integer value) {
            addCriterion("w_pid >", value, "wPid");
            return (Criteria) this;
        }

        public Criteria andWPidGreaterThanOrEqualTo(Integer value) {
            addCriterion("w_pid >=", value, "wPid");
            return (Criteria) this;
        }

        public Criteria andWPidLessThan(Integer value) {
            addCriterion("w_pid <", value, "wPid");
            return (Criteria) this;
        }

        public Criteria andWPidLessThanOrEqualTo(Integer value) {
            addCriterion("w_pid <=", value, "wPid");
            return (Criteria) this;
        }

        public Criteria andWPidIn(List<Integer> values) {
            addCriterion("w_pid in", values, "wPid");
            return (Criteria) this;
        }

        public Criteria andWPidNotIn(List<Integer> values) {
            addCriterion("w_pid not in", values, "wPid");
            return (Criteria) this;
        }

        public Criteria andWPidBetween(Integer value1, Integer value2) {
            addCriterion("w_pid between", value1, value2, "wPid");
            return (Criteria) this;
        }

        public Criteria andWPidNotBetween(Integer value1, Integer value2) {
            addCriterion("w_pid not between", value1, value2, "wPid");
            return (Criteria) this;
        }

        public Criteria andWPathIsNull() {
            addCriterion("w_path is null");
            return (Criteria) this;
        }

        public Criteria andWPathIsNotNull() {
            addCriterion("w_path is not null");
            return (Criteria) this;
        }

        public Criteria andWPathEqualTo(String value) {
            addCriterion("w_path =", value, "wPath");
            return (Criteria) this;
        }

        public Criteria andWPathNotEqualTo(String value) {
            addCriterion("w_path <>", value, "wPath");
            return (Criteria) this;
        }

        public Criteria andWPathGreaterThan(String value) {
            addCriterion("w_path >", value, "wPath");
            return (Criteria) this;
        }

        public Criteria andWPathGreaterThanOrEqualTo(String value) {
            addCriterion("w_path >=", value, "wPath");
            return (Criteria) this;
        }

        public Criteria andWPathLessThan(String value) {
            addCriterion("w_path <", value, "wPath");
            return (Criteria) this;
        }

        public Criteria andWPathLessThanOrEqualTo(String value) {
            addCriterion("w_path <=", value, "wPath");
            return (Criteria) this;
        }

        public Criteria andWPathLike(String value) {
            addCriterion("w_path like", value, "wPath");
            return (Criteria) this;
        }

        public Criteria andWPathNotLike(String value) {
            addCriterion("w_path not like", value, "wPath");
            return (Criteria) this;
        }

        public Criteria andWPathIn(List<String> values) {
            addCriterion("w_path in", values, "wPath");
            return (Criteria) this;
        }

        public Criteria andWPathNotIn(List<String> values) {
            addCriterion("w_path not in", values, "wPath");
            return (Criteria) this;
        }

        public Criteria andWPathBetween(String value1, String value2) {
            addCriterion("w_path between", value1, value2, "wPath");
            return (Criteria) this;
        }

        public Criteria andWPathNotBetween(String value1, String value2) {
            addCriterion("w_path not between", value1, value2, "wPath");
            return (Criteria) this;
        }

        public Criteria andWOrderIsNull() {
            addCriterion("w_order is null");
            return (Criteria) this;
        }

        public Criteria andWOrderIsNotNull() {
            addCriterion("w_order is not null");
            return (Criteria) this;
        }

        public Criteria andWOrderEqualTo(Integer value) {
            addCriterion("w_order =", value, "wOrder");
            return (Criteria) this;
        }

        public Criteria andWOrderNotEqualTo(Integer value) {
            addCriterion("w_order <>", value, "wOrder");
            return (Criteria) this;
        }

        public Criteria andWOrderGreaterThan(Integer value) {
            addCriterion("w_order >", value, "wOrder");
            return (Criteria) this;
        }

        public Criteria andWOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("w_order >=", value, "wOrder");
            return (Criteria) this;
        }

        public Criteria andWOrderLessThan(Integer value) {
            addCriterion("w_order <", value, "wOrder");
            return (Criteria) this;
        }

        public Criteria andWOrderLessThanOrEqualTo(Integer value) {
            addCriterion("w_order <=", value, "wOrder");
            return (Criteria) this;
        }

        public Criteria andWOrderIn(List<Integer> values) {
            addCriterion("w_order in", values, "wOrder");
            return (Criteria) this;
        }

        public Criteria andWOrderNotIn(List<Integer> values) {
            addCriterion("w_order not in", values, "wOrder");
            return (Criteria) this;
        }

        public Criteria andWOrderBetween(Integer value1, Integer value2) {
            addCriterion("w_order between", value1, value2, "wOrder");
            return (Criteria) this;
        }

        public Criteria andWOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("w_order not between", value1, value2, "wOrder");
            return (Criteria) this;
        }

        public Criteria andWIsshowIsNull() {
            addCriterion("w_isshow is null");
            return (Criteria) this;
        }

        public Criteria andWIsshowIsNotNull() {
            addCriterion("w_isshow is not null");
            return (Criteria) this;
        }

        public Criteria andWIsshowEqualTo(Integer value) {
            addCriterion("w_isshow =", value, "wIsshow");
            return (Criteria) this;
        }

        public Criteria andWIsshowNotEqualTo(Integer value) {
            addCriterion("w_isshow <>", value, "wIsshow");
            return (Criteria) this;
        }

        public Criteria andWIsshowGreaterThan(Integer value) {
            addCriterion("w_isshow >", value, "wIsshow");
            return (Criteria) this;
        }

        public Criteria andWIsshowGreaterThanOrEqualTo(Integer value) {
            addCriterion("w_isshow >=", value, "wIsshow");
            return (Criteria) this;
        }

        public Criteria andWIsshowLessThan(Integer value) {
            addCriterion("w_isshow <", value, "wIsshow");
            return (Criteria) this;
        }

        public Criteria andWIsshowLessThanOrEqualTo(Integer value) {
            addCriterion("w_isshow <=", value, "wIsshow");
            return (Criteria) this;
        }

        public Criteria andWIsshowIn(List<Integer> values) {
            addCriterion("w_isshow in", values, "wIsshow");
            return (Criteria) this;
        }

        public Criteria andWIsshowNotIn(List<Integer> values) {
            addCriterion("w_isshow not in", values, "wIsshow");
            return (Criteria) this;
        }

        public Criteria andWIsshowBetween(Integer value1, Integer value2) {
            addCriterion("w_isshow between", value1, value2, "wIsshow");
            return (Criteria) this;
        }

        public Criteria andWIsshowNotBetween(Integer value1, Integer value2) {
            addCriterion("w_isshow not between", value1, value2, "wIsshow");
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