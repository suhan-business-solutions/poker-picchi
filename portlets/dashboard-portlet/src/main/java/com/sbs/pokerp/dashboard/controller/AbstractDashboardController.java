package com.sbs.pokerp.dashboard.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.portlet.ActionRequest;
import javax.portlet.PortletRequest;

import org.springframework.validation.Errors;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.sbs.pokerp.dashboard.exception.PokerPicchiGenericException;
import com.sbs.pokerp.dashboard.exception.PokerPicchiGenericException.POKER_PICCHI_EXCEPTION;
import com.sbs.pokerp.dashboard.util.IConstants;

/**
 * @author jpnaidu
 */

public abstract class AbstractDashboardController implements IConstants{

    private static Log	  _log       = LogFactoryUtil.getLog( AbstractDashboardController.class );

    private static final String ERROR_PATH = "common/error";

    @ExceptionHandler( { RuntimeException.class, Exception.class } )
    @SuppressWarnings( "unchecked" )
    public String handleException( PortletRequest portletRequest, Throwable throwable ) {
	_log.info( " ^^^^^^^^^^^^^^^^^^^^^^^ AbstractDataSetController.handleException() ^^^^^^^^^^^^^^^^^^^^^^^" );

	_log.error( "An exception occured", throwable );
	String strViewPath = "";
	Map< String, String[ ] > errorsMap = ( Map< String, String[ ] > ) portletRequest.getAttribute( ERROR_MAP );
	if( errorsMap == null ) {
	    errorsMap = new HashMap< String, String[ ] >();
	}
	if( throwable instanceof PokerPicchiGenericException ) {

	    PokerPicchiGenericException pokerPicchiGenericException = ( PokerPicchiGenericException ) throwable;
	    String[ ] customErrorMsg = { pokerPicchiGenericException.getMessage() };

	    errorsMap.put( PokerPicchiGenericException.class.getName() + "." + pokerPicchiGenericException.getPokerPicchiGenericException().getErrorCode(),
		    customErrorMsg );
	    // This is to hide the default error message
	    // SessionMessages.add( portletRequest,
	    // ( ( LiferayPortletConfig ) portletRequest.getAttribute(
	    // JavaConstants.JAVAX_PORTLET_CONFIG ) ).getPortletName()
	    // + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE );
	}
	else {
	    errorsMap.put( PokerPicchiGenericException.class.getName() + "." + POKER_PICCHI_EXCEPTION.SYSTEM_EXCEPTION.getErrorCode(), new String[ 0 ] );

	}
	strViewPath = ERROR_PATH;
	portletRequest.setAttribute( ERROR_MAP, errorsMap );

	return strViewPath;
    }

    protected Map< String, String[ ] > constructValidationErrors( ActionRequest actionRequest, Errors errors ) {

	List< ObjectError > allObjectErrors = errors.getAllErrors();
	Map< String, String[ ] > errorsMap = ( Map< String, String[ ] > ) actionRequest.getAttribute( ERROR_MAP );
	if( errorsMap == null ) {
	    errorsMap = new HashMap< String, String[ ] >();
	}
	for( ObjectError objectError : allObjectErrors ) {
	    errorsMap.put( objectError.getCode(), ( String[ ] ) objectError.getArguments() );

	    _log.debug( "Codes " + Arrays.asList( objectError.getCodes() ).toString() );
	    _log.debug( "Error Code is " + objectError.getCode() );
	    _log.debug( "Default message is " + objectError.getDefaultMessage() );

	}

	return errorsMap;
    }
}
