/**
 * 
 */
package com.sbs.pokerp.dashboard.dto;

import java.io.Serializable;

/**
 * @author jpnaidu
 */
public class PokerTransactionDTO implements Serializable{

    /**
     * 
     */
    private static final long serialVersionUID = -6994441205680489957L;

    private long	      playerId;
    private long	      tableId;
    private long	      amount;
    private String	    playerName;

    public long getPlayerId() {
	return playerId;
    }

    public void setPlayerId( long playerId ) {
	this.playerId = playerId;
    }

    public long getTableId() {
	return tableId;
    }

    public void setTableId( long tableId ) {
	this.tableId = tableId;
    }

    public long getAmount() {
	return amount;
    }

    public void setAmount( long amount ) {
	this.amount = amount;
    }

    public String getPlayerName() {
	return playerName;
    }

    public void setPlayerName( String playerName ) {
	this.playerName = playerName;
    }

}
