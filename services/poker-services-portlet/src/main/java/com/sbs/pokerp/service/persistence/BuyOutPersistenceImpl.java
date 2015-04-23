package com.sbs.pokerp.service.persistence;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.sbs.pokerp.NoSuchBuyOutException;
import com.sbs.pokerp.model.BuyOut;
import com.sbs.pokerp.model.impl.BuyOutImpl;
import com.sbs.pokerp.model.impl.BuyOutModelImpl;
import com.sbs.pokerp.service.persistence.BuyOutPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the BuyOut service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author jpnaidu
 * @see BuyOutPersistence
 * @see BuyOutUtil
 * @generated
 */
public class BuyOutPersistenceImpl extends BasePersistenceImpl<BuyOut>
    implements BuyOutPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link BuyOutUtil} to access the BuyOut persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = BuyOutImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(BuyOutModelImpl.ENTITY_CACHE_ENABLED,
            BuyOutModelImpl.FINDER_CACHE_ENABLED, BuyOutImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(BuyOutModelImpl.ENTITY_CACHE_ENABLED,
            BuyOutModelImpl.FINDER_CACHE_ENABLED, BuyOutImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(BuyOutModelImpl.ENTITY_CACHE_ENABLED,
            BuyOutModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_GAMEIDANDPLAYERID =
        new FinderPath(BuyOutModelImpl.ENTITY_CACHE_ENABLED,
            BuyOutModelImpl.FINDER_CACHE_ENABLED, BuyOutImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygameIdAndPlayerId",
            new String[] {
                Long.class.getName(), Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GAMEIDANDPLAYERID =
        new FinderPath(BuyOutModelImpl.ENTITY_CACHE_ENABLED,
            BuyOutModelImpl.FINDER_CACHE_ENABLED, BuyOutImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "findBygameIdAndPlayerId",
            new String[] { Long.class.getName(), Long.class.getName() },
            BuyOutModelImpl.GAMEID_COLUMN_BITMASK |
            BuyOutModelImpl.PLAYERID_COLUMN_BITMASK |
            BuyOutModelImpl.CREATEDDATE_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_GAMEIDANDPLAYERID = new FinderPath(BuyOutModelImpl.ENTITY_CACHE_ENABLED,
            BuyOutModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "countBygameIdAndPlayerId",
            new String[] { Long.class.getName(), Long.class.getName() });
    private static final String _FINDER_COLUMN_GAMEIDANDPLAYERID_GAMEID_2 = "buyOut.gameId = ? AND ";
    private static final String _FINDER_COLUMN_GAMEIDANDPLAYERID_PLAYERID_2 = "buyOut.playerId = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_GAMEID = new FinderPath(BuyOutModelImpl.ENTITY_CACHE_ENABLED,
            BuyOutModelImpl.FINDER_CACHE_ENABLED, BuyOutImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygameId",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GAMEID =
        new FinderPath(BuyOutModelImpl.ENTITY_CACHE_ENABLED,
            BuyOutModelImpl.FINDER_CACHE_ENABLED, BuyOutImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygameId",
            new String[] { Long.class.getName() },
            BuyOutModelImpl.GAMEID_COLUMN_BITMASK |
            BuyOutModelImpl.CREATEDDATE_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_GAMEID = new FinderPath(BuyOutModelImpl.ENTITY_CACHE_ENABLED,
            BuyOutModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygameId",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_GAMEID_GAMEID_2 = "buyOut.gameId = ?";
    private static final String _SQL_SELECT_BUYOUT = "SELECT buyOut FROM BuyOut buyOut";
    private static final String _SQL_SELECT_BUYOUT_WHERE = "SELECT buyOut FROM BuyOut buyOut WHERE ";
    private static final String _SQL_COUNT_BUYOUT = "SELECT COUNT(buyOut) FROM BuyOut buyOut";
    private static final String _SQL_COUNT_BUYOUT_WHERE = "SELECT COUNT(buyOut) FROM BuyOut buyOut WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "buyOut.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No BuyOut exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No BuyOut exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(BuyOutPersistenceImpl.class);
    private static BuyOut _nullBuyOut = new BuyOutImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<BuyOut> toCacheModel() {
                return _nullBuyOutCacheModel;
            }
        };

    private static CacheModel<BuyOut> _nullBuyOutCacheModel = new CacheModel<BuyOut>() {
            @Override
            public BuyOut toEntityModel() {
                return _nullBuyOut;
            }
        };

    public BuyOutPersistenceImpl() {
        setModelClass(BuyOut.class);
    }

    /**
     * Returns all the BuyOuts where gameId = &#63; and playerId = &#63;.
     *
     * @param gameId the game ID
     * @param playerId the player ID
     * @return the matching BuyOuts
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<BuyOut> findBygameIdAndPlayerId(long gameId, long playerId)
        throws SystemException {
        return findBygameIdAndPlayerId(gameId, playerId, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
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
    @Override
    public List<BuyOut> findBygameIdAndPlayerId(long gameId, long playerId,
        int start, int end) throws SystemException {
        return findBygameIdAndPlayerId(gameId, playerId, start, end, null);
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
    @Override
    public List<BuyOut> findBygameIdAndPlayerId(long gameId, long playerId,
        int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GAMEIDANDPLAYERID;
            finderArgs = new Object[] { gameId, playerId };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_GAMEIDANDPLAYERID;
            finderArgs = new Object[] {
                    gameId, playerId,
                    
                    start, end, orderByComparator
                };
        }

        List<BuyOut> list = (List<BuyOut>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (BuyOut buyOut : list) {
                if ((gameId != buyOut.getGameId()) ||
                        (playerId != buyOut.getPlayerId())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(4 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(4);
            }

            query.append(_SQL_SELECT_BUYOUT_WHERE);

            query.append(_FINDER_COLUMN_GAMEIDANDPLAYERID_GAMEID_2);

            query.append(_FINDER_COLUMN_GAMEIDANDPLAYERID_PLAYERID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(BuyOutModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(gameId);

                qPos.add(playerId);

                if (!pagination) {
                    list = (List<BuyOut>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<BuyOut>(list);
                } else {
                    list = (List<BuyOut>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
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
    @Override
    public BuyOut findBygameIdAndPlayerId_First(long gameId, long playerId,
        OrderByComparator orderByComparator)
        throws NoSuchBuyOutException, SystemException {
        BuyOut buyOut = fetchBygameIdAndPlayerId_First(gameId, playerId,
                orderByComparator);

        if (buyOut != null) {
            return buyOut;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("gameId=");
        msg.append(gameId);

        msg.append(", playerId=");
        msg.append(playerId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchBuyOutException(msg.toString());
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
    @Override
    public BuyOut fetchBygameIdAndPlayerId_First(long gameId, long playerId,
        OrderByComparator orderByComparator) throws SystemException {
        List<BuyOut> list = findBygameIdAndPlayerId(gameId, playerId, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public BuyOut findBygameIdAndPlayerId_Last(long gameId, long playerId,
        OrderByComparator orderByComparator)
        throws NoSuchBuyOutException, SystemException {
        BuyOut buyOut = fetchBygameIdAndPlayerId_Last(gameId, playerId,
                orderByComparator);

        if (buyOut != null) {
            return buyOut;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("gameId=");
        msg.append(gameId);

        msg.append(", playerId=");
        msg.append(playerId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchBuyOutException(msg.toString());
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
    @Override
    public BuyOut fetchBygameIdAndPlayerId_Last(long gameId, long playerId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countBygameIdAndPlayerId(gameId, playerId);

        if (count == 0) {
            return null;
        }

        List<BuyOut> list = findBygameIdAndPlayerId(gameId, playerId,
                count - 1, count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public BuyOut[] findBygameIdAndPlayerId_PrevAndNext(long transactionId,
        long gameId, long playerId, OrderByComparator orderByComparator)
        throws NoSuchBuyOutException, SystemException {
        BuyOut buyOut = findByPrimaryKey(transactionId);

        Session session = null;

        try {
            session = openSession();

            BuyOut[] array = new BuyOutImpl[3];

            array[0] = getBygameIdAndPlayerId_PrevAndNext(session, buyOut,
                    gameId, playerId, orderByComparator, true);

            array[1] = buyOut;

            array[2] = getBygameIdAndPlayerId_PrevAndNext(session, buyOut,
                    gameId, playerId, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected BuyOut getBygameIdAndPlayerId_PrevAndNext(Session session,
        BuyOut buyOut, long gameId, long playerId,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_BUYOUT_WHERE);

        query.append(_FINDER_COLUMN_GAMEIDANDPLAYERID_GAMEID_2);

        query.append(_FINDER_COLUMN_GAMEIDANDPLAYERID_PLAYERID_2);

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(BuyOutModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(gameId);

        qPos.add(playerId);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(buyOut);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<BuyOut> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the BuyOuts where gameId = &#63; and playerId = &#63; from the database.
     *
     * @param gameId the game ID
     * @param playerId the player ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeBygameIdAndPlayerId(long gameId, long playerId)
        throws SystemException {
        for (BuyOut buyOut : findBygameIdAndPlayerId(gameId, playerId,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(buyOut);
        }
    }

    /**
     * Returns the number of BuyOuts where gameId = &#63; and playerId = &#63;.
     *
     * @param gameId the game ID
     * @param playerId the player ID
     * @return the number of matching BuyOuts
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countBygameIdAndPlayerId(long gameId, long playerId)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_GAMEIDANDPLAYERID;

        Object[] finderArgs = new Object[] { gameId, playerId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_COUNT_BUYOUT_WHERE);

            query.append(_FINDER_COLUMN_GAMEIDANDPLAYERID_GAMEID_2);

            query.append(_FINDER_COLUMN_GAMEIDANDPLAYERID_PLAYERID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(gameId);

                qPos.add(playerId);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns all the BuyOuts where gameId = &#63;.
     *
     * @param gameId the game ID
     * @return the matching BuyOuts
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<BuyOut> findBygameId(long gameId) throws SystemException {
        return findBygameId(gameId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    @Override
    public List<BuyOut> findBygameId(long gameId, int start, int end)
        throws SystemException {
        return findBygameId(gameId, start, end, null);
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
    @Override
    public List<BuyOut> findBygameId(long gameId, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GAMEID;
            finderArgs = new Object[] { gameId };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_GAMEID;
            finderArgs = new Object[] { gameId, start, end, orderByComparator };
        }

        List<BuyOut> list = (List<BuyOut>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (BuyOut buyOut : list) {
                if ((gameId != buyOut.getGameId())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(3 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(3);
            }

            query.append(_SQL_SELECT_BUYOUT_WHERE);

            query.append(_FINDER_COLUMN_GAMEID_GAMEID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(BuyOutModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(gameId);

                if (!pagination) {
                    list = (List<BuyOut>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<BuyOut>(list);
                } else {
                    list = (List<BuyOut>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
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
    @Override
    public BuyOut findBygameId_First(long gameId,
        OrderByComparator orderByComparator)
        throws NoSuchBuyOutException, SystemException {
        BuyOut buyOut = fetchBygameId_First(gameId, orderByComparator);

        if (buyOut != null) {
            return buyOut;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("gameId=");
        msg.append(gameId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchBuyOutException(msg.toString());
    }

    /**
     * Returns the first BuyOut in the ordered set where gameId = &#63;.
     *
     * @param gameId the game ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching BuyOut, or <code>null</code> if a matching BuyOut could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BuyOut fetchBygameId_First(long gameId,
        OrderByComparator orderByComparator) throws SystemException {
        List<BuyOut> list = findBygameId(gameId, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public BuyOut findBygameId_Last(long gameId,
        OrderByComparator orderByComparator)
        throws NoSuchBuyOutException, SystemException {
        BuyOut buyOut = fetchBygameId_Last(gameId, orderByComparator);

        if (buyOut != null) {
            return buyOut;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("gameId=");
        msg.append(gameId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchBuyOutException(msg.toString());
    }

    /**
     * Returns the last BuyOut in the ordered set where gameId = &#63;.
     *
     * @param gameId the game ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching BuyOut, or <code>null</code> if a matching BuyOut could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BuyOut fetchBygameId_Last(long gameId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countBygameId(gameId);

        if (count == 0) {
            return null;
        }

        List<BuyOut> list = findBygameId(gameId, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public BuyOut[] findBygameId_PrevAndNext(long transactionId, long gameId,
        OrderByComparator orderByComparator)
        throws NoSuchBuyOutException, SystemException {
        BuyOut buyOut = findByPrimaryKey(transactionId);

        Session session = null;

        try {
            session = openSession();

            BuyOut[] array = new BuyOutImpl[3];

            array[0] = getBygameId_PrevAndNext(session, buyOut, gameId,
                    orderByComparator, true);

            array[1] = buyOut;

            array[2] = getBygameId_PrevAndNext(session, buyOut, gameId,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected BuyOut getBygameId_PrevAndNext(Session session, BuyOut buyOut,
        long gameId, OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_BUYOUT_WHERE);

        query.append(_FINDER_COLUMN_GAMEID_GAMEID_2);

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(BuyOutModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(gameId);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(buyOut);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<BuyOut> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the BuyOuts where gameId = &#63; from the database.
     *
     * @param gameId the game ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeBygameId(long gameId) throws SystemException {
        for (BuyOut buyOut : findBygameId(gameId, QueryUtil.ALL_POS,
                QueryUtil.ALL_POS, null)) {
            remove(buyOut);
        }
    }

    /**
     * Returns the number of BuyOuts where gameId = &#63;.
     *
     * @param gameId the game ID
     * @return the number of matching BuyOuts
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countBygameId(long gameId) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_GAMEID;

        Object[] finderArgs = new Object[] { gameId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_BUYOUT_WHERE);

            query.append(_FINDER_COLUMN_GAMEID_GAMEID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(gameId);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Caches the BuyOut in the entity cache if it is enabled.
     *
     * @param buyOut the BuyOut
     */
    @Override
    public void cacheResult(BuyOut buyOut) {
        EntityCacheUtil.putResult(BuyOutModelImpl.ENTITY_CACHE_ENABLED,
            BuyOutImpl.class, buyOut.getPrimaryKey(), buyOut);

        buyOut.resetOriginalValues();
    }

    /**
     * Caches the BuyOuts in the entity cache if it is enabled.
     *
     * @param buyOuts the BuyOuts
     */
    @Override
    public void cacheResult(List<BuyOut> buyOuts) {
        for (BuyOut buyOut : buyOuts) {
            if (EntityCacheUtil.getResult(
                        BuyOutModelImpl.ENTITY_CACHE_ENABLED, BuyOutImpl.class,
                        buyOut.getPrimaryKey()) == null) {
                cacheResult(buyOut);
            } else {
                buyOut.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all BuyOuts.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(BuyOutImpl.class.getName());
        }

        EntityCacheUtil.clearCache(BuyOutImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the BuyOut.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(BuyOut buyOut) {
        EntityCacheUtil.removeResult(BuyOutModelImpl.ENTITY_CACHE_ENABLED,
            BuyOutImpl.class, buyOut.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<BuyOut> buyOuts) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (BuyOut buyOut : buyOuts) {
            EntityCacheUtil.removeResult(BuyOutModelImpl.ENTITY_CACHE_ENABLED,
                BuyOutImpl.class, buyOut.getPrimaryKey());
        }
    }

    /**
     * Creates a new BuyOut with the primary key. Does not add the BuyOut to the database.
     *
     * @param transactionId the primary key for the new BuyOut
     * @return the new BuyOut
     */
    @Override
    public BuyOut create(long transactionId) {
        BuyOut buyOut = new BuyOutImpl();

        buyOut.setNew(true);
        buyOut.setPrimaryKey(transactionId);

        return buyOut;
    }

    /**
     * Removes the BuyOut with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param transactionId the primary key of the BuyOut
     * @return the BuyOut that was removed
     * @throws com.sbs.pokerp.NoSuchBuyOutException if a BuyOut with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BuyOut remove(long transactionId)
        throws NoSuchBuyOutException, SystemException {
        return remove((Serializable) transactionId);
    }

    /**
     * Removes the BuyOut with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the BuyOut
     * @return the BuyOut that was removed
     * @throws com.sbs.pokerp.NoSuchBuyOutException if a BuyOut with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BuyOut remove(Serializable primaryKey)
        throws NoSuchBuyOutException, SystemException {
        Session session = null;

        try {
            session = openSession();

            BuyOut buyOut = (BuyOut) session.get(BuyOutImpl.class, primaryKey);

            if (buyOut == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchBuyOutException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(buyOut);
        } catch (NoSuchBuyOutException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected BuyOut removeImpl(BuyOut buyOut) throws SystemException {
        buyOut = toUnwrappedModel(buyOut);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(buyOut)) {
                buyOut = (BuyOut) session.get(BuyOutImpl.class,
                        buyOut.getPrimaryKeyObj());
            }

            if (buyOut != null) {
                session.delete(buyOut);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (buyOut != null) {
            clearCache(buyOut);
        }

        return buyOut;
    }

    @Override
    public BuyOut updateImpl(com.sbs.pokerp.model.BuyOut buyOut)
        throws SystemException {
        buyOut = toUnwrappedModel(buyOut);

        boolean isNew = buyOut.isNew();

        BuyOutModelImpl buyOutModelImpl = (BuyOutModelImpl) buyOut;

        Session session = null;

        try {
            session = openSession();

            if (buyOut.isNew()) {
                session.save(buyOut);

                buyOut.setNew(false);
            } else {
                session.merge(buyOut);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !BuyOutModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((buyOutModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GAMEIDANDPLAYERID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        buyOutModelImpl.getOriginalGameId(),
                        buyOutModelImpl.getOriginalPlayerId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GAMEIDANDPLAYERID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GAMEIDANDPLAYERID,
                    args);

                args = new Object[] {
                        buyOutModelImpl.getGameId(),
                        buyOutModelImpl.getPlayerId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GAMEIDANDPLAYERID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GAMEIDANDPLAYERID,
                    args);
            }

            if ((buyOutModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GAMEID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] { buyOutModelImpl.getOriginalGameId() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GAMEID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GAMEID,
                    args);

                args = new Object[] { buyOutModelImpl.getGameId() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GAMEID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GAMEID,
                    args);
            }
        }

        EntityCacheUtil.putResult(BuyOutModelImpl.ENTITY_CACHE_ENABLED,
            BuyOutImpl.class, buyOut.getPrimaryKey(), buyOut);

        return buyOut;
    }

    protected BuyOut toUnwrappedModel(BuyOut buyOut) {
        if (buyOut instanceof BuyOutImpl) {
            return buyOut;
        }

        BuyOutImpl buyOutImpl = new BuyOutImpl();

        buyOutImpl.setNew(buyOut.isNew());
        buyOutImpl.setPrimaryKey(buyOut.getPrimaryKey());

        buyOutImpl.setTransactionId(buyOut.getTransactionId());
        buyOutImpl.setGameId(buyOut.getGameId());
        buyOutImpl.setPlayerId(buyOut.getPlayerId());
        buyOutImpl.setAmount(buyOut.getAmount());
        buyOutImpl.setCreatedBy(buyOut.getCreatedBy());
        buyOutImpl.setCreatedDate(buyOut.getCreatedDate());
        buyOutImpl.setUpdatedBy(buyOut.getUpdatedBy());
        buyOutImpl.setUpdatedDate(buyOut.getUpdatedDate());

        return buyOutImpl;
    }

    /**
     * Returns the BuyOut with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the BuyOut
     * @return the BuyOut
     * @throws com.sbs.pokerp.NoSuchBuyOutException if a BuyOut with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BuyOut findByPrimaryKey(Serializable primaryKey)
        throws NoSuchBuyOutException, SystemException {
        BuyOut buyOut = fetchByPrimaryKey(primaryKey);

        if (buyOut == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchBuyOutException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return buyOut;
    }

    /**
     * Returns the BuyOut with the primary key or throws a {@link com.sbs.pokerp.NoSuchBuyOutException} if it could not be found.
     *
     * @param transactionId the primary key of the BuyOut
     * @return the BuyOut
     * @throws com.sbs.pokerp.NoSuchBuyOutException if a BuyOut with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BuyOut findByPrimaryKey(long transactionId)
        throws NoSuchBuyOutException, SystemException {
        return findByPrimaryKey((Serializable) transactionId);
    }

    /**
     * Returns the BuyOut with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the BuyOut
     * @return the BuyOut, or <code>null</code> if a BuyOut with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BuyOut fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        BuyOut buyOut = (BuyOut) EntityCacheUtil.getResult(BuyOutModelImpl.ENTITY_CACHE_ENABLED,
                BuyOutImpl.class, primaryKey);

        if (buyOut == _nullBuyOut) {
            return null;
        }

        if (buyOut == null) {
            Session session = null;

            try {
                session = openSession();

                buyOut = (BuyOut) session.get(BuyOutImpl.class, primaryKey);

                if (buyOut != null) {
                    cacheResult(buyOut);
                } else {
                    EntityCacheUtil.putResult(BuyOutModelImpl.ENTITY_CACHE_ENABLED,
                        BuyOutImpl.class, primaryKey, _nullBuyOut);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(BuyOutModelImpl.ENTITY_CACHE_ENABLED,
                    BuyOutImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return buyOut;
    }

    /**
     * Returns the BuyOut with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param transactionId the primary key of the BuyOut
     * @return the BuyOut, or <code>null</code> if a BuyOut with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BuyOut fetchByPrimaryKey(long transactionId)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) transactionId);
    }

    /**
     * Returns all the BuyOuts.
     *
     * @return the BuyOuts
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<BuyOut> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    @Override
    public List<BuyOut> findAll(int start, int end) throws SystemException {
        return findAll(start, end, null);
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
    @Override
    public List<BuyOut> findAll(int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
            finderArgs = FINDER_ARGS_EMPTY;
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
            finderArgs = new Object[] { start, end, orderByComparator };
        }

        List<BuyOut> list = (List<BuyOut>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_BUYOUT);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_BUYOUT;

                if (pagination) {
                    sql = sql.concat(BuyOutModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<BuyOut>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<BuyOut>(list);
                } else {
                    list = (List<BuyOut>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Removes all the BuyOuts from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (BuyOut buyOut : findAll()) {
            remove(buyOut);
        }
    }

    /**
     * Returns the number of BuyOuts.
     *
     * @return the number of BuyOuts
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countAll() throws SystemException {
        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
                FINDER_ARGS_EMPTY, this);

        if (count == null) {
            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(_SQL_COUNT_BUYOUT);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Initializes the BuyOut persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.sbs.pokerp.model.BuyOut")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<BuyOut>> listenersList = new ArrayList<ModelListener<BuyOut>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<BuyOut>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(BuyOutImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
