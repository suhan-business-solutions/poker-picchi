package com.sbs.pokerp.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link BuyIn}.
 * </p>
 *
 * @author jpnaidu
 * @see BuyIn
 * @generated
 */
public class BuyInWrapper implements BuyIn, ModelWrapper<BuyIn> {
    private BuyIn _buyIn;

    public BuyInWrapper(BuyIn buyIn) {
        _buyIn = buyIn;
    }

    @Override
    public Class<?> getModelClass() {
        return BuyIn.class;
    }

    @Override
    public String getModelClassName() {
        return BuyIn.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("transactionId", getTransactionId());
        attributes.put("gameId", getGameId());
        attributes.put("playerId", getPlayerId());
        attributes.put("amount", getAmount());
        attributes.put("credit", getCredit());
        attributes.put("createdBy", getCreatedBy());
        attributes.put("createdDate", getCreatedDate());
        attributes.put("updatedBy", getUpdatedBy());
        attributes.put("updatedDate", getUpdatedDate());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long transactionId = (Long) attributes.get("transactionId");

        if (transactionId != null) {
            setTransactionId(transactionId);
        }

        Long gameId = (Long) attributes.get("gameId");

        if (gameId != null) {
            setGameId(gameId);
        }

        Long playerId = (Long) attributes.get("playerId");

        if (playerId != null) {
            setPlayerId(playerId);
        }

        Double amount = (Double) attributes.get("amount");

        if (amount != null) {
            setAmount(amount);
        }

        Boolean credit = (Boolean) attributes.get("credit");

        if (credit != null) {
            setCredit(credit);
        }

        String createdBy = (String) attributes.get("createdBy");

        if (createdBy != null) {
            setCreatedBy(createdBy);
        }

        Date createdDate = (Date) attributes.get("createdDate");

        if (createdDate != null) {
            setCreatedDate(createdDate);
        }

        String updatedBy = (String) attributes.get("updatedBy");

        if (updatedBy != null) {
            setUpdatedBy(updatedBy);
        }

        Date updatedDate = (Date) attributes.get("updatedDate");

        if (updatedDate != null) {
            setUpdatedDate(updatedDate);
        }
    }

    /**
    * Returns the primary key of this BuyIn.
    *
    * @return the primary key of this BuyIn
    */
    @Override
    public long getPrimaryKey() {
        return _buyIn.getPrimaryKey();
    }

    /**
    * Sets the primary key of this BuyIn.
    *
    * @param primaryKey the primary key of this BuyIn
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _buyIn.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the transaction ID of this BuyIn.
    *
    * @return the transaction ID of this BuyIn
    */
    @Override
    public long getTransactionId() {
        return _buyIn.getTransactionId();
    }

    /**
    * Sets the transaction ID of this BuyIn.
    *
    * @param transactionId the transaction ID of this BuyIn
    */
    @Override
    public void setTransactionId(long transactionId) {
        _buyIn.setTransactionId(transactionId);
    }

    /**
    * Returns the game ID of this BuyIn.
    *
    * @return the game ID of this BuyIn
    */
    @Override
    public long getGameId() {
        return _buyIn.getGameId();
    }

    /**
    * Sets the game ID of this BuyIn.
    *
    * @param gameId the game ID of this BuyIn
    */
    @Override
    public void setGameId(long gameId) {
        _buyIn.setGameId(gameId);
    }

    /**
    * Returns the player ID of this BuyIn.
    *
    * @return the player ID of this BuyIn
    */
    @Override
    public long getPlayerId() {
        return _buyIn.getPlayerId();
    }

    /**
    * Sets the player ID of this BuyIn.
    *
    * @param playerId the player ID of this BuyIn
    */
    @Override
    public void setPlayerId(long playerId) {
        _buyIn.setPlayerId(playerId);
    }

    /**
    * Returns the amount of this BuyIn.
    *
    * @return the amount of this BuyIn
    */
    @Override
    public double getAmount() {
        return _buyIn.getAmount();
    }

