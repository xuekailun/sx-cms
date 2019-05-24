package com.moon.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ContentsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ContentsExample() {
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

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andKeywordIsNull() {
            addCriterion("keyword is null");
            return (Criteria) this;
        }

        public Criteria andKeywordIsNotNull() {
            addCriterion("keyword is not null");
            return (Criteria) this;
        }

        public Criteria andKeywordEqualTo(String value) {
            addCriterion("keyword =", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotEqualTo(String value) {
            addCriterion("keyword <>", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordGreaterThan(String value) {
            addCriterion("keyword >", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordGreaterThanOrEqualTo(String value) {
            addCriterion("keyword >=", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordLessThan(String value) {
            addCriterion("keyword <", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordLessThanOrEqualTo(String value) {
            addCriterion("keyword <=", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordLike(String value) {
            addCriterion("keyword like", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotLike(String value) {
            addCriterion("keyword not like", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordIn(List<String> values) {
            addCriterion("keyword in", values, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotIn(List<String> values) {
            addCriterion("keyword not in", values, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordBetween(String value1, String value2) {
            addCriterion("keyword between", value1, value2, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotBetween(String value1, String value2) {
            addCriterion("keyword not between", value1, value2, "keyword");
            return (Criteria) this;
        }

        public Criteria andSummaryIsNull() {
            addCriterion("summary is null");
            return (Criteria) this;
        }

        public Criteria andSummaryIsNotNull() {
            addCriterion("summary is not null");
            return (Criteria) this;
        }

        public Criteria andSummaryEqualTo(String value) {
            addCriterion("summary =", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotEqualTo(String value) {
            addCriterion("summary <>", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryGreaterThan(String value) {
            addCriterion("summary >", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryGreaterThanOrEqualTo(String value) {
            addCriterion("summary >=", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryLessThan(String value) {
            addCriterion("summary <", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryLessThanOrEqualTo(String value) {
            addCriterion("summary <=", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryLike(String value) {
            addCriterion("summary like", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotLike(String value) {
            addCriterion("summary not like", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryIn(List<String> values) {
            addCriterion("summary in", values, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotIn(List<String> values) {
            addCriterion("summary not in", values, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryBetween(String value1, String value2) {
            addCriterion("summary between", value1, value2, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotBetween(String value1, String value2) {
            addCriterion("summary not between", value1, value2, "summary");
            return (Criteria) this;
        }

        public Criteria andStyleIsNull() {
            addCriterion("style is null");
            return (Criteria) this;
        }

        public Criteria andStyleIsNotNull() {
            addCriterion("style is not null");
            return (Criteria) this;
        }

        public Criteria andStyleEqualTo(String value) {
            addCriterion("style =", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleNotEqualTo(String value) {
            addCriterion("style <>", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleGreaterThan(String value) {
            addCriterion("style >", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleGreaterThanOrEqualTo(String value) {
            addCriterion("style >=", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleLessThan(String value) {
            addCriterion("style <", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleLessThanOrEqualTo(String value) {
            addCriterion("style <=", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleLike(String value) {
            addCriterion("style like", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleNotLike(String value) {
            addCriterion("style not like", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleIn(List<String> values) {
            addCriterion("style in", values, "style");
            return (Criteria) this;
        }

        public Criteria andStyleNotIn(List<String> values) {
            addCriterion("style not in", values, "style");
            return (Criteria) this;
        }

        public Criteria andStyleBetween(String value1, String value2) {
            addCriterion("style between", value1, value2, "style");
            return (Criteria) this;
        }

        public Criteria andStyleNotBetween(String value1, String value2) {
            addCriterion("style not between", value1, value2, "style");
            return (Criteria) this;
        }

        public Criteria andThumbnailIsNull() {
            addCriterion("thumbnail is null");
            return (Criteria) this;
        }

        public Criteria andThumbnailIsNotNull() {
            addCriterion("thumbnail is not null");
            return (Criteria) this;
        }

        public Criteria andThumbnailEqualTo(String value) {
            addCriterion("thumbnail =", value, "thumbnail");
            return (Criteria) this;
        }

        public Criteria andThumbnailNotEqualTo(String value) {
            addCriterion("thumbnail <>", value, "thumbnail");
            return (Criteria) this;
        }

        public Criteria andThumbnailGreaterThan(String value) {
            addCriterion("thumbnail >", value, "thumbnail");
            return (Criteria) this;
        }

        public Criteria andThumbnailGreaterThanOrEqualTo(String value) {
            addCriterion("thumbnail >=", value, "thumbnail");
            return (Criteria) this;
        }

        public Criteria andThumbnailLessThan(String value) {
            addCriterion("thumbnail <", value, "thumbnail");
            return (Criteria) this;
        }

        public Criteria andThumbnailLessThanOrEqualTo(String value) {
            addCriterion("thumbnail <=", value, "thumbnail");
            return (Criteria) this;
        }

        public Criteria andThumbnailLike(String value) {
            addCriterion("thumbnail like", value, "thumbnail");
            return (Criteria) this;
        }

        public Criteria andThumbnailNotLike(String value) {
            addCriterion("thumbnail not like", value, "thumbnail");
            return (Criteria) this;
        }

        public Criteria andThumbnailIn(List<String> values) {
            addCriterion("thumbnail in", values, "thumbnail");
            return (Criteria) this;
        }

        public Criteria andThumbnailNotIn(List<String> values) {
            addCriterion("thumbnail not in", values, "thumbnail");
            return (Criteria) this;
        }

        public Criteria andThumbnailBetween(String value1, String value2) {
            addCriterion("thumbnail between", value1, value2, "thumbnail");
            return (Criteria) this;
        }

        public Criteria andThumbnailNotBetween(String value1, String value2) {
            addCriterion("thumbnail not between", value1, value2, "thumbnail");
            return (Criteria) this;
        }

        public Criteria andInsertdateIsNull() {
            addCriterion("insertdate is null");
            return (Criteria) this;
        }

        public Criteria andInsertdateIsNotNull() {
            addCriterion("insertdate is not null");
            return (Criteria) this;
        }

        public Criteria andInsertdateEqualTo(Date value) {
            addCriterion("insertdate =", value, "insertdate");
            return (Criteria) this;
        }

        public Criteria andInsertdateNotEqualTo(Date value) {
            addCriterion("insertdate <>", value, "insertdate");
            return (Criteria) this;
        }

        public Criteria andInsertdateGreaterThan(Date value) {
            addCriterion("insertdate >", value, "insertdate");
            return (Criteria) this;
        }

        public Criteria andInsertdateGreaterThanOrEqualTo(Date value) {
            addCriterion("insertdate >=", value, "insertdate");
            return (Criteria) this;
        }

        public Criteria andInsertdateLessThan(Date value) {
            addCriterion("insertdate <", value, "insertdate");
            return (Criteria) this;
        }

        public Criteria andInsertdateLessThanOrEqualTo(Date value) {
            addCriterion("insertdate <=", value, "insertdate");
            return (Criteria) this;
        }

        public Criteria andInsertdateIn(List<Date> values) {
            addCriterion("insertdate in", values, "insertdate");
            return (Criteria) this;
        }

        public Criteria andInsertdateNotIn(List<Date> values) {
            addCriterion("insertdate not in", values, "insertdate");
            return (Criteria) this;
        }

        public Criteria andInsertdateBetween(Date value1, Date value2) {
            addCriterion("insertdate between", value1, value2, "insertdate");
            return (Criteria) this;
        }

        public Criteria andInsertdateNotBetween(Date value1, Date value2) {
            addCriterion("insertdate not between", value1, value2, "insertdate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateIsNull() {
            addCriterion("updatedate is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedateIsNotNull() {
            addCriterion("updatedate is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedateEqualTo(Date value) {
            addCriterion("updatedate =", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateNotEqualTo(Date value) {
            addCriterion("updatedate <>", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateGreaterThan(Date value) {
            addCriterion("updatedate >", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("updatedate >=", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateLessThan(Date value) {
            addCriterion("updatedate <", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateLessThanOrEqualTo(Date value) {
            addCriterion("updatedate <=", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateIn(List<Date> values) {
            addCriterion("updatedate in", values, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateNotIn(List<Date> values) {
            addCriterion("updatedate not in", values, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateBetween(Date value1, Date value2) {
            addCriterion("updatedate between", value1, value2, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateNotBetween(Date value1, Date value2) {
            addCriterion("updatedate not between", value1, value2, "updatedate");
            return (Criteria) this;
        }

        public Criteria andStickIsNull() {
            addCriterion("stick is null");
            return (Criteria) this;
        }

        public Criteria andStickIsNotNull() {
            addCriterion("stick is not null");
            return (Criteria) this;
        }

        public Criteria andStickEqualTo(Integer value) {
            addCriterion("stick =", value, "stick");
            return (Criteria) this;
        }

        public Criteria andStickNotEqualTo(Integer value) {
            addCriterion("stick <>", value, "stick");
            return (Criteria) this;
        }

        public Criteria andStickGreaterThan(Integer value) {
            addCriterion("stick >", value, "stick");
            return (Criteria) this;
        }

        public Criteria andStickGreaterThanOrEqualTo(Integer value) {
            addCriterion("stick >=", value, "stick");
            return (Criteria) this;
        }

        public Criteria andStickLessThan(Integer value) {
            addCriterion("stick <", value, "stick");
            return (Criteria) this;
        }

        public Criteria andStickLessThanOrEqualTo(Integer value) {
            addCriterion("stick <=", value, "stick");
            return (Criteria) this;
        }

        public Criteria andStickIn(List<Integer> values) {
            addCriterion("stick in", values, "stick");
            return (Criteria) this;
        }

        public Criteria andStickNotIn(List<Integer> values) {
            addCriterion("stick not in", values, "stick");
            return (Criteria) this;
        }

        public Criteria andStickBetween(Integer value1, Integer value2) {
            addCriterion("stick between", value1, value2, "stick");
            return (Criteria) this;
        }

        public Criteria andStickNotBetween(Integer value1, Integer value2) {
            addCriterion("stick not between", value1, value2, "stick");
            return (Criteria) this;
        }

        public Criteria andStickdateIsNull() {
            addCriterion("stickdate is null");
            return (Criteria) this;
        }

        public Criteria andStickdateIsNotNull() {
            addCriterion("stickdate is not null");
            return (Criteria) this;
        }

        public Criteria andStickdateEqualTo(Date value) {
            addCriterion("stickdate =", value, "stickdate");
            return (Criteria) this;
        }

        public Criteria andStickdateNotEqualTo(Date value) {
            addCriterion("stickdate <>", value, "stickdate");
            return (Criteria) this;
        }

        public Criteria andStickdateGreaterThan(Date value) {
            addCriterion("stickdate >", value, "stickdate");
            return (Criteria) this;
        }

        public Criteria andStickdateGreaterThanOrEqualTo(Date value) {
            addCriterion("stickdate >=", value, "stickdate");
            return (Criteria) this;
        }

        public Criteria andStickdateLessThan(Date value) {
            addCriterion("stickdate <", value, "stickdate");
            return (Criteria) this;
        }

        public Criteria andStickdateLessThanOrEqualTo(Date value) {
            addCriterion("stickdate <=", value, "stickdate");
            return (Criteria) this;
        }

        public Criteria andStickdateIn(List<Date> values) {
            addCriterion("stickdate in", values, "stickdate");
            return (Criteria) this;
        }

        public Criteria andStickdateNotIn(List<Date> values) {
            addCriterion("stickdate not in", values, "stickdate");
            return (Criteria) this;
        }

        public Criteria andStickdateBetween(Date value1, Date value2) {
            addCriterion("stickdate between", value1, value2, "stickdate");
            return (Criteria) this;
        }

        public Criteria andStickdateNotBetween(Date value1, Date value2) {
            addCriterion("stickdate not between", value1, value2, "stickdate");
            return (Criteria) this;
        }

        public Criteria andWcidIsNull() {
            addCriterion("wcid is null");
            return (Criteria) this;
        }

        public Criteria andWcidIsNotNull() {
            addCriterion("wcid is not null");
            return (Criteria) this;
        }

        public Criteria andWcidEqualTo(Integer value) {
            addCriterion("wcid =", value, "wcid");
            return (Criteria) this;
        }

        public Criteria andWcidNotEqualTo(Integer value) {
            addCriterion("wcid <>", value, "wcid");
            return (Criteria) this;
        }

        public Criteria andWcidGreaterThan(Integer value) {
            addCriterion("wcid >", value, "wcid");
            return (Criteria) this;
        }

        public Criteria andWcidGreaterThanOrEqualTo(Integer value) {
            addCriterion("wcid >=", value, "wcid");
            return (Criteria) this;
        }

        public Criteria andWcidLessThan(Integer value) {
            addCriterion("wcid <", value, "wcid");
            return (Criteria) this;
        }

        public Criteria andWcidLessThanOrEqualTo(Integer value) {
            addCriterion("wcid <=", value, "wcid");
            return (Criteria) this;
        }

        public Criteria andWcidIn(List<Integer> values) {
            addCriterion("wcid in", values, "wcid");
            return (Criteria) this;
        }

        public Criteria andWcidNotIn(List<Integer> values) {
            addCriterion("wcid not in", values, "wcid");
            return (Criteria) this;
        }

        public Criteria andWcidBetween(Integer value1, Integer value2) {
            addCriterion("wcid between", value1, value2, "wcid");
            return (Criteria) this;
        }

        public Criteria andWcidNotBetween(Integer value1, Integer value2) {
            addCriterion("wcid not between", value1, value2, "wcid");
            return (Criteria) this;
        }

        public Criteria andIshrefIsNull() {
            addCriterion("ishref is null");
            return (Criteria) this;
        }

        public Criteria andIshrefIsNotNull() {
            addCriterion("ishref is not null");
            return (Criteria) this;
        }

        public Criteria andIshrefEqualTo(Integer value) {
            addCriterion("ishref =", value, "ishref");
            return (Criteria) this;
        }

        public Criteria andIshrefNotEqualTo(Integer value) {
            addCriterion("ishref <>", value, "ishref");
            return (Criteria) this;
        }

        public Criteria andIshrefGreaterThan(Integer value) {
            addCriterion("ishref >", value, "ishref");
            return (Criteria) this;
        }

        public Criteria andIshrefGreaterThanOrEqualTo(Integer value) {
            addCriterion("ishref >=", value, "ishref");
            return (Criteria) this;
        }

        public Criteria andIshrefLessThan(Integer value) {
            addCriterion("ishref <", value, "ishref");
            return (Criteria) this;
        }

        public Criteria andIshrefLessThanOrEqualTo(Integer value) {
            addCriterion("ishref <=", value, "ishref");
            return (Criteria) this;
        }

        public Criteria andIshrefIn(List<Integer> values) {
            addCriterion("ishref in", values, "ishref");
            return (Criteria) this;
        }

        public Criteria andIshrefNotIn(List<Integer> values) {
            addCriterion("ishref not in", values, "ishref");
            return (Criteria) this;
        }

        public Criteria andIshrefBetween(Integer value1, Integer value2) {
            addCriterion("ishref between", value1, value2, "ishref");
            return (Criteria) this;
        }

        public Criteria andIshrefNotBetween(Integer value1, Integer value2) {
            addCriterion("ishref not between", value1, value2, "ishref");
            return (Criteria) this;
        }

        public Criteria andHrefsIsNull() {
            addCriterion("hrefs is null");
            return (Criteria) this;
        }

        public Criteria andHrefsIsNotNull() {
            addCriterion("hrefs is not null");
            return (Criteria) this;
        }

        public Criteria andHrefsEqualTo(String value) {
            addCriterion("hrefs =", value, "hrefs");
            return (Criteria) this;
        }

        public Criteria andHrefsNotEqualTo(String value) {
            addCriterion("hrefs <>", value, "hrefs");
            return (Criteria) this;
        }

        public Criteria andHrefsGreaterThan(String value) {
            addCriterion("hrefs >", value, "hrefs");
            return (Criteria) this;
        }

        public Criteria andHrefsGreaterThanOrEqualTo(String value) {
            addCriterion("hrefs >=", value, "hrefs");
            return (Criteria) this;
        }

        public Criteria andHrefsLessThan(String value) {
            addCriterion("hrefs <", value, "hrefs");
            return (Criteria) this;
        }

        public Criteria andHrefsLessThanOrEqualTo(String value) {
            addCriterion("hrefs <=", value, "hrefs");
            return (Criteria) this;
        }

        public Criteria andHrefsLike(String value) {
            addCriterion("hrefs like", value, "hrefs");
            return (Criteria) this;
        }

        public Criteria andHrefsNotLike(String value) {
            addCriterion("hrefs not like", value, "hrefs");
            return (Criteria) this;
        }

        public Criteria andHrefsIn(List<String> values) {
            addCriterion("hrefs in", values, "hrefs");
            return (Criteria) this;
        }

        public Criteria andHrefsNotIn(List<String> values) {
            addCriterion("hrefs not in", values, "hrefs");
            return (Criteria) this;
        }

        public Criteria andHrefsBetween(String value1, String value2) {
            addCriterion("hrefs between", value1, value2, "hrefs");
            return (Criteria) this;
        }

        public Criteria andHrefsNotBetween(String value1, String value2) {
            addCriterion("hrefs not between", value1, value2, "hrefs");
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