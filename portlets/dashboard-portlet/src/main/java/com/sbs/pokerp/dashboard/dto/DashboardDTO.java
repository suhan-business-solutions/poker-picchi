/**
 * 
 */
package com.sbs.pokerp.dashboard.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author jpnaidu
 */
public class DashboardDTO implements Serializable{

    /**
     * 
     */
    private static final long   serialVersionUID = 3406279244554120251L;

    private String	      tableName;
    private double	      tableValue;
    private Date		startDate;
    private List< TablePlayerDTO > playersList;

    /**
     * @return the tableName
     */
    public String getTableName() {
	return tableName;
    }

    /**
     * @param tableName
     *            the tableName to set
     */
    public void setTableName( String tableName ) {
	this.tableName = tableName;
    }

    /**
     * @return the tableValue
     */
    public double getTableValue() {
	return tableValue;
    }

    /**
     * @param tableValue
     *            the tableValue to set
     */
    public void setTableValue( double tableValue ) {
	this.tableValue = tableValue;
    }

    /**
     * @return the startDate
     */
    public Date getStartDate() {
	return startDate;
    }

    /**
     * @param startDate
     *            the startDate to set
     */
    public void setStartDate( Date startDate ) {
	this.startDate = startDate;
    }

    /**
     * @return the playersList
     */
    public List< TablePlayerDTO > getPlayersList() {
	return playersList;
    }

    /**
     * @param playersList
     *            the playersList to set
     */
    public void setPlayersList( List< TablePlayerDTO > playersList ) {
	this.playersList = playersList;
    }

    /**
     * @return the serialversionuid
     */
    public static long getSerialversionuid() {
	return serialVersionUID;
    }

}
