package com.sbs.pokerp.model;

import com.sbs.pokerp.service.persistence.PokerTablePlayerPK;

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
public class PokerTablePlayerSoap implements Serializable {
    private long _gameId;
    private long _playerId;
    private Date _timeJoined;
    private Date _timeLeft;
    private double _amountWon;
    private String _createdBy;
    private Date _createdDate;
    private String _updatedBy;
    private Date _updatedDate;

    public PokerTablePlayerSoap() {
    }

    public static PokerTablePlayerSoap toSoapModel(PokerTablePlayer model) {
        PokerTablePlayerSoap soapModel = new PokerTablePlayerSoap();

        soapModel.setGameId(model.getGameId());
        soapModel.setPlayerId(model.getPlayerId());
        soapModel.setTimeJoined(model.getTimeJoined());
        soapModel.setTimeLeft(model.getTimeLeft());
        soapModel.setAmountWon(model.getAmountWon());
        soapModel.setCreatedBy(model.getCreatedBy());
        soapModel.setCreatedDate(model.getCreatedDate());
        soapModel.setUpdatedBy(model.getUpdatedBy());
        soapModel.setUpdatedDate(model.getUpdatedDate());

        return soapModel;
    }

    public static PokerTablePlayerSoap[] toSoapModels(PokerTablePlayer[] models) {
        PokerTablePlayerSoap[] soapModels = new PokerTablePlayerSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static PokerTablePlayerSoap[][] toSoapModels(
        PokerTablePlayer[][] models) {
        PokerTablePlayerSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new PokerTablePlayerSoap[models.length][models[0].length];
        } else {
            soapModels = new PokerTablePlayerSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static PokerTablePlayerSoap[] toSoapModels(
        List<PokerTablePlayer> models) {
        List<PokerTablePlayerSoap> soapModels = new ArrayList<PokerTablePlayerSoap>(models.size());

        for (PokerTablePlayer model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new PokerTablePlayerSoap[soapModels.size()]);
    }

    public PokerTablePlayerPK getPrimaryKey() {
        return new PokerTablePlayerPK(_gameId, _playerId);
    }

    public void setPrimaryKey(PokerTablePlayerPK pk) {
        setGameId(pk.gameId);
        setPlayerId(pk.playerId);
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

    public Date getTimeJoined() {
        return _timeJoined;
    }

    public void setTimeJoined(Date timeJoined) {
        _timeJoined = timeJoined;
    }

    public Date getTimeLeft() {
        return _timeLeft;
    }

    public void setTimeLeft(Date timeLeft) {
        _timeLeft = timeLeft;
    }

    public double getAmountWon() {
        return _amountWon;
    }

    public void setAmountWon(double amountWon) {
        _amountWon = amountWon;
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
