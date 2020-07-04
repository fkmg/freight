package com.sxt.benas;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ContractProductCExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ContractProductCExample() {
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

        public Criteria andContractProductIdIsNull() {
            addCriterion("CONTRACT_PRODUCT_ID is null");
            return (Criteria) this;
        }

        public Criteria andContractProductIdIsNotNull() {
            addCriterion("CONTRACT_PRODUCT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andContractProductIdEqualTo(String value) {
            addCriterion("CONTRACT_PRODUCT_ID =", value, "contractProductId");
            return (Criteria) this;
        }

        public Criteria andContractProductIdNotEqualTo(String value) {
            addCriterion("CONTRACT_PRODUCT_ID <>", value, "contractProductId");
            return (Criteria) this;
        }

        public Criteria andContractProductIdGreaterThan(String value) {
            addCriterion("CONTRACT_PRODUCT_ID >", value, "contractProductId");
            return (Criteria) this;
        }

        public Criteria andContractProductIdGreaterThanOrEqualTo(String value) {
            addCriterion("CONTRACT_PRODUCT_ID >=", value, "contractProductId");
            return (Criteria) this;
        }

        public Criteria andContractProductIdLessThan(String value) {
            addCriterion("CONTRACT_PRODUCT_ID <", value, "contractProductId");
            return (Criteria) this;
        }

        public Criteria andContractProductIdLessThanOrEqualTo(String value) {
            addCriterion("CONTRACT_PRODUCT_ID <=", value, "contractProductId");
            return (Criteria) this;
        }

        public Criteria andContractProductIdLike(String value) {
            addCriterion("CONTRACT_PRODUCT_ID like", value, "contractProductId");
            return (Criteria) this;
        }

        public Criteria andContractProductIdNotLike(String value) {
            addCriterion("CONTRACT_PRODUCT_ID not like", value, "contractProductId");
            return (Criteria) this;
        }

        public Criteria andContractProductIdIn(List<String> values) {
            addCriterion("CONTRACT_PRODUCT_ID in", values, "contractProductId");
            return (Criteria) this;
        }

        public Criteria andContractProductIdNotIn(List<String> values) {
            addCriterion("CONTRACT_PRODUCT_ID not in", values, "contractProductId");
            return (Criteria) this;
        }

        public Criteria andContractProductIdBetween(String value1, String value2) {
            addCriterion("CONTRACT_PRODUCT_ID between", value1, value2, "contractProductId");
            return (Criteria) this;
        }

        public Criteria andContractProductIdNotBetween(String value1, String value2) {
            addCriterion("CONTRACT_PRODUCT_ID not between", value1, value2, "contractProductId");
            return (Criteria) this;
        }

        public Criteria andContractIdIsNull() {
            addCriterion("CONTRACT_ID is null");
            return (Criteria) this;
        }

        public Criteria andContractIdIsNotNull() {
            addCriterion("CONTRACT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andContractIdEqualTo(String value) {
            addCriterion("CONTRACT_ID =", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotEqualTo(String value) {
            addCriterion("CONTRACT_ID <>", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdGreaterThan(String value) {
            addCriterion("CONTRACT_ID >", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdGreaterThanOrEqualTo(String value) {
            addCriterion("CONTRACT_ID >=", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdLessThan(String value) {
            addCriterion("CONTRACT_ID <", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdLessThanOrEqualTo(String value) {
            addCriterion("CONTRACT_ID <=", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdLike(String value) {
            addCriterion("CONTRACT_ID like", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotLike(String value) {
            addCriterion("CONTRACT_ID not like", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdIn(List<String> values) {
            addCriterion("CONTRACT_ID in", values, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotIn(List<String> values) {
            addCriterion("CONTRACT_ID not in", values, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdBetween(String value1, String value2) {
            addCriterion("CONTRACT_ID between", value1, value2, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotBetween(String value1, String value2) {
            addCriterion("CONTRACT_ID not between", value1, value2, "contractId");
            return (Criteria) this;
        }

        public Criteria andFactoryIdIsNull() {
            addCriterion("FACTORY_ID is null");
            return (Criteria) this;
        }

        public Criteria andFactoryIdIsNotNull() {
            addCriterion("FACTORY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFactoryIdEqualTo(String value) {
            addCriterion("FACTORY_ID =", value, "factoryId");
            return (Criteria) this;
        }

        public Criteria andFactoryIdNotEqualTo(String value) {
            addCriterion("FACTORY_ID <>", value, "factoryId");
            return (Criteria) this;
        }

        public Criteria andFactoryIdGreaterThan(String value) {
            addCriterion("FACTORY_ID >", value, "factoryId");
            return (Criteria) this;
        }

        public Criteria andFactoryIdGreaterThanOrEqualTo(String value) {
            addCriterion("FACTORY_ID >=", value, "factoryId");
            return (Criteria) this;
        }

        public Criteria andFactoryIdLessThan(String value) {
            addCriterion("FACTORY_ID <", value, "factoryId");
            return (Criteria) this;
        }

        public Criteria andFactoryIdLessThanOrEqualTo(String value) {
            addCriterion("FACTORY_ID <=", value, "factoryId");
            return (Criteria) this;
        }

        public Criteria andFactoryIdLike(String value) {
            addCriterion("FACTORY_ID like", value, "factoryId");
            return (Criteria) this;
        }

        public Criteria andFactoryIdNotLike(String value) {
            addCriterion("FACTORY_ID not like", value, "factoryId");
            return (Criteria) this;
        }

        public Criteria andFactoryIdIn(List<String> values) {
            addCriterion("FACTORY_ID in", values, "factoryId");
            return (Criteria) this;
        }

        public Criteria andFactoryIdNotIn(List<String> values) {
            addCriterion("FACTORY_ID not in", values, "factoryId");
            return (Criteria) this;
        }

        public Criteria andFactoryIdBetween(String value1, String value2) {
            addCriterion("FACTORY_ID between", value1, value2, "factoryId");
            return (Criteria) this;
        }

        public Criteria andFactoryIdNotBetween(String value1, String value2) {
            addCriterion("FACTORY_ID not between", value1, value2, "factoryId");
            return (Criteria) this;
        }

        public Criteria andFactoryNameIsNull() {
            addCriterion("FACTORY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andFactoryNameIsNotNull() {
            addCriterion("FACTORY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andFactoryNameEqualTo(String value) {
            addCriterion("FACTORY_NAME =", value, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameNotEqualTo(String value) {
            addCriterion("FACTORY_NAME <>", value, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameGreaterThan(String value) {
            addCriterion("FACTORY_NAME >", value, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameGreaterThanOrEqualTo(String value) {
            addCriterion("FACTORY_NAME >=", value, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameLessThan(String value) {
            addCriterion("FACTORY_NAME <", value, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameLessThanOrEqualTo(String value) {
            addCriterion("FACTORY_NAME <=", value, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameLike(String value) {
            addCriterion("FACTORY_NAME like", value, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameNotLike(String value) {
            addCriterion("FACTORY_NAME not like", value, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameIn(List<String> values) {
            addCriterion("FACTORY_NAME in", values, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameNotIn(List<String> values) {
            addCriterion("FACTORY_NAME not in", values, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameBetween(String value1, String value2) {
            addCriterion("FACTORY_NAME between", value1, value2, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameNotBetween(String value1, String value2) {
            addCriterion("FACTORY_NAME not between", value1, value2, "factoryName");
            return (Criteria) this;
        }

        public Criteria andProductNoIsNull() {
            addCriterion("PRODUCT_NO is null");
            return (Criteria) this;
        }

        public Criteria andProductNoIsNotNull() {
            addCriterion("PRODUCT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andProductNoEqualTo(String value) {
            addCriterion("PRODUCT_NO =", value, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoNotEqualTo(String value) {
            addCriterion("PRODUCT_NO <>", value, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoGreaterThan(String value) {
            addCriterion("PRODUCT_NO >", value, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_NO >=", value, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoLessThan(String value) {
            addCriterion("PRODUCT_NO <", value, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_NO <=", value, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoLike(String value) {
            addCriterion("PRODUCT_NO like", value, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoNotLike(String value) {
            addCriterion("PRODUCT_NO not like", value, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoIn(List<String> values) {
            addCriterion("PRODUCT_NO in", values, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoNotIn(List<String> values) {
            addCriterion("PRODUCT_NO not in", values, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoBetween(String value1, String value2) {
            addCriterion("PRODUCT_NO between", value1, value2, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_NO not between", value1, value2, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductImageIsNull() {
            addCriterion("PRODUCT_IMAGE is null");
            return (Criteria) this;
        }

        public Criteria andProductImageIsNotNull() {
            addCriterion("PRODUCT_IMAGE is not null");
            return (Criteria) this;
        }

        public Criteria andProductImageEqualTo(String value) {
            addCriterion("PRODUCT_IMAGE =", value, "productImage");
            return (Criteria) this;
        }

        public Criteria andProductImageNotEqualTo(String value) {
            addCriterion("PRODUCT_IMAGE <>", value, "productImage");
            return (Criteria) this;
        }

        public Criteria andProductImageGreaterThan(String value) {
            addCriterion("PRODUCT_IMAGE >", value, "productImage");
            return (Criteria) this;
        }

        public Criteria andProductImageGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_IMAGE >=", value, "productImage");
            return (Criteria) this;
        }

        public Criteria andProductImageLessThan(String value) {
            addCriterion("PRODUCT_IMAGE <", value, "productImage");
            return (Criteria) this;
        }

        public Criteria andProductImageLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_IMAGE <=", value, "productImage");
            return (Criteria) this;
        }

        public Criteria andProductImageLike(String value) {
            addCriterion("PRODUCT_IMAGE like", value, "productImage");
            return (Criteria) this;
        }

        public Criteria andProductImageNotLike(String value) {
            addCriterion("PRODUCT_IMAGE not like", value, "productImage");
            return (Criteria) this;
        }

        public Criteria andProductImageIn(List<String> values) {
            addCriterion("PRODUCT_IMAGE in", values, "productImage");
            return (Criteria) this;
        }

        public Criteria andProductImageNotIn(List<String> values) {
            addCriterion("PRODUCT_IMAGE not in", values, "productImage");
            return (Criteria) this;
        }

        public Criteria andProductImageBetween(String value1, String value2) {
            addCriterion("PRODUCT_IMAGE between", value1, value2, "productImage");
            return (Criteria) this;
        }

        public Criteria andProductImageNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_IMAGE not between", value1, value2, "productImage");
            return (Criteria) this;
        }

        public Criteria andProductDescIsNull() {
            addCriterion("PRODUCT_DESC is null");
            return (Criteria) this;
        }

        public Criteria andProductDescIsNotNull() {
            addCriterion("PRODUCT_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andProductDescEqualTo(String value) {
            addCriterion("PRODUCT_DESC =", value, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescNotEqualTo(String value) {
            addCriterion("PRODUCT_DESC <>", value, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescGreaterThan(String value) {
            addCriterion("PRODUCT_DESC >", value, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_DESC >=", value, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescLessThan(String value) {
            addCriterion("PRODUCT_DESC <", value, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_DESC <=", value, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescLike(String value) {
            addCriterion("PRODUCT_DESC like", value, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescNotLike(String value) {
            addCriterion("PRODUCT_DESC not like", value, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescIn(List<String> values) {
            addCriterion("PRODUCT_DESC in", values, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescNotIn(List<String> values) {
            addCriterion("PRODUCT_DESC not in", values, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescBetween(String value1, String value2) {
            addCriterion("PRODUCT_DESC between", value1, value2, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_DESC not between", value1, value2, "productDesc");
            return (Criteria) this;
        }

        public Criteria andLoadingRateIsNull() {
            addCriterion("LOADING_RATE is null");
            return (Criteria) this;
        }

        public Criteria andLoadingRateIsNotNull() {
            addCriterion("LOADING_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andLoadingRateEqualTo(String value) {
            addCriterion("LOADING_RATE =", value, "loadingRate");
            return (Criteria) this;
        }

        public Criteria andLoadingRateNotEqualTo(String value) {
            addCriterion("LOADING_RATE <>", value, "loadingRate");
            return (Criteria) this;
        }

        public Criteria andLoadingRateGreaterThan(String value) {
            addCriterion("LOADING_RATE >", value, "loadingRate");
            return (Criteria) this;
        }

        public Criteria andLoadingRateGreaterThanOrEqualTo(String value) {
            addCriterion("LOADING_RATE >=", value, "loadingRate");
            return (Criteria) this;
        }

        public Criteria andLoadingRateLessThan(String value) {
            addCriterion("LOADING_RATE <", value, "loadingRate");
            return (Criteria) this;
        }

        public Criteria andLoadingRateLessThanOrEqualTo(String value) {
            addCriterion("LOADING_RATE <=", value, "loadingRate");
            return (Criteria) this;
        }

        public Criteria andLoadingRateLike(String value) {
            addCriterion("LOADING_RATE like", value, "loadingRate");
            return (Criteria) this;
        }

        public Criteria andLoadingRateNotLike(String value) {
            addCriterion("LOADING_RATE not like", value, "loadingRate");
            return (Criteria) this;
        }

        public Criteria andLoadingRateIn(List<String> values) {
            addCriterion("LOADING_RATE in", values, "loadingRate");
            return (Criteria) this;
        }

        public Criteria andLoadingRateNotIn(List<String> values) {
            addCriterion("LOADING_RATE not in", values, "loadingRate");
            return (Criteria) this;
        }

        public Criteria andLoadingRateBetween(String value1, String value2) {
            addCriterion("LOADING_RATE between", value1, value2, "loadingRate");
            return (Criteria) this;
        }

        public Criteria andLoadingRateNotBetween(String value1, String value2) {
            addCriterion("LOADING_RATE not between", value1, value2, "loadingRate");
            return (Criteria) this;
        }

        public Criteria andBoxNumIsNull() {
            addCriterion("BOX_NUM is null");
            return (Criteria) this;
        }

        public Criteria andBoxNumIsNotNull() {
            addCriterion("BOX_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andBoxNumEqualTo(Integer value) {
            addCriterion("BOX_NUM =", value, "boxNum");
            return (Criteria) this;
        }

        public Criteria andBoxNumNotEqualTo(Integer value) {
            addCriterion("BOX_NUM <>", value, "boxNum");
            return (Criteria) this;
        }

        public Criteria andBoxNumGreaterThan(Integer value) {
            addCriterion("BOX_NUM >", value, "boxNum");
            return (Criteria) this;
        }

        public Criteria andBoxNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("BOX_NUM >=", value, "boxNum");
            return (Criteria) this;
        }

        public Criteria andBoxNumLessThan(Integer value) {
            addCriterion("BOX_NUM <", value, "boxNum");
            return (Criteria) this;
        }

        public Criteria andBoxNumLessThanOrEqualTo(Integer value) {
            addCriterion("BOX_NUM <=", value, "boxNum");
            return (Criteria) this;
        }

        public Criteria andBoxNumIn(List<Integer> values) {
            addCriterion("BOX_NUM in", values, "boxNum");
            return (Criteria) this;
        }

        public Criteria andBoxNumNotIn(List<Integer> values) {
            addCriterion("BOX_NUM not in", values, "boxNum");
            return (Criteria) this;
        }

        public Criteria andBoxNumBetween(Integer value1, Integer value2) {
            addCriterion("BOX_NUM between", value1, value2, "boxNum");
            return (Criteria) this;
        }

        public Criteria andBoxNumNotBetween(Integer value1, Integer value2) {
            addCriterion("BOX_NUM not between", value1, value2, "boxNum");
            return (Criteria) this;
        }

        public Criteria andPackingUnitIsNull() {
            addCriterion("PACKING_UNIT is null");
            return (Criteria) this;
        }

        public Criteria andPackingUnitIsNotNull() {
            addCriterion("PACKING_UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andPackingUnitEqualTo(String value) {
            addCriterion("PACKING_UNIT =", value, "packingUnit");
            return (Criteria) this;
        }

        public Criteria andPackingUnitNotEqualTo(String value) {
            addCriterion("PACKING_UNIT <>", value, "packingUnit");
            return (Criteria) this;
        }

        public Criteria andPackingUnitGreaterThan(String value) {
            addCriterion("PACKING_UNIT >", value, "packingUnit");
            return (Criteria) this;
        }

        public Criteria andPackingUnitGreaterThanOrEqualTo(String value) {
            addCriterion("PACKING_UNIT >=", value, "packingUnit");
            return (Criteria) this;
        }

        public Criteria andPackingUnitLessThan(String value) {
            addCriterion("PACKING_UNIT <", value, "packingUnit");
            return (Criteria) this;
        }

        public Criteria andPackingUnitLessThanOrEqualTo(String value) {
            addCriterion("PACKING_UNIT <=", value, "packingUnit");
            return (Criteria) this;
        }

        public Criteria andPackingUnitLike(String value) {
            addCriterion("PACKING_UNIT like", value, "packingUnit");
            return (Criteria) this;
        }

        public Criteria andPackingUnitNotLike(String value) {
            addCriterion("PACKING_UNIT not like", value, "packingUnit");
            return (Criteria) this;
        }

        public Criteria andPackingUnitIn(List<String> values) {
            addCriterion("PACKING_UNIT in", values, "packingUnit");
            return (Criteria) this;
        }

        public Criteria andPackingUnitNotIn(List<String> values) {
            addCriterion("PACKING_UNIT not in", values, "packingUnit");
            return (Criteria) this;
        }

        public Criteria andPackingUnitBetween(String value1, String value2) {
            addCriterion("PACKING_UNIT between", value1, value2, "packingUnit");
            return (Criteria) this;
        }

        public Criteria andPackingUnitNotBetween(String value1, String value2) {
            addCriterion("PACKING_UNIT not between", value1, value2, "packingUnit");
            return (Criteria) this;
        }

        public Criteria andCnumberIsNull() {
            addCriterion("CNUMBER is null");
            return (Criteria) this;
        }

        public Criteria andCnumberIsNotNull() {
            addCriterion("CNUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andCnumberEqualTo(Integer value) {
            addCriterion("CNUMBER =", value, "cnumber");
            return (Criteria) this;
        }

        public Criteria andCnumberNotEqualTo(Integer value) {
            addCriterion("CNUMBER <>", value, "cnumber");
            return (Criteria) this;
        }

        public Criteria andCnumberGreaterThan(Integer value) {
            addCriterion("CNUMBER >", value, "cnumber");
            return (Criteria) this;
        }

        public Criteria andCnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("CNUMBER >=", value, "cnumber");
            return (Criteria) this;
        }

        public Criteria andCnumberLessThan(Integer value) {
            addCriterion("CNUMBER <", value, "cnumber");
            return (Criteria) this;
        }

        public Criteria andCnumberLessThanOrEqualTo(Integer value) {
            addCriterion("CNUMBER <=", value, "cnumber");
            return (Criteria) this;
        }

        public Criteria andCnumberIn(List<Integer> values) {
            addCriterion("CNUMBER in", values, "cnumber");
            return (Criteria) this;
        }

        public Criteria andCnumberNotIn(List<Integer> values) {
            addCriterion("CNUMBER not in", values, "cnumber");
            return (Criteria) this;
        }

        public Criteria andCnumberBetween(Integer value1, Integer value2) {
            addCriterion("CNUMBER between", value1, value2, "cnumber");
            return (Criteria) this;
        }

        public Criteria andCnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("CNUMBER not between", value1, value2, "cnumber");
            return (Criteria) this;
        }

        public Criteria andOutNumberIsNull() {
            addCriterion("OUT_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andOutNumberIsNotNull() {
            addCriterion("OUT_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andOutNumberEqualTo(Integer value) {
            addCriterion("OUT_NUMBER =", value, "outNumber");
            return (Criteria) this;
        }

        public Criteria andOutNumberNotEqualTo(Integer value) {
            addCriterion("OUT_NUMBER <>", value, "outNumber");
            return (Criteria) this;
        }

        public Criteria andOutNumberGreaterThan(Integer value) {
            addCriterion("OUT_NUMBER >", value, "outNumber");
            return (Criteria) this;
        }

        public Criteria andOutNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("OUT_NUMBER >=", value, "outNumber");
            return (Criteria) this;
        }

        public Criteria andOutNumberLessThan(Integer value) {
            addCriterion("OUT_NUMBER <", value, "outNumber");
            return (Criteria) this;
        }

        public Criteria andOutNumberLessThanOrEqualTo(Integer value) {
            addCriterion("OUT_NUMBER <=", value, "outNumber");
            return (Criteria) this;
        }

        public Criteria andOutNumberIn(List<Integer> values) {
            addCriterion("OUT_NUMBER in", values, "outNumber");
            return (Criteria) this;
        }

        public Criteria andOutNumberNotIn(List<Integer> values) {
            addCriterion("OUT_NUMBER not in", values, "outNumber");
            return (Criteria) this;
        }

        public Criteria andOutNumberBetween(Integer value1, Integer value2) {
            addCriterion("OUT_NUMBER between", value1, value2, "outNumber");
            return (Criteria) this;
        }

        public Criteria andOutNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("OUT_NUMBER not between", value1, value2, "outNumber");
            return (Criteria) this;
        }

        public Criteria andFinishedIsNull() {
            addCriterion("FINISHED is null");
            return (Criteria) this;
        }

        public Criteria andFinishedIsNotNull() {
            addCriterion("FINISHED is not null");
            return (Criteria) this;
        }

        public Criteria andFinishedEqualTo(Integer value) {
            addCriterion("FINISHED =", value, "finished");
            return (Criteria) this;
        }

        public Criteria andFinishedNotEqualTo(Integer value) {
            addCriterion("FINISHED <>", value, "finished");
            return (Criteria) this;
        }

        public Criteria andFinishedGreaterThan(Integer value) {
            addCriterion("FINISHED >", value, "finished");
            return (Criteria) this;
        }

        public Criteria andFinishedGreaterThanOrEqualTo(Integer value) {
            addCriterion("FINISHED >=", value, "finished");
            return (Criteria) this;
        }

        public Criteria andFinishedLessThan(Integer value) {
            addCriterion("FINISHED <", value, "finished");
            return (Criteria) this;
        }

        public Criteria andFinishedLessThanOrEqualTo(Integer value) {
            addCriterion("FINISHED <=", value, "finished");
            return (Criteria) this;
        }

        public Criteria andFinishedIn(List<Integer> values) {
            addCriterion("FINISHED in", values, "finished");
            return (Criteria) this;
        }

        public Criteria andFinishedNotIn(List<Integer> values) {
            addCriterion("FINISHED not in", values, "finished");
            return (Criteria) this;
        }

        public Criteria andFinishedBetween(Integer value1, Integer value2) {
            addCriterion("FINISHED between", value1, value2, "finished");
            return (Criteria) this;
        }

        public Criteria andFinishedNotBetween(Integer value1, Integer value2) {
            addCriterion("FINISHED not between", value1, value2, "finished");
            return (Criteria) this;
        }

        public Criteria andProductRequestIsNull() {
            addCriterion("PRODUCT_REQUEST is null");
            return (Criteria) this;
        }

        public Criteria andProductRequestIsNotNull() {
            addCriterion("PRODUCT_REQUEST is not null");
            return (Criteria) this;
        }

        public Criteria andProductRequestEqualTo(String value) {
            addCriterion("PRODUCT_REQUEST =", value, "productRequest");
            return (Criteria) this;
        }

        public Criteria andProductRequestNotEqualTo(String value) {
            addCriterion("PRODUCT_REQUEST <>", value, "productRequest");
            return (Criteria) this;
        }

        public Criteria andProductRequestGreaterThan(String value) {
            addCriterion("PRODUCT_REQUEST >", value, "productRequest");
            return (Criteria) this;
        }

        public Criteria andProductRequestGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_REQUEST >=", value, "productRequest");
            return (Criteria) this;
        }

        public Criteria andProductRequestLessThan(String value) {
            addCriterion("PRODUCT_REQUEST <", value, "productRequest");
            return (Criteria) this;
        }

        public Criteria andProductRequestLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_REQUEST <=", value, "productRequest");
            return (Criteria) this;
        }

        public Criteria andProductRequestLike(String value) {
            addCriterion("PRODUCT_REQUEST like", value, "productRequest");
            return (Criteria) this;
        }

        public Criteria andProductRequestNotLike(String value) {
            addCriterion("PRODUCT_REQUEST not like", value, "productRequest");
            return (Criteria) this;
        }

        public Criteria andProductRequestIn(List<String> values) {
            addCriterion("PRODUCT_REQUEST in", values, "productRequest");
            return (Criteria) this;
        }

        public Criteria andProductRequestNotIn(List<String> values) {
            addCriterion("PRODUCT_REQUEST not in", values, "productRequest");
            return (Criteria) this;
        }

        public Criteria andProductRequestBetween(String value1, String value2) {
            addCriterion("PRODUCT_REQUEST between", value1, value2, "productRequest");
            return (Criteria) this;
        }

        public Criteria andProductRequestNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_REQUEST not between", value1, value2, "productRequest");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("PRICE is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("PRICE =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("PRICE <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("PRICE >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PRICE >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("PRICE <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PRICE <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("PRICE in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("PRICE not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRICE between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRICE not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(BigDecimal value) {
            addCriterion("AMOUNT =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(BigDecimal value) {
            addCriterion("AMOUNT <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(BigDecimal value) {
            addCriterion("AMOUNT >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMOUNT >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(BigDecimal value) {
            addCriterion("AMOUNT <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMOUNT <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<BigDecimal> values) {
            addCriterion("AMOUNT in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<BigDecimal> values) {
            addCriterion("AMOUNT not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMOUNT between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMOUNT not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNull() {
            addCriterion("ORDER_NO is null");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNotNull() {
            addCriterion("ORDER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNoEqualTo(Integer value) {
            addCriterion("ORDER_NO =", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualTo(Integer value) {
            addCriterion("ORDER_NO <>", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThan(Integer value) {
            addCriterion("ORDER_NO >", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("ORDER_NO >=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThan(Integer value) {
            addCriterion("ORDER_NO <", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualTo(Integer value) {
            addCriterion("ORDER_NO <=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIn(List<Integer> values) {
            addCriterion("ORDER_NO in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotIn(List<Integer> values) {
            addCriterion("ORDER_NO not in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoBetween(Integer value1, Integer value2) {
            addCriterion("ORDER_NO between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotBetween(Integer value1, Integer value2) {
            addCriterion("ORDER_NO not between", value1, value2, "orderNo");
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