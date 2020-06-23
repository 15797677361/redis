package com.cn.redis.po;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class UserExample implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNull() {
            addCriterion("user_phone is null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNotNull() {
            addCriterion("user_phone is not null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneEqualTo(String value) {
            addCriterion("user_phone =", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotEqualTo(String value) {
            addCriterion("user_phone <>", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThan(String value) {
            addCriterion("user_phone >", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("user_phone >=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThan(String value) {
            addCriterion("user_phone <", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThanOrEqualTo(String value) {
            addCriterion("user_phone <=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLike(String value) {
            addCriterion("user_phone like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotLike(String value) {
            addCriterion("user_phone not like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIn(List<String> values) {
            addCriterion("user_phone in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotIn(List<String> values) {
            addCriterion("user_phone not in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneBetween(String value1, String value2) {
            addCriterion("user_phone between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotBetween(String value1, String value2) {
            addCriterion("user_phone not between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andWechatPhoneIsNull() {
            addCriterion("wechat_phone is null");
            return (Criteria) this;
        }

        public Criteria andWechatPhoneIsNotNull() {
            addCriterion("wechat_phone is not null");
            return (Criteria) this;
        }

        public Criteria andWechatPhoneEqualTo(String value) {
            addCriterion("wechat_phone =", value, "wechatPhone");
            return (Criteria) this;
        }

        public Criteria andWechatPhoneNotEqualTo(String value) {
            addCriterion("wechat_phone <>", value, "wechatPhone");
            return (Criteria) this;
        }

        public Criteria andWechatPhoneGreaterThan(String value) {
            addCriterion("wechat_phone >", value, "wechatPhone");
            return (Criteria) this;
        }

        public Criteria andWechatPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("wechat_phone >=", value, "wechatPhone");
            return (Criteria) this;
        }

        public Criteria andWechatPhoneLessThan(String value) {
            addCriterion("wechat_phone <", value, "wechatPhone");
            return (Criteria) this;
        }

        public Criteria andWechatPhoneLessThanOrEqualTo(String value) {
            addCriterion("wechat_phone <=", value, "wechatPhone");
            return (Criteria) this;
        }

        public Criteria andWechatPhoneLike(String value) {
            addCriterion("wechat_phone like", value, "wechatPhone");
            return (Criteria) this;
        }

        public Criteria andWechatPhoneNotLike(String value) {
            addCriterion("wechat_phone not like", value, "wechatPhone");
            return (Criteria) this;
        }

        public Criteria andWechatPhoneIn(List<String> values) {
            addCriterion("wechat_phone in", values, "wechatPhone");
            return (Criteria) this;
        }

        public Criteria andWechatPhoneNotIn(List<String> values) {
            addCriterion("wechat_phone not in", values, "wechatPhone");
            return (Criteria) this;
        }

        public Criteria andWechatPhoneBetween(String value1, String value2) {
            addCriterion("wechat_phone between", value1, value2, "wechatPhone");
            return (Criteria) this;
        }

        public Criteria andWechatPhoneNotBetween(String value1, String value2) {
            addCriterion("wechat_phone not between", value1, value2, "wechatPhone");
            return (Criteria) this;
        }

        public Criteria andUserWechatIsNull() {
            addCriterion("user_wechat is null");
            return (Criteria) this;
        }

        public Criteria andUserWechatIsNotNull() {
            addCriterion("user_wechat is not null");
            return (Criteria) this;
        }

        public Criteria andUserWechatEqualTo(String value) {
            addCriterion("user_wechat =", value, "userWechat");
            return (Criteria) this;
        }

        public Criteria andUserWechatNotEqualTo(String value) {
            addCriterion("user_wechat <>", value, "userWechat");
            return (Criteria) this;
        }

        public Criteria andUserWechatGreaterThan(String value) {
            addCriterion("user_wechat >", value, "userWechat");
            return (Criteria) this;
        }

        public Criteria andUserWechatGreaterThanOrEqualTo(String value) {
            addCriterion("user_wechat >=", value, "userWechat");
            return (Criteria) this;
        }

        public Criteria andUserWechatLessThan(String value) {
            addCriterion("user_wechat <", value, "userWechat");
            return (Criteria) this;
        }

        public Criteria andUserWechatLessThanOrEqualTo(String value) {
            addCriterion("user_wechat <=", value, "userWechat");
            return (Criteria) this;
        }

        public Criteria andUserWechatLike(String value) {
            addCriterion("user_wechat like", value, "userWechat");
            return (Criteria) this;
        }

        public Criteria andUserWechatNotLike(String value) {
            addCriterion("user_wechat not like", value, "userWechat");
            return (Criteria) this;
        }

        public Criteria andUserWechatIn(List<String> values) {
            addCriterion("user_wechat in", values, "userWechat");
            return (Criteria) this;
        }

        public Criteria andUserWechatNotIn(List<String> values) {
            addCriterion("user_wechat not in", values, "userWechat");
            return (Criteria) this;
        }

        public Criteria andUserWechatBetween(String value1, String value2) {
            addCriterion("user_wechat between", value1, value2, "userWechat");
            return (Criteria) this;
        }

        public Criteria andUserWechatNotBetween(String value1, String value2) {
            addCriterion("user_wechat not between", value1, value2, "userWechat");
            return (Criteria) this;
        }

        public Criteria andIdCardIsNull() {
            addCriterion("id_card is null");
            return (Criteria) this;
        }

        public Criteria andIdCardIsNotNull() {
            addCriterion("id_card is not null");
            return (Criteria) this;
        }

        public Criteria andIdCardEqualTo(String value) {
            addCriterion("id_card =", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotEqualTo(String value) {
            addCriterion("id_card <>", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardGreaterThan(String value) {
            addCriterion("id_card >", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardGreaterThanOrEqualTo(String value) {
            addCriterion("id_card >=", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLessThan(String value) {
            addCriterion("id_card <", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLessThanOrEqualTo(String value) {
            addCriterion("id_card <=", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLike(String value) {
            addCriterion("id_card like", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotLike(String value) {
            addCriterion("id_card not like", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardIn(List<String> values) {
            addCriterion("id_card in", values, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotIn(List<String> values) {
            addCriterion("id_card not in", values, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardBetween(String value1, String value2) {
            addCriterion("id_card between", value1, value2, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotBetween(String value1, String value2) {
            addCriterion("id_card not between", value1, value2, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardImgzIsNull() {
            addCriterion("id_card_imgz is null");
            return (Criteria) this;
        }

        public Criteria andIdCardImgzIsNotNull() {
            addCriterion("id_card_imgz is not null");
            return (Criteria) this;
        }

        public Criteria andIdCardImgzEqualTo(String value) {
            addCriterion("id_card_imgz =", value, "idCardImgz");
            return (Criteria) this;
        }

        public Criteria andIdCardImgzNotEqualTo(String value) {
            addCriterion("id_card_imgz <>", value, "idCardImgz");
            return (Criteria) this;
        }

        public Criteria andIdCardImgzGreaterThan(String value) {
            addCriterion("id_card_imgz >", value, "idCardImgz");
            return (Criteria) this;
        }

        public Criteria andIdCardImgzGreaterThanOrEqualTo(String value) {
            addCriterion("id_card_imgz >=", value, "idCardImgz");
            return (Criteria) this;
        }

        public Criteria andIdCardImgzLessThan(String value) {
            addCriterion("id_card_imgz <", value, "idCardImgz");
            return (Criteria) this;
        }

        public Criteria andIdCardImgzLessThanOrEqualTo(String value) {
            addCriterion("id_card_imgz <=", value, "idCardImgz");
            return (Criteria) this;
        }

        public Criteria andIdCardImgzLike(String value) {
            addCriterion("id_card_imgz like", value, "idCardImgz");
            return (Criteria) this;
        }

        public Criteria andIdCardImgzNotLike(String value) {
            addCriterion("id_card_imgz not like", value, "idCardImgz");
            return (Criteria) this;
        }

        public Criteria andIdCardImgzIn(List<String> values) {
            addCriterion("id_card_imgz in", values, "idCardImgz");
            return (Criteria) this;
        }

        public Criteria andIdCardImgzNotIn(List<String> values) {
            addCriterion("id_card_imgz not in", values, "idCardImgz");
            return (Criteria) this;
        }

        public Criteria andIdCardImgzBetween(String value1, String value2) {
            addCriterion("id_card_imgz between", value1, value2, "idCardImgz");
            return (Criteria) this;
        }

        public Criteria andIdCardImgzNotBetween(String value1, String value2) {
            addCriterion("id_card_imgz not between", value1, value2, "idCardImgz");
            return (Criteria) this;
        }

        public Criteria andUserLicenseIsNull() {
            addCriterion("user_license is null");
            return (Criteria) this;
        }

        public Criteria andUserLicenseIsNotNull() {
            addCriterion("user_license is not null");
            return (Criteria) this;
        }

        public Criteria andUserLicenseEqualTo(String value) {
            addCriterion("user_license =", value, "userLicense");
            return (Criteria) this;
        }

        public Criteria andUserLicenseNotEqualTo(String value) {
            addCriterion("user_license <>", value, "userLicense");
            return (Criteria) this;
        }

        public Criteria andUserLicenseGreaterThan(String value) {
            addCriterion("user_license >", value, "userLicense");
            return (Criteria) this;
        }

        public Criteria andUserLicenseGreaterThanOrEqualTo(String value) {
            addCriterion("user_license >=", value, "userLicense");
            return (Criteria) this;
        }

        public Criteria andUserLicenseLessThan(String value) {
            addCriterion("user_license <", value, "userLicense");
            return (Criteria) this;
        }

        public Criteria andUserLicenseLessThanOrEqualTo(String value) {
            addCriterion("user_license <=", value, "userLicense");
            return (Criteria) this;
        }

        public Criteria andUserLicenseLike(String value) {
            addCriterion("user_license like", value, "userLicense");
            return (Criteria) this;
        }

        public Criteria andUserLicenseNotLike(String value) {
            addCriterion("user_license not like", value, "userLicense");
            return (Criteria) this;
        }

        public Criteria andUserLicenseIn(List<String> values) {
            addCriterion("user_license in", values, "userLicense");
            return (Criteria) this;
        }

        public Criteria andUserLicenseNotIn(List<String> values) {
            addCriterion("user_license not in", values, "userLicense");
            return (Criteria) this;
        }

        public Criteria andUserLicenseBetween(String value1, String value2) {
            addCriterion("user_license between", value1, value2, "userLicense");
            return (Criteria) this;
        }

        public Criteria andUserLicenseNotBetween(String value1, String value2) {
            addCriterion("user_license not between", value1, value2, "userLicense");
            return (Criteria) this;
        }

        public Criteria andLicenseImgzmIsNull() {
            addCriterion("license_imgzm is null");
            return (Criteria) this;
        }

        public Criteria andLicenseImgzmIsNotNull() {
            addCriterion("license_imgzm is not null");
            return (Criteria) this;
        }

        public Criteria andLicenseImgzmEqualTo(String value) {
            addCriterion("license_imgzm =", value, "licenseImgzm");
            return (Criteria) this;
        }

        public Criteria andLicenseImgzmNotEqualTo(String value) {
            addCriterion("license_imgzm <>", value, "licenseImgzm");
            return (Criteria) this;
        }

        public Criteria andLicenseImgzmGreaterThan(String value) {
            addCriterion("license_imgzm >", value, "licenseImgzm");
            return (Criteria) this;
        }

        public Criteria andLicenseImgzmGreaterThanOrEqualTo(String value) {
            addCriterion("license_imgzm >=", value, "licenseImgzm");
            return (Criteria) this;
        }

        public Criteria andLicenseImgzmLessThan(String value) {
            addCriterion("license_imgzm <", value, "licenseImgzm");
            return (Criteria) this;
        }

        public Criteria andLicenseImgzmLessThanOrEqualTo(String value) {
            addCriterion("license_imgzm <=", value, "licenseImgzm");
            return (Criteria) this;
        }

        public Criteria andLicenseImgzmLike(String value) {
            addCriterion("license_imgzm like", value, "licenseImgzm");
            return (Criteria) this;
        }

        public Criteria andLicenseImgzmNotLike(String value) {
            addCriterion("license_imgzm not like", value, "licenseImgzm");
            return (Criteria) this;
        }

        public Criteria andLicenseImgzmIn(List<String> values) {
            addCriterion("license_imgzm in", values, "licenseImgzm");
            return (Criteria) this;
        }

        public Criteria andLicenseImgzmNotIn(List<String> values) {
            addCriterion("license_imgzm not in", values, "licenseImgzm");
            return (Criteria) this;
        }

        public Criteria andLicenseImgzmBetween(String value1, String value2) {
            addCriterion("license_imgzm between", value1, value2, "licenseImgzm");
            return (Criteria) this;
        }

        public Criteria andLicenseImgzmNotBetween(String value1, String value2) {
            addCriterion("license_imgzm not between", value1, value2, "licenseImgzm");
            return (Criteria) this;
        }

        public Criteria andLicenseImgfmIsNull() {
            addCriterion("license_imgfm is null");
            return (Criteria) this;
        }

        public Criteria andLicenseImgfmIsNotNull() {
            addCriterion("license_imgfm is not null");
            return (Criteria) this;
        }

        public Criteria andLicenseImgfmEqualTo(String value) {
            addCriterion("license_imgfm =", value, "licenseImgfm");
            return (Criteria) this;
        }

        public Criteria andLicenseImgfmNotEqualTo(String value) {
            addCriterion("license_imgfm <>", value, "licenseImgfm");
            return (Criteria) this;
        }

        public Criteria andLicenseImgfmGreaterThan(String value) {
            addCriterion("license_imgfm >", value, "licenseImgfm");
            return (Criteria) this;
        }

        public Criteria andLicenseImgfmGreaterThanOrEqualTo(String value) {
            addCriterion("license_imgfm >=", value, "licenseImgfm");
            return (Criteria) this;
        }

        public Criteria andLicenseImgfmLessThan(String value) {
            addCriterion("license_imgfm <", value, "licenseImgfm");
            return (Criteria) this;
        }

        public Criteria andLicenseImgfmLessThanOrEqualTo(String value) {
            addCriterion("license_imgfm <=", value, "licenseImgfm");
            return (Criteria) this;
        }

        public Criteria andLicenseImgfmLike(String value) {
            addCriterion("license_imgfm like", value, "licenseImgfm");
            return (Criteria) this;
        }

        public Criteria andLicenseImgfmNotLike(String value) {
            addCriterion("license_imgfm not like", value, "licenseImgfm");
            return (Criteria) this;
        }

        public Criteria andLicenseImgfmIn(List<String> values) {
            addCriterion("license_imgfm in", values, "licenseImgfm");
            return (Criteria) this;
        }

        public Criteria andLicenseImgfmNotIn(List<String> values) {
            addCriterion("license_imgfm not in", values, "licenseImgfm");
            return (Criteria) this;
        }

        public Criteria andLicenseImgfmBetween(String value1, String value2) {
            addCriterion("license_imgfm between", value1, value2, "licenseImgfm");
            return (Criteria) this;
        }

        public Criteria andLicenseImgfmNotBetween(String value1, String value2) {
            addCriterion("license_imgfm not between", value1, value2, "licenseImgfm");
            return (Criteria) this;
        }

        public Criteria andUserCreditIsNull() {
            addCriterion("user_credit is null");
            return (Criteria) this;
        }

        public Criteria andUserCreditIsNotNull() {
            addCriterion("user_credit is not null");
            return (Criteria) this;
        }

        public Criteria andUserCreditEqualTo(String value) {
            addCriterion("user_credit =", value, "userCredit");
            return (Criteria) this;
        }

        public Criteria andUserCreditNotEqualTo(String value) {
            addCriterion("user_credit <>", value, "userCredit");
            return (Criteria) this;
        }

        public Criteria andUserCreditGreaterThan(String value) {
            addCriterion("user_credit >", value, "userCredit");
            return (Criteria) this;
        }

        public Criteria andUserCreditGreaterThanOrEqualTo(String value) {
            addCriterion("user_credit >=", value, "userCredit");
            return (Criteria) this;
        }

        public Criteria andUserCreditLessThan(String value) {
            addCriterion("user_credit <", value, "userCredit");
            return (Criteria) this;
        }

        public Criteria andUserCreditLessThanOrEqualTo(String value) {
            addCriterion("user_credit <=", value, "userCredit");
            return (Criteria) this;
        }

        public Criteria andUserCreditLike(String value) {
            addCriterion("user_credit like", value, "userCredit");
            return (Criteria) this;
        }

        public Criteria andUserCreditNotLike(String value) {
            addCriterion("user_credit not like", value, "userCredit");
            return (Criteria) this;
        }

        public Criteria andUserCreditIn(List<String> values) {
            addCriterion("user_credit in", values, "userCredit");
            return (Criteria) this;
        }

        public Criteria andUserCreditNotIn(List<String> values) {
            addCriterion("user_credit not in", values, "userCredit");
            return (Criteria) this;
        }

        public Criteria andUserCreditBetween(String value1, String value2) {
            addCriterion("user_credit between", value1, value2, "userCredit");
            return (Criteria) this;
        }

        public Criteria andUserCreditNotBetween(String value1, String value2) {
            addCriterion("user_credit not between", value1, value2, "userCredit");
            return (Criteria) this;
        }

        public Criteria andIsCardIsNull() {
            addCriterion("is_card is null");
            return (Criteria) this;
        }

        public Criteria andIsCardIsNotNull() {
            addCriterion("is_card is not null");
            return (Criteria) this;
        }

        public Criteria andIsCardEqualTo(String value) {
            addCriterion("is_card =", value, "isCard");
            return (Criteria) this;
        }

        public Criteria andIsCardNotEqualTo(String value) {
            addCriterion("is_card <>", value, "isCard");
            return (Criteria) this;
        }

        public Criteria andIsCardGreaterThan(String value) {
            addCriterion("is_card >", value, "isCard");
            return (Criteria) this;
        }

        public Criteria andIsCardGreaterThanOrEqualTo(String value) {
            addCriterion("is_card >=", value, "isCard");
            return (Criteria) this;
        }

        public Criteria andIsCardLessThan(String value) {
            addCriterion("is_card <", value, "isCard");
            return (Criteria) this;
        }

        public Criteria andIsCardLessThanOrEqualTo(String value) {
            addCriterion("is_card <=", value, "isCard");
            return (Criteria) this;
        }

        public Criteria andIsCardLike(String value) {
            addCriterion("is_card like", value, "isCard");
            return (Criteria) this;
        }

        public Criteria andIsCardNotLike(String value) {
            addCriterion("is_card not like", value, "isCard");
            return (Criteria) this;
        }

        public Criteria andIsCardIn(List<String> values) {
            addCriterion("is_card in", values, "isCard");
            return (Criteria) this;
        }

        public Criteria andIsCardNotIn(List<String> values) {
            addCriterion("is_card not in", values, "isCard");
            return (Criteria) this;
        }

        public Criteria andIsCardBetween(String value1, String value2) {
            addCriterion("is_card between", value1, value2, "isCard");
            return (Criteria) this;
        }

        public Criteria andIsCardNotBetween(String value1, String value2) {
            addCriterion("is_card not between", value1, value2, "isCard");
            return (Criteria) this;
        }

        public Criteria andIsLicenseIsNull() {
            addCriterion("is_license is null");
            return (Criteria) this;
        }

        public Criteria andIsLicenseIsNotNull() {
            addCriterion("is_license is not null");
            return (Criteria) this;
        }

        public Criteria andIsLicenseEqualTo(String value) {
            addCriterion("is_license =", value, "isLicense");
            return (Criteria) this;
        }

        public Criteria andIsLicenseNotEqualTo(String value) {
            addCriterion("is_license <>", value, "isLicense");
            return (Criteria) this;
        }

        public Criteria andIsLicenseGreaterThan(String value) {
            addCriterion("is_license >", value, "isLicense");
            return (Criteria) this;
        }

        public Criteria andIsLicenseGreaterThanOrEqualTo(String value) {
            addCriterion("is_license >=", value, "isLicense");
            return (Criteria) this;
        }

        public Criteria andIsLicenseLessThan(String value) {
            addCriterion("is_license <", value, "isLicense");
            return (Criteria) this;
        }

        public Criteria andIsLicenseLessThanOrEqualTo(String value) {
            addCriterion("is_license <=", value, "isLicense");
            return (Criteria) this;
        }

        public Criteria andIsLicenseLike(String value) {
            addCriterion("is_license like", value, "isLicense");
            return (Criteria) this;
        }

        public Criteria andIsLicenseNotLike(String value) {
            addCriterion("is_license not like", value, "isLicense");
            return (Criteria) this;
        }

        public Criteria andIsLicenseIn(List<String> values) {
            addCriterion("is_license in", values, "isLicense");
            return (Criteria) this;
        }

        public Criteria andIsLicenseNotIn(List<String> values) {
            addCriterion("is_license not in", values, "isLicense");
            return (Criteria) this;
        }

        public Criteria andIsLicenseBetween(String value1, String value2) {
            addCriterion("is_license between", value1, value2, "isLicense");
            return (Criteria) this;
        }

        public Criteria andIsLicenseNotBetween(String value1, String value2) {
            addCriterion("is_license not between", value1, value2, "isLicense");
            return (Criteria) this;
        }

        public Criteria andIsNewIsNull() {
            addCriterion("is_new is null");
            return (Criteria) this;
        }

        public Criteria andIsNewIsNotNull() {
            addCriterion("is_new is not null");
            return (Criteria) this;
        }

        public Criteria andIsNewEqualTo(String value) {
            addCriterion("is_new =", value, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewNotEqualTo(String value) {
            addCriterion("is_new <>", value, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewGreaterThan(String value) {
            addCriterion("is_new >", value, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewGreaterThanOrEqualTo(String value) {
            addCriterion("is_new >=", value, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewLessThan(String value) {
            addCriterion("is_new <", value, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewLessThanOrEqualTo(String value) {
            addCriterion("is_new <=", value, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewLike(String value) {
            addCriterion("is_new like", value, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewNotLike(String value) {
            addCriterion("is_new not like", value, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewIn(List<String> values) {
            addCriterion("is_new in", values, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewNotIn(List<String> values) {
            addCriterion("is_new not in", values, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewBetween(String value1, String value2) {
            addCriterion("is_new between", value1, value2, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewNotBetween(String value1, String value2) {
            addCriterion("is_new not between", value1, value2, "isNew");
            return (Criteria) this;
        }

        public Criteria andLicenseEndtimeIsNull() {
            addCriterion("license_endtime is null");
            return (Criteria) this;
        }

        public Criteria andLicenseEndtimeIsNotNull() {
            addCriterion("license_endtime is not null");
            return (Criteria) this;
        }

        public Criteria andLicenseEndtimeEqualTo(String value) {
            addCriterion("license_endtime =", value, "licenseEndtime");
            return (Criteria) this;
        }

        public Criteria andLicenseEndtimeNotEqualTo(String value) {
            addCriterion("license_endtime <>", value, "licenseEndtime");
            return (Criteria) this;
        }

        public Criteria andLicenseEndtimeGreaterThan(String value) {
            addCriterion("license_endtime >", value, "licenseEndtime");
            return (Criteria) this;
        }

        public Criteria andLicenseEndtimeGreaterThanOrEqualTo(String value) {
            addCriterion("license_endtime >=", value, "licenseEndtime");
            return (Criteria) this;
        }

        public Criteria andLicenseEndtimeLessThan(String value) {
            addCriterion("license_endtime <", value, "licenseEndtime");
            return (Criteria) this;
        }

        public Criteria andLicenseEndtimeLessThanOrEqualTo(String value) {
            addCriterion("license_endtime <=", value, "licenseEndtime");
            return (Criteria) this;
        }

        public Criteria andLicenseEndtimeLike(String value) {
            addCriterion("license_endtime like", value, "licenseEndtime");
            return (Criteria) this;
        }

        public Criteria andLicenseEndtimeNotLike(String value) {
            addCriterion("license_endtime not like", value, "licenseEndtime");
            return (Criteria) this;
        }

        public Criteria andLicenseEndtimeIn(List<String> values) {
            addCriterion("license_endtime in", values, "licenseEndtime");
            return (Criteria) this;
        }

        public Criteria andLicenseEndtimeNotIn(List<String> values) {
            addCriterion("license_endtime not in", values, "licenseEndtime");
            return (Criteria) this;
        }

        public Criteria andLicenseEndtimeBetween(String value1, String value2) {
            addCriterion("license_endtime between", value1, value2, "licenseEndtime");
            return (Criteria) this;
        }

        public Criteria andLicenseEndtimeNotBetween(String value1, String value2) {
            addCriterion("license_endtime not between", value1, value2, "licenseEndtime");
            return (Criteria) this;
        }

        public Criteria andLicenseTypeIsNull() {
            addCriterion("license_type is null");
            return (Criteria) this;
        }

        public Criteria andLicenseTypeIsNotNull() {
            addCriterion("license_type is not null");
            return (Criteria) this;
        }

        public Criteria andLicenseTypeEqualTo(String value) {
            addCriterion("license_type =", value, "licenseType");
            return (Criteria) this;
        }

        public Criteria andLicenseTypeNotEqualTo(String value) {
            addCriterion("license_type <>", value, "licenseType");
            return (Criteria) this;
        }

        public Criteria andLicenseTypeGreaterThan(String value) {
            addCriterion("license_type >", value, "licenseType");
            return (Criteria) this;
        }

        public Criteria andLicenseTypeGreaterThanOrEqualTo(String value) {
            addCriterion("license_type >=", value, "licenseType");
            return (Criteria) this;
        }

        public Criteria andLicenseTypeLessThan(String value) {
            addCriterion("license_type <", value, "licenseType");
            return (Criteria) this;
        }

        public Criteria andLicenseTypeLessThanOrEqualTo(String value) {
            addCriterion("license_type <=", value, "licenseType");
            return (Criteria) this;
        }

        public Criteria andLicenseTypeLike(String value) {
            addCriterion("license_type like", value, "licenseType");
            return (Criteria) this;
        }

        public Criteria andLicenseTypeNotLike(String value) {
            addCriterion("license_type not like", value, "licenseType");
            return (Criteria) this;
        }

        public Criteria andLicenseTypeIn(List<String> values) {
            addCriterion("license_type in", values, "licenseType");
            return (Criteria) this;
        }

        public Criteria andLicenseTypeNotIn(List<String> values) {
            addCriterion("license_type not in", values, "licenseType");
            return (Criteria) this;
        }

        public Criteria andLicenseTypeBetween(String value1, String value2) {
            addCriterion("license_type between", value1, value2, "licenseType");
            return (Criteria) this;
        }

        public Criteria andLicenseTypeNotBetween(String value1, String value2) {
            addCriterion("license_type not between", value1, value2, "licenseType");
            return (Criteria) this;
        }

        public Criteria andLicenseIssutimeIsNull() {
            addCriterion("license_issutime is null");
            return (Criteria) this;
        }

        public Criteria andLicenseIssutimeIsNotNull() {
            addCriterion("license_issutime is not null");
            return (Criteria) this;
        }

        public Criteria andLicenseIssutimeEqualTo(String value) {
            addCriterion("license_issutime =", value, "licenseIssutime");
            return (Criteria) this;
        }

        public Criteria andLicenseIssutimeNotEqualTo(String value) {
            addCriterion("license_issutime <>", value, "licenseIssutime");
            return (Criteria) this;
        }

        public Criteria andLicenseIssutimeGreaterThan(String value) {
            addCriterion("license_issutime >", value, "licenseIssutime");
            return (Criteria) this;
        }

        public Criteria andLicenseIssutimeGreaterThanOrEqualTo(String value) {
            addCriterion("license_issutime >=", value, "licenseIssutime");
            return (Criteria) this;
        }

        public Criteria andLicenseIssutimeLessThan(String value) {
            addCriterion("license_issutime <", value, "licenseIssutime");
            return (Criteria) this;
        }

        public Criteria andLicenseIssutimeLessThanOrEqualTo(String value) {
            addCriterion("license_issutime <=", value, "licenseIssutime");
            return (Criteria) this;
        }

        public Criteria andLicenseIssutimeLike(String value) {
            addCriterion("license_issutime like", value, "licenseIssutime");
            return (Criteria) this;
        }

        public Criteria andLicenseIssutimeNotLike(String value) {
            addCriterion("license_issutime not like", value, "licenseIssutime");
            return (Criteria) this;
        }

        public Criteria andLicenseIssutimeIn(List<String> values) {
            addCriterion("license_issutime in", values, "licenseIssutime");
            return (Criteria) this;
        }

        public Criteria andLicenseIssutimeNotIn(List<String> values) {
            addCriterion("license_issutime not in", values, "licenseIssutime");
            return (Criteria) this;
        }

        public Criteria andLicenseIssutimeBetween(String value1, String value2) {
            addCriterion("license_issutime between", value1, value2, "licenseIssutime");
            return (Criteria) this;
        }

        public Criteria andLicenseIssutimeNotBetween(String value1, String value2) {
            addCriterion("license_issutime not between", value1, value2, "licenseIssutime");
            return (Criteria) this;
        }

        public Criteria andIntegralAvailableIsNull() {
            addCriterion("integral_available is null");
            return (Criteria) this;
        }

        public Criteria andIntegralAvailableIsNotNull() {
            addCriterion("integral_available is not null");
            return (Criteria) this;
        }

        public Criteria andIntegralAvailableEqualTo(String value) {
            addCriterion("integral_available =", value, "integralAvailable");
            return (Criteria) this;
        }

        public Criteria andIntegralAvailableNotEqualTo(String value) {
            addCriterion("integral_available <>", value, "integralAvailable");
            return (Criteria) this;
        }

        public Criteria andIntegralAvailableGreaterThan(String value) {
            addCriterion("integral_available >", value, "integralAvailable");
            return (Criteria) this;
        }

        public Criteria andIntegralAvailableGreaterThanOrEqualTo(String value) {
            addCriterion("integral_available >=", value, "integralAvailable");
            return (Criteria) this;
        }

        public Criteria andIntegralAvailableLessThan(String value) {
            addCriterion("integral_available <", value, "integralAvailable");
            return (Criteria) this;
        }

        public Criteria andIntegralAvailableLessThanOrEqualTo(String value) {
            addCriterion("integral_available <=", value, "integralAvailable");
            return (Criteria) this;
        }

        public Criteria andIntegralAvailableLike(String value) {
            addCriterion("integral_available like", value, "integralAvailable");
            return (Criteria) this;
        }

        public Criteria andIntegralAvailableNotLike(String value) {
            addCriterion("integral_available not like", value, "integralAvailable");
            return (Criteria) this;
        }

        public Criteria andIntegralAvailableIn(List<String> values) {
            addCriterion("integral_available in", values, "integralAvailable");
            return (Criteria) this;
        }

        public Criteria andIntegralAvailableNotIn(List<String> values) {
            addCriterion("integral_available not in", values, "integralAvailable");
            return (Criteria) this;
        }

        public Criteria andIntegralAvailableBetween(String value1, String value2) {
            addCriterion("integral_available between", value1, value2, "integralAvailable");
            return (Criteria) this;
        }

        public Criteria andIntegralAvailableNotBetween(String value1, String value2) {
            addCriterion("integral_available not between", value1, value2, "integralAvailable");
            return (Criteria) this;
        }

        public Criteria andIntegralAddIsNull() {
            addCriterion("integral_add is null");
            return (Criteria) this;
        }

        public Criteria andIntegralAddIsNotNull() {
            addCriterion("integral_add is not null");
            return (Criteria) this;
        }

        public Criteria andIntegralAddEqualTo(String value) {
            addCriterion("integral_add =", value, "integralAdd");
            return (Criteria) this;
        }

        public Criteria andIntegralAddNotEqualTo(String value) {
            addCriterion("integral_add <>", value, "integralAdd");
            return (Criteria) this;
        }

        public Criteria andIntegralAddGreaterThan(String value) {
            addCriterion("integral_add >", value, "integralAdd");
            return (Criteria) this;
        }

        public Criteria andIntegralAddGreaterThanOrEqualTo(String value) {
            addCriterion("integral_add >=", value, "integralAdd");
            return (Criteria) this;
        }

        public Criteria andIntegralAddLessThan(String value) {
            addCriterion("integral_add <", value, "integralAdd");
            return (Criteria) this;
        }

        public Criteria andIntegralAddLessThanOrEqualTo(String value) {
            addCriterion("integral_add <=", value, "integralAdd");
            return (Criteria) this;
        }

        public Criteria andIntegralAddLike(String value) {
            addCriterion("integral_add like", value, "integralAdd");
            return (Criteria) this;
        }

        public Criteria andIntegralAddNotLike(String value) {
            addCriterion("integral_add not like", value, "integralAdd");
            return (Criteria) this;
        }

        public Criteria andIntegralAddIn(List<String> values) {
            addCriterion("integral_add in", values, "integralAdd");
            return (Criteria) this;
        }

        public Criteria andIntegralAddNotIn(List<String> values) {
            addCriterion("integral_add not in", values, "integralAdd");
            return (Criteria) this;
        }

        public Criteria andIntegralAddBetween(String value1, String value2) {
            addCriterion("integral_add between", value1, value2, "integralAdd");
            return (Criteria) this;
        }

        public Criteria andIntegralAddNotBetween(String value1, String value2) {
            addCriterion("integral_add not between", value1, value2, "integralAdd");
            return (Criteria) this;
        }

        public Criteria andVipIdIsNull() {
            addCriterion("vip_id is null");
            return (Criteria) this;
        }

        public Criteria andVipIdIsNotNull() {
            addCriterion("vip_id is not null");
            return (Criteria) this;
        }

        public Criteria andVipIdEqualTo(Integer value) {
            addCriterion("vip_id =", value, "vipId");
            return (Criteria) this;
        }

        public Criteria andVipIdNotEqualTo(Integer value) {
            addCriterion("vip_id <>", value, "vipId");
            return (Criteria) this;
        }

        public Criteria andVipIdGreaterThan(Integer value) {
            addCriterion("vip_id >", value, "vipId");
            return (Criteria) this;
        }

        public Criteria andVipIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("vip_id >=", value, "vipId");
            return (Criteria) this;
        }

        public Criteria andVipIdLessThan(Integer value) {
            addCriterion("vip_id <", value, "vipId");
            return (Criteria) this;
        }

        public Criteria andVipIdLessThanOrEqualTo(Integer value) {
            addCriterion("vip_id <=", value, "vipId");
            return (Criteria) this;
        }

        public Criteria andVipIdIn(List<Integer> values) {
            addCriterion("vip_id in", values, "vipId");
            return (Criteria) this;
        }

        public Criteria andVipIdNotIn(List<Integer> values) {
            addCriterion("vip_id not in", values, "vipId");
            return (Criteria) this;
        }

        public Criteria andVipIdBetween(Integer value1, Integer value2) {
            addCriterion("vip_id between", value1, value2, "vipId");
            return (Criteria) this;
        }

        public Criteria andVipIdNotBetween(Integer value1, Integer value2) {
            addCriterion("vip_id not between", value1, value2, "vipId");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
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