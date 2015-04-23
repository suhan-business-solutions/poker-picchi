package com.sbs.pokerp.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.sbs.pokerp.model.BuyOut;

/**
 * The persistence interface for the BuyOut service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author jpnaidu
 * @see BuyOutPersistenceImpl
 * @see BuyOutUtil
 * @generated
 */
public interface BuyOutPersistence extends BasePersistence<BuyOut> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link BuyOutUtil} to access the BuyOut persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the BuyOuts where gameId = &#63; and playerId = &#63;.
    *
    * @param gameId the game ID
    * @param playerId the player ID
    * @return the matching BuyOuts
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.sbs.pokerp.model.BuyOut> findBygameIdAndPlayerId(
        long gameId, long playerId)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.sbs.pokerp.model.BuyOut> findBygameIdAndPlayerId(
        long gameId, long playerId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.sbs.pokerp.model.BuyOut> findBygameIdAndPlayerId(
        long gameId, long playerId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.sbs.pokerp.model.BuyOut findBygameIdAndPlayerId_First(
        long gameId, long playerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.sbs.pokerp.NoSuchBuyOutException;

    /**
    * Returns the first BuyOut in the ordered set where gameId = &#63; and playerId = &#63;.
    *
    * @param gameId the game ID
    * @param playerId the player ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching BuyOut, or <code>null</code> if a matching BuyOut could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.sbs.pokerp.model.BuyOut fetchBygameIdAndPlayerId_First(
        long gameId, long playerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.sbs.pokerp.model.BuyOut findBygameIdAndPlayerId_Last(
        long gameId, long playerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.sbs.pokerp.NoSuchBuyOutException;

    /**
    * Returns the last BuyOut in the ordered set where gameId = &#63; and playerId = &#63;.
    *
    * @param gameId the game ID
    * @param playerId the player ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching BuyOut, or <code>null</code> if a matching BuyOut could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.sbs.pokerp.model.BuyOut fetchBygameIdAndPlayerId_Last(
        long gameId, long playerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.sbs.pokerp.model.BuyOut[] findBygameIdAndPlayerId_PrevAndNext(
        long transactionId, long gameId, long playerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.sbs.pokerp.NoSuchBuyOutException;

    /**
    * Removes all the BuyOuts where gameId = &#63; and playerId = &#63; from the database.
    *
    * @param gameId the game ID
    * @param playerId the player ID
    * @throws SystemException if a system exception occurred
    */
    public void removeBygameIdAndPlayerId(long gameId, long playerId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of BuyOuts where gameId = &#63; and playerId = &#63;.
    *
    * @param gameId the game ID
    * @param playerId the player ID
    * @return the number of matching BuyOuts
    * @throws SystemException if a system exception occurred
    */
    public int countBygameIdAndPlayerId(long gameId, long playerId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the BuyOuts where gameId = &#63;.
    *
    * @param gameId the game ID
    * @return the matching BuyOuts
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.sbs.pokerp.model.BuyOut> findBygameId(long gameId)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.sbs.pokerp.model.BuyOut> findBygameId(
        long gameId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.sbs.pokerp.model.BuyOut> findBygameId(
        long gameId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first BuyOut in the ordered set where gameId = &#63;.
    *
    * @param gameId the game ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching BuyOut
    * @throws com.sbs.pokerp.NoSuchBuyOutException if a matching BuyOut could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.sbs.pokerp.model.BuyOut findBygameId_First(long gameId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.sbs.pokerp.NoSuchBuyOutException;

    /**
    * Returns the first BuyOut in the ordered set where gameId = &#63;.
    *
    * @param gameId the game ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching BuyOut, or <code>null</code> if a matching BuyOut could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.sbs.pokerp.model.BuyOut fetchBygameId_First(long gameId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last BuyOut in the ordered set where gameId = &#63;.
    *
    * @param gameId the game ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching BuyOut
    * @throws com.sbs.pokerp.NoSuchBuyOutException if a matching BuyOut could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.sbs.pokerp.model.BuyOut findBygameId_Last(long gameId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.sbs.pokerp.NoSuchBuyOutException;

    /**
    * Returns the last BuyOut in the ordered set where gameId = &#63;.
    *
    * @param gameId the game ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching BuyOut, or <code>null</code> if a matching BuyOut could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.sbs.pokerp.model.BuyOut fetchBygameId_Last(long gameId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.sbs.pokerp.model.BuyOut[] findBygameId_PrevAndNext(
        long transactionId, long gameId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.sbs.pokerp.NoSuchBuyOutException;

    /**
    * Removes all the BuyOuts where gameId = &#63; from the database.
    *
    * @param gameId the game ID
    * @throws SystemException if a system exception occurred
    */
    public void removeBygameId(long gameId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of BuyOuts where gameId = &#63;.
    *
    * @param gameId the game ID
    * @return the number of matching BuyOuts
    * @throws SystemException if a system exception occurred
    */
    public int countBygameId(long gameId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the BuyOut in the entity cache if it is enabled.
    *
    * @param buyOut the BuyOut
    */
    public void cacheResult(com.sbs.pokerp.model.BuyOut buyOut);

    /**
    * Caches the BuyOuts in the entity cache if it is enabled.
    *
    * @param buyOuts the BuyOuts
    */
    public void cacheResult(java.util.List<com.sbs.pokerp.model.BuyOut> buyOuts);

    /**
    * Creates a new BuyOut with the primary key. Does not add the BuyOut to the database.
    *
    * @param transactionId the primary key for the new BuyOut
    * @return the new BuyOut
    */
    public com.sbs.pokerp.model.BuyOut create(long transactionId);

    /**
    * Removes the BuyOut with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param transactionId the primary key of the BuyOut
    * @return the BuyOut that was removed
    * @throws com.sbs.pokerp.NoSuchBuyOutException if a BuyOut with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.sbs.pokerp.model.BuyOut remove(long transactionId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.sbs.pokerp.NoSuchBuyOutException;

    public com.sbs.pokerp.model.BuyOut updateImpl(
        com.sbs.pokerp.model.BuyOut buyOut)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the BuyOut with the primary key or throws a {@link com.sbs.pokerp.NoSuchBuyOutException} if it could not be found.
    *
    * @param transactionId the primary key of the BuyOut
    * @return the BuyOut
    * @throws com.sbs.pokerp.NoSuchBuyOutException if a BuyOut with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.sbs.pokerp.model.BuyOut findByPrimaryKey(long transactionId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.sbs.pokerp.NoSuchBuyOutException;

    /**
    * Returns the BuyOut with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param transactionId the primary key of the BuyOut
    * @return the BuyOut, or <code>null</code> if a BuyOut with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.sbs.pokerp.model.BuyOut fetchByPrimaryKey(long transactionId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the BuyOuts.
    *
    * @return the BuyOuts
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.sbs.pokerp.model.BuyOut> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.sbs.pokerp.model.BuyOut> findAll(int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.sbs.pokerp.model.BuyOut> findAll(int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the BuyOuts from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of BuyOuts.
    *
    * @return the number of BuyOuts
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
