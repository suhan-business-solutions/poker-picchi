/**
 * 
 */
package com.sbs.pokerp.dashboard.dto;

/**
 * @author jpnaidu
 */
public class BuyIn extends PokerTransaction{
    /**
     * 
     */
    private static final long serialVersionUID = -4200074316598066583L;
    private boolean	   credit;

    public boolean isCredit() {
	return credit;
    }

    public void setCredit( boolean credit ) {
	this.credit = credit;
    }

    @Override
    public String toString() {
	// TODO Auto-generated method stub
	return super.toString();
    }

}
