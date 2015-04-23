package com.sbs.pokerp.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.sbs.pokerp.service.ClpSerializer;
import com.sbs.pokerp.service.PokerTablePlayerLocalServiceUtil;
import com.sbs.pokerp.service.persistence.PokerTablePlayerPK;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class PokerTablePlayerClp extends BaseModelImpl<PokerTablePlayer>
    implements PokerTablePlayer {
    private long _gameId;
    private long _playerId;
    private Date _timeJoined;
    private Date _timeLeft;
    private double _amountWon;
    private String _createdBy;
    private Date _createdDate;
    private String _updatedBy;
    private Date _updatedDate;
    private BaseModel<?> _pokerTablePlayerRemoteModel;
    private Class<?> _clpSerializerClass = com.sbs.pokerp.service.ClpSerializer.class;

    public PokerTablePlayerClp() {
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
    public PokerTablePlayerPK getPrimaryKey() {
        return new PokerTablePlayerPK(_gameId, _playerId);
    }

    @Override
    public void setPrimaryKey(PokerTablePlayerPK primaryKey) {
        setGameId(primaryKey.gameId);
        setPlayerId(primaryKey.playerId);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return new PokerTablePlayerPK(_gameId, _playerId);
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey((PokerTablePlayerPK) primaryKeyObj);
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

    @Override
    public long getGameId() {
        return _gameId;
    }

    @Override
    public void setGameId(long gameId) {
        _gameId = gameId;

        if (_pokerTablePlayerRemoteModel != null) {
            try {
                Class<?> clazz = _pokerTablePlayerRemoteModel.getClass();

                Method method = clazz.getMethod("setGameId", long.class);

                method.invoke(_pokerTablePlayerRemoteModel, gameId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getPlayerId() {
        return _playerId;
    }

    @Override
    public void setPlayerId(long playerId) {
        _playerId = playerId;

        if (_pokerTablePlayerRemoteModel != null) {
            try {
                Class<?> clazz = _pokerTablePlayerRemoteModel.getClass();

                Method method = clazz.getMethod("setPlayerId", long.class);

                method.invoke(_pokerTablePlayerRemoteModel, playerId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getTimeJoined() {
        return _timeJoined;
    }

    @Override
    public void setTimeJoined(Date timeJoined) {
        _timeJoined = timeJoined;

        if (_pokerTablePlayerRemoteModel != null) {
            try {
                Class<?> clazz = _pokerTablePlayerRemoteModel.getClass();

                Method method = clazz.getMethod("setTimeJoined", Date.class);

                method.invoke(_pokerTablePlayerRemoteModel, timeJoined);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getTimeLeft() {
        return _timeLeft;
    }

    @Override
    public void setTimeLeft(Date timeLeft) {
        _timeLeft = timeLeft;

        if (_pokerTablePlayerRemoteModel != null) {
            try {
                Class<?> clazz = _pokerTablePlayerRemoteModel.getClass();

                Method method = clazz.getMethod("setTimeLeft", Date.class);

                method.invoke(_pokerTablePlayerRemoteModel, timeLeft);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public double getAmountWon() {
        return _amountWon;
    }

    @Override
    public void setAmountWon(double amountWon) {
        _amountWon = amountWon;

        if (_pokerTablePlayerRemoteModel != null) {
            try {
                Class<?> clazz = _pokerTablePlayerRemoteModel.getClass();

                Method method = clazz.getMethod("setAmountWon", double.class);

                method.invoke(_pokerTablePlayerRemoteModel, amountWon);
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

        if (_pokerTablePlayerRemoteModel != null) {
            try {
                Class<?> clazz = _pokerTablePlayerRemoteModel.getClass();

                Method method = clazz.getMethod("setCreatedBy", String.class);

                method.invoke(_pokerTablePlayerRemoteModel, createdBy);
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

        if (_pokerTablePlayerRemoteModel != null) {
            try {
                Class<?> clazz = _pokerTablePlayerRemoteModel.getClass();

                Method method = clazz.getMethod("setCreatedDate", Date.class);

                method.invoke(_pokerTablePlayerRemoteModel, createdDate);
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

        if (_pokerTablePlayerRemoteModel != null) {
            try {
                Class<?> clazz = _pokerTablePlayerRemoteModel.getClass();

                Method method = clazz.getMethod("setUpdatedBy", String.class);

                method.invoke(_pokerTablePlayerRemoteModel, updatedBy);
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

        if (_pokerTablePlayerRemoteModel != null) {
            try {
                Class<?> clazz = _pokerTablePlayerRemoteModel.getClass();

                Method method = clazz.getMethod("setUpdatedDate", Date.class);

                method.invoke(_pokerTablePlayerRemoteModel, updatedDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getPokerTablePlayerRemoteModel() {
        return _pokerTablePlayerRemoteModel;
    }

    public void setPokerTablePlayerRemoteModel(
        BaseModel<?> pokerTablePlayerRemoteModel) {
        _pokerTablePlayerRemoteModel = pokerTablePlayerRemoteModel;
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

        Class<?> remoteModelClass = _pokerTablePlayerRemoteModel.getClass();

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

        Object returnValue = method.invoke(_pokerTablePlayerRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            PokerTablePlayerLocalServiceUtil.addPokerTablePlayer(this);
        } else {
            PokerTablePlayerLocalServiceUtil.updatePokerTablePlayer(this);
        }
    }

    @Override
    public PokerTablePlayer toEscapedModel() {
        return (PokerTablePlayer) ProxyUtil.newProxyInstance(PokerTablePlayer.class.getClassLoader(),
            new Class[] { PokerTablePlayer.class },
            new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        PokerTablePlayerClp clone = new PokerTablePlayerClp();

        clone.setGameId(getGameId());
        clone.setPlayerId(getPlayerId());
        clone.setTimeJoined(getTimeJoined());
        clone.setTimeLeft(getTimeLeft());
        clone.setAmountWon(getAmountWon());
        clone.setCreatedBy(getCreatedBy());
        clone.setCreatedDate(getCreatedDate());
        clone.setUpdatedBy(getUpdatedBy());
        clone.setUpdatedDate(getUpdatedDate());

        return clone;
    }

    @Override
    public int compareTo(PokerTablePlayer pokerTablePlayer) {
        int value = 0;

        value = DateUtil.compareTo(getCreatedDate(),
                pokerTablePlayer.getCreatedDate());

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

        if (!(obj instanceof PokerTablePlayerClp)) {
            return false;
        }

        PokerTablePlayerClp pokerTablePlayer = (PokerTablePlayerClp) obj;

        PokerTablePlayerPK primaryKey = pokerTablePlayer.getPrimaryKey();

        if (getPrimaryKey().equals(primaryKey)) {
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
        return getPrimaryKey().hashCode();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(19);

        sb.append("{gameId=");
        sb.append(getGameId());
        sb.append(", playerId=");
        sb.append(getPlayerId());
        sb.append(", timeJoined=");
        sb.append(getTimeJoined());
        sb.append(", timeLeft=");
        sb.append(getTimeLeft());
        sb.append(", amountWon=");
        sb.append(getAmountWon());
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
        StringBundler sb = new StringBundler(31);

        sb.append("<model><model-name>");
        sb.append("com.sbs.pokerp.model.PokerTablePlayer");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>gameId</column-name><column-value><![CDATA[");
        sb.append(getGameId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>playerId</column-name><column-value><![CDATA[");
        sb.append(getPlayerId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>timeJoined</column-name><column-value><![CDATA[");
        sb.append(getTimeJoined());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>timeLeft</column-name><column-value><![CDATA[");
        sb.append(getTimeLeft());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>amountWon</column-name><column-value><![CDATA[");
        sb.append(getAmountWon());
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
