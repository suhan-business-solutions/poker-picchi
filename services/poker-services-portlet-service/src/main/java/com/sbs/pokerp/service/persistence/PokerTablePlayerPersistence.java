package com.sbs.pokerp.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.sbs.pokerp.model.PokerTablePlayer;

/**
 * The persistence interface for the PokerTablePlayer service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author jpnaidu
 * @see PokerTablePlayerPersistenceImpl
 * @see PokerTablePlayerUtil
 * @generated
 */
public interface PokerTablePlayerPersistence extends BasePersistence<PokerTablePlayer> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link PokerTablePlayerUtil} to access the PokerTablePlayer persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns the PokerTablePlayer where gameId = &#63; and playerId = &#63; or throws a {@link com.sbs.pokerp.NoSuchPokerTablePlayerException} if it could not be found.
    *
    * @param gameId the game ID
    * @param playerId the player ID
    * @return the matching PokerTablePlayer
    * @throws com.sbs.pokerp.NoSuchPokerTablePlayerException if a matching PokerTablePlayer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.sbs.pokerp.model.PokerTablePlayer findBygameIdAndPlayerId(
        long gameId, long playerId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.sbs.pokerp.NoSuchPokerTablePlayerException;

    /**
    * Returns the PokerTablePlayer where gameId = &#63; and playerId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param gameId the game ID
    * @param playerId the player ID
    * @return the matching PokerTablePlayer, or <code>null</code> if a matching PokerTablePlayer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.sbs.pokerp.model.PokerTablePlayer fetchBygameIdAndPlayerId(
        long gameId, long playerId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the PokerTablePlayer where gameId = &#63; and playerId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param gameId the game ID
    * @param playerId the player ID
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching PokerTablePlayer, or <code>null</code> if a matching PokerTablePlayer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.sbs.pokerp.model.PokerTablePlayer fetchBygameIdAndPlayerId(
        long gameId, long playerId, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes the PokerTablePlayer where gameId = &#63; and playerId = &#63; from the database.
    *
    * @param gameId the game ID
    * @param playerId the player ID
    * @return the PokerTablePlayer that was removed
    * @throws SystemException if a system exception occurred
    */
    public com.sbs.pokerp.model.PokerTablePlayer removeBygameIdAndPlayerId(
        long gameId, long playerId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.sbs.pokerp.NoSuchPokerTablePlayerException;

    /**
    * Returns the number of PokerTablePlayers where gameId = &#63; and playerId = &#63;.
    *
    * @param gameId the game ID
    * @param playerId the player ID
    * @return the number of matching PokerTablePlayers
    * @throws SystemException if a system exception occurred
    */
    public int countBygameIdAndPlayerId(long gameId, long playerId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the PokerTablePlayers where gameId = &#63;.
    *
    * @param gameId the game ID
    * @return the matching PokerTablePlayers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.sbs.pokerp.model.PokerTablePlayer> findBygameId(
        long gameId) throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.sbs.pokerp.model.PokerTablePlayer> findBygameId(
        long gameId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.sbs.pokerp.model.PokerTablePlayer> findBygameId(
        long gameId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first PokerTablePlayer in the ordered set where gameId = &#63;.
    *
    * @param gameId the game ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching PokerTablePlayer
    * @throws com.sbs.pokerp.NoSuchPokerTablePlayerException if a matching PokerTablePlayer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.sbs.pokerp.model.PokerTablePlayer findBygameId_First(
        long gameId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.sbs.pokerp.NoSuchPokerTablePlayerException;

    /**
    * Returns the first PokerTablePlayer in the ordered set where gameId = &#63;.
    *
    * @param gameId the game ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching PokerTablePlayer, or <code>null</code> if a matching PokerTablePlayer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.sbs.pokerp.model.PokerTablePlayer fetchBygameId_First(
        long gameId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last PokerTablePlayer in the ordered set where gameId = &#63;.
    *
    * @param gameId the game ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching PokerTablePlayer
    * @throws com.sbs.pokerp.NoSuchPokerTablePlayerException if a matching PokerTablePlayer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.sbs.pokerp.model.PokerTablePlayer findBygameId_Last(
        long gameId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.sbs.pokerp.NoSuchPokerTablePlayerException;

    /**
    * Returns the last PokerTablePlayer in the ordered set where gameId = &#63;.
    *
    * @param gameId the game ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching PokerTablePlayer, or <code>null</code> if a matching PokerTablePlayer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.sbs.pokerp.model.PokerTablePlayer fetchBygameId_Last(
        long gameId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.sbs.pokerp.model.PokerTablePlayer[] findBygameId_PrevAndNext(
        PokerTablePlayerPK pokerTablePlayerPK, long gameId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.sbs.pokerp.NoSuchPokerTablePlayerException;

    /**
    * Removes all the PokerTablePlayers where gameId = &#63; from the database.
    *
    * @param gameId the game ID
    * @throws SystemException if a system exception occurred
    */
    public void removeBygameId(long gameId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of PokerTablePlayers where gameId = &#63;.
    *
    * @param gameId the game ID
    * @return the number of matching PokerTablePlayers
    * @throws SystemException if a system exception occurred
    */
    public int countBygameId(long gameId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the PokerTablePlayers where playerId = &#63;.
    *
    * @param playerId the player ID
    * @return the matching PokerTablePlayers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.sbs.pokerp.model.PokerTablePlayer> findByplayerId(
        long playerId)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.sbs.pokerp.model.PokerTablePlayer> findByplayerId(
        long playerId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.sbs.pokerp.model.PokerTablePlayer> findByplayerId(
        long playerId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first PokerTablePlayer in the ordered set where playerId = &#63;.
    *
    * @param playerId the player ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching PokerTablePlayer
    * @throws com.sbs.pokerp.NoSuchPokerTablePlayerException if a matching PokerTablePlayer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.sbs.pokerp.model.PokerTablePlayer findByplayerId_First(
        long playerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.sbs.pokerp.NoSuchPokerTablePlayerException;

    /**
    * Returns the first PokerTablePlayer in the ordered set where playerId = &#63;.
    *
    * @param playerId the player ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching PokerTablePlayer, or <code>null</code> if a matching PokerTablePlayer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.sbs.pokerp.model.PokerTablePlayer fetchByplayerId_First(
        long playerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last PokerTablePlayer in the ordered set where playerId = &#63;.
    *
    * @param playerId the player ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching PokerTablePlayer
    * @throws com.sbs.pokerp.NoSuchPokerTablePlayerException if a matching PokerTablePlayer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.sbs.pokerp.model.PokerTablePlayer findByplayerId_Last(
        long playerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.sbs.pokerp.NoSuchPokerTablePlayerException;

    /**
    * Returns the last PokerTablePlayer in the ordered set where playerId = &#63;.
    *
    * @param playerId the player ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching PokerTablePlayer, or <code>null</code> if a matching PokerTablePlayer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.sbs.pokerp.model.PokerTablePlayer fetchByplayerId_Last(
        long playerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.sbs.pokerp.model.PokerTablePlayer[] findByplayerId_PrevAndNext(
        PokerTablePlayerPK pokerTablePlayerPK, long playerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.sbs.pokerp.NoSuchPokerTablePlayerException;

    /**
    * Removes all the PokerTablePlayers where playerId = &#63; from the database.
    *
    * @param playerId the player ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByplayerId(long playerId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of PokerTablePlayers where playerId = &#63;.
    *
    * @param playerId the player ID
    * @return the number of matching PokerTablePlayers
    * @throws SystemException if a system exception occurred
    */
    public int countByplayerId(long playerId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the PokerTablePlayer in the entity cache if it is enabled.
    *
    * @param pokerTablePlayer the PokerTablePlayer
    */
    public void cacheResult(
        com.sbs.pokerp.model.PokerTablePlayer pokerTablePlayer);

    /**
    * Caches the PokerTablePlayers in the entity cache if it is enabled.
    *
    * @param pokerTablePlayers the PokerTablePlayers
    */
    public void cacheResult(
        java.util.List<com.sbs.pokerp.model.PokerTablePlayer> pokerTablePlayers);

    /**
    * Creates a new PokerTablePlayer with the primary key. Does not add the PokerTablePlayer to the database.
    *
    * @param pokerTablePlayerPK the primary key for the new PokerTablePlayer
    * @return the new PokerTablePlayer
    */
    public com.sbs.pokerp.model.PokerTablePlayer create(
        PokerTablePlayerPK pokerTablePlayerPK);

    /**
    * Removes the PokerTablePlayer with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param pokerTablePlayerPK the primary key of the PokerTablePlayer
    * @return the PokerTablePlayer that was removed
    * @throws com.sbs.pokerp.NoSuchPokerTablePlayerException if a PokerTablePlayer with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.sbs.pokerp.model.PokerTablePlayer remove(
        PokerTablePlayerPK pokerTablePlayerPK)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.sbs.pokerp.NoSuchPokerTablePlayerException;

    public com.sbs.pokerp.model.PokerTablePlayer updateImpl(
        com.sbs.pokerp.model.PokerTablePlayer pokerTablePlayer)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the PokerTablePlayer with the primary key or throws a {@link com.sbs.pokerp.NoSuchPokerTablePlayerException} if it could not be found.
    *
    * @param pokerTablePlayerPK the primary key of the PokerTablePlayer
    * @return the PokerTablePlayer
    * @throws com.sbs.pokerp.NoSuchPokerTablePlayerException if a PokerTablePlayer with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.sbs.pokerp.model.PokerTablePlayer findByPrimaryKey(
        PokerTablePlayerPK pokerTablePlayerPK)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.sbs.pokerp.NoSuchPokerTablePlayerException;

    /**
    * Returns the PokerTablePlayer with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param pokerTablePlayerPK the primary key of the PokerTablePlayer
    * @return the PokerTablePlayer, or <code>null</code> if a PokerTablePlayer with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.sbs.pokerp.model.PokerTablePlayer fetchByPrimaryKey(
        PokerTablePlayerPK pokerTablePlayerPK)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the PokerTablePlayers.
    *
    * @return the PokerTablePlayers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.sbs.pokerp.model.PokerTablePlayer> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.sbs.pokerp.model.PokerTablePlayer> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.sbs.pokerp.model.PokerTablePlayer> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the PokerTablePlayers from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of PokerTablePlayers.
    *
    * @return the number of PokerTablePlayers
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
