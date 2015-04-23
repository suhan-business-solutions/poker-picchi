package com.sbs.pokerp.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.sbs.pokerp.model.BuyIn;
import com.sbs.pokerp.service.BuyInLocalServiceUtil;

/**
 * @author jpnaidu
 * @generated
 */
public abstract class BuyInActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public BuyInActionableDynamicQuery() throws SystemException {
        setBaseLocalService(BuyInLocalServiceUtil.getService());
        setClass(BuyIn.class);

        setClassLoader(com.sbs.pokerp.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("transactionId");
    }
}
