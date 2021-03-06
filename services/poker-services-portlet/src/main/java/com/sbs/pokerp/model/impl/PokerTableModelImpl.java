package com.sbs.pokerp.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import com.sbs.pokerp.model.PokerTable;
import com.sbs.pokerp.model.PokerTableModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the PokerTable service. Represents a row in the &quot;pokerp_PokerTable&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.sbs.pokerp.model.PokerTableModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link PokerTableImpl}.
 * </p>
 *
 * @author jpnaidu
 * @see PokerTableImpl
 * @see com.sbs.pokerp.model.PokerTable
 * @see com.sbs.pokerp.model.PokerTableModel
 * @generated
 */
public class PokerTableModelImpl extends BaseModelImpl<PokerTable>
    implements PokerTableModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a PokerTable model instance should use the {@link com.sbs.pokerp.model.PokerTable} interface instead.
     */
    public static final String TABLE_NAME = "pokerp_PokerTable";
    public static final Object[][] TABLE_COLUMNS = {
            { "gameId", Types.BIGINT },
            { "orgId", Types.BIGINT },
            { "tableName", Types.VARCHAR },
            { "playerCount", Types.INTEGER },
            { "status", Types.INTEGER },
            { "notes", Types.VARCHAR },
            { "createdBy", Types.VARCHAR },
            { "createdDate", Types.TIMESTAMP },
            { "updatedBy", Types.VARCHAR },
            { "updatedDate", Types.TIMESTAMP }
        };
    public static final String TABLE_SQL_CREATE = "create table pokerp_PokerTable (gameId LONG not null primary key,orgId LONG,tableName VARCHAR(75) null,playerCount INTEGER,status INTEGER,notes VARCHAR(75) null,createdBy VARCHAR(75) null,createdDate DATE null,updatedBy VARCHAR(75) null,updatedDate DATE null)";
    public static final String TABLE_SQL_DROP = "drop table pokerp_PokerTable";
    public static final String ORDER_BY_JPQL = " ORDER BY pokerTable.gameId ASC, pokerTable.createdDate ASC";
    public static final String ORDER_BY_SQL = " ORDER BY pokerp_PokerTable.gameId ASC, pokerp_PokerTable.createdDate ASC";
    public static final String DATA_SOURCE = "liferayDataSource";
    public static final String SESSION_FACTORY = "liferaySessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.com.sbs.pokerp.model.PokerTable"),
            true);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.com.sbs.pokerp.model.PokerTable"),
            true);
    public static final boolean COLUMN_BITMASK_ENABLED = false;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.com.sbs.pokerp.model.PokerTable"));
    private static ClassLoader _classLoader = PokerTable.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] {
            PokerTable.class
        };
    private long _gameId;
    private long _orgId;
    private String _tableName;
    private int _playerCount;
    private int _status;
    private String _notes;
    private String _createdBy;
    private Date _createdDate;
    private String _updatedBy;
    private Date _updatedDate;
    private PokerTable _escapedModel;

    public PokerTableModelImpl() {
    }

    @Override
    public long getPrimaryKey() {
        return _gameId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setGameId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _gameId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
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

    @Override
    public long getGameId() {
        return _gameId;
    }

    @Override
    public void setGameId(long gameId) {
        _gameId = gameId;
    }

    @Override
    public long getOrgId() {
        return _orgId;
    }

    @Override
    public void setOrgId(long orgId) {
        _orgId = orgId;
    }

    @Override
    public String getTableName() {
        if (_tableName == null) {
            return StringPool.BLANK;
        } else {
            return _tableName;
        }
    }

    @Override
    public void setTableName(String tableName) {
        _tableName = tableName;
    }

    @Override
    public int getPlayerCount() {
        return _playerCount;
    }

    @Override
    public void setPlayerCount(int playerCount) {
        _playerCount = playerCount;
    }

    @Override
    public int getStatus() {
        return _status;
    }

    @Override
    public void setStatus(int status) {
        _status = status;
    }

    @Override
    public String getNotes() {
        if (_notes == null) {
            return StringPool.BLANK;
        } else {
            return _notes;
        }
    }

    @Override
    public void setNotes(String notes) {
        _notes = notes;
    }

    @Override
    public String getCreatedBy() {
        if (_createdBy == null) {
            return StringPool.BLANK;
        } else {
            return _createdBy;
        }
    }

    @Override
    public void setCreatedBy(String createdBy) {
        _createdBy = createdBy;
    }

    @Override
    public Date getCreatedDate() {
        return _createdDate;
    }

    @Override
    public void setCreatedDate(Date createdDate) {
        _createdDate = createdDate;
    }

    @Override
    public String getUpdatedBy() {
        if (_updatedBy == null) {
            return StringPool.BLANK;
        } else {
            return _updatedBy;
        }
    }

    @Override
    public void setUpdatedBy(String updatedBy) {
        _updatedBy = updatedBy;
    }

    @Override
    public Date getUpdatedDate() {
        return _updatedDate;
    }

    @Override
    public void setUpdatedDate(Date updatedDate) {
        _updatedDate = updatedDate;
    }

    @Override
    public ExpandoBridge getExpandoBridge() {
        return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
            PokerTable.class.getName(), getPrimaryKey());
    }

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
        ExpandoBridge expandoBridge = getExpandoBridge();

        expandoBridge.setAttributes(serviceContext);
    }

    @Override
    public PokerTable toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (PokerTable) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        PokerTableImpl pokerTableImpl = new PokerTableImpl();

        pokerTableImpl.setGameId(getGameId());
        pokerTableImpl.setOrgId(getOrgId());
        pokerTableImpl.setTableName(getTableName());
        pokerTableImpl.setPlayerCount(getPlayerCount());
        pokerTableImpl.setStatus(getStatus());
        pokerTableImpl.setNotes(getNotes());
        pokerTableImpl.setCreatedBy(getCreatedBy());
        pokerTableImpl.setCreatedDate(getCreatedDate());
        pokerTableImpl.setUpdatedBy(getUpdatedBy());
        pokerTableImpl.setUpdatedDate(getUpdatedDate());

        pokerTableImpl.resetOriginalValues();

        return pokerTableImpl;
    }

    @Override
    public int compareTo(PokerTable pokerTable) {
        int value = 0;

        if (getGameId() < pokerTable.getGameId()) {
            value = -1;
        } else if (getGameId() > pokerTable.getGameId()) {
            value = 1;
        } else {
            value = 0;
        }

        if (value != 0) {
            return value;
        }

        value = DateUtil.compareTo(getCreatedDate(), pokerTable.getCreatedDate());

        if (value != 0) {
            return value;
        }

        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof PokerTable)) {
            return false;
        }

        PokerTable pokerTable = (PokerTable) obj;

        long primaryKey = pokerTable.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public void resetOriginalValues() {
    }

    @Override
    public CacheModel<PokerTable> toCacheModel() {
        PokerTableCacheModel pokerTableCacheModel = new PokerTableCacheModel();

        pokerTableCacheModel.gameId = getGameId();

        pokerTableCacheModel.orgId = getOrgId();

        pokerTableCacheModel.tableName = getTableName();

        String tableName = pokerTableCacheModel.tableName;

        if ((tableName != null) && (tableName.length() == 0)) {
            pokerTableCacheModel.tableName = null;
        }

        pokerTableCacheModel.playerCount = getPlayerCount();

        pokerTableCacheModel.status = getStatus();

        pokerTableCacheModel.notes = getNotes();

        String notes = pokerTableCacheModel.notes;

        if ((notes != null) && (notes.length() == 0)) {
            pokerTableCacheModel.notes = null;
        }

        pokerTableCacheModel.createdBy = getCreatedBy();

        String createdBy = pokerTableCacheModel.createdBy;

        if ((createdBy != null) && (createdBy.length() == 0)) {
            pokerTableCacheModel.createdBy = null;
        }

        Date createdDate = getCreatedDate();

        if (createdDate != null) {
            pokerTableCacheModel.createdDate = createdDate.getTime();
        } else {
            pokerTableCacheModel.createdDate = Long.MIN_VALUE;
        }

        pokerTableCacheModel.updatedBy = getUpdatedBy();

        String updatedBy = pokerTableCacheModel.updatedBy;

        if ((updatedBy != null) && (updatedBy.length() == 0)) {
            pokerTableCacheModel.updatedBy = null;
        }

        Date updatedDate = getUpdatedDate();

        if (updatedDate != null) {
            pokerTableCacheModel.updatedDate = updatedDate.getTime();
        } else {
            pokerTableCacheModel.updatedDate = Long.MIN_VALUE;
        }

        return pokerTableCacheModel;
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(21);

        sb.append("{gameId=");
        sb.append(getGameId());
        sb.append(", orgId=");
        sb.append(getOrgId());
        sb.append(", tableName=");
        sb.append(getTableName());
        sb.append(", playerCount=");
        sb.append(getPlayerCount());
        sb.append(", status=");
        sb.append(getStatus());
        sb.append(", notes=");
        sb.append(getNotes());
        sb.append(", createdBy=");
        sb.append(getCreatedBy());
        sb.append(", createdDate=");
        sb.append(getCreatedDate());
        sb.append(", updatedBy=");
        sb.append(getUpdatedBy());
        sb.append(", updatedDate=");
        sb.append(getUpdatedDate());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(34);

        sb.append("<model><model-name>");
        sb.append("com.sbs.pokerp.model.PokerTable");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>gameId</column-name><column-value><![CDATA[");
        sb.append(getGameId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>orgId</column-name><column-value><![CDATA[");
        sb.append(getOrgId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>tableName</column-name><column-value><![CDATA[");
        sb.append(getTableName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>playerCount</column-name><column-value><![CDATA[");
        sb.append(getPlayerCount());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>status</column-name><column-value><![CDATA[");
        sb.append(getStatus());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>notes</column-name><column-value><![CDATA[");
        sb.append(getNotes());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>createdBy</column-name><column-value><![CDATA[");
        sb.append(getCreatedBy());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>createdDate</column-name><column-value><![CDATA[");
        sb.append(getCreatedDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>updatedBy</column-name><column-value><![CDATA[");
        sb.append(getUpdatedBy());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>updatedDate</column-name><column-value><![CDATA[");
        sb.append(getUpdatedDate());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
