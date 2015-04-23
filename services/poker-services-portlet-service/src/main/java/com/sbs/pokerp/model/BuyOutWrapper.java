package com.sbs.pokerp.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link BuyOut}.
 * </p>
 *
 * @author jpnaidu
 * @see BuyOut
 * @generated
 */
public class BuyOutWrapper implements BuyOut, ModelWrapper<BuyOut> {
    private BuyOut _buyOut;

    public BuyOutWrapper(BuyOut buyOut) {
        _buyOut = buyOut;
    }

    @Override
    public Class<?> getModelClass() {
        return BuyOut.class;
    }

    @Override
    public String getModelClassName() {
        return BuyOut.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("transactionId", getTransactionId());
        attributes.put("gameId", getGameId());
        attributes.put("playerId", getPlayerId());
        attributes.put("amount", getAmount());
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
    * Returns the primary key of this BuyOut.
    *
    * @return the primary key of this BuyOut
    */
    @Override
    public long getPrimaryKey() {
        return _buyOut.getPrimaryKey();
    }

    /**
    * Sets the primary key of this BuyOut.
    *
    * @param primaryKey the primary key of this BuyOut
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _buyOut.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the transaction ID of this BuyOut.
    *
    * @return the transaction ID of this BuyOut
    */
    @Override
    public long getTransactionId() {
        return _buyOut.getTransactionId();
    }

    /**
    * Sets the transaction ID of this BuyOut.
    *
    * @param transactionId the transaction ID of this BuyOut
    */
    @Override
    public void setTransactionId(long transactionId) {
        _buyOut.setTransactionId(transactionId);
    }

    /**
    * Returns the game ID of this BuyOut.
    *
    * @return the game ID of this BuyOut
    */
    @Override
    public long getGameId() {
        return _buyOut.getGameId();
    }

    /**
    * Sets the game ID of this BuyOut.
    *
    * @param gameId the game ID of this BuyOut
    */
    @Override
    public void setGameId(long gameId) {
        _buyOut.setGameId(gameId);
    }

    /**
    * Returns the player ID of this BuyOut.
    *
    * @return the player ID of this BuyOut
    */
    @Override
    public long getPlayerId() {
        return _buyOut.getPlayerId();
    }

    /**
    * Sets the player ID of this BuyOut.
    *
    * @param playerId the player ID of this BuyOut
    */
    @Override
    public void setPlayerId(long playerId) {
        _buyOut.setPlayerId(playerId);
    }

    /**
    * Returns the amount of this BuyOut.
    *
    * @return the amount of this BuyOut
    */
    @Override
    public double getAmount() {
        return _buyOut.getAmount();
    }

    /**
    * Sets the amount of this BuyOut.
    *
    * @param amount the amount of this BuyOut
    */
    @Override
    public void setAmount(double amount) {
        _buyOut.setAmount(amount);
    }

    /**
    * Returns the created by of this BuyOut.
    *
    * @return the created by of this BuyOut
    */
    @Override
    public java.lang.String getCreatedBy() {
        return _buyOut.getCreatedBy();
    }

    /**
    * Sets the created by of this BuyOut.
    *
    * @param createdBy the created by of this BuyOut
    */
    @Override
    public void setCreatedBy(java.lang.String createdBy) {
        _buyOut.setCreatedBy(createdBy);
    }

    /**
    * Returns the created date of this BuyOut.
    *
    * @return the created date of this BuyOut
    */
    @Override
    public java.util.Date getCreatedDate() {
        return _buyOut.getCreatedDate();
    }

    /**
    * Sets the created date of this BuyOut.
    *
    * @param createdDate the created date of this BuyOut
    */
    @Override
    public void setCreatedDate(java.util.Date createdDate) {
        _buyOut.setCreatedDate(createdDate);
    }

    /**
    * Returns the updated by of this BuyOut.
    *
    * @return the updated by of this BuyOut
    */
    @Override
    public java.lang.String getUpdatedBy() {
        return _buyOut.getUpdatedBy();
    }

    /**
    * Sets the updated by of this BuyOut.
    *
    * @param updatedBy the updated by of this BuyOut
    */
    @Override
    public void setUpdatedBy(java.lang.String updatedBy) {
        _buyOut.setUpdatedBy(updatedBy);
    }

    /**
    * Returns the updated date of this BuyOut.
    *
    * @return the updated date of this BuyOut
    */
    @Override
    public java.util.Date getUpdatedDate() {
        return _buyOut.getUpdatedDate();
    }

    /**
    * Sets the updated date of this BuyOut.
    *
    * @param updatedDate the updated date of this BuyOut
    */
    @Override
    public void setUpdatedDate(java.util.Date updatedDate) {
        _buyOut.setUpdatedDate(updatedDate);
    }

    @Override
    public boolean isNew() {
        return _buyOut.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _buyOut.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _buyOut.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _buyOut.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _buyOut.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _buyOut.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _buyOut.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _buyOut.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _buyOut.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _buyOut.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _buyOut.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new BuyOutWrapper((BuyOut) _buyOut.clone());
    }

    @Override
    public int compareTo(BuyOut buyOut) {
        return _buyOut.compareTo(buyOut);
    }

    @Override
    public int hashCode() {
        return _buyOut.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<BuyOut> toCacheModel() {
        return _buyOut.toCacheModel();
    }

    @Override
    public BuyOut toEscapedModel() {
        return new BuyOutWrapper(_buyOut.toEscapedModel());
    }

    @Override
    public BuyOut toUnescapedModel() {
        return new BuyOutWrapper(_buyOut.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _buyOut.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _buyOut.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _buyOut.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof BuyOutWrapper)) {
            return false;
        }

        BuyOutWrapper buyOutWrapper = (BuyOutWrapper) obj;

        if (Validator.equals(_buyOut, buyOutWrapper._buyOut)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public BuyOut getWrappedBuyOut() {
        return _buyOut;
    }

    @Override
    public BuyOut getWrappedModel() {
        return _buyOut;
    }

    @Override
    public void resetOriginalValues() {
        _buyOut.resetOriginalValues();
    }
}
