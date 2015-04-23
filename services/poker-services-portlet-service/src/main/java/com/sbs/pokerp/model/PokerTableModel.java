package com.sbs.pokerp.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the PokerTable service. Represents a row in the &quot;pokerp_PokerTable&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.sbs.pokerp.model.impl.PokerTableModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.sbs.pokerp.model.impl.PokerTableImpl}.
 * </p>
 *
 * @author jpnaidu
 * @see PokerTable
 * @see com.sbs.pokerp.model.impl.PokerTableImpl
 * @see com.sbs.pokerp.model.impl.PokerTableModelImpl
 * @generated
 */
public interface PokerTableModel extends BaseModel<PokerTable> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a PokerTable model instance should use the {@link PokerTable} interface instead.
     */

    /**
     * Returns the primary key of this PokerTable.
     *
     * @return the primary key of this PokerTable
     */
    public long getPrimaryKey();

    /**
     * Sets the primary key of this PokerTable.
     *
     * @param primaryKey the primary key of this PokerTable
     */
    public void setPrimaryKey(long primaryKey);

    /**
     * Returns the game ID of this PokerTable.
     *
     * @return the game ID of this PokerTable
     */
    public long getGameId();

    /**
     * Sets the game ID of this PokerTable.
     *
     * @param gameId the game ID of this PokerTable
     */
    public void setGameId(long gameId);

    /**
     * Returns the org ID of this PokerTable.
     *
     * @return the org ID of this PokerTable
     */
    public long getOrgId();

    /**
     * Sets the org ID of this PokerTable.
     *
     * @param orgId the org ID of this PokerTable
     */
    public void setOrgId(long orgId);

    /**
     * Returns the table name of this PokerTable.
     *
     * @return the table name of this PokerTable
     */
    @AutoEscape
    public String getTableName();

    /**
     * Sets the table name of this PokerTable.
     *
     * @param tableName the table name of this PokerTable
     */
    public void setTableName(String tableName);

    /**
     * Returns the player count of this PokerTable.
     *
     * @return the player count of this PokerTable
     */
    public int getPlayerCount();

    /**
     * Sets the player count of this PokerTable.
     *
     * @param playerCount the player count of this PokerTable
     */
    public void setPlayerCount(int playerCount);

    /**
     * Returns the status of this PokerTable.
     *
     * @return the status of this PokerTable
     */
    public int getStatus();

    /**
     * Sets the status of this PokerTable.
     *
     * @param status the status of this PokerTable
     */
    public void setStatus(int status);

    /**
     * Returns the notes of this PokerTable.
     *
     * @return the notes of this PokerTable
     */
    @AutoEscape
    public String getNotes();

    /**
     * Sets the notes of this PokerTable.
     *
     * @param notes the notes of this PokerTable
     */
    public void setNotes(String notes);

    /**
     * Returns the created by of this PokerTable.
     *
     * @return the created by of this PokerTable
     */
    @AutoEscape
    public String getCreatedBy();

    /**
     * Sets the created by of this PokerTable.
     *
     * @param createdBy the created by of this PokerTable
     */
    public void setCreatedBy(String createdBy);

    /**
     * Returns the created date of this PokerTable.
     *
     * @return the created date of this PokerTable
     */
    public Date getCreatedDate();

    /**
     * Sets the created date of this PokerTable.
     *
     * @param createdDate the created date of this PokerTable
     */
    public void setCreatedDate(Date createdDate);

    /**
     * Returns the updated by of this PokerTable.
     *
     * @return the updated by of this PokerTable
     */
    @AutoEscape
    public String getUpdatedBy();

    /**
     * Sets the updated by of this PokerTable.
     *
     * @param updatedBy the updated by of this PokerTable
     */
    public void setUpdatedBy(String updatedBy);

    /**
     * Returns the updated date of this PokerTable.
     *
     * @return the updated date of this PokerTable
     */
    public Date getUpdatedDate();

    /**
     * Sets the updated date of this PokerTable.
     *
     * @param updatedDate the updated date of this PokerTable
     */
    public void setUpdatedDate(Date updatedDate);

    @Override
    public boolean isNew();

    @Override
    public void setNew(boolean n);

    @Override
    public boolean isCachedModel();

    @Override
    public void setCachedModel(boolean cachedModel);

    @Override
    public boolean isEscapedModel();

    @Override
    public Serializable getPrimaryKeyObj();

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj);

    @Override
    public ExpandoBridge getExpandoBridge();

    @Override
    public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

    @Override
    public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext);

    @Override
    public Object clone();

    @Override
    public int compareTo(PokerTable pokerTable);

    @Override
    public int hashCode();

    @Override
    public CacheModel<PokerTable> toCacheModel();

    @Override
    public PokerTable toEscapedModel();

    @Override
    public PokerTable toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}