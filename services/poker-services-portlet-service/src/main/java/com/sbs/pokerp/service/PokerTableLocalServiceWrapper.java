package com.sbs.pokerp.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link PokerTableLocalService}.
 *
 * @author jpnaidu
 * @see PokerTableLocalService
 * @generated
 */
public class PokerTableLocalServiceWrapper implements PokerTableLocalService,
    ServiceWrapper<PokerTableLocalService> {
    private PokerTableLocalService _pokerTableLocalService;

    public PokerTableLocalServiceWrapper(
        PokerTableLocalService pokerTableLocalService) {
        _pokerTableLocalService = pokerTableLocalService;
    }

    /**
    * Adds the PokerTable to the database. Also notifies the appropriate model listeners.
    *
    * @param pokerTable the PokerTable
    * @return the PokerTable that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.sbs.pokerp.model.PokerTable addPokerTable(
        com.sbs.pokerp.model.PokerTable pokerTable)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _pokerTableLocalService.addPokerTable(pokerTable);
    }

    /**
    * Creates a new PokerTable with the primary key. Does not add the PokerTable to the database.
    *
    * @param gameId the primary key for the new PokerTable
    * @return the new PokerTable
    */
    @Override
    public com.sbs.pokerp.model.PokerTable createPokerTable(long gameId) {
        return _pokerTableLocalService.createPokerTable(gameId);
    }

    /**
    * Deletes the PokerTable with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param gameId the primary key of the PokerTable
    * @return the PokerTable that was removed
    * @throws PortalException if a PokerTable with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.sbs.pokerp.model.PokerTable deletePokerTable(long gameId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _pokerTableLocalService.deletePokerTable(gameId);
    }

    /**
    * Deletes the PokerTable from the database. Also notifies the appropriate model listeners.
    *
    * @param pokerTable the PokerTable
    * @return the PokerTable that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.sbs.pokerp.model.PokerTable deletePokerTable(
        com.sbs.pokerp.model.PokerTable pokerTable)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _pokerTableLocalService.deletePokerTable(pokerTable);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _pokerTableLocalService.dynamicQuery();
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
        return _pokerTableLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.sbs.pokerp.model.impl.PokerTableModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _pokerTableLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.sbs.pokerp.model.impl.PokerTableModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _pokerTableLocalService.dynamicQuery(dynamicQuery, start, end,
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
        return _pokerTableLocalService.dynamicQueryCount(dynamicQuery);
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
        return _pokerTableLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public com.sbs.pokerp.model.PokerTable fetchPokerTable(long gameId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _pokerTableLocalService.fetchPokerTable(gameId);
    }

    /**
    * Returns the PokerTable with the primary key.
    *
    * @param gameId the primary key of the PokerTable
    * @return the PokerTable
    * @throws PortalException if a PokerTable with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.sbs.pokerp.model.PokerTable getPokerTable(long gameId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _pokerTableLocalService.getPokerTable(gameId);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _pokerTableLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the PokerTables.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.sbs.pokerp.model.impl.PokerTableModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of PokerTables
    * @param end the upper bound of the range of PokerTables (not inclusive)
    * @return the range of PokerTables
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.sbs.pokerp.model.PokerTable> getPokerTables(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _pokerTableLocalService.getPokerTables(start, end);
    }

    /**
    * Returns the number of PokerTables.
    *
    * @return the number of PokerTables
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getPokerTablesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _pokerTableLocalService.getPokerTablesCount();
    }

    /**
    * Updates the PokerTable in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param pokerTable the PokerTable
    * @return the PokerTable that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.sbs.pokerp.model.PokerTable updatePokerTable(
        com.sbs.pokerp.model.PokerTable pokerTable)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _pokerTableLocalService.updatePokerTable(pokerTable);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _pokerTableLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _pokerTableLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _pokerTableLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public PokerTableLocalService getWrappedPokerTableLocalService() {
        return _pokerTableLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedPokerTableLocalService(
        PokerTableLocalService pokerTableLocalService) {
        _pokerTableLocalService = pokerTableLocalService;
    }

    @Override
    public PokerTableLocalService getWrappedService() {
        return _pokerTableLocalService;
    }

    @Override
    public void setWrappedService(PokerTableLocalService pokerTableLocalService) {
        _pokerTableLocalService = pokerTableLocalService;
    }
}
