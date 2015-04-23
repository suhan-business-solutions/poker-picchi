/**
 * 
 */
package com.sbs.pokerp.dashboard.bd;

import java.util.List;

import org.springframework.stereotype.Service;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.User;
import com.liferay.portal.service.OrganizationLocalServiceUtil;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.sbs.pokerp.dashboard.dto.DashboardDTO;
import com.sbs.pokerp.dashboard.dto.PokerTableDTO;
import com.sbs.pokerp.dashboard.exception.PokerPicchiGenericException;
import com.sbs.pokerp.dashboard.exception.PokerPicchiGenericException.POKER_PICCHI_EXCEPTION;

/**
 * @author jpnaidu
 */
@Service( "dashboardManager" )
public class DashboardManager implements IDashboardManager{

    private static Log _log = LogFactoryUtil.getLog( DashboardManager.class );

    /*
     * (non-Javadoc)
     * @see
     * com.sbs.pokerp.dashboard.bd.IDashboardManager#getOrganizationUsers(long)
     */
    public List< User > getOrganizationUsers( long orgId ) {
	List< User > userList = null;
	try {
	    userList = UserLocalServiceUtil.getOrganizationUsers( orgId );
	}
	catch( SystemException ex ) {
	    _log.error( ex.getMessage(), ex );
	    throw new PokerPicchiGenericException( ex, POKER_PICCHI_EXCEPTION.SYSTEM_EXCEPTION );
	}
	return userList;
    }

    public String getOrganizationName( long orgId ) {
	String orgName = StringPool.BLANK;
	try {
	    orgName = OrganizationLocalServiceUtil.getOrganization( orgId ).getName();
	}
	catch( PortalException ex ) {
	    _log.error( ex.getMessage(), ex );
	    throw new PokerPicchiGenericException( ex, POKER_PICCHI_EXCEPTION.PORTAL_EXCEPTION );
	}
	catch( SystemException ex ) {
	    _log.error( ex.getMessage(), ex );
	    throw new PokerPicchiGenericException( ex, POKER_PICCHI_EXCEPTION.SYSTEM_EXCEPTION );
	}
	return orgName;
    }

    public DashboardDTO createTable( PokerTableDTO pokerTable ) {
	// TODO Auto-generated method stub
	// insert into poker_table
	// insert list of buy in into the buy_in table
	// insert list of players in the poker_table_players
	// compute and populate the dashboard dto and return
	return null;
    }

}
