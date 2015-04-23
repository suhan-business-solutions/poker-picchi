/**
 * 
 */
package com.sbs.pokerp.dashboard.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * @author jpnaidu
 */
public class TablePlayerDTO implements Serializable{
    private long   playerId;
    private long   tableId;
    private Date   timeJoined;
    private Date   timeLeft;
    private double totalBuyInAmount;
    private double totalBuyInCredit;
    private int    totalBuyInCount;

    /**
     * @return the playerId
     */
    public long getPlayerId() {
	return playerId;
    }

    /**
     * @param playerId
     *            the playerId to set
     */
    public void setPlayerId( long playerId ) {
	this.playerId = playerId;
    }

    /**
     * @return the tableId
     */
    public long getTableId() {
	return tableId;
    }

    /**
     * @param tableId
     *            the tableId to set
     */
    public void setTableId( long tableId ) {
	this.tableId = tableId;
    }

    /**
     * @return the timeJoined
     */
    public Date getTimeJoined() {
	return timeJoined;
    }

    /**
     * @param timeJoined
     *            the timeJoined to set
     */
    public void setTimeJoined( Date timeJoined ) {
	this.timeJoined = timeJoined;
    }

    /**
     * @return the timeLeft
     */
    public Date getTimeLeft() {
	return timeLeft;
    }

    /**
     * @param timeLeft
     *            the timeLeft to set
     */
    public void setTimeLeft( Date timeLeft ) {
	this.timeLeft = timeLeft;
    }

    /**
     * @return the totalBuyInAmount
     */
    public double getTotalBuyInAmount() {
	return totalBuyInAmount;
    }

    /**
     * @param totalBuyInAmount
     *            the totalBuyInAmount to set
     */
    public void setTotalBuyInAmount( double totalBuyInAmount ) {
	this.totalBuyInAmount = totalBuyInAmount;
    }

    /**
     * @return the totalBuyInCredit
     */
    public double getTotalBuyInCredit() {
	return totalBuyInCredit;
    }

    /**
     * @param totalBuyInCredit
     *            the totalBuyInCredit to set
     */
    public void setTotalBuyInCredit( double totalBuyInCredit ) {
	this.totalBuyInCredit = totalBuyInCredit;
    }

    /**
     * @return the totalBuyInCount
     */
    public int getTotalBuyInCount() {
	return totalBuyInCount;
    }

    /**
     * @param totalBuyInCount
     *            the totalBuyInCount to set
     */
    public void setTotalBuyInCount( int totalBuyInCount ) {
	this.totalBuyInCount = totalBuyInCount;
    }

}
