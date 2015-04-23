/**
 * 
 */
package com.sbs.pokerp.dashboard.bd;

import java.util.List;

import com.liferay.portal.model.User;
import com.sbs.pokerp.dashboard.dto.DashboardDTO;
import com.sbs.pokerp.dashboard.dto.PokerTableDTO;

/**
 * @author jpnaidu
 */
public interface IDashboardManager{

    public List< User > getOrganizationUsers( long orgId );

    public String getOrganizationName( long orgId );

    public DashboardDTO createTable( PokerTableDTO pokerTable );
}
