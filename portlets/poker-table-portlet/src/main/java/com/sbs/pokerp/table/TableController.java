package com.sbs.pokerp.table;

import javax.portlet.GenericPortlet;
import javax.portlet.RenderRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

/**
 * Portlet implementation class TableController
 * 
 * @author jpnaidu
 */
@Controller( "tableController" )
@RequestMapping( "VIEW" )
public class TableController extends GenericPortlet{
    private static Log	 _log      = LogFactoryUtil.getLog( TableController.class );

    public static final String VIEW_PATH = "table/view";

    @RequestMapping
    public String view( ModelMap model, RenderRequest request ) throws PortalException, SystemException {
	_log.info( "******************************" );
	return VIEW_PATH;
    }

}
