package com.sbs.pokerp.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.sbs.pokerp.model.BuyOut;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing BuyOut in entity cache.
 *
 * @author jpnaidu
 * @see BuyOut
 * @generated
 */
public class BuyOutCacheModel implements CacheModel<BuyOut>, Externalizable {
    public long transactionId;
    public long gameId;
    public long playerId;
    public double amount;
    public String createdBy;
    public long createdDate;
    public String updatedBy;
    public long updatedDate;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(17);

        sb.append("{transactionId=");
        sb.append(transactionId);
        sb.append(", gameId=");
        sb.append(gameId);
        sb.append(", playerId=");
        sb.append(playerId);
        sb.append(", amount=");
        sb.append(amount);
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
    public BuyOut toEntityModel() {
        BuyOutImpl buyOutImpl = new BuyOutImpl();

        buyOutImpl.setTransactionId(transactionId);
        buyOutImpl.setGameId(gameId);
        buyOutImpl.setPlayerId(playerId);
        buyOutImpl.setAmount(amount);

        if (createdBy == null) {
            buyOutImpl.setCreatedBy(StringPool.BLANK);
        } else {
            buyOutImpl.setCreatedBy(createdBy);
        }

        if (createdDate == Long.MIN_VALUE) {
            buyOutImpl.setCreatedDate(null);
        } else {
            buyOutImpl.setCreatedDate(new Date(createdDate));
        }

        if (updatedBy == null) {
            buyOutImpl.setUpdatedBy(StringPool.BLANK);
        } else {
            buyOutImpl.setUpdatedBy(updatedBy);
        }

        if (updatedDate == Long.MIN_VALUE) {
            buyOutImpl.setUpdatedDate(null);
        } else {
            buyOutImpl.setUpdatedDate(new Date(updatedDate));
        }

        buyOutImpl.resetOriginalValues();

        return buyOutImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        transactionId = objectInput.readLong();
        gameId = objectInput.readLong();
        playerId = objectInput.readLong();
        amount = objectInput.readDouble();
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
