package com.sbs.pokerp.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.sbs.pokerp.model.BuyIn;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing BuyIn in entity cache.
 *
 * @author jpnaidu
 * @see BuyIn
 * @generated
 */
public class BuyInCacheModel implements CacheModel<BuyIn>, Externalizable {
    public long transactionId;
    public long gameId;
    public long playerId;
    public double amount;
    public boolean credit;
    public String createdBy;
    public long createdDate;
    public String updatedBy;
    public long updatedDate;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(19);

        sb.append("{transactionId=");
        sb.append(transactionId);
        sb.append(", gameId=");
        sb.append(gameId);
        sb.append(", playerId=");
        sb.append(playerId);
        sb.append(", amount=");
        sb.append(amount);
        sb.append(", credit=");
        sb.append(credit);
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
    public BuyIn toEntityModel() {
        BuyInImpl buyInImpl = new BuyInImpl();

        buyInImpl.setTransactionId(transactionId);
        buyInImpl.setGameId(gameId);
        buyInImpl.setPlayerId(playerId);
        buyInImpl.setAmount(amount);
        buyInImpl.setCredit(credit);

        if (createdBy == null) {
            buyInImpl.setCreatedBy(StringPool.BLANK);
        } else {
            buyInImpl.setCreatedBy(createdBy);
        }

        if (createdDate == Long.MIN_VALUE) {
            buyInImpl.setCreatedDate(null);
        } else {
            buyInImpl.setCreatedDate(new Date(createdDate));
        }

        if (updatedBy == null) {
            buyInImpl.setUpdatedBy(StringPool.BLANK);
        } else {
            buyInImpl.setUpdatedBy(updatedBy);
        }

        if (updatedDate == Long.MIN_VALUE) {
            buyInImpl.setUpdatedDate(null);
        } else {
            buyInImpl.setUpdatedDate(new Date(updatedDate));
        }

        buyInImpl.resetOriginalValues();

        return buyInImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        transactionId = objectInput.readLong();
        gameId = objectInput.readLong();
        playerId = objectInput.readLong();
        amount = objectInput.readDouble();
        credit = objectInput.readBoolean();
        createdBy = objectInput.readUTF();
        createdDate = objectInput.readLong();
        updatedBy = objectInput.readUTF();
        updatedDate = objectInput.readLong();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(transactionId);
        objectOutput.writeLong(gameId);
        objectOutput.writeLong(playerId);
        objectOutput.writeDouble(amount);
        objectOutput.writeBoolean(credit);

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
