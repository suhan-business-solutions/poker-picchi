package com.sbs.pokerp.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link PokerTable}.
 * </p>
 *
 * @author jpnaidu
 * @see PokerTable
 * @generated
 */
public class PokerTableWrapper implements PokerTable, ModelWrapper<PokerTable> {
    private PokerTable _pokerTable;

    public PokerTableWrapper(PokerTable pokerTable) {
        _pokerTable = pokerTable;
    }

    @Override
    public Class<?> getModelClass() {
        return PokerTable.class;
    }

    @Override
    public String getModelClassName() {
        return PokerTable.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("gameId", getGameId());
        attributes.put("orgId", getOrgId());
        attributes.put("tableName", getTableName());
        attributes.put("playerCount", getPlayerCount());
        attributes.put("status", getStatus());
        attributes.put("notes", getNotes());
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

        Long orgId = (Long) attributes.get("orgId");

        if (orgId != null) {
            setOrgId(orgId);
        }

        String tableName = (String) attributes.get("tableName");

        if (tableName != null) {
            setTableName(tableName);
        }

        Integer playerCount = (Integer) attributes.get("playerCount");

        if (playerCount != null) {
            setPlayerCount(playerCount);
        }

        Integer status = (Integer) attributes.get("status");

        if (status != null) {
            setStatus(status);
        }

        String notes = (String) attributes.get("notes");

        if (notes != null) {
            setNotes(notes);
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
    * Returns the primary key of this PokerTable.
    *
    * @return the primary key of this PokerTable
    */
    @Override
    public long getPrimaryKey() {
        return _pokerTable.getPrimaryKey();
    }

    /**
    * Sets the primary key of this PokerTable.
    *
    * @param primaryKey the primary key of this PokerTable
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _pokerTable.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the game ID of this PokerTable.
    *
    * @return the game ID of this PokerTable
    */
    @Override
    public long getGameId() {
        return _pokerTable.getGameId();
    }

    /**
    * Sets the game ID of this PokerTable.
    *
    * @param gameId the game ID of this PokerTable
    */
    @Override
    public void setGameId(long gameId) {
        _pokerTable.setGameId(gameId);
    }

    /**
    * Returns the org ID of this PokerTable.
    *
    * @return the org ID of this PokerTable
    */
    @Override
    public long getOrgId() {
        return _pokerTable.getOrgId();
    }

    /**
    * Sets the org ID of this PokerTable.
    *
    * @param orgId the org ID of this PokerTable
    */
    @Override
    public void setOrgId(long orgId) {
        _pokerTable.setOrgId(orgId);
    }

    /**
    * Returns the table name of this PokerTable.
    *
    * @return the table name of this PokerTable
    */
    @Override
    public java.lang.String getTableName() {
        return _pokerTable.getTableName();
    }

    /**
    * Sets the table name of this PokerTable.
    *
    * @param tableName the table name of this PokerTable
    */
    @Override
    public void setTableName(java.lang.String tableName) {
        _pokerTable.setTableName(tableName);
    }

    /**
    * Returns the player count of this PokerTable.
    *
    * @return the player count of this PokerTable
    */
    @Override
    public int getPlayerCount() {
        return _pokerTable.getPlayerCount();
    }

    /**
    * Sets the player count of this PokerTable.
    *
    * @param playerCount the player count of this PokerTable
    */
    @Override
    public void setPlayerCount(int playerCount) {
        _pokerTable.setPlayerCount(playerCount);
    }

    /**
    * Returns the status of this PokerTable.
    *
    * @return the status of this PokerTable
    */
    @Override
    public int getStatus() {
        return _pokerTable.getStatus();
    }

    /**
    * Sets the status of this PokerTable.
    *
    * @param status the status of this PokerTable
    */
    @Override
    public void setStatus(int status) {
        _pokerTable.setStatus(status);
    }

    /**
    * Returns the notes of this PokerTable.
    *
    * @return the notes of this PokerTable
    */
    @Override
    public java.lang.String getNotes() {
        return _pokerTable.getNotes();
    }

    /**
    * Sets the notes of this PokerTable.
    *
    * @param notes the notes of this PokerTable
    */
    @Override
    public void setNotes(java.lang.String notes) {
        _pokerTable.setNotes(notes);
    }

    /**
    * Returns the created by of this PokerTable.
    *
    * @return the created by of this PokerTable
    */
    @Override
    public java.lang.String getCreatedBy() {
        return _pokerTable.getCreatedBy();
    }

    /**
    * Sets the created by of this PokerTable.
    *
    * @param createdBy the created by of this PokerTable
    */
    @Override
    public void setCreatedBy(java.lang.String createdBy) {
        _pokerTable.setCreatedBy(createdBy);
    }

    /**
    * Returns the created date of this PokerTable.
    *
    * @return the created date of this PokerTable
    */
    @Override
    public java.util.Date getCreatedDate() {
        return _pokerTable.getCreatedDate();
    }

    /**
    * Sets the created date of this PokerTable.
    *
    * @param createdDate the created date of this PokerTable
    */
    @Override
    public void setCreatedDate(java.util.Date createdDate) {
        _pokerTable.setCreatedDate(createdDate);
    }

    /**
    * Returns the updated by of this PokerTable.
    *
    * @return the updated by of this PokerTable
    */
    @Override
    public java.lang.String getUpdatedBy() {
        return _pokerTable.getUpdatedBy();
    }

    /**
    * Sets the updated by of this PokerTable.
    *
    * @param updatedBy the updated by of this PokerTable
    */
    @Override
    public void setUpdatedBy(java.lang.String updatedBy) {
        _pokerTable.setUpdatedBy(updatedBy);
    }

    /**
    * Returns the updated date of this PokerTable.
    *
    * @return the updated date of this PokerTable
    */
    @Override
    public java.util.Date getUpdatedDate() {
        return _pokerTable.getUpdatedDate();
    }

    /**
    * Sets the updated date of this PokerTable.
    *
    * @param updatedDate the updated date of this PokerTable
    */
    @Override
    public void setUpdatedDate(java.util.Date updatedDate) {
        _pokerTable.setUpdatedDate(updatedDate);
    }

    @Override
    public boolean isNew() {
        return _pokerTable.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _pokerTable.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _pokerTable.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _pokerTable.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _pokerTable.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _pokerTable.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _pokerTable.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _pokerTable.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _pokerTable.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _pokerTable.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _pokerTable.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new PokerTableWrapper((PokerTable) _pokerTable.clone());
    }

    @Override
    public int compareTo(PokerTable pokerTable) {
        return _pokerTable.compareTo(pokerTable);
    }

    @Override
    public int hashCode() {
        return _pokerTable.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<PokerTable> toCacheModel() {
        return _pokerTable.toCacheModel();
    }

    @Override
    public PokerTable toEscapedModel() {
        return new PokerTableWrapper(_pokerTable.toEscapedModel());
    }

    @Override
    public PokerTable toUnescapedModel() {
        return new PokerTableWrapper(_pokerTable.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _pokerTable.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _pokerTable.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _pokerTable.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof PokerTableWrapper)) {
            return false;
        }

        PokerTableWrapper pokerTableWrapper = (PokerTableWrapper) obj;

        if (Validator.equals(_pokerTable, pokerTableWrapper._pokerTable)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public PokerTable getWrappedPokerTable() {
        return _pokerTable;
    }

    @Override
    public PokerTable getWrappedModel() {
        return _pokerTable;
    }

    @Override
    public void resetOriginalValues() {
        _pokerTable.resetOriginalValues();
    }
}
