package com.sbs.pokerp.service.persistence;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Serializable;

/**
 * @author jpnaidu
 * @generated
 */
public class PokerTablePlayerPK implements Comparable<PokerTablePlayerPK>,
    Serializable {
    public long gameId;
    public long playerId;

    public PokerTablePlayerPK() {
    }

    public PokerTablePlayerPK(long gameId, long playerId) {
        this.gameId = gameId;
        this.playerId = playerId;
    }

    public long getGameId() {
        return gameId;
    }

    public void setGameId(long gameId) {
        this.gameId = gameId;
    }

    public long getPlayerId() {
        return playerId;
    }

    public void setPlayerId(long playerId) {
        this.playerId = playerId;
    }

    @Override
    public int compareTo(PokerTablePlayerPK pk) {
        if (pk == null) {
            return -1;
        }

        int value = 0;

        if (gameId < pk.gameId) {
            value = -1;
        } else if (gameId > pk.gameId) {
            value = 1;
        } else {
            value = 0;
        }

        if (value != 0) {
            return value;
        }

        if (playerId < pk.playerId) {
            value = -1;
        } else if (playerId > pk.playerId) {
            value = 1;
        } else {
            value = 0;
        }

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

        if (!(obj instanceof PokerTablePlayerPK)) {
            return false;
        }

        PokerTablePlayerPK pk = (PokerTablePlayerPK) obj;

        if ((gameId == pk.gameId) && (playerId == pk.playerId)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (String.valueOf(gameId) + String.valueOf(playerId)).hashCode();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(10);

        sb.append(StringPool.OPEN_CURLY_BRACE);

        sb.append("gameId");
        sb.append(StringPool.EQUAL);
        sb.append(gameId);

        sb.append(StringPool.COMMA);
        sb.append(StringPool.SPACE);
        sb.append("playerId");
        sb.append(StringPool.EQUAL);
        sb.append(playerId);

        sb.append(StringPool.CLOSE_CURLY_BRACE);

        return sb.toString();
    }
}
