package com.sbs.pokerp.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link PokerTablePlayerLocalService}.
 *
 * @author jpnaidu
 * @see PokerTablePlayerLocalService
 * @generated
 */
public class PokerTablePlayerLocalServiceWrapper
    implements PokerTablePlayerLocalService,
        ServiceWrapper<PokerTablePlayerLocalService> {
    private PokerTablePlayerLocalService _pokerTablePlayerLocalService;

    public PokerTablePlayerLocalServiceWrapper(
        PokerTablePlayerLocalService pokerTablePlayerLocalService) {
        _pokerTablePlayerLocalService = pokerTablePlayerLocalService;
    }

    /**
    * Adds the PokerTablePlayer to the database. Also notifies the appropriate model listeners.
    *
    * @param pokerTablePlayer the PokerTablePlayer
    * @return the PokerTablePlayer that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.sbs.pokerp.model.PokerTablePlayer addPokerTablePlayer(
        com.sbs.pokerp.model.PokerTablePlayer pokerTablePlayer)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _pokerTablePlayerLocalService.addPokerTablePlayer(pokerTablePlayer);
    }

    /**
    * Creates a new PokerTablePlayer with the primary key. Does not add the PokerTablePlayer to the database.
    *
    * @param pokerTablePlayerPK the primary key for the new PokerTablePlayer
    * @return the new PokerTablePlayer
    */
    @Override
    public com.sbs.pokerp.model.PokerTablePlayer createPokerTablePlayer(
        com.sbs.pokerp.service.persistence.PokerTablePlayerPK pokerTablePlayerPK) {
        return _pokerTablePlayerLocalService.createPokerTablePlayer(pokerTablePlayerPK);
    }

    /**
    * Deletes the PokerTablePlayer with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param pokerTablePlayerPK the primary key of the PokerTablePlayer
    * @return the PokerTablePlayer that was removed
    * @throws PortalException if a PokerTablePlayer with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.sbs.pokerp.model.PokerTablePlayer deletePokerTablePlayer(
        com.sbs.pokerp.service.persistence.PokerTablePlayerPK pokerTablePlayerPK)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _pokerTablePlayerLocalService.deletePokerTablePlayer(pokerTablePlayerPK);
    }

    /**
    * Deletes the PokerTablePlayer from the database. Also notifies the appropriate model listeners.
    *
    * @param pokerTablePlayer the PokerTablePlayer
    * @return the PokerTablePlayer that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.sbs.pokerp.model.PokerTablePlayer deletePokerTablePlayer(
        com.sbs.pokerp.model.PokerTablePlayer pokerTablePlayer)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _pokerTablePlayerLocalService.deletePokerTablePlayer(pokerTablePlayer);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _pokerTablePlayerLocalService.dynamicQuery();
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
        return _pokerTablePlayerLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.sbs.pokerp.model.impl.PokerTablePlayerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _pokerTablePlayerLocalService.dynamicQuery(dynamicQuery, start,
            end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.sbs.pokerp.model.impl.PokerTablePlayerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _pokerTablePlayerLocalService.dynamicQuery(dynamicQuery, start,
            end, orderByComparator);
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
        return _pokerTablePlayerLocalService.dynamicQueryCount(dynamicQuery);
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
        return _pokerTablePlayerLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public com.sbs.pokerp.model.PokerTablePlayer fetchPokerTablePlayer(
        com.sbs.pokerp.service.persistence.PokerTablePlayerPK pokerTablePlayerPK)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _pokerTablePlayerLocalService.fetchPokerTablePlayer(pokerTablePlayerPK);
    }

    /**
    * Returns the PokerTablePlayer with the primary key.
    *
    * @param pokerTablePlayerPK the primary key of the PokerTablePlayer
    * @return the PokerTablePlayer
    * @throws PortalException if a PokerTablePlayer with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.sbs.pokerp.model.PokerTablePlayer getPokerTablePlayer(
        com.sbs.pokerp.service.persistence.PokerTablePlayerPK pokerTablePlayerPK)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _pokerTablePlayerLocalService.getPokerTablePlayer(pokerTablePlayerPK);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _pokerTablePlayerLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the PokerTablePlayers.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.sbs.pokerp.model.impl.PokerTablePlayerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of PokerTablePlayers
    * @param end the upper bound of the range of PokerTablePlayers (not inclusive)
    * @return the range of PokerTablePlayers
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.sbs.pokerp.model.PokerTablePlayer> getPokerTablePlayers(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _pokerTablePlayerLocalService.getPokerTablePlayers(start, end);
    }

    /**
    * Returns the number of PokerTablePlayers.
    *
    * @return the number of PokerTablePlayers
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getPokerTablePlayersCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _pokerTablePlayerLocalService.getPokerTablePlayersCount();
    }

    /**
    * Updates the PokerTablePlayer in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param pokerTablePlayer the PokerTablePlayer
    * @return the PokerTablePlayer that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.sbs.pokerp.model.PokerTablePlayer updatePokerTablePlayer(
        com.sbs.pokerp.model.PokerTablePlayer pokerTablePlayer)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _pokerTablePlayerLocalService.updatePokerTablePlayer(pokerTablePlayer);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _pokerTablePlayerLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _pokerTablePlayerLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _pokerTablePlayerLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public PokerTablePlayerLocalService getWrappedPokerTablePlayerLocalService() {
        return _pokerTablePlayerLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedPokerTablePlayerLocalService(
        PokerTablePlayerLocalService pokerTablePlayerLocalService) {
        _pokerTablePlayerLocalService = pokerTablePlayerLocalService;
    }

    @Override
    public PokerTablePlayerLocalService getWrappedService() {
        return _pokerTablePlayerLocalService;
    }

    @Override
    public void setWrappedService(
        PokerTablePlayerLocalService pokerTablePlayerLocalService) {
        _pokerTablePlayerLocalService = pokerTablePlayerLocalService;
    }
}
