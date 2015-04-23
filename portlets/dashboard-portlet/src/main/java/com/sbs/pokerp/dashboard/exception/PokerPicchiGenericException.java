/**
 * 
 */
package com.sbs.pokerp.dashboard.exception;

/**
 * @author jpnaidu
 */
public class PokerPicchiGenericException extends RuntimeException{

    /**
	 * 
	 */
    private static final long      serialVersionUID = 8343255273587396924L;

    private POKER_PICCHI_EXCEPTION pokerPicchiException;

    public static enum POKER_PICCHI_EXCEPTION {
	SYSTEM_EXCEPTION( "000001" ), ENVIRONMENT_SETUP_EXCEPTION( "000002" ), PORTAL_EXCEPTION( "000003" ), DEFERRED_FEATURE_EXCEPTION( "000004" );

	private String errorCode;

	POKER_PICCHI_EXCEPTION( String errorCode ) {
	    this.errorCode = errorCode;
	}

	public String getErrorCode() {
	    return this.errorCode;
	}
    }

    /**
	 * 
	 */
    public PokerPicchiGenericException() {
	super();
    }

    /**
     * @param arg0
     */
    public PokerPicchiGenericException( String arg0 ) {
	super( arg0 );
	this.pokerPicchiException = POKER_PICCHI_EXCEPTION.SYSTEM_EXCEPTION;
    }

    /**
     * @param arg0
     */
    public PokerPicchiGenericException( Throwable arg0 ) {
	super( arg0 );
    }

    public PokerPicchiGenericException( Throwable arg0, POKER_PICCHI_EXCEPTION pokerPichiException ) {
	super( arg0 );
	this.pokerPicchiException = pokerPichiException;
    }

    /**
     * @param arg0
     * @param arg1
     */
    public PokerPicchiGenericException( String arg0, Throwable arg1, POKER_PICCHI_EXCEPTION pokerPichiException ) {
	super( arg0, arg1 );
	this.pokerPicchiException = pokerPichiException;
    }

    public PokerPicchiGenericException( String arg0, POKER_PICCHI_EXCEPTION pokerPichiException ) {
	super( arg0 );
	this.pokerPicchiException = pokerPichiException;
    }

    public POKER_PICCHI_EXCEPTION getPokerPicchiGenericException() {
	if( this.pokerPicchiException == null ) {
	    return POKER_PICCHI_EXCEPTION.SYSTEM_EXCEPTION;
	}
	return pokerPicchiException;
    }

}
