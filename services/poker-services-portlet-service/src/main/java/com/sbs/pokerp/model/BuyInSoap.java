package com.sbs.pokerp.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author jpnaidu
 * @generated
 */
public class BuyInSoap implements Serializable {
    private long _transactionId;
    private long _gameId;
    private long _playerId;
    private double _amount;
    private boolean _credit;
    private String _createdBy;
    private Date _createdDate;
    private String _updatedBy;
    private Date _updatedDate;

    public BuyInSoap() {
    }

    public static BuyInSoap toSoapModel(BuyIn model) {
        BuyInSoap soapModel = new BuyInSoap();

        soapModel.setTransactionId(model.getTransactionId());
        soapModel.setGameId(model.getGameId());
        soapModel.setPlayerId(model.getPlayerId());
        soapModel.setAmount(model.getAmount());
        soapModel.setCredit(model.getCredit());
        soapModel.setCreatedBy(model.getCreatedBy());
        soapModel.setCreatedDate(model.getCreatedDate());
        soapModel.setUpdatedBy(model.getUpdatedBy());
        soapModel.setUpdatedDate(model.getUpdatedDate());

        return soapModel;
    }

    public static BuyInSoap[] toSoapModels(BuyIn[] models) {
        BuyInSoap[] soapModels = new BuyInSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static BuyInSoap[][] toSoapModels(BuyIn[][] models) {
        BuyInSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new BuyInSoap[models.length][models[0].length];
        } else {
            soapModels = new BuyInSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static BuyInSoap[] toSoapModels(List<BuyIn> models) {
        List<BuyInSoap> soapModels = new ArrayList<BuyInSoap>(models.size());

        for (BuyIn model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new BuyInSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _transactionId;
    }

    public void setPrimaryKey(long pk) {
        setTransactionId(pk);
    }

    public long getTransactionId() {
        return _transactionId;
    }

    public void setTransactionId(long transactionId) {
        _transactionId = transactionId;
    }

    public long getGameId() {
        return _gameId;
    }

    public void setGameId(long gameId) {
        _gameId = gameId;
    }

    public long getPlayerId() {
        return _playerId;
    }

    public void setPlayerId(long playerId) {
        _playerId = playerId;
    }

    public double getAmount() {
        return _amount;
    }

    public void setAmount(double amount) {
        _amount = amount;
    }

    public boolean getCredit() {
        return _credit;
    }

    public boolean isCredit() {
        return _credit;
    }

    public void setCredit(boolean credit) {
        _credit = credit;
    }

    public String getCreatedBy() {
        return _createdBy;
    }

    public void setCreatedBy(String createdBy) {
        _createdBy = createdBy;
    }

    public Date getCreatedDate() {
        return _createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        _createdDate = createdDate;
    }

    public String getUpdatedBy() {
        return _updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        _updatedBy = updatedBy;
    }

    public Date getUpdatedDate() {
        return _updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        _updatedDate = updatedDate;
    }
}
