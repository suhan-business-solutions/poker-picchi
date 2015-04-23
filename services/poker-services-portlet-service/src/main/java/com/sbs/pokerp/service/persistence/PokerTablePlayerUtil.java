package com.sbs.pokerp.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.sbs.pokerp.model.PokerTablePlayer;

import java.util.List;

/**
 * The persistence utility for the PokerTablePlayer service. This utility wraps {@link PokerTablePlayerPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author jpnaidu
 * @see PokerTablePlayerPersistence
 * @see PokerTablePlayerPersistenceImpl
 * @generated
 */
public class PokerTablePlayerUtil {
    private static PokerTablePlayerPersistence _persistence;

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
    public static void clearCache(PokerTablePlayer pokerTablePlayer) {
        getPersistence().clearCache(pokerTablePlayer);
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
    public static List<PokerTablePlayer> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<PokerTablePlayer> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<PokerTablePlayer> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static PokerTablePlayer update(PokerTablePlayer pokerTablePlayer)
        throws SystemException {
        return getPersistence().update(pokerTablePlayer);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static PokerTablePlayer update(PokerTablePlayer pokerTablePlayer,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(pokerTablePlayer, serviceContext);
    }

    /**
    * Returns the PokerTablePlayer where gameId = &#63; and playerId = &#63; or throws a {@link com.sbs.pokerp.NoSuchPokerTablePlayerException} if it could not be found.
    *
    * @param gameId the game ID
    * @param playerId the player ID
    * @return the matching PokerTablePlayer
    * @throws com.sbs.pokerp.NoSuchPokerTablePlayerException if a matching PokerTablePlayer could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.sbs.pokerp.model.PokerTablePlayer findBygameIdAndPlayerId(
        long gameId, long playerId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.sbs.pokerp.NoSuchPokerTablePlayerException {
        return getPersistence().findBygameIdAndPlayerId(gameId, playerId);
    }

    /**
    * Returns the PokerTablePlayer where gameId = &#63; and playerId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param gameId the game ID
    * @param playerId the player ID
    * @return the matching PokerTablePlayer, or <code>null</code> if a matching PokerTablePlayer could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.sbs.pokerp.model.PokerTablePlayer fetchBygameIdAndPlayerId(
        long gameId, long playerId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchBygameIdAndPlayerId(gameId, playerId);
    }

    /**
    * Returns the PokerTablePlayer where gameId = &#63; and playerId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param gameId the game ID
    * @param playerId the player ID
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching PokerTablePlayer, or <code>null</code> if a matching PokerTablePlayer could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.sbs.pokerp.model.PokerTablePlayer fetchBygameIdAndPlayerId(
        long gameId, long playerId, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchBygameIdAndPlayerId(gameId, playerId, retrieveFromCache);
    }

    /**
    * Removes the PokerTablePlayer where gameId = &#63; and playerId = &#63; from the database.
    *
    * @param gameId the game ID
    * @param playerId the player ID
    * @return the PokerTablePlayer that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.sbs.pokerp.model.PokerTablePlayer removeBygameIdAndPlayerId(
        long gameId, long playerId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.sbs.pokerp.NoSuchPokerTablePlayerException {
        return getPersistence().removeBygameIdAndPlayerId(gameId, playerId);
    }

    /**
    * Returns the number of PokerTablePlayers where gameId = &#63; and playerId = &#63;.
    *
    * @param gameId the game ID
    * @param playerId the player ID
    * @return the number of matching PokerTablePlayers
    * @throws SystemException if a system exception occurred
    */
    public static int countBygameIdAndPlayerId(long gameId, long playerId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countBygameIdAndPlayerId(gameId, playerId);
    }

    /**
    * Returns all the PokerTablePlayers where gameId = &#63;.
    *
    * @param gameId the game ID
    * @return the matching PokerTablePlayers
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.sbs.pokerp.model.PokerTablePlayer> findBygameId(
        long gameId) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findBygameId(gameId);
    }

    /**
    * Returns a range of all the PokerTablePlayers where gameId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.sbs.pokerp.model.impl.PokerTablePlayerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param gameId the game ID
    * @param start the lower bound of the range of PokerTablePlayers
    * @param end the upper bound of the range of PokerTablePlayers (not inclusive)
    * @return the range of matching PokerTablePlayers
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.sbs.pokerp.model.PokerTablePlayer> findBygameId(
        long gameId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findBygameId(gameId, start, end);
    }

    /**
    * Returns an ordered range of all the PokerTablePlayers where gameId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.sbs.pokerp.model.impl.PokerTablePlayerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param gameId the game ID
    * @param start the lower bound of the range of PokerTablePlayers
    * @param end the upper bound of the range of PokerTablePlayers (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching PokerTablePlayers
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.sbs.pokerp.model.PokerTablePlayer> findBygameId(
        long gameId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findBygameId(gameId, start, end, orderByComparator);
    }

    /**
    * Returns the first PokerTablePlayer in the ordered set where gameId = &#63;.
    *
    * @param gameId the game ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching PokerTablePlayer
    * @throws com.sbs.pokerp.NoSuchPokerTablePlayerException if a matching PokerTablePlayer could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.sbs.pokerp.model.PokerTablePlayer findBygameId_First(
        long gameId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.sbs.pokerp.NoSuchPokerTablePlayerException {
        return getPersistence().findBygameId_First(gameId, orderByComparator);
    }

    /**
    * Returns the first PokerTablePlayer in the ordered set where gameId = &#63;.
    *
    * @param gameId the game ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching PokerTablePlayer, or <code>null</code> if a matching PokerTablePlayer could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.sbs.pokerp.model.PokerTablePlayer fetchBygameId_First(
        long gameId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchBygameId_First(gameId, orderByComparator);
    }

    /**
    * Returns the last PokerTablePlayer in the ordered set where gameId = &#63;.
    *
    * @param gameId the game ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching PokerTablePlayer
    * @throws com.sbs.pokerp.NoSuchPokerTablePlayerException if a matching PokerTablePlayer could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.sbs.pokerp.model.PokerTablePlayer findBygameId_Last(
        long gameId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.sbs.pokerp.NoSuchPokerTablePlayerException {
        return getPersistence().findBygameId_Last(gameId, orderByComparator);
    }

    /**
    * Returns the last PokerTablePlayer in the ordered set where gameId = &#63;.
    *
    * @param gameId the game ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching PokerTablePlayer, or <code>null</code> if a matching PokerTablePlayer could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.sbs.pokerp.model.PokerTablePlayer fetchBygameId_Last(
        long gameId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchBygameId_Last(gameId, orderByComparator);
    }

    /**
    * Returns the PokerTablePlayers before and after the current PokerTablePlayer in the ordered set where gameId = &#63;.
    *
    * @param pokerTablePlayerPK the primary key of the current PokerTablePlayer
    * @param gameId the game ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next PokerTablePlayer
    * @throws com.sbs.pokerp.NoSuchPokerTablePlayerException if a PokerTablePlayer with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.sbs.pokerp.model.PokerTablePlayer[] findBygameId_PrevAndNext(
        PokerTablePlayerPK pokerTablePlayerPK, long gameId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.sbs.pokerp.NoSuchPokerTablePlayerException {
        return getPersistence()
                   .findBygameId_PrevAndNext(pokerTablePlayerPK, gameId,
            orderByComparator);
    }

    /**
    * Removes all the PokerTablePlayers where gameId = &#63; from the database.
    *
    * @param gameId the game ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeBygameId(long gameId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeBygameId(gameId);
    }

    /**
    * Returns the number of PokerTablePlayers where gameId = &#63;.
    *
    * @param gameId the game ID
    * @return the number of matching PokerTablePlayers
    * @throws SystemException if a system exception occurred
    */
    public static int countBygameId(long gameId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countBygameId(gameId);
    }

    /**
    * Returns all the PokerTablePlayers where playerId = &#63;.
    *
    * @param playerId the player ID
    * @return the matching PokerTablePlayers
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.sbs.pokerp.model.PokerTablePlayer> findByplayerId(
        long playerId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByplayerId(playerId);
    }

    /**
    * Returns a range of all the PokerTablePlayers where playerId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.sbs.pokerp.model.impl.PokerTablePlayerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param playerId the player ID
    * @param start the lower bound of the range of PokerTablePlayers
    * @param end the upper bound of the range of PokerTablePlayers (not inclusive)
    * @return the range of matching PokerTablePlayers
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.sbs.pokerp.model.PokerTablePlayer> findByplayerId(
        long playerId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByplayerId(playerId, start, end);
    }

    /**
    * Returns an ordered range of all the PokerTablePlayers where playerId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.sbs.pokerp.model.impl.PokerTablePlayerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param playerId the player ID
    * @param start the lower bound of the range of PokerTablePlayers
    * @param end the upper bound of the range of PokerTablePlayers (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching PokerTablePlayers
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.sbs.pokerp.model.PokerTablePlayer> findByplayerId(
        long playerId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByplayerId(playerId, start, end, orderByComparator);
    }

    /**
    * Returns the first PokerTablePlayer in the ordered set where playerId = &#63;.
    *
    * @param playerId the player ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching PokerTablePlayer
    * @throws com.sbs.pokerp.NoSuchPokerTablePlayerException if a matching PokerTablePlayer could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.sbs.pokerp.model.PokerTablePlayer findByplayerId_First(
        long playerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.sbs.pokerp.NoSuchPokerTablePlayerException {
        return getPersistence().findByplayerId_First(playerId, orderByComparator);
    }

    /**
    * Returns the first PokerTablePlayer in the ordered set where playerId = &#63;.
    *
    * @param playerId the player ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching PokerTablePlayer, or <code>null</code> if a matching PokerTablePlayer could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.sbs.pokerp.model.PokerTablePlayer fetchByplayerId_First(
        long playerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByplayerId_First(playerId, orderByComparator);
    }

    /**
    * Returns the last PokerTablePlayer in the ordered set where playerId = &#63;.
    *
    * @param playerId the player ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching PokerTablePlayer
    * @throws com.sbs.pokerp.NoSuchPokerTablePlayerException if a matching PokerTablePlayer could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.sbs.pokerp.model.PokerTablePlayer findByplayerId_Last(
        long playerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.sbs.pokerp.NoSuchPokerTablePlayerException {
        return getPersistence().findByplayerId_Last(playerId, orderByComparator);
    }

    /**
    * Returns the last PokerTablePlayer in the ordered set where playerId = &#63;.
    *
    * @param playerId the player ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching PokerTablePlayer, or <code>null</code> if a matching PokerTablePlayer could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.sbs.pokerp.model.PokerTablePlayer fetchByplayerId_Last(
        long playerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByplayerId_Last(playerId, orderByComparator);
    }

    /**
    * Returns the PokerTablePlayers before and after the current PokerTablePlayer in the ordered set where playerId = &#63;.
    *
    * @param pokerTablePlayerPK the primary key of the current PokerTablePlayer
    * @param playerId the player ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next PokerTablePlayer
    * @throws com.sbs.pokerp.NoSuchPokerTablePlayerException if a PokerTablePlayer with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.sbs.pokerp.model.PokerTablePlayer[] findByplayerId_PrevAndNext(
        PokerTablePlayerPK pokerTablePlayerPK, long playerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.sbs.pokerp.NoSuchPokerTablePlayerException {
        return getPersistence()
                   .findByplayerId_PrevAndNext(pokerTablePlayerPK, playerId,
            orderByComparator);
    }

    /**
    * Removes all the PokerTablePlayers where playerId = &#63; from the database.
    *
    * @param playerId the player ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeByplayerId(long playerId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByplayerId(playerId);
    }

    /**
    * Returns the number of PokerTablePlayers where playerId = &#63;.
    *
    * @param playerId the player ID
    * @return the number of matching PokerTablePlayers
    * @throws SystemException if a system exception occurred
    */
    public static int countByplayerId(long playerId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByplayerId(playerId);
    }

    /**
    * Caches the PokerTablePlayer in the entity cache if it is enabled.
    *
    * @param pokerTablePlayer the PokerTablePlayer
    */
    public static void cacheResult(
        com.sbs.pokerp.model.PokerTablePlayer pokerTablePlayer) {
        getPersistence().cacheResult(pokerTablePlayer);
    }

    /**
    * Caches the PokerTablePlayers in the entity cache if it is enabled.
    *
    * @param pokerTablePlayers the PokerTablePlayers
    */
    public static void cacheResult(
        java.util.List<com.sbs.pokerp.model.PokerTablePlayer> pokerTablePlayers) {
        getPersistence().cacheResult(pokerTablePlayers);
    }

    /**
    * Creates a new PokerTablePlayer with the primary key. Does not add the PokerTablePlayer to the database.
    *
    * @param pokerTablePlayerPK the primary key for the new PokerTablePlayer
    * @return the new PokerTablePlayer
    */
    public static com.sbs.pokerp.model.PokerTablePlayer create(
        PokerTablePlayerPK pokerTablePlayerPK) {
        return getPersistence().create(pokerTablePlayerPK);
    }

    /**
    * Removes the PokerTablePlayer with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param pokerTablePlayerPK the primary key of the PokerTablePlayer
    * @return the PokerTablePlayer that was removed
    * @throws com.sbs.pokerp.NoSuchPokerTablePlayerException if a PokerTablePlayer with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.sbs.pokerp.model.PokerTablePlayer remove(
        PokerTablePlayerPK pokerTablePlayerPK)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.sbs.pokerp.NoSuchPokerTablePlayerException {
        return getPersistence().remove(pokerTablePlayerPK);
    }

    public static com.sbs.pokerp.model.PokerTablePlayer updateImpl(
        com.sbs.pokerp.model.PokerTablePlayer pokerTablePlayer)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(pokerTablePlayer);
    }

    /**
    * Returns the PokerTablePlayer with the primary key or throws a {@link com.sbs.pokerp.NoSuchPokerTablePlayerException} if it could not be found.
    *
    * @param pokerTablePlayerPK the primary key of the PokerTablePlayer
    * @return the PokerTablePlayer
    * @throws com.sbs.pokerp.NoSuchPokerTablePlayerException if a PokerTablePlayer with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.sbs.pokerp.model.PokerTablePlayer findByPrimaryKey(
        PokerTablePlayerPK pokerTablePlayerPK)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.sbs.pokerp.NoSuchPokerTablePlayerException {
        return getPersistence().findByPrimaryKey(pokerTablePlayerPK);
    }

    /**
    * Returns the PokerTablePlayer with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param pokerTablePlayerPK the primary key of the PokerTablePlayer
    * @return the PokerTablePlayer, or <code>null</code> if a PokerTablePlayer with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.sbs.pokerp.model.PokerTablePlayer fetchByPrimaryKey(
        PokerTablePlayerPK pokerTablePlayerPK)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(pokerTablePlayerPK);
    }

    /**
    * Returns all the PokerTablePlayers.
    *
    * @return the PokerTablePlayers
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.sbs.pokerp.model.PokerTablePlayer> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
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
    public static java.util.List<com.sbs.pokerp.model.PokerTablePlayer> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the PokerTablePlayers.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.sbs.pokerp.model.impl.PokerTablePlayerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of PokerTablePlayers
    * @param end the upper bound of the range of PokerTablePlayers (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of PokerTablePlayers
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.sbs.pokerp.model.PokerTablePlayer> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the PokerTablePlayers from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of PokerTablePlayers.
    *
    * @return the number of PokerTablePlayers
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static PokerTablePlayerPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (PokerTablePlayerPersistence) PortletBeanLocatorUtil.locate(com.sbs.pokerp.service.ClpSerializer.getServletContextName(),
                    PokerTablePlayerPersistence.class.getName());

            ReferenceRegistry.registerReference(PokerTablePlayerUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(PokerTablePlayerPersistence persistence) {
    }
}