    /**
    * Sets the amount of this BuyIn.
    *
    * @param amount the amount of this BuyIn
    */
    @Override
    public void setAmount(double amount) {
        _buyIn.setAmount(amount);
    }

    /**
    * Returns the credit of this BuyIn.
    *
    * @return the credit of this BuyIn
    */
    @Override
    public boolean getCredit() {
        return _buyIn.getCredit();
    }

    /**
    * Returns <code>true</code> if this BuyIn is credit.
    *
    * @return <code>true</code> if this BuyIn is credit; <code>false</code> otherwise
    */
    @Override
    public boolean isCredit() {
        return _buyIn.isCredit();
    }

    /**
    * Sets whether this BuyIn is credit.
    *
    * @param credit the credit of this BuyIn
    */
    @Override
    public void setCredit(boolean credit) {
        _buyIn.setCredit(credit);
    }

    /**
    * Returns the created by of this BuyIn.
    *
    * @return the created by of this BuyIn
    */
    @Override
    public java.lang.String getCreatedBy() {
        return _buyIn.getCreatedBy();
    }

    /**
    * Sets the created by of this BuyIn.
    *
    * @param createdBy the created by of this BuyIn
    */
    @Override
    public void setCreatedBy(java.lang.String createdBy) {
        _buyIn.setCreatedBy(createdBy);
    }

    /**
    * Returns the created date of this BuyIn.
    *
    * @return the created date of this BuyIn
    */
    @Override
    public java.util.Date getCreatedDate() {
        return _buyIn.getCreatedDate();
    }

    /**
    * Sets the created date of this BuyIn.
    *
    * @param createdDate the created date of this BuyIn
    */
    @Override
    public void setCreatedDate(java.util.Date createdDate) {
        _buyIn.setCreatedDate(createdDate);
    }

    /**
    * Returns the updated by of this BuyIn.
    *
    * @return the updated by of this BuyIn
    */
    @Override
    public java.lang.String getUpdatedBy() {
        return _buyIn.getUpdatedBy();
    }

    /**
    * Sets the updated by of this BuyIn.
    *
    * @param updatedBy the updated by of this BuyIn
    */
    @Override
    public void setUpdatedBy(java.lang.String updatedBy) {
        _buyIn.setUpdatedBy(updatedBy);
    }

    /**
    * Returns the updated date of this BuyIn.
    *
    * @return the updated date of this BuyIn
    */
    @Override
    public java.util.Date getUpdatedDate() {
        return _buyIn.getUpdatedDate();
    }

    /**
    * Sets the updated date of this BuyIn.
    *
    * @param updatedDate the updated date of this BuyIn
    */
    @Override
    public void setUpdatedDate(java.util.Date updatedDate) {
        _buyIn.setUpdatedDate(updatedDate);
    }

    @Override
    public boolean isNew() {
        return _buyIn.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _buyIn.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _buyIn.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _buyIn.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _buyIn.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _buyIn.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _buyIn.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _buyIn.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _buyIn.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _buyIn.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _buyIn.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new BuyInWrapper((BuyIn) _buyIn.clone());
    }

    @Override
    public int compareTo(BuyIn buyIn) {
        return _buyIn.compareTo(buyIn);
    }

    @Override
    public int hashCode() {
        return _buyIn.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<BuyIn> toCacheModel() {
        return _buyIn.toCacheModel();
    }

    @Override
    public BuyIn toEscapedModel() {
        return new BuyInWrapper(_buyIn.toEscapedModel());
    }

    @Override
    public BuyIn toUnescapedModel() {
        return new BuyInWrapper(_buyIn.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _buyIn.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _buyIn.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _buyIn.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof BuyInWrapper)) {
            return false;
        }

        BuyInWrapper buyInWrapper = (BuyInWrapper) obj;

        if (Validator.equals(_buyIn, buyInWrapper._buyIn)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public BuyIn getWrappedBuyIn() {
        return _buyIn;
    }

    @Override
    public BuyIn getWrappedModel() {
        return _buyIn;
    }

    @Override
    public void resetOriginalValues() {
        _buyIn.resetOriginalValues();
    }
}
