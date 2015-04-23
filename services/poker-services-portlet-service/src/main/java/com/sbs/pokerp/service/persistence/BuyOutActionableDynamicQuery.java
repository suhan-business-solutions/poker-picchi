package com.sbs.pokerp.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.sbs.pokerp.model.BuyOut;
import com.sbs.pokerp.service.BuyOutLocalServiceUtil;

/**
 * @author jpnaidu
 * @generated
 */
public abstract class BuyOutActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public BuyOutActionableDynamicQuery() throws SystemException {
        setBaseLocalService(BuyOutLocalServiceUtil.getService());
        setClass(BuyOut.class);

        setClassLoader(com.sbs.pokerp.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("transactionId");
    }
}
