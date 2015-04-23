package com.sbs.pokerp.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.sbs.pokerp.service.ClpSerializer;
import com.sbs.pokerp.service.PokerTableLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class PokerTableClp extends BaseModelImpl<PokerTable>
    implements PokerTable {
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
    private BaseModel<?> _pokerTableRemoteModel;
    private Class<?> _clpSerializerClass = com.sbs.pokerp.service.ClpSerializer.class;

    public PokerTableClp() {
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

        if (_pokerTableRemoteModel != null) {
            try {
                Class<?> clazz = _pokerTableRemoteModel.getClass();

                Method method = clazz.getMethod("setGameId", long.class);

                method.invoke(_pokerTableRemoteModel, gameId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getOrgId() {
        return _orgId;
    }

    @Override
    public void setOrgId(long orgId) {
        _orgId = orgId;

        if (_pokerTableRemoteModel != null) {
            try {
                Class<?> clazz = _pokerTableRemoteModel.getClass();

                Method method = clazz.getMethod("setOrgId", long.class);

                method.invoke(_pokerTableRemoteModel, orgId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getTableName() {
        return _tableName;
    }

    @Override
    public void setTableName(String tableName) {
        _tableName = tableName;

        if (_pokerTableRemoteModel != null) {
            try {
                Class<?> clazz = _pokerTableRemoteModel.getClass();

                Method method = clazz.getMethod("setTableName", String.class);

                method.invoke(_pokerTableRemoteModel, tableName);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getPlayerCount() {
        return _playerCount;
    }

    @Override
    public void setPlayerCount(int playerCount) {
        _playerCount = playerCount;

        if (_pokerTableRemoteModel != null) {
            try {
                Class<?> clazz = _pokerTableRemoteModel.getClass();

                Method method = clazz.getMethod("setPlayerCount", int.class);

                method.invoke(_pokerTableRemoteModel, playerCount);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getStatus() {
        return _status;
    }

    @Override
    public void setStatus(int status) {
        _status = status;

        if (_pokerTableRemoteModel != null) {
            try {
                Class<?> clazz = _pokerTableRemoteModel.getClass();

                Method method = clazz.getMethod("setStatus", int.class);

                method.invoke(_pokerTableRemoteModel, status);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getNotes() {
        return _notes;
    }

    @Override
    public void setNotes(String notes) {
        _notes = notes;

        if (_pokerTableRemoteModel != null) {
            try {
                Class<?> clazz = _pokerTableRemoteModel.getClass();

                Method method = clazz.getMethod("setNotes", String.class);

                method.invoke(_pokerTableRemoteModel, notes);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getCreatedBy() {
        return _createdBy;
    }

    @Override
    public void setCreatedBy(String createdBy) {
        _createdBy = createdBy;

        if (_pokerTableRemoteModel != null) {
            try {
                Class<?> clazz = _pokerTableRemoteModel.getClass();

                Method method = clazz.getMethod("setCreatedBy", String.class);

                method.invoke(_pokerTableRemoteModel, createdBy);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getCreatedDate() {
        return _createdDate;
    }

    @Override
    public void setCreatedDate(Date createdDate) {
        _createdDate = createdDate;

        if (_pokerTableRemoteModel != null) {
            try {
                Class<?> clazz = _pokerTableRemoteModel.getClass();

                Method method = clazz.getMethod("setCreatedDate", Date.class);

                method.invoke(_pokerTableRemoteModel, createdDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getUpdatedBy() {
        return _updatedBy;
    }

    @Override
    public void setUpdatedBy(String updatedBy) {
        _updatedBy = updatedBy;

        if (_pokerTableRemoteModel != null) {
            try {
                Class<?> clazz = _pokerTableRemoteModel.getClass();

                Method method = clazz.getMethod("setUpdatedBy", String.class);

                method.invoke(_pokerTableRemoteModel, updatedBy);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getUpdatedDate() {
        return _updatedDate;
    }

    @Override
    public void setUpdatedDate(Date updatedDate) {
        _updatedDate = updatedDate;

        if (_pokerTableRemoteModel != null) {
            try {
                Class<?> clazz = _pokerTableRemoteModel.getClass();

                Method method = clazz.getMethod("setUpdatedDate", Date.class);

                method.invoke(_pokerTableRemoteModel, updatedDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getPokerTableRemoteModel() {
        return _pokerTableRemoteModel;
    }

    public void setPokerTableRemoteModel(BaseModel<?> pokerTableRemoteModel) {
        _pokerTableRemoteModel = pokerTableRemoteModel;
    }

    public Object invokeOnRemoteModel(String methodName,
        Class<?>[] parameterTypes, Object[] parameterValues)
        throws Exception {
        Object[] remoteParameterValues = new Object[parameterValues.length];

        for (int i = 0; i < parameterValues.length; i++) {
            if (parameterValues[i] != null) {
                remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
            }
        }

        Class<?> remoteModelClass = _pokerTableRemoteModel.getClass();

        ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

        Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

        for (int i = 0; i < parameterTypes.length; i++) {
            if (parameterTypes[i].isPrimitive()) {
                remoteParameterTypes[i] = parameterTypes[i];
            } else {
                String parameterTypeName = parameterTypes[i].getName();

                remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
            }
        }

        Method method = remoteModelClass.getMethod(methodName,
                remoteParameterTypes);

        Object returnValue = method.invoke(_pokerTableRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            PokerTableLocalServiceUtil.addPokerTable(this);
        } else {
            PokerTableLocalServiceUtil.updatePokerTable(this);
        }
    }

    @Override
    public PokerTable toEscapedModel() {
        return (PokerTable) ProxyUtil.newProxyInstance(PokerTable.class.getClassLoader(),
            new Class[] { PokerTable.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        PokerTableClp clone = new PokerTableClp();

        clone.setGameId(getGameId());
        clone.setOrgId(getOrgId());
        clone.setTableName(getTableName());
        clone.setPlayerCount(getPlayerCount());
        clone.setStatus(getStatus());
        clone.setNotes(getNotes());
        clone.setCreatedBy(getCreatedBy());
        clone.setCreatedDate(getCreatedDate());
        clone.setUpdatedBy(getUpdatedBy());
        clone.setUpdatedDate(getUpdatedDate());

        return clone;
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

        if (!(obj instanceof PokerTableClp)) {
            return false;
        }

        PokerTableClp pokerTable = (PokerTableClp) obj;

        long primaryKey = pokerTable.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    public Class<?> getClpSerializerClass() {
        return _clpSerializerClass;
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
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
