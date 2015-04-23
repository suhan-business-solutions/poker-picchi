package com.sbs.pokerp.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.sbs.pokerp.model.BuyOut;

import java.util.List;

/**
 * The persistence utility for the BuyOut service. This utility wraps {@link BuyOutPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author jpnaidu
 * @see BuyOutPersistence
 * @see BuyOutPersistenceImpl
 * @generated
 */
public class BuyOutUtil {
    private static BuyOutPersistence _persistence;

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
    public static void clearCache(BuyOut buyOut) {
        getPersistence().clearCache(buyOut);
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
    public static List<BuyOut> findWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<BuyOut> findWithDynamicQuery(DynamicQuery dynamicQuery,
        int start, int end) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<BuyOut> findWithDynamicQuery(DynamicQuery dynamicQuery,
        int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static BuyOut update(BuyOut buyOut) throws SystemException {
        return getPersistence().update(buyOut);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static BuyOut update(BuyOut buyOut, ServiceContext serviceContext)
        throws SystemException {
        return getPersistence().update(buyOut, serviceContext);
    }

    /**
    * Returns all the BuyOuts where gameId = &#63; and playerId = &#63;.
    *
    * @param gameId the game ID
    * @param playerId the player ID
    * @return the matching BuyOuts
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.sbs.pokerp.model.BuyOut> findBygameIdAndPlayerId(
        long gameId, long playerId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findBygameIdAndPlayerId(gameId, playerId);
    }

    /**
    * Returns a range of all the BuyOuts where gameId = &#63; and playerId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.sbs.pokerp.model.impl.BuyOutModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param gameId the game ID
    * @param playerId the player ID
    * @param start the lower bound of the range of BuyOuts
    * @param end the upper bound of the range of BuyOuts (not inclusive)
    * @return the range of matching BuyOuts
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.sbs.pokerp.model.BuyOut> findBygameIdAndPlayerId(
        long gameId, long playerId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findBygameIdAndPlayerId(gameId, playerId, start, end);
    }

    /**
    * Returns an ordered range of all the BuyOuts where gameId = &#63; and playerId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.sbs.pokerp.model.impl.BuyOutModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param gameId the game ID
    * @param playerId the player ID
    * @param start the lower bound of the range of BuyOuts
    * @param end the upper bound of the range of BuyOuts (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching BuyOuts
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.sbs.pokerp.model.BuyOut> findBygameIdAndPlayerId(
        long gameId, long playerId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findBygameIdAndPlayerId(gameId, playerId, start, end,
            orderByComparator);
    }

    /**
    * Returns the first BuyOut in the ordered set where gameId = &#63; and playerId = &#63;.
    *
    * @param gameId the game ID
    * @param playerId the player ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching BuyOut
    * @throws com.sbs.pokerp.NoSuchBuyOutException if a matching BuyOut could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.sbs.pokerp.model.BuyOut findBygameIdAndPlayerId_First(
        long gameId, long playerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.sbs.pokerp.NoSuchBuyOutException {
        return getPersistence()
                   .findBygameIdAndPlayerId_First(gameId, playerId,
            orderByComparator);
    }

    /**
    * Returns the first BuyOut in the ordered set where gameId = &#63; and playerId = &#63;.
    *
    * @param gameId the game ID
    * @param playerId the player ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching BuyOut, or <code>null</code> if a matching BuyOut could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.sbs.pokerp.model.BuyOut fetchBygameIdAndPlayerId_First(
        long gameId, long playerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchBygameIdAndPlayerId_First(gameId, playerId,
            orderByComparator);
    }

    /**
    * Returns the last BuyOut in the ordered set where gameId = &#63; and playerId = &#63;.
    *
    * @param gameId the game ID
    * @param playerId the player ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching BuyOut
    * @throws com.sbs.pokerp.NoSuchBuyOutException if a matching BuyOut could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.sbs.pokerp.model.BuyOut findBygameIdAndPlayerId_Last(
        long gameId, long playerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.sbs.pokerp.NoSuchBuyOutException {
        return getPersistence()
                   .findBygameIdAndPlayerId_Last(gameId, playerId,
            orderByComparator);
    }

    /**
    * Returns the last BuyOut in the ordered set where gameId = &#63; and playerId = &#63;.
    *
    * @param gameId the game ID
    * @param playerId the player ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching BuyOut, or <code>null</code> if a matching BuyOut could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.sbs.pokerp.model.BuyOut fetchBygameIdAndPlayerId_Last(
        long gameId, long playerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchBygameIdAndPlayerId_Last(gameId, playerId,
            orderByComparator);
    }

    /**
    * Returns the BuyOuts before and after the current BuyOut in the ordered set where gameId = &#63; and playerId = &#63;.
    *
    * @param transactionId the primary key of the current BuyOut
    * @param gameId the game ID
    * @param playerId the player ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next BuyOut
    * @throws com.sbs.pokerp.NoSuchBuyOutException if a BuyOut with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.sbs.pokerp.model.BuyOut[] findBygameIdAndPlayerId_PrevAndNext(
        long transactionId, long gameId, long playerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.sbs.pokerp.NoSuchBuyOutException {
        return getPersistence()
                   .findBygameIdAndPlayerId_PrevAndNext(transactionId, gameId,
            playerId, orderByComparator);
    }

    /**
    * Removes all the BuyOuts where gameId = &#63; and playerId = &#63; from the database.
    *
    * @param gameId the game ID
    * @param playerId the player ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeBygameIdAndPlayerId(long gameId, long playerId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeBygameIdAndPlayerId(gameId, playerId);
    }

    /**
    * Returns the number of BuyOuts where gameId = &#63; and playerId = &#63;.
    *
    * @param gameId the game ID
    * @param playerId the player ID
    * @return the number of matching BuyOuts
    * @throws SystemException if a system exception occurred
    */
    public static int countBygameIdAndPlayerId(long gameId, long playerId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countBygameIdAndPlayerId(gameId, playerId);
    }

    /**
    * Returns all the BuyOuts where gameId = &#63;.
    *
    * @param gameId the game ID
    * @return the matching BuyOuts
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.sbs.pokerp.model.BuyOut> findBygameId(
        long gameId) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findBygameId(gameId);
    }

    /**
    * Returns a range of all the BuyOuts where gameId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.sbs.pokerp.model.impl.BuyOutModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param gameId the game ID
    * @param start the lower bound of the range of BuyOuts
    * @param end the upper bound of the range of BuyOuts (not inclusive)
    * @return the range of matching BuyOuts
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.sbs.pokerp.model.BuyOut> findBygameId(
        long gameId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findBygameId(gameId, start, end);
    }

    /**
    * Returns an ordered range of all the BuyOuts where gameId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.sbs.pokerp.model.impl.BuyOutModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param gameId the game ID
    * @param start the lower bound of the range of BuyOuts
    * @param end the upper bound of the range of BuyOuts (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching BuyOuts
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.sbs.pokerp.model.BuyOut> findBygameId(
        long gameId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findBygameId(gameId, start, end, orderByComparator);
    }

    /**
    * Returns the first BuyOut in the ordered set where gameId = &#63;.
    *
    * @param gameId the game ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching BuyOut
    * @throws com.sbs.pokerp.NoSuchBuyOutException if a matching BuyOut could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.sbs.pokerp.model.BuyOut findBygameId_First(long gameId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.sbs.pokerp.NoSuchBuyOutException {
        return getPersistence().findBygameId_First(gameId, orderByComparator);
    }

    /**
    * Returns the first BuyOut in the ordered set where gameId = &#63;.
    *
    * @param gameId the game ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching BuyOut, or <code>null</code> if a matching BuyOut could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.sbs.pokerp.model.BuyOut fetchBygameId_First(long gameId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchBygameId_First(gameId, orderByComparator);
    }

    /**
    * Returns the last BuyOut in the ordered set where gameId = &#63;.
    *
    * @param gameId the game ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching BuyOut
    * @throws com.sbs.pokerp.NoSuchBuyOutException if a matching BuyOut could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.sbs.pokerp.model.BuyOut findBygameId_Last(long gameId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.sbs.pokerp.NoSuchBuyOutException {
        return getPersistence().findBygameId_Last(gameId, orderByComparator);
    }

    /**
    * Returns the last BuyOut in the ordered set where gameId = &#63;.
    *
    * @param gameId the game ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching BuyOut, or <code>null</code> if a matching BuyOut could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.sbs.pokerp.model.BuyOut fetchBygameId_Last(long gameId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchBygameId_Last(gameId, orderByComparator);
    }

    /**
    * Returns the BuyOuts before and after the current BuyOut in the ordered set where gameId = &#63;.
    *
    * @param transactionId the primary key of the current BuyOut
    * @param gameId the game ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next BuyOut
    * @throws com.sbs.pokerp.NoSuchBuyOutException if a BuyOut with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.sbs.pokerp.model.BuyOut[] findBygameId_PrevAndNext(
        long transactionId, long gameId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.sbs.pokerp.NoSuchBuyOutException {
        return getPersistence()
                   .findBygameId_PrevAndNext(transactionId, gameId,
            orderByComparator);
    }

    /**
    * Removes all the BuyOuts where gameId = &#63; from the database.
    *
    * @param gameId the game ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeBygameId(long gameId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeBygameId(gameId);
    }

    /**
    * Returns the number of BuyOuts where gameId = &#63;.
    *
    * @param gameId the game ID
    * @return the number of matching BuyOuts
    * @throws SystemException if a system exception occurred
    */
    public static int countBygameId(long gameId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countBygameId(gameId);
    }

    /**
    * Caches the BuyOut in the entity cache if it is enabled.
    *
    * @param buyOut the BuyOut
    */
    public static void cacheResult(com.sbs.pokerp.model.BuyOut buyOut) {
        getPersistence().cacheResult(buyOut);
    }

    /**
    * Caches the BuyOuts in the entity cache if it is enabled.
    *
    * @param buyOuts the BuyOuts
    */
    public static void cacheResult(
        java.util.List<com.sbs.pokerp.model.BuyOut> buyOuts) {
        getPersistence().cacheResult(buyOuts);
    }

    /**
    * Creates a new BuyOut with the primary key. Does not add the BuyOut to the database.
    *
    * @param transactionId the primary key for the new BuyOut
    * @return the new BuyOut
    */
    public static com.sbs.pokerp.model.BuyOut create(long transactionId) {
        return getPersistence().create(transactionId);
    }

    /**
    * Removes the BuyOut with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param transactionId the primary key of the BuyOut
    * @return the BuyOut that was removed
    * @throws com.sbs.pokerp.NoSuchBuyOutException if a BuyOut with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.sbs.pokerp.model.BuyOut remove(long transactionId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.sbs.pokerp.NoSuchBuyOutException {
        return getPersistence().remove(transactionId);
    }

    public static com.sbs.pokerp.model.BuyOut updateImpl(
        com.sbs.pokerp.model.BuyOut buyOut)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(buyOut);
    }

    /**
    * Returns the BuyOut with the primary key or throws a {@link com.sbs.pokerp.NoSuchBuyOutException} if it could not be found.
    *
    * @param transactionId the primary key of the BuyOut
    * @return the BuyOut
    * @throws com.sbs.pokerp.NoSuchBuyOutException if a BuyOut with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.sbs.pokerp.model.BuyOut findByPrimaryKey(
        long transactionId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.sbs.pokerp.NoSuchBuyOutException {
        return getPersistence().findByPrimaryKey(transactionId);
    }

    /**
    * Returns the BuyOut with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param transactionId the primary key of the BuyOut
    * @return the BuyOut, or <code>null</code> if a BuyOut with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.sbs.pokerp.model.BuyOut fetchByPrimaryKey(
        long transactionId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(transactionId);
    }

    /**
    * Returns all the BuyOuts.
    *
    * @return the BuyOuts
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.sbs.pokerp.model.BuyOut> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
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
    public static java.util.List<com.sbs.pokerp.model.BuyOut> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the BuyOuts.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.sbs.pokerp.model.impl.BuyOutModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of BuyOuts
    * @param end the upper bound of the range of BuyOuts (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of BuyOuts
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.sbs.pokerp.model.BuyOut> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the BuyOuts from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of BuyOuts.
    *
    * @return the number of BuyOuts
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static BuyOutPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (BuyOutPersistence) PortletBeanLocatorUtil.locate(com.sbs.pokerp.service.ClpSerializer.getServletContextName(),
                    BuyOutPersistence.class.getName());

            ReferenceRegistry.registerReference(BuyOutUtil.class, "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(BuyOutPersistence persistence) {
    }
}
