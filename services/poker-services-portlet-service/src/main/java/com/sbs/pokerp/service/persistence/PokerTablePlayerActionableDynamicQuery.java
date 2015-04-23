package com.sbs.pokerp.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.sbs.pokerp.model.PokerTablePlayer;
import com.sbs.pokerp.service.PokerTablePlayerLocalServiceUtil;

/**
 * @author jpnaidu
 * @generated
 */
public abstract class PokerTablePlayerActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public PokerTablePlayerActionableDynamicQuery() throws SystemException {
        setBaseLocalService(PokerTablePlayerLocalServiceUtil.getService());
        setClass(PokerTablePlayer.class);

        setClassLoader(com.sbs.pokerp.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("primaryKey.gameId");
    }
}
