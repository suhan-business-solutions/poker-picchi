package com.sbs.pokerp.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.sbs.pokerp.model.PokerTable;

import java.util.List;

/**
 * The persistence utility for the PokerTable service. This utility wraps {@link PokerTablePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author jpnaidu
 * @see PokerTablePersistence
 * @see PokerTablePersistenceImpl
 * @generated
 */
public class PokerTableUtil {
    private static PokerTablePersistence _persistence;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
     */
    public static void clearCache() {
        getPersistence().clearCache();
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
     */
    public static void clearCache(PokerTable pokerTable) {
        getPersistence().clearCache(pokerTable);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
     */
    public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().countWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
     */
    public static List<PokerTable> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<PokerTable> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<PokerTable> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static PokerTable update(PokerTable pokerTable)
        throws SystemException {
        return getPersistence().update(pokerTable);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static PokerTable update(PokerTable pokerTable,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(pokerTable, serviceContext);
    }

    /**
    * Caches the PokerTable in the entity cache if it is enabled.
    *
    * @param pokerTable the PokerTable
    */
    public static void cacheResult(com.sbs.pokerp.model.PokerTable pokerTable) {
        getPersistence().cacheResult(pokerTable);
    }

    /**
    * Caches the PokerTables in the entity cache if it is enabled.
    *
    * @param pokerTables the PokerTables
    */
    public static void cacheResult(
        java.util.List<com.sbs.pokerp.model.PokerTable> pokerTables) {
        getPersistence().cacheResult(pokerTables);
    }

    /**
    * Creates a new PokerTable with the primary key. Does not add the PokerTable to the database.
    *
    * @param gameId the primary key for the new PokerTable
    * @return the new PokerTable
    */
    public static com.sbs.pokerp.model.PokerTable create(long gameId) {
        return getPersistence().create(gameId);
    }

    /**
    * Removes the PokerTable with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param gameId the primary key of the PokerTable
    * @return the PokerTable that was removed
    * @throws com.sbs.pokerp.NoSuchPokerTableException if a PokerTable with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.sbs.pokerp.model.PokerTable remove(long gameId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.sbs.pokerp.NoSuchPokerTableException {
        return getPersistence().remove(gameId);
    }

    public static com.sbs.pokerp.model.PokerTable updateImpl(
        com.sbs.pokerp.model.PokerTable pokerTable)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(pokerTable);
    }

    /**
    * Returns the PokerTable with the primary key or throws a {@link com.sbs.pokerp.NoSuchPokerTableException} if it could not be found.
    *
    * @param gameId the primary key of the PokerTable
    * @return the PokerTable
    * @throws com.sbs.pokerp.NoSuchPokerTableException if a PokerTable with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.sbs.pokerp.model.PokerTable findByPrimaryKey(long gameId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.sbs.pokerp.NoSuchPokerTableException {
        return getPersistence().findByPrimaryKey(gameId);
    }

    /**
    * Returns the PokerTable with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param gameId the primary key of the PokerTable
    * @return the PokerTable, or <code>null</code> if a PokerTable with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.sbs.pokerp.model.PokerTable fetchByPrimaryKey(long gameId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(gameId);
    }

    /**
    * Returns all the PokerTables.
    *
    * @return the PokerTables
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.sbs.pokerp.model.PokerTable> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
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
    public static java.util.List<com.sbs.pokerp.model.PokerTable> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the PokerTables.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.sbs.pokerp.model.impl.PokerTableModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of PokerTables
    * @param end the upper bound of the range of PokerTables (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of PokerTables
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.sbs.pokerp.model.PokerTable> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the PokerTables from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of PokerTables.
    *
    * @return the number of PokerTables
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static PokerTablePersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (PokerTablePersistence) PortletBeanLocatorUtil.locate(com.sbs.pokerp.service.ClpSerializer.getServletContextName(),
                    PokerTablePersistence.class.getName());

            ReferenceRegistry.registerReference(PokerTableUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(PokerTablePersistence persistence) {
    }
}
