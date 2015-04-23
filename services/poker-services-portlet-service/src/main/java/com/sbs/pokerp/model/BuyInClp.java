package com.sbs.pokerp.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.sbs.pokerp.service.BuyInLocalServiceUtil;
import com.sbs.pokerp.service.ClpSerializer;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class BuyInClp extends BaseModelImpl<BuyIn> implements BuyIn {
    private long _transactionId;
    private long _gameId;
    private long _playerId;
    private double _amount;
    private boolean _credit;
    private String _createdBy;
    private Date _createdDate;
    private String _updatedBy;
    private Date _updatedDate;
    private BaseModel<?> _buyInRemoteModel;
    private Class<?> _clpSerializerClass = com.sbs.pokerp.service.ClpSerializer.class;

    public BuyInClp() {
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

    @Override
    public long getTransactionId() {
        return _transactionId;
    }

    @Override
    public void setTransactionId(long transactionId) {
        _transactionId = transactionId;

        if (_buyInRemoteModel != null) {
            try {
                Class<?> clazz = _buyInRemoteModel.getClass();

                Method method = clazz.getMethod("setTransactionId", long.class);

                method.invoke(_buyInRemoteModel, transactionId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getGameId() {
        return _gameId;
    }

    @Override
    public void setGameId(long gameId) {
        _gameId = gameId;

        if (_buyInRemoteModel != null) {
            try {
                Class<?> clazz = _buyInRemoteModel.getClass();

                Method method = clazz.getMethod("setGameId", long.class);

                method.invoke(_buyInRemoteModel, gameId);
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

        if (_buyInRemoteModel != null) {
            try {
                Class<?> clazz = _buyInRemoteModel.getClass();

                Method method = clazz.getMethod("setPlayerId", long.class);

                method.invoke(_buyInRemoteModel, playerId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public double getAmount() {
        return _amount;
    }

    @Override
    public void setAmount(double amount) {
        _amount = amount;

        if (_buyInRemoteModel != null) {
            try {
                Class<?> clazz = _buyInRemoteModel.getClass();

                Method method = clazz.getMethod("setAmount", double.class);

                method.invoke(_buyInRemoteModel, amount);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public boolean getCredit() {
        return _credit;
    }

    @Override
    public boolean isCredit() {
        return _credit;
    }

    @Override
    public void setCredit(boolean credit) {
        _credit = credit;

        if (_buyInRemoteModel != null) {
            try {
                Class<?> clazz = _buyInRemoteModel.getClass();

                Method method = clazz.getMethod("setCredit", boolean.class);

                method.invoke(_buyInRemoteModel, credit);
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

        if (_buyInRemoteModel != null) {
            try {
                Class<?> clazz = _buyInRemoteModel.getClass();

                Method method = clazz.getMethod("setCreatedBy", String.class);

                method.invoke(_buyInRemoteModel, createdBy);
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

        if (_buyInRemoteModel != null) {
            try {
                Class<?> clazz = _buyInRemoteModel.getClass();

                Method method = clazz.getMethod("setCreatedDate", Date.class);

                method.invoke(_buyInRemoteModel, createdDate);
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

        if (_buyInRemoteModel != null) {
            try {
                Class<?> clazz = _buyInRemoteModel.getClass();

                Method method = clazz.getMethod("setUpdatedBy", String.class);

                method.invoke(_buyInRemoteModel, updatedBy);
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

        if (_buyInRemoteModel != null) {
            try {
                Class<?> clazz = _buyInRemoteModel.getClass();

                Method method = clazz.getMethod("setUpdatedDate", Date.class);

                method.invoke(_buyInRemoteModel, updatedDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getBuyInRemoteModel() {
        return _buyInRemoteModel;
    }

    public void setBuyInRemoteModel(BaseModel<?> buyInRemoteModel) {
        _buyInRemoteModel = buyInRemoteModel;
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

        Class<?> remoteModelClass = _buyInRemoteModel.getClass();

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

        Object returnValue = method.invoke(_buyInRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            BuyInLocalServiceUtil.addBuyIn(this);
        } else {
            BuyInLocalServiceUtil.updateBuyIn(this);
        }
    }

    @Override
    public BuyIn toEscapedModel() {
        return (BuyIn) ProxyUtil.newProxyInstance(BuyIn.class.getClassLoader(),
            new Class[] { BuyIn.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        BuyInClp clone = new BuyInClp();

        clone.setTransactionId(getTransactionId());
        clone.setGameId(getGameId());
        clone.setPlayerId(getPlayerId());
        clone.setAmount(getAmount());
        clone.setCredit(getCredit());
        clone.setCreatedBy(getCreatedBy());
        clone.setCreatedDate(getCreatedDate());
        clone.setUpdatedBy(getUpdatedBy());
        clone.setUpdatedDate(getUpdatedDate());

        return clone;
    }

    @Override
    public int compareTo(BuyIn buyIn) {
        int value = 0;

        value = DateUtil.compareTo(getCreatedDate(), buyIn.getCreatedDate());

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

        if (!(obj instanceof BuyInClp)) {
            return false;
        }

        BuyInClp buyIn = (BuyInClp) obj;

        long primaryKey = buyIn.getPrimaryKey();

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
        StringBundler sb = new StringBundler(19);

        sb.append("{transactionId=");
        sb.append(getTransactionId());
        sb.append(", gameId=");
        sb.append(getGameId());
        sb.append(", playerId=");
        sb.append(getPlayerId());
        sb.append(", amount=");
        sb.append(getAmount());
        sb.append(", credit=");
        sb.append(getCredit());
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
        sb.append("com.sbs.pokerp.model.BuyIn");
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
            "<column><column-name>credit</column-name><column-value><![CDATA[");
        sb.append(getCredit());
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
