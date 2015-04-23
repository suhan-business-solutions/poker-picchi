package com.sbs.pokerp.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.sbs.pokerp.model.BuyIn;

/**
 * The persistence interface for the BuyIn service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author jpnaidu
 * @see BuyInPersistenceImpl
 * @see BuyInUtil
 * @generated
 */
public interface BuyInPersistence extends BasePersistence<BuyIn> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link BuyInUtil} to access the BuyIn persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the BuyIns where gameId = &#63; and playerId = &#63;.
    *
    * @param gameId the game ID
    * @param playerId the player ID
    * @return the matching BuyIns
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.sbs.pokerp.model.BuyIn> findBygameIdAndPlayerId(
        long gameId, long playerId)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.sbs.pokerp.model.BuyIn> findBygameIdAndPlayerId(
        long gameId, long playerId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.sbs.pokerp.model.BuyIn> findBygameIdAndPlayerId(
        long gameId, long playerId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.sbs.pokerp.model.BuyIn findBygameIdAndPlayerId_First(
        long gameId, long playerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.sbs.pokerp.NoSuchBuyInException;

    /**
    * Returns the first BuyIn in the ordered set where gameId = &#63; and playerId = &#63;.
    *
    * @param gameId the game ID
    * @param playerId the player ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching BuyIn, or <code>null</code> if a matching BuyIn could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.sbs.pokerp.model.BuyIn fetchBygameIdAndPlayerId_First(
        long gameId, long playerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.sbs.pokerp.model.BuyIn findBygameIdAndPlayerId_Last(
        long gameId, long playerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.sbs.pokerp.NoSuchBuyInException;

    /**
    * Returns the last BuyIn in the ordered set where gameId = &#63; and playerId = &#63;.
    *
    * @param gameId the game ID
    * @param playerId the player ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching BuyIn, or <code>null</code> if a matching BuyIn could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.sbs.pokerp.model.BuyIn fetchBygameIdAndPlayerId_Last(
        long gameId, long playerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.sbs.pokerp.model.BuyIn[] findBygameIdAndPlayerId_PrevAndNext(
        long transactionId, long gameId, long playerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.sbs.pokerp.NoSuchBuyInException;

    /**
    * Removes all the BuyIns where gameId = &#63; and playerId = &#63; from the database.
    *
    * @param gameId the game ID
    * @param playerId the player ID
    * @throws SystemException if a system exception occurred
    */
    public void removeBygameIdAndPlayerId(long gameId, long playerId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of BuyIns where gameId = &#63; and playerId = &#63;.
    *
    * @param gameId the game ID
    * @param playerId the player ID
    * @return the number of matching BuyIns
    * @throws SystemException if a system exception occurred
    */
    public int countBygameIdAndPlayerId(long gameId, long playerId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the BuyIns where gameId = &#63;.
    *
    * @param gameId the game ID
    * @return the matching BuyIns
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.sbs.pokerp.model.BuyIn> findBygameId(long gameId)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.sbs.pokerp.model.BuyIn> findBygameId(
        long gameId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.sbs.pokerp.model.BuyIn> findBygameId(
        long gameId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first BuyIn in the ordered set where gameId = &#63;.
    *
    * @param gameId the game ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching BuyIn
    * @throws com.sbs.pokerp.NoSuchBuyInException if a matching BuyIn could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.sbs.pokerp.model.BuyIn findBygameId_First(long gameId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.sbs.pokerp.NoSuchBuyInException;

    /**
    * Returns the first BuyIn in the ordered set where gameId = &#63;.
    *
    * @param gameId the game ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching BuyIn, or <code>null</code> if a matching BuyIn could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.sbs.pokerp.model.BuyIn fetchBygameId_First(long gameId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last BuyIn in the ordered set where gameId = &#63;.
    *
    * @param gameId the game ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching BuyIn
    * @throws com.sbs.pokerp.NoSuchBuyInException if a matching BuyIn could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.sbs.pokerp.model.BuyIn findBygameId_Last(long gameId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.sbs.pokerp.NoSuchBuyInException;

    /**
    * Returns the last BuyIn in the ordered set where gameId = &#63;.
    *
    * @param gameId the game ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching BuyIn, or <code>null</code> if a matching BuyIn could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.sbs.pokerp.model.BuyIn fetchBygameId_Last(long gameId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.sbs.pokerp.model.BuyIn[] findBygameId_PrevAndNext(
        long transactionId, long gameId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.sbs.pokerp.NoSuchBuyInException;

    /**
    * Removes all the BuyIns where gameId = &#63; from the database.
    *
    * @param gameId the game ID
    * @throws SystemException if a system exception occurred
    */
    public void removeBygameId(long gameId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of BuyIns where gameId = &#63;.
    *
    * @param gameId the game ID
    * @return the number of matching BuyIns
    * @throws SystemException if a system exception occurred
    */
    public int countBygameId(long gameId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the BuyIn in the entity cache if it is enabled.
    *
    * @param buyIn the BuyIn
    */
    public void cacheResult(com.sbs.pokerp.model.BuyIn buyIn);

    /**
    * Caches the BuyIns in the entity cache if it is enabled.
    *
    * @param buyIns the BuyIns
    */
    public void cacheResult(java.util.List<com.sbs.pokerp.model.BuyIn> buyIns);

    /**
    * Creates a new BuyIn with the primary key. Does not add the BuyIn to the database.
    *
    * @param transactionId the primary key for the new BuyIn
    * @return the new BuyIn
    */
    public com.sbs.pokerp.model.BuyIn create(long transactionId);

    /**
    * Removes the BuyIn with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param transactionId the primary key of the BuyIn
    * @return the BuyIn that was removed
    * @throws com.sbs.pokerp.NoSuchBuyInException if a BuyIn with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.sbs.pokerp.model.BuyIn remove(long transactionId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.sbs.pokerp.NoSuchBuyInException;

    public com.sbs.pokerp.model.BuyIn updateImpl(
        com.sbs.pokerp.model.BuyIn buyIn)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the BuyIn with the primary key or throws a {@link com.sbs.pokerp.NoSuchBuyInException} if it could not be found.
    *
    * @param transactionId the primary key of the BuyIn
    * @return the BuyIn
    * @throws com.sbs.pokerp.NoSuchBuyInException if a BuyIn with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.sbs.pokerp.model.BuyIn findByPrimaryKey(long transactionId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.sbs.pokerp.NoSuchBuyInException;

    /**
    * Returns the BuyIn with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param transactionId the primary key of the BuyIn
    * @return the BuyIn, or <code>null</code> if a BuyIn with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.sbs.pokerp.model.BuyIn fetchByPrimaryKey(long transactionId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the BuyIns.
    *
    * @return the BuyIns
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.sbs.pokerp.model.BuyIn> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.sbs.pokerp.model.BuyIn> findAll(int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.sbs.pokerp.model.BuyIn> findAll(int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the BuyIns from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of BuyIns.
    *
    * @return the number of BuyIns
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
