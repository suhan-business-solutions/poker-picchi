package com.sbs.pokerp.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for BuyOut. This utility wraps
 * {@link com.sbs.pokerp.service.impl.BuyOutLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author jpnaidu
 * @see BuyOutLocalService
 * @see com.sbs.pokerp.service.base.BuyOutLocalServiceBaseImpl
 * @see com.sbs.pokerp.service.impl.BuyOutLocalServiceImpl
 * @generated
 */
public class BuyOutLocalServiceUtil {
    private static BuyOutLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.sbs.pokerp.service.impl.BuyOutLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the BuyOut to the database. Also notifies the appropriate model listeners.
    *
    * @param buyOut the BuyOut
    * @return the BuyOut that was added
    * @throws SystemException if a system exception occurred
    */
    public static com.sbs.pokerp.model.BuyOut addBuyOut(
        com.sbs.pokerp.model.BuyOut buyOut)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addBuyOut(buyOut);
    }

    /**
    * Creates a new BuyOut with the primary key. Does not add the BuyOut to the database.
    *
    * @param transactionId the primary key for the new BuyOut
    * @return the new BuyOut
    */
    public static com.sbs.pokerp.model.BuyOut createBuyOut(long transactionId) {
        return getService().createBuyOut(transactionId);
    }

    /**
    * Deletes the BuyOut with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param transactionId the primary key of the BuyOut
    * @return the BuyOut that was removed
    * @throws PortalException if a BuyOut with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.sbs.pokerp.model.BuyOut deleteBuyOut(long transactionId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteBuyOut(transactionId);
    }

    /**
    * Deletes the BuyOut from the database. Also notifies the appropriate model listeners.
    *
    * @param buyOut the BuyOut
    * @return the BuyOut that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.sbs.pokerp.model.BuyOut deleteBuyOut(
        com.sbs.pokerp.model.BuyOut buyOut)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteBuyOut(buyOut);
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
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.sbs.pokerp.model.impl.BuyOutModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

    public static com.sbs.pokerp.model.BuyOut fetchBuyOut(long transactionId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchBuyOut(transactionId);
    }

    /**
    * Returns the BuyOut with the primary key.
    *
    * @param transactionId the primary key of the BuyOut
    * @return the BuyOut
    * @throws PortalException if a BuyOut with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.sbs.pokerp.model.BuyOut getBuyOut(long transactionId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getBuyOut(transactionId);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
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
    public static java.util.List<com.sbs.pokerp.model.BuyOut> getBuyOuts(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getBuyOuts(start, end);
    }

    /**
    * Returns the number of BuyOuts.
    *
    * @return the number of BuyOuts
    * @throws SystemException if a system exception occurred
    */
    public static int getBuyOutsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getBuyOutsCount();
    }

    /**
    * Updates the BuyOut in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param buyOut the BuyOut
    * @return the BuyOut that was updated
    * @throws SystemException if a system exception occurred
    */
    public static com.sbs.pokerp.model.BuyOut updateBuyOut(
        com.sbs.pokerp.model.BuyOut buyOut)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateBuyOut(buyOut);
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

    public static BuyOutLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    BuyOutLocalService.class.getName());

            if (invokableLocalService instanceof BuyOutLocalService) {
                _service = (BuyOutLocalService) invokableLocalService;
            } else {
                _service = new BuyOutLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(BuyOutLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(BuyOutLocalService service) {
    }
}
