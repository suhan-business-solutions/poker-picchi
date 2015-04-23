package com.sbs.pokerp.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for PokerTable. This utility wraps
 * {@link com.sbs.pokerp.service.impl.PokerTableLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author jpnaidu
 * @see PokerTableLocalService
 * @see com.sbs.pokerp.service.base.PokerTableLocalServiceBaseImpl
 * @see com.sbs.pokerp.service.impl.PokerTableLocalServiceImpl
 * @generated
 */
public class PokerTableLocalServiceUtil {
    private static PokerTableLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.sbs.pokerp.service.impl.PokerTableLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the PokerTable to the database. Also notifies the appropriate model listeners.
    *
    * @param pokerTable the PokerTable
    * @return the PokerTable that was added
    * @throws SystemException if a system exception occurred
    */
    public static com.sbs.pokerp.model.PokerTable addPokerTable(
        com.sbs.pokerp.model.PokerTable pokerTable)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addPokerTable(pokerTable);
    }

    /**
    * Creates a new PokerTable with the primary key. Does not add the PokerTable to the database.
    *
    * @param gameId the primary key for the new PokerTable
    * @return the new PokerTable
    */
    public static com.sbs.pokerp.model.PokerTable createPokerTable(long gameId) {
        return getService().createPokerTable(gameId);
    }

    /**
    * Deletes the PokerTable with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param gameId the primary key of the PokerTable
    * @return the PokerTable that was removed
    * @throws PortalException if a PokerTable with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.sbs.pokerp.model.PokerTable deletePokerTable(long gameId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deletePokerTable(gameId);
    }

    /**
    * Deletes the PokerTable from the database. Also notifies the appropriate model listeners.
    *
    * @param pokerTable the PokerTable
    * @return the PokerTable that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.sbs.pokerp.model.PokerTable deletePokerTable(
        com.sbs.pokerp.model.PokerTable pokerTable)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deletePokerTable(pokerTable);
    }

    public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return getService().dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery);
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
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery, start, end);
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
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery, projection);
    }

    public static com.sbs.pokerp.model.PokerTable fetchPokerTable(long gameId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchPokerTable(gameId);
    }

    /**
    * Returns the PokerTable with the primary key.
    *
    * @param gameId the primary key of the PokerTable
    * @return the PokerTable
    * @throws PortalException if a PokerTable with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.sbs.pokerp.model.PokerTable getPokerTable(long gameId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPokerTable(gameId);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
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
    public static java.util.List<com.sbs.pokerp.model.PokerTable> getPokerTables(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getPokerTables(start, end);
    }

    /**
    * Returns the number of PokerTables.
    *
    * @return the number of PokerTables
    * @throws SystemException if a system exception occurred
    */
    public static int getPokerTablesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getPokerTablesCount();
    }

    /**
    * Updates the PokerTable in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param pokerTable the PokerTable
    * @return the PokerTable that was updated
    * @throws SystemException if a system exception occurred
    */
    public static com.sbs.pokerp.model.PokerTable updatePokerTable(
        com.sbs.pokerp.model.PokerTable pokerTable)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updatePokerTable(pokerTable);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public static java.lang.String getBeanIdentifier() {
        return getService().getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public static void setBeanIdentifier(java.lang.String beanIdentifier) {
        getService().setBeanIdentifier(beanIdentifier);
    }

    public static java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return getService().invokeMethod(name, parameterTypes, arguments);
    }

    public static void clearService() {
        _service = null;
    }

    public static PokerTableLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    PokerTableLocalService.class.getName());

            if (invokableLocalService instanceof PokerTableLocalService) {
                _service = (PokerTableLocalService) invokableLocalService;
            } else {
                _service = new PokerTableLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(PokerTableLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(PokerTableLocalService service) {
    }
}
