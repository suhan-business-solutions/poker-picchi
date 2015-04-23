package com.sbs.pokerp.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.sbs.pokerp.model.BuyIn;

import java.util.List;

/**
 * The persistence utility for the BuyIn service. This utility wraps {@link BuyInPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author jpnaidu
 * @see BuyInPersistence
 * @see BuyInPersistenceImpl
 * @generated
 */
public class BuyInUtil {
    private static BuyInPersistence _persistence;

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
    public static void clearCache(BuyIn buyIn) {
        getPersistence().clearCache(buyIn);
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
    public static List<BuyIn> findWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<BuyIn> findWithDynamicQuery(DynamicQuery dynamicQuery,
        int start, int end) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<BuyIn> findWithDynamicQuery(DynamicQuery dynamicQuery,
        int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static BuyIn update(BuyIn buyIn) throws SystemException {
        return getPersistence().update(buyIn);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static BuyIn update(BuyIn buyIn, ServiceContext serviceContext)
        throws SystemException {
        return getPersistence().update(buyIn, serviceContext);
    }

    /**
    * Returns all the BuyIns where gameId = &#63; and playerId = &#63;.
    *
    * @param gameId the game ID
    * @param playerId the player ID
    * @return the matching BuyIns
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.sbs.pokerp.model.BuyIn> findBygameIdAndPlayerId(
        long gameId, long playerId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findBygameIdAndPlayerId(gameId, playerId);
    }

    /**
    * Returns a range of all the BuyIns where gameId = &#63; and playerId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.sbs.pokerp.model.impl.BuyInModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param gameId the game ID
    * @param playerId the player ID
    * @param start the lower bound of the range of BuyIns
    * @param end the upper bound of the range of BuyIns (not inclusive)
    * @return the range of matching BuyIns
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.sbs.pokerp.model.BuyIn> findBygameIdAndPlayerId(
        long gameId, long playerId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findBygameIdAndPlayerId(gameId, playerId, start, end);
    }

    /**
    * Returns an ordered range of all the BuyIns where gameId = &#63; and playerId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.sbs.pokerp.model.impl.BuyInModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param gameId the game ID
    * @param playerId the player ID
    * @param start the lower bound of the range of BuyIns
    * @param end the upper bound of the range of BuyIns (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching BuyIns
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.sbs.pokerp.model.BuyIn> findBygameIdAndPlayerId(
        long gameId, long playerId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findBygameIdAndPlayerId(gameId, playerId, start, end,
            orderByComparator);
    }

    /**
    * Returns the first BuyIn in the ordered set where gameId = &#63; and playerId = &#63;.
    *
    * @param gameId the game ID
    * @param playerId the player ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching BuyIn
    * @throws com.sbs.pokerp.NoSuchBuyInException if a matching BuyIn could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.sbs.pokerp.model.BuyIn findBygameIdAndPlayerId_First(
        long gameId, long playerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.sbs.pokerp.NoSuchBuyInException {
        return getPersistence()
                   .findBygameIdAndPlayerId_First(gameId, playerId,
            orderByComparator);
    }

    /**
    * Returns the first BuyIn in the ordered set where gameId = &#63; and playerId = &#63;.
    *
    * @param gameId the game ID
    * @param playerId the player ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching BuyIn, or <code>null</code> if a matching BuyIn could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.sbs.pokerp.model.BuyIn fetchBygameIdAndPlayerId_First(
        long gameId, long playerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchBygameIdAndPlayerId_First(gameId, playerId,
            orderByComparator);
    }

    /**
    * Returns the last BuyIn in the ordered set where gameId = &#63; and playerId = &#63;.
    *
    * @param gameId the game ID
    * @param playerId the player ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching BuyIn
    * @throws com.sbs.pokerp.NoSuchBuyInException if a matching BuyIn could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.sbs.pokerp.model.BuyIn findBygameIdAndPlayerId_Last(
        long gameId, long playerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.sbs.pokerp.NoSuchBuyInException {
        return getPersistence()
                   .findBygameIdAndPlayerId_Last(gameId, playerId,
            orderByComparator);
    }

    /**
    * Returns the last BuyIn in the ordered set where gameId = &#63; and playerId = &#63;.
    *
    * @param gameId the game ID
    * @param playerId the player ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching BuyIn, or <code>null</code> if a matching BuyIn could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.sbs.pokerp.model.BuyIn fetchBygameIdAndPlayerId_Last(
        long gameId, long playerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchBygameIdAndPlayerId_Last(gameId, playerId,
            orderByComparator);
    }

    /**
    * Returns the BuyIns before and after the current BuyIn in the ordered set where gameId = &#63; and playerId = &#63;.
    *
    * @param transactionId the primary key of the current BuyIn
    * @param gameId the game ID
    * @param playerId the player ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next BuyIn
    * @throws com.sbs.pokerp.NoSuchBuyInException if a BuyIn with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.sbs.pokerp.model.BuyIn[] findBygameIdAndPlayerId_PrevAndNext(
        long transactionId, long gameId, long playerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.sbs.pokerp.NoSuchBuyInException {
        return getPersistence()
                   .findBygameIdAndPlayerId_PrevAndNext(transactionId, gameId,
            playerId, orderByComparator);
    }

    /**
    * Removes all the BuyIns where gameId = &#63; and playerId = &#63; from the database.
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
    * Returns the number of BuyIns where gameId = &#63; and playerId = &#63;.
    *
    * @param gameId the game ID
    * @param playerId the player ID
    * @return the number of matching BuyIns
    * @throws SystemException if a system exception occurred
    */
    public static int countBygameIdAndPlayerId(long gameId, long playerId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countBygameIdAndPlayerId(gameId, playerId);
    }

    /**
    * Returns all the BuyIns where gameId = &#63;.
    *
    * @param gameId the game ID
    * @return the matching BuyIns
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.sbs.pokerp.model.BuyIn> findBygameId(
        long gameId) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findBygameId(gameId);
    }

    /**
    * Returns a range of all the BuyIns where gameId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.sbs.pokerp.model.impl.BuyInModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param gameId the game ID
    * @param start the lower bound of the range of BuyIns
    * @param end the upper bound of the range of BuyIns (not inclusive)
    * @return the range of matching BuyIns
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.sbs.pokerp.model.BuyIn> findBygameId(
        long gameId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findBygameId(gameId, start, end);
    }

    /**
    * Returns an ordered range of all the BuyIns where gameId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.sbs.pokerp.model.impl.BuyInModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param gameId the game ID
    * @param start the lower bound of the range of BuyIns
    * @param end the upper bound of the range of BuyIns (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching BuyIns
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.sbs.pokerp.model.BuyIn> findBygameId(
        long gameId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findBygameId(gameId, start, end, orderByComparator);
    }

    /**
    * Returns the first BuyIn in the ordered set where gameId = &#63;.
    *
    * @param gameId the game ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching BuyIn
    * @throws com.sbs.pokerp.NoSuchBuyInException if a matching BuyIn could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.sbs.pokerp.model.BuyIn findBygameId_First(long gameId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.sbs.pokerp.NoSuchBuyInException {
        return getPersistence().findBygameId_First(gameId, orderByComparator);
    }

    /**
    * Returns the first BuyIn in the ordered set where gameId = &#63;.
    *
    * @param gameId the game ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching BuyIn, or <code>null</code> if a matching BuyIn could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.sbs.pokerp.model.BuyIn fetchBygameId_First(long gameId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchBygameId_First(gameId, orderByComparator);
    }

    /**
    * Returns the last BuyIn in the ordered set where gameId = &#63;.
    *
    * @param gameId the game ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching BuyIn
    * @throws com.sbs.pokerp.NoSuchBuyInException if a matching BuyIn could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.sbs.pokerp.model.BuyIn findBygameId_Last(long gameId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.sbs.pokerp.NoSuchBuyInException {
        return getPersistence().findBygameId_Last(gameId, orderByComparator);
    }

    /**
    * Returns the last BuyIn in the ordered set where gameId = &#63;.
    *
    * @param gameId the game ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching BuyIn, or <code>null</code> if a matching BuyIn could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.sbs.pokerp.model.BuyIn fetchBygameId_Last(long gameId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchBygameId_Last(gameId, orderByComparator);
    }

    /**
    * Returns the BuyIns before and after the current BuyIn in the ordered set where gameId = &#63;.
    *
    * @param transactionId the primary key of the current BuyIn
    * @param gameId the game ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next BuyIn
    * @throws com.sbs.pokerp.NoSuchBuyInException if a BuyIn with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.sbs.pokerp.model.BuyIn[] findBygameId_PrevAndNext(
        long transactionId, long gameId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.sbs.pokerp.NoSuchBuyInException {
        return getPersistence()
                   .findBygameId_PrevAndNext(transactionId, gameId,
            orderByComparator);
    }

    /**
    * Removes all the BuyIns where gameId = &#63; from the database.
    *
    * @param gameId the game ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeBygameId(long gameId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeBygameId(gameId);
    }

    /**
    * Returns the number of BuyIns where gameId = &#63;.
    *
    * @param gameId the game ID
    * @return the number of matching BuyIns
    * @throws SystemException if a system exception occurred
    */
    public static int countBygameId(long gameId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countBygameId(gameId);
    }

    /**
    * Caches the BuyIn in the entity cache if it is enabled.
    *
    * @param buyIn the BuyIn
    */
    public static void cacheResult(com.sbs.pokerp.model.BuyIn buyIn) {
        getPersistence().cacheResult(buyIn);
    }

    /**
    * Caches the BuyIns in the entity cache if it is enabled.
    *
    * @param buyIns the BuyIns
    */
    public static void cacheResult(
        java.util.List<com.sbs.pokerp.model.BuyIn> buyIns) {
        getPersistence().cacheResult(buyIns);
    }

    /**
    * Creates a new BuyIn with the primary key. Does not add the BuyIn to the database.
    *
    * @param transactionId the primary key for the new BuyIn
    * @return the new BuyIn
    */
    public static com.sbs.pokerp.model.BuyIn create(long transactionId) {
        return getPersistence().create(transactionId);
    }

    /**
    * Removes the BuyIn with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param transactionId the primary key of the BuyIn
    * @return the BuyIn that was removed
    * @throws com.sbs.pokerp.NoSuchBuyInException if a BuyIn with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.sbs.pokerp.model.BuyIn remove(long transactionId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.sbs.pokerp.NoSuchBuyInException {
        return getPersistence().remove(transactionId);
    }

    public static com.sbs.pokerp.model.BuyIn updateImpl(
        com.sbs.pokerp.model.BuyIn buyIn)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(buyIn);
    }

    /**
    * Returns the BuyIn with the primary key or throws a {@link com.sbs.pokerp.NoSuchBuyInException} if it could not be found.
    *
    * @param transactionId the primary key of the BuyIn
    * @return the BuyIn
    * @throws com.sbs.pokerp.NoSuchBuyInException if a BuyIn with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.sbs.pokerp.model.BuyIn findByPrimaryKey(
        long transactionId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.sbs.pokerp.NoSuchBuyInException {
        return getPersistence().findByPrimaryKey(transactionId);
    }

    /**
    * Returns the BuyIn with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param transactionId the primary key of the BuyIn
    * @return the BuyIn, or <code>null</code> if a BuyIn with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.sbs.pokerp.model.BuyIn fetchByPrimaryKey(
        long transactionId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(transactionId);
    }

    /**
    * Returns all the BuyIns.
    *
    * @return the BuyIns
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.sbs.pokerp.model.BuyIn> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the BuyIns.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.sbs.pokerp.model.impl.BuyInModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of BuyIns
    * @param end the upper bound of the range of BuyIns (not inclusive)
    * @return the range of BuyIns
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.sbs.pokerp.model.BuyIn> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the BuyIns.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.sbs.pokerp.model.impl.BuyInModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of BuyIns
    * @param end the upper bound of the range of BuyIns (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of BuyIns
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.sbs.pokerp.model.BuyIn> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the BuyIns from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of BuyIns.
    *
    * @return the number of BuyIns
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static BuyInPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (BuyInPersistence) PortletBeanLocatorUtil.locate(com.sbs.pokerp.service.ClpSerializer.getServletContextName(),
                    BuyInPersistence.class.getName());

            ReferenceRegistry.registerReference(BuyInUtil.class, "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(BuyInPersistence persistence) {
    }
}
