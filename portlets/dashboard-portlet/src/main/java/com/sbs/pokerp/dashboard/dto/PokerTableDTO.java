/**
 * 
 */
package com.sbs.pokerp.dashboard.dto;

import java.util.List;

/**
 * @author jpnaidu
 */
public class PokerTableDTO{

    private String	tableName;
    private List< BuyInDTO > buyInList;

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
     * @return the buyInList
     */
    public List< BuyInDTO > getBuyInList() {
	return buyInList;
    }

    /**
     * @param buyInList
     *            the buyInList to set
     */
    public void setBuyInList( List< BuyInDTO > buyInList ) {
	this.buyInList = buyInList;
    }

}
