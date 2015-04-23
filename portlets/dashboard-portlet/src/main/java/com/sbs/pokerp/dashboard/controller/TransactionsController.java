/**
 * 
 */
package com.sbs.pokerp.dashboard.controller;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.RenderRequest;
import javax.portlet.WindowStateException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.portlet.ModelAndView;
import org.springframework.web.portlet.bind.annotation.ActionMapping;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.LiferayWindowState;
import com.sbs.pokerp.dashboard.dto.BuyInDTO;
import com.sbs.pokerp.dashboard.dto.BuyOutDTO;

/**
 * @author jpnaidu
 */
@Controller( "transactionsController" )
@RequestMapping( "VIEW" )
public class TransactionsController{
    private static Log	 _log	 = LogFactoryUtil.getLog( DashboardController.class );
    public static final String BUY_IN_PATH  = "dashboard/buyIn";
    public static final String BUY_OUT_PATH = "dashboard/buyOut";

    @RequestMapping( params = { "action=buy-in" } )
    public ModelAndView showBuyIn( ModelMap model, RenderRequest request, @RequestParam( "playerId" ) long playerId, @RequestParam( "tableId" ) long tableId )
	    throws PortalException, SystemException {
	_log.debug( "TransactionsController.showBuyIn()******************************" );

	BuyInDTO buyIn = new BuyInDTO();
	buyIn.setPlayerName( "Naidu Jitta" );
	buyIn.setPlayerId( 10231 );
	buyIn.setTableId( 1234 );

	ModelAndView mav = new ModelAndView();

	mav.setViewName( BUY_IN_PATH );
	mav.addObject( "buyIn", buyIn );

	return mav;
    }

    @RequestMapping( params = { "action=buy-out" } )
    public ModelAndView showBuyOut( ModelMap model, RenderRequest request, @RequestParam( "playerId" ) long playerId, @RequestParam( "tableId" ) long tableId )
	    throws PortalException, SystemException {
	_log.debug( "TransactionsController.showBuyOut()******************************" );
	ModelAndView mav = new ModelAndView();

	BuyOutDTO buyOut = new BuyOutDTO();
	buyOut.setPlayerName( "Naidu Jitta" );
	buyOut.setPlayerId( 10231 );
	buyOut.setTableId( 1234 );

	mav.addObject( "buyOut", buyOut );
	mav.setViewName( BUY_OUT_PATH );

	return mav;
    }

    @ActionMapping( params = { "action=add-buy-in" } )
    public void addBuyIn( @ModelAttribute( "buyIn" ) BuyInDTO buyIn, BindingResult result, ActionRequest actionRequest, ActionResponse response,
	    SessionStatus sessionStatus ) throws WindowStateException {

	_log.debug( "******************************TransactionsController.addBuyIn()******************************" );
	_log.debug( actionRequest.getParameter( "buyIn" ) );
	_log.debug( "Buy In ===>" + JSONFactoryUtil.looseSerialize( buyIn ) );
	response.setWindowState( LiferayWindowState.NORMAL );
	response.setRenderParameter( "action", "showDashboard" );

    }

    @ActionMapping( params = { "action=buy-out" } )
    public void buyOut( @ModelAttribute( "buyOut" ) BuyOutDTO buyOut, BindingResult result, ActionRequest actionRequest, ActionResponse response,
	    SessionStatus sessionStatus ) throws WindowStateException {

	_log.debug( "******************************TransactionsController.buyOut()******************************" );
	_log.debug( "Buy Out ===>" + JSONFactoryUtil.looseSerialize( buyOut ) );
	response.setWindowState( LiferayWindowState.NORMAL );
	response.setRenderParameter( "action", "showDashboard" );

    }

    @ModelAttribute( "buyIn" )
    public BuyInDTO getCommandObject() {

	_log.info( "Creating Buy In command object" );
	return new BuyInDTO();
    }
}
