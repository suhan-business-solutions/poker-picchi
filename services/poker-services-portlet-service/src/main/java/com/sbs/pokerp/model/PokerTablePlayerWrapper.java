package com.sbs.pokerp.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link PokerTablePlayer}.
 * </p>
 *
 * @author jpnaidu
 * @see PokerTablePlayer
 * @generated
 */
public class PokerTablePlayerWrapper implements PokerTablePlayer,
    ModelWrapper<PokerTablePlayer> {
    private PokerTablePlayer _pokerTablePlayer;

    public PokerTablePlayerWrapper(PokerTablePlayer pokerTablePlayer) {
        _pokerTablePlayer = pokerTablePlayer;
    }

    @Override
    public Class<?> getModelClass() {
        return PokerTablePlayer.class;
    }

    @Override
    public String getModelClassName() {
        return PokerTablePlayer.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("gameId", getGameId());
        attributes.put("playerId", getPlayerId());
        attributes.put("timeJoined", getTimeJoined());
        attributes.put("timeLeft", getTimeLeft());
        attributes.put("amountWon", getAmountWon());
        attributes.put("createdBy", getCreatedBy());
        attributes.put("createdDate", getCreatedDate());
        attributes.put("updatedBy", getUpdatedBy());
        attributes.put("updatedDate", getUpdatedDate());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long gameId = (Long) attributes.get("gameId");

        if (gameId != null) {
            setGameId(gameId);
        }

        Long playerId = (Long) attributes.get("playerId");

        if (playerId != null) {
            setPlayerId(playerId);
        }

        Date timeJoined = (Date) attributes.get("timeJoined");

        if (timeJoined != null) {
            setTimeJoined(timeJoined);
        }

        Date timeLeft = (Date) attributes.get("timeLeft");

        if (timeLeft != null) {
            setTimeLeft(timeLeft);
        }

        Double amountWon = (Double) attributes.get("amountWon");

        if (amountWon != null) {
            setAmountWon(amountWon);
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
    * Returns the primary key of this PokerTablePlayer.
    *
    * @return the primary key of this PokerTablePlayer
    */
    @Override
    public com.sbs.pokerp.service.persistence.PokerTablePlayerPK getPrimaryKey() {
        return _pokerTablePlayer.getPrimaryKey();
    }

    /**
    * Sets the primary key of this PokerTablePlayer.
    *
    * @param primaryKey the primary key of this PokerTablePlayer
    */
    @Override
    public void setPrimaryKey(
        com.sbs.pokerp.service.persistence.PokerTablePlayerPK primaryKey) {
        _pokerTablePlayer.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the game ID of this PokerTablePlayer.
    *
    * @return the game ID of this PokerTablePlayer
    */
    @Override
    public long getGameId() {
        return _pokerTablePlayer.getGameId();
    }

    /**
    * Sets the game ID of this PokerTablePlayer.
    *
    * @param gameId the game ID of this PokerTablePlayer
    */
    @Override
    public void setGameId(long gameId) {
        _pokerTablePlayer.setGameId(gameId);
    }

    /**
    * Returns the player ID of this PokerTablePlayer.
    *
    * @return the player ID of this PokerTablePlayer
    */
    @Override
    public long getPlayerId() {
        return _pokerTablePlayer.getPlayerId();
    }

    /**
    * Sets the player ID of this PokerTablePlayer.
    *
    * @param playerId the player ID of this PokerTablePlayer
    */
    @Override
    public void setPlayerId(long playerId) {
        _pokerTablePlayer.setPlayerId(playerId);
    }

    /**
    * Returns the time joined of this PokerTablePlayer.
    *
    * @return the time joined of this PokerTablePlayer
    */
    @Override
    public java.util.Date getTimeJoined() {
        return _pokerTablePlayer.getTimeJoined();
    }

    /**
    * Sets the time joined of this PokerTablePlayer.
    *
    * @param timeJoined the time joined of this PokerTablePlayer
    */
    @Override
    public void setTimeJoined(java.util.Date timeJoined) {
        _pokerTablePlayer.setTimeJoined(timeJoined);
    }

    /**
    * Returns the time left of this PokerTablePlayer.
    *
    * @return the time left of this PokerTablePlayer
    */
    @Override
    public java.util.Date getTimeLeft() {
        return _pokerTablePlayer.getTimeLeft();
    }

    /**
    * Sets the time left of this PokerTablePlayer.
    *
    * @param timeLeft the time left of this PokerTablePlayer
    */
    @Override
    public void setTimeLeft(java.util.Date timeLeft) {
        _pokerTablePlayer.setTimeLeft(timeLeft);
    }

    /**
    * Returns the amount won of this PokerTablePlayer.
    *
    * @return the amount won of this PokerTablePlayer
    */
    @Override
    public double getAmountWon() {
        return _pokerTablePlayer.getAmountWon();
    }

    /**
    * Sets the amount won of this PokerTablePlayer.
    *
    * @param amountWon the amount won of this PokerTablePlayer
    */
    @Override
    public void setAmountWon(double amountWon) {
        _pokerTablePlayer.setAmountWon(amountWon);
    }

    /**
    * Returns the created by of this PokerTablePlayer.
    *
    * @return the created by of this PokerTablePlayer
    */
    @Override
    public java.lang.String getCreatedBy() {
        return _pokerTablePlayer.getCreatedBy();
    }

    /**
    * Sets the created by of this PokerTablePlayer.
    *
    * @param createdBy the created by of this PokerTablePlayer
    */
    @Override
    public void setCreatedBy(java.lang.String createdBy) {
        _pokerTablePlayer.setCreatedBy(createdBy);
    }

    /**
    * Returns the created date of this PokerTablePlayer.
    *
    * @return the created date of this PokerTablePlayer
    */
    @Override
    public java.util.Date getCreatedDate() {
        return _pokerTablePlayer.getCreatedDate();
    }

    /**
    * Sets the created date of this PokerTablePlayer.
    *
    * @param createdDate the created date of this PokerTablePlayer
    */
    @Override
    public void setCreatedDate(java.util.Date createdDate) {
        _pokerTablePlayer.setCreatedDate(createdDate);
    }

    /**
    * Returns the updated by of this PokerTablePlayer.
    *
    * @return the updated by of this PokerTablePlayer
    */
    @Override
    public java.lang.String getUpdatedBy() {
        return _pokerTablePlayer.getUpdatedBy();
    }

    /**
    * Sets the updated by of this PokerTablePlayer.
    *
    * @param updatedBy the updated by of this PokerTablePlayer
    */
    @Override
    public void setUpdatedBy(java.lang.String updatedBy) {
        _pokerTablePlayer.setUpdatedBy(updatedBy);
    }

    /**
    * Returns the updated date of this PokerTablePlayer.
    *
    * @return the updated date of this PokerTablePlayer
    */
    @Override
    public java.util.Date getUpdatedDate() {
        return _pokerTablePlayer.getUpdatedDate();
    }

    /**
    * Sets the updated date of this PokerTablePlayer.
    *
    * @param updatedDate the updated date of this PokerTablePlayer
    */
    @Override
    public void setUpdatedDate(java.util.Date updatedDate) {
        _pokerTablePlayer.setUpdatedDate(updatedDate);
    }

    @Override
    public boolean isNew() {
        return _pokerTablePlayer.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _pokerTablePlayer.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _pokerTablePlayer.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _pokerTablePlayer.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _pokerTablePlayer.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _pokerTablePlayer.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _pokerTablePlayer.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _pokerTablePlayer.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _pokerTablePlayer.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _pokerTablePlayer.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _pokerTablePlayer.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new PokerTablePlayerWrapper((PokerTablePlayer) _pokerTablePlayer.clone());
    }

    @Override
    public int compareTo(PokerTablePlayer pokerTablePlayer) {
        return _pokerTablePlayer.compareTo(pokerTablePlayer);
    }

    @Override
    public int hashCode() {
        return _pokerTablePlayer.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<PokerTablePlayer> toCacheModel() {
        return _pokerTablePlayer.toCacheModel();
    }

    @Override
    public PokerTablePlayer toEscapedModel() {
        return new PokerTablePlayerWrapper(_pokerTablePlayer.toEscapedModel());
    }

    @Override
    public PokerTablePlayer toUnescapedModel() {
        return new PokerTablePlayerWrapper(_pokerTablePlayer.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _pokerTablePlayer.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _pokerTablePlayer.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _pokerTablePlayer.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof PokerTablePlayerWrapper)) {
            return false;
        }

        PokerTablePlayerWrapper pokerTablePlayerWrapper = (PokerTablePlayerWrapper) obj;

        if (Validator.equals(_pokerTablePlayer,
                    pokerTablePlayerWrapper._pokerTablePlayer)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public PokerTablePlayer getWrappedPokerTablePlayer() {
        return _pokerTablePlayer;
    }

    @Override
    public PokerTablePlayer getWrappedModel() {
        return _pokerTablePlayer;
    }

    @Override
    public void resetOriginalValues() {
        _pokerTablePlayer.resetOriginalValues();
    }
}
