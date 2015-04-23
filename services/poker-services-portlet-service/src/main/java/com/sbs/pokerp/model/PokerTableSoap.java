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
public class PokerTableSoap implements Serializable {
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

    public PokerTableSoap() {
    }

    public static PokerTableSoap toSoapModel(PokerTable model) {
        PokerTableSoap soapModel = new PokerTableSoap();

        soapModel.setGameId(model.getGameId());
        soapModel.setOrgId(model.getOrgId());
        soapModel.setTableName(model.getTableName());
        soapModel.setPlayerCount(model.getPlayerCount());
        soapModel.setStatus(model.getStatus());
        soapModel.setNotes(model.getNotes());
        soapModel.setCreatedBy(model.getCreatedBy());
        soapModel.setCreatedDate(model.getCreatedDate());
        soapModel.setUpdatedBy(model.getUpdatedBy());
        soapModel.setUpdatedDate(model.getUpdatedDate());

        return soapModel;
    }

    public static PokerTableSoap[] toSoapModels(PokerTable[] models) {
        PokerTableSoap[] soapModels = new PokerTableSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static PokerTableSoap[][] toSoapModels(PokerTable[][] models) {
        PokerTableSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new PokerTableSoap[models.length][models[0].length];
        } else {
            soapModels = new PokerTableSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static PokerTableSoap[] toSoapModels(List<PokerTable> models) {
        List<PokerTableSoap> soapModels = new ArrayList<PokerTableSoap>(models.size());

        for (PokerTable model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new PokerTableSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _gameId;
    }

    public void setPrimaryKey(long pk) {
        setGameId(pk);
    }

    public long getGameId() {
        return _gameId;
    }

    public void setGameId(long gameId) {
        _gameId = gameId;
    }

    public long getOrgId() {
        return _orgId;
    }

    public void setOrgId(long orgId) {
        _orgId = orgId;
    }

    public String getTableName() {
        return _tableName;
    }

    public void setTableName(String tableName) {
        _tableName = tableName;
    }

    public int getPlayerCount() {
        return _playerCount;
    }

    public void setPlayerCount(int playerCount) {
        _playerCount = playerCount;
    }

    public int getStatus() {
        return _status;
    }

    public void setStatus(int status) {
        _status = status;
    }

    public String getNotes() {
        return _notes;
    }

    public void setNotes(String notes) {
        _notes = notes;
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
