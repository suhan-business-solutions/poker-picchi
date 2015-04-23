package com.sbs.pokerp.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.sbs.pokerp.model.PokerTable;
import com.sbs.pokerp.service.PokerTableLocalServiceUtil;

/**
 * @author jpnaidu
 * @generated
 */
public abstract class PokerTableActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public PokerTableActionableDynamicQuery() throws SystemException {
        setBaseLocalService(PokerTableLocalServiceUtil.getService());
        setClass(PokerTable.class);

        setClassLoader(com.sbs.pokerp.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("gameId");
    }
}
