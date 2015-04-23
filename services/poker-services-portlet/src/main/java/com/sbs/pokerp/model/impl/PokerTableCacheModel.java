package com.sbs.pokerp.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.sbs.pokerp.model.PokerTable;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing PokerTable in entity cache.
 *
 * @author jpnaidu
 * @see PokerTable
 * @generated
 */
public class PokerTableCacheModel implements CacheModel<PokerTable>,
    Externalizable {
    public long gameId;
    public long orgId;
    public String tableName;
    public int playerCount;
    public int status;
    public String notes;
    public String createdBy;
    public long createdDate;
    public String updatedBy;
    public long updatedDate;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(21);

        sb.append("{gameId=");
        sb.append(gameId);
        sb.append(", orgId=");
        sb.append(orgId);
        sb.append(", tableName=");
        sb.append(tableName);
        sb.append(", playerCount=");
        sb.append(playerCount);
        sb.append(", status=");
        sb.append(status);
        sb.append(", notes=");
        sb.append(notes);
        sb.append(", createdBy=");
        sb.append(createdBy);
        sb.append(", createdDate=");
        sb.append(createdDate);
        sb.append(", updatedBy=");
        sb.append(updatedBy);
        sb.append(", updatedDate=");
        sb.append(updatedDate);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public PokerTable toEntityModel() {
        PokerTableImpl pokerTableImpl = new PokerTableImpl();

        pokerTableImpl.setGameId(gameId);
        pokerTableImpl.setOrgId(orgId);

        if (tableName == null) {
            pokerTableImpl.setTableName(StringPool.BLANK);
        } else {
            pokerTableImpl.setTableName(tableName);
        }

        pokerTableImpl.setPlayerCount(playerCount);
        pokerTableImpl.setStatus(status);

        if (notes == null) {
            pokerTableImpl.setNotes(StringPool.BLANK);
        } else {
            pokerTableImpl.setNotes(notes);
        }

        if (createdBy == null) {
            pokerTableImpl.setCreatedBy(StringPool.BLANK);
        } else {
            pokerTableImpl.setCreatedBy(createdBy);
        }

        if (createdDate == Long.MIN_VALUE) {
            pokerTableImpl.setCreatedDate(null);
        } else {
            pokerTableImpl.setCreatedDate(new Date(createdDate));
        }

        if (updatedBy == null) {
            pokerTableImpl.setUpdatedBy(StringPool.BLANK);
        } else {
            pokerTableImpl.setUpdatedBy(updatedBy);
        }

        if (updatedDate == Long.MIN_VALUE) {
            pokerTableImpl.setUpdatedDate(null);
        } else {
            pokerTableImpl.setUpdatedDate(new Date(updatedDate));
        }

        pokerTableImpl.resetOriginalValues();

        return pokerTableImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        gameId = objectInput.readLong();
        orgId = objectInput.readLong();
        tableName = objectInput.readUTF();
        playerCount = objectInput.readInt();
        status = objectInput.readInt();
        notes = objectInput.readUTF();
        createdBy = objectInput.readUTF();
        createdDate = objectInput.readLong();
        updatedBy = objectInput.readUTF();
        updatedDate = objectInput.readLong();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(gameId);
        objectOutput.writeLong(orgId);

        if (tableName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(tableName);
        }

        objectOutput.writeInt(playerCount);
        objectOutput.writeInt(status);

        if (notes == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(notes);
        }

        if (createdBy == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(createdBy);
        }

        objectOutput.writeLong(createdDate);

        if (updatedBy == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(updatedBy);
        }

        objectOutput.writeLong(updatedDate);
    }
}
