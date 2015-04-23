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

import com.sbs.pokerp.model.BuyOut;
import com.sbs.pokerp.model.BuyOutModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the BuyOut service. Represents a row in the &quot;pokerp_BuyOut&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.sbs.pokerp.model.BuyOutModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link BuyOutImpl}.
 * </p>
 *
 * @author jpnaidu
 * @see BuyOutImpl
 * @see com.sbs.pokerp.model.BuyOut
 * @see com.sbs.pokerp.model.BuyOutModel
 * @generated
 */
public class BuyOutModelImpl extends BaseModelImpl<BuyOut>
    implements BuyOutModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a BuyOut model instance should use the {@link com.sbs.pokerp.model.BuyOut} interface instead.
     */
    public static final String TABLE_NAME = "pokerp_BuyOut";
    public static final Object[][] TABLE_COLUMNS = {
            { "transactionId", Types.BIGINT },
            { "gameId", Types.BIGINT },
            { "playerId", Types.BIGINT },
            { "amount", Types.DOUBLE },
            { "createdBy", Types.VARCHAR },
            { "createdDate", Types.TIMESTAMP },
            { "updatedBy", Types.VARCHAR },
            { "updatedDate", Types.TIMESTAMP }
        };
    public static final String TABLE_SQL_CREATE = "create table pokerp_BuyOut (transactionId LONG not null primary key,gameId LONG,playerId LONG,amount DOUBLE,createdBy VARCHAR(75) null,createdDate DATE null,updatedBy VARCHAR(75) null,updatedDate DATE null)";
    public static final String TABLE_SQL_DROP = "drop table pokerp_BuyOut";
    public static final String ORDER_BY_JPQL = " ORDER BY buyOut.createdDate ASC";
    public static final String ORDER_BY_SQL = " ORDER BY pokerp_BuyOut.createdDate ASC";
    public static final String DATA_SOURCE = "liferayDataSource";
    public static final String SESSION_FACTORY = "liferaySessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.com.sbs.pokerp.model.BuyOut"),
            true);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.com.sbs.pokerp.model.BuyOut"),
            true);
    public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.column.bitmask.enabled.com.sbs.pokerp.model.BuyOut"),
            true);
    public static long GAMEID_COLUMN_BITMASK = 1L;
    public static long PLAYERID_COLUMN_BITMASK = 2L;
    public static long CREATEDDATE_COLUMN_BITMASK = 4L;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.com.sbs.pokerp.model.BuyOut"));
    private static ClassLoader _classLoader = BuyOut.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] { BuyOut.class };
    private long _transactionId;
    private long _gameId;
    private long _originalGameId;
    private boolean _setOriginalGameId;
    private long _playerId;
    private long _originalPlayerId;
    private boolean _setOriginalPlayerId;
    private double _amount;
    private String _createdBy;
    private Date _createdDate;
    private String _updatedBy;
    private Date _updatedDate;
    private long _columnBitmask;
    private BuyOut _escapedModel;

    public BuyOutModelImpl() {
    }

    @Override
    public long getPrimaryKey() {
        return _transactionId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setTransactionId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _transactionId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
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

    @Override
    public long getTransactionId() {
        return _transactionId;
    }

    @Override
    public void setTransactionId(long transactionId) {
        _transactionId = transactionId;
    }

    @Override
    public long getGameId() {
        return _gameId;
    }

    @Override
    public void setGameId(long gameId) {
        _columnBitmask |= GAMEID_COLUMN_BITMASK;

        if (!_setOriginalGameId) {
            _setOriginalGameId = true;

            _originalGameId = _gameId;
        }

        _gameId = gameId;
    }

    public long getOriginalGameId() {
        return _originalGameId;
    }

    @Override
    public long getPlayerId() {
        return _playerId;
    }

    @Override
    public void setPlayerId(long playerId) {
        _columnBitmask |= PLAYERID_COLUMN_BITMASK;

        if (!_setOriginalPlayerId) {
            _setOriginalPlayerId = true;

            _originalPlayerId = _playerId;
        }

        _playerId = playerId;
    }

    public long getOriginalPlayerId() {
        return _originalPlayerId;
    }

    @Override
    public double getAmount() {
        return _amount;
    }

    @Override
    public void setAmount(double amount) {
        _amount = amount;
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
        _columnBitmask = -1L;

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

    public long getColumnBitmask() {
        return _columnBitmask;
    }

    @Override
    public ExpandoBridge getExpandoBridge() {
        return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
            BuyOut.class.getName(), getPrimaryKey());
    }

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
        ExpandoBridge expandoBridge = getExpandoBridge();

        expandoBridge.setAttributes(serviceContext);
    }

    @Override
    public BuyOut toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (BuyOut) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        BuyOutImpl buyOutImpl = new BuyOutImpl();

        buyOutImpl.setTransactionId(getTransactionId());
        buyOutImpl.setGameId(getGameId());
        buyOutImpl.setPlayerId(getPlayerId());
        buyOutImpl.setAmount(getAmount());
        buyOutImpl.setCreatedBy(getCreatedBy());
        buyOutImpl.setCreatedDate(getCreatedDate());
        buyOutImpl.setUpdatedBy(getUpdatedBy());
        buyOutImpl.setUpdatedDate(getUpdatedDate());

        buyOutImpl.resetOriginalValues();

        return buyOutImpl;
    }

    @Override
    public int compareTo(BuyOut buyOut) {
        int value = 0;

        value = DateUtil.compareTo(getCreatedDate(), buyOut.getCreatedDate());

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

        if (!(obj instanceof BuyOut)) {
            return false;
        }

        BuyOut buyOut = (BuyOut) obj;

        long primaryKey = buyOut.getPrimaryKey();

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
        BuyOutModelImpl buyOutModelImpl = this;

        buyOutModelImpl._originalGameId = buyOutModelImpl._gameId;

        buyOutModelImpl._setOriginalGameId = false;

        buyOutModelImpl._originalPlayerId = buyOutModelImpl._playerId;

        buyOutModelImpl._setOriginalPlayerId = false;

        buyOutModelImpl._columnBitmask = 0;
    }

    @Override
    public CacheModel<BuyOut> toCacheModel() {
        BuyOutCacheModel buyOutCacheModel = new BuyOutCacheModel();

        buyOutCacheModel.transactionId = getTransactionId();

        buyOutCacheModel.gameId = getGameId();

        buyOutCacheModel.playerId = getPlayerId();

        buyOutCacheModel.amount = getAmount();

        buyOutCacheModel.createdBy = getCreatedBy();

        String createdBy = buyOutCacheModel.createdBy;

        if ((createdBy != null) && (createdBy.length() == 0)) {
            buyOutCacheModel.createdBy = null;
        }

        Date createdDate = getCreatedDate();

        if (createdDate != null) {
            buyOutCacheModel.createdDate = createdDate.getTime();
        } else {
            buyOutCacheModel.createdDate = Long.MIN_VALUE;
        }

        buyOutCacheModel.updatedBy = getUpdatedBy();

        String updatedBy = buyOutCacheModel.updatedBy;

        if ((updatedBy != null) && (updatedBy.length() == 0)) {
            buyOutCacheModel.updatedBy = null;
        }

        Date updatedDate = getUpdatedDate();

        if (updatedDate != null) {
            buyOutCacheModel.updatedDate = updatedDate.getTime();
        } else {
            buyOutCacheModel.updatedDate = Long.MIN_VALUE;
        }

        return buyOutCacheModel;
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(17);

        sb.append("{transactionId=");
        sb.append(getTransactionId());
        sb.append(", gameId=");
        sb.append(getGameId());
        sb.append(", playerId=");
        sb.append(getPlayerId());
        sb.append(", amount=");
        sb.append(getAmount());
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
        StringBundler sb = new StringBundler(28);

        sb.append("<model><model-name>");
        sb.append("com.sbs.pokerp.model.BuyOut");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>transactionId</column-name><column-value><![CDATA[");
        sb.append(getTransactionId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>gameId</column-name><column-value><![CDATA[");
        sb.append(getGameId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>playerId</column-name><column-value><![CDATA[");
        sb.append(getPlayerId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>amount</column-name><column-value><![CDATA[");
        sb.append(getAmount());
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