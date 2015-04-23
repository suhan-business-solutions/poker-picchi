package com.sbs.pokerp.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link BuyOutLocalService}.
 *
 * @author jpnaidu
 * @see BuyOutLocalService
 * @generated
 */
public class BuyOutLocalServiceWrapper implements BuyOutLocalService,
    ServiceWrapper<BuyOutLocalService> {
    private BuyOutLocalService _buyOutLocalService;

    public BuyOutLocalServiceWrapper(BuyOutLocalService buyOutLocalService) {
        _buyOutLocalService = buyOutLocalService;
    }

    /**
    * Adds the BuyOut to the database. Also notifies the appropriate model listeners.
    *
    * @param buyOut the BuyOut
    * @return the BuyOut that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.sbs.pokerp.model.BuyOut addBuyOut(
        com.sbs.pokerp.model.BuyOut buyOut)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _buyOutLocalService.addBuyOut(buyOut);
    }

    /**
    * Creates a new BuyOut with the primary key. Does not add the BuyOut to the database.
    *
    * @param transactionId the primary key for the new BuyOut
    * @return the new BuyOut
    */
    @Override
    public com.sbs.pokerp.model.BuyOut createBuyOut(long transactionId) {
        return _buyOutLocalService.createBuyOut(transactionId);
    }

    /**
    * Deletes the BuyOut with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param transactionId the primary key of the BuyOut
    * @return the BuyOut that was removed
    * @throws PortalException if a BuyOut with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.sbs.pokerp.model.BuyOut deleteBuyOut(long transactionId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _buyOutLocalService.deleteBuyOut(transactionId);
    }

    /**
    * Deletes the BuyOut from the database. Also notifies the appropriate model listeners.
    *
    * @param buyOut the BuyOut
    * @return the BuyOut that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.sbs.pokerp.model.BuyOut deleteBuyOut(
        com.sbs.pokerp.model.BuyOut buyOut)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _buyOutLocalService.deleteBuyOut(buyOut);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _buyOutLocalService.dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _buyOutLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.sbs.pokerp.model.impl.BuyOutModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return _buyOutLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.sbs.pokerp.model.impl.BuyOutModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _buyOutLocalService.dynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _buyOutLocalService.dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _buyOutLocalService.dynamicQueryCount(dynamicQuery, projection);
    }

    @Override
    public com.sbs.pokerp.model.BuyOut fetchBuyOut(long transactionId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _buyOutLocalService.fetchBuyOut(transactionId);
    }

    /**
    * Returns the BuyOut with the primary key.
    *
    * @param transactionId the primary key of the BuyOut
    * @return the BuyOut
    * @throws PortalException if a BuyOut with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.sbs.pokerp.model.BuyOut getBuyOut(long transactionId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _buyOutLocalService.getBuyOut(transactionId);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _buyOutLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the BuyOuts.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.sbs.pokerp.model.impl.BuyOutModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of BuyOuts
    * @param end the upper bound of the range of BuyOuts (not inclusive)
    * @return the range of BuyOuts
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.sbs.pokerp.model.BuyOut> getBuyOuts(int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return _buyOutLocalService.getBuyOuts(start, end);
    }

    /**
    * Returns the number of BuyOuts.
    *
    * @return the number of BuyOuts
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getBuyOutsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _buyOutLocalService.getBuyOutsCount();
    }

    /**
    * Updates the BuyOut in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param buyOut the BuyOut
    * @return the BuyOut that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.sbs.pokerp.model.BuyOut updateBuyOut(
        com.sbs.pokerp.model.BuyOut buyOut)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _buyOutLocalService.updateBuyOut(buyOut);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _buyOutLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _buyOutLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _buyOutLocalService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public BuyOutLocalService getWrappedBuyOutLocalService() {
        return _buyOutLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedBuyOutLocalService(
        BuyOutLocalService buyOutLocalService) {
        _buyOutLocalService = buyOutLocalService;
    }

    @Override
    public BuyOutLocalService getWrappedService() {
        return _buyOutLocalService;
    }

    @Override
    public void setWrappedService(BuyOutLocalService buyOutLocalService) {
        _buyOutLocalService = buyOutLocalService;
    }
}
