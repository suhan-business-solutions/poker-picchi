package com.sbs.pokerp.dashboard.controller;

import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.RenderRequest;

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
import com.liferay.portal.model.User;
import com.liferay.portal.service.UserLocalServiceUtil;

/**
 * Portlet implementation class DashboardController
 */
@Controller( "dashboardController" )
@RequestMapping( "VIEW" )
public class DashboardController{

    private static Log	 _log	   = LogFactoryUtil.getLog( DashboardController.class );
    public static final String VIEW_PATH      = "dashboard/view";
    public static final String DASHBOARD_PATH = "dashboard/dashboard";

    @RequestMapping
    public ModelAndView view( ModelMap model, RenderRequest request ) throws PortalException, SystemException {
	_log.debug( "******************************" );
	List< User > liUsers = null;
	try {
	    liUsers = UserLocalServiceUtil.getUsers( -1, -1 );
	}
	catch( SystemException e ) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}

	ModelAndView mav = new ModelAndView();
	mav.setViewName( VIEW_PATH );

	mav.addObject( "users", liUsers );
	return mav;
    }

    @ActionMapping( params = { "action=createTable" } )
    public void createTable( ActionRequest actionRequest, ActionResponse response, SessionStatus sessionStatus ) {
	_log.debug( "******************************DashboardController.createTable()******************************" );
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
