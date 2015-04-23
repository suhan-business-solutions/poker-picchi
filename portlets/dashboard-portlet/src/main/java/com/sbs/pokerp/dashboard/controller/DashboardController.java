package com.sbs.pokerp.dashboard.controller;

import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.RenderRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.portlet.ModelAndView;
import org.springframework.web.portlet.bind.annotation.ActionMapping;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.model.User;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.portal.theme.ThemeDisplay;
import com.sbs.pokerp.dashboard.bd.IDashboardManager;
import com.sbs.pokerp.dashboard.exception.PokerPicchiGenericException;
import com.sbs.pokerp.dashboard.exception.PokerPicchiGenericException.POKER_PICCHI_EXCEPTION;

/**
 * Portlet implementation class DashboardController
 */
@Controller( "dashboardController" )
@RequestMapping( "VIEW" )
public class DashboardController extends AbstractDashboardController{

    private static Log	 _log	   = LogFactoryUtil.getLog( DashboardController.class );
    public static final String VIEW_PATH      = "dashboard/view";
    public static final String DASHBOARD_PATH = "dashboard/dashboard";

    @Autowired
    private IDashboardManager  dashboardManager;

    @RequestMapping
    public ModelAndView view( ModelMap model, RenderRequest request ) throws PortalException, SystemException {
	_log.debug( "******************************" );

	ModelAndView mav = new ModelAndView();

	ThemeDisplay themeDisplay = ( ThemeDisplay ) request.getAttribute( WebKeys.THEME_DISPLAY );
	long[ ] userOrgIds = themeDisplay.getUser().getOrganizationIds();
	if( userOrgIds.length != 1 ) {
	    // Super Admin
	    throw new PokerPicchiGenericException( "User is associated with multiple Groups", POKER_PICCHI_EXCEPTION.DEFERRED_FEATURE_EXCEPTION );
	}
	else {

	    request.setAttribute( ORG_ID_PARAM, userOrgIds[ 0 ] );
	    mav = this.viewTableDashboard( model, request );

	}

	return mav;
    }

    @RequestMapping( params = { "action=createTableView" } )
    public ModelAndView viewTableDashboard( ModelMap model, RenderRequest request ) throws PortalException, SystemException {
	ModelAndView mav = new ModelAndView();

	long orgId = GetterUtil.get( request.getAttribute( ORG_ID_PARAM ), 0 );
	_log.debug( "DashboardController.viewTableDashboard()::Org Id ===>" + orgId );
	List< User > liUsers = dashboardManager.getOrganizationUsers( orgId );
	String orgName = dashboardManager.getOrganizationName( orgId );

	_log.debug( "DashboardController.viewTableDashboard()::Org Name ===>" + orgName );

	mav.addObject( USERS_LIST_PARAM, liUsers );
	mav.addObject( ORG_NAME_PARAM, orgName );
	mav.addObject( ORG_ID_PARAM, orgId );

	mav.setViewName( VIEW_PATH );
	return mav;
    }

    @ActionMapping( params = { "action=createTable" } )
    public void createTable( ActionRequest actionRequest, ActionResponse response, SessionStatus sessionStatus ) {
	_log.debug( "******************************DashboardController.createTable()******************************" );
	String tableName = Validator.isNotNull( ParamUtil.getString( actionRequest, TABLE_NAME_FIELD ) ) ? ParamUtil
		.getString( actionRequest, TABLE_NAME_FIELD ) : ParamUtil.getString( actionRequest, ORG_NAME_PARAM );
	double buyInAmt = ParamUtil.getDouble( actionRequest, BUY_IN_FIELD );
	long orgId = ParamUtil.getLong( actionRequest, ORG_ID_PARAM );
	long[ ] playerIds = ParamUtil.getLongValues( actionRequest, ROW_IDS_FIELD );

	_log.debug( "DashboardController.createTable()::tableName ===>" + tableName );
	_log.debug( "DashboardController.createTable()::buyInAmt ===>" + buyInAmt );
	_log.debug( "DashboardController.createTable()::playerIds ===>" + playerIds );
	_log.debug( "DashboardController.createTable()::orgId ===>" + orgId );
	_log.debug( "DashboardController.createTable()::Selected Credit players******************************" );
	for( int ii = 0; ii < playerIds.length; ii++ ) {
	    _log.debug( "DashboardController.createTable()PlayerId ===>" + playerIds[ ii ] );
	    _log.debug( "DashboardController.createTable()Credit ===>" + ParamUtil.getBoolean( actionRequest, CREDIT_FIELD + playerIds[ ii ] ) );
	}

	response.setRenderParameter( "action", "showDashboard" );

    }

    @RequestMapping( params = { "action=showDashboard" } )
    public ModelAndView showDashboard( ModelMap model, RenderRequest request ) throws PortalException, SystemException {
	ModelAndView mav = new ModelAndView();
	mav.setViewName( DASHBOARD_PATH );
	List< User > liUsers = null;
	try {
	    liUsers = UserLocalServiceUtil.getUsers( -1, -1 );
	}
	catch( SystemException e ) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
	mav.addObject( "users", liUsers );
	return mav;
    }

}
