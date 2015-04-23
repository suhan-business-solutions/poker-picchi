package com.sbs.pokerp.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.sbs.pokerp.model.PokerTablePlayer;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing PokerTablePlayer in entity cache.
 *
 * @author jpnaidu
 * @see PokerTablePlayer
 * @generated
 */
public class PokerTablePlayerCacheModel implements CacheModel<PokerTablePlayer>,
    Externalizable {
    public long gameId;
    public long playerId;
    public long timeJoined;
    public long timeLeft;
    public double amountWon;
    public String createdBy;
    public long createdDate;
    public String updatedBy;
    public long updatedDate;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(19);

        sb.append("{gameId=");
        sb.append(gameId);
        sb.append(", playerId=");
        sb.append(playerId);
        sb.append(", timeJoined=");
        sb.append(timeJoined);
        sb.append(", timeLeft=");
        sb.append(timeLeft);
        sb.append(", amountWon=");
        sb.append(amountWon);
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
    public PokerTablePlayer toEntityModel() {
        PokerTablePlayerImpl pokerTablePlayerImpl = new PokerTablePlayerImpl();

        pokerTablePlayerImpl.setGameId(gameId);
        pokerTablePlayerImpl.setPlayerId(playerId);

        if (timeJoined == Long.MIN_VALUE) {
            pokerTablePlayerImpl.setTimeJoined(null);
        } else {
            pokerTablePlayerImpl.setTimeJoined(new Date(timeJoined));
        }

        if (timeLeft == Long.MIN_VALUE) {
            pokerTablePlayerImpl.setTimeLeft(null);
        } else {
            pokerTablePlayerImpl.setTimeLeft(new Date(timeLeft));
        }

        pokerTablePlayerImpl.setAmountWon(amountWon);

        if (createdBy == null) {
            pokerTablePlayerImpl.setCreatedBy(StringPool.BLANK);
        } else {
            pokerTablePlayerImpl.setCreatedBy(createdBy);
        }

        if (createdDate == Long.MIN_VALUE) {
            pokerTablePlayerImpl.setCreatedDate(null);
        } else {
            pokerTablePlayerImpl.setCreatedDate(new Date(createdDate));
        }

        if (updatedBy == null) {
            pokerTablePlayerImpl.setUpdatedBy(StringPool.BLANK);
        } else {
            pokerTablePlayerImpl.setUpdatedBy(updatedBy);
        }

        if (updatedDate == Long.MIN_VALUE) {
            pokerTablePlayerImpl.setUpdatedDate(null);
        } else {
            pokerTablePlayerImpl.setUpdatedDate(new Date(updatedDate));
        }

        pokerTablePlayerImpl.resetOriginalValues();

        return pokerTablePlayerImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        gameId = objectInput.readLong();
        playerId = objectInput.readLong();
        timeJoined = objectInput.readLong();
        timeLeft = objectInput.readLong();
        amountWon = objectInput.readDouble();
        createdBy = objectInput.readUTF();
        createdDate = objectInput.readLong();
        updatedBy = objectInput.readUTF();
        updatedDate = objectInput.readLong();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(gameId);
        objectOutput.writeLong(playerId);
        objectOutput.writeLong(timeJoined);
        objectOutput.writeLong(timeLeft);
        objectOutput.writeDouble(amountWon);

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
