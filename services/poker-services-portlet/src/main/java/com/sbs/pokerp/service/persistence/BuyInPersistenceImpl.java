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

import com.sbs.pokerp.NoSuchBuyInException;
import com.sbs.pokerp.model.BuyIn;
import com.sbs.pokerp.model.impl.BuyInImpl;
import com.sbs.pokerp.model.impl.BuyInModelImpl;
import com.sbs.pokerp.service.persistence.BuyInPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the BuyIn service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author jpnaidu
 * @see BuyInPersistence
 * @see BuyInUtil
 * @generated
 */
public class BuyInPersistenceImpl extends BasePersistenceImpl<BuyIn>
    implements BuyInPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link BuyInUtil} to access the BuyIn persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = BuyInImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(BuyInModelImpl.ENTITY_CACHE_ENABLED,
            BuyInModelImpl.FINDER_CACHE_ENABLED, BuyInImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(BuyInModelImpl.ENTITY_CACHE_ENABLED,
            BuyInModelImpl.FINDER_CACHE_ENABLED, BuyInImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(BuyInModelImpl.ENTITY_CACHE_ENABLED,
            BuyInModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_GAMEIDANDPLAYERID =
        new FinderPath(BuyInModelImpl.ENTITY_CACHE_ENABLED,
            BuyInModelImpl.FINDER_CACHE_ENABLED, BuyInImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygameIdAndPlayerId",
            new String[] {
                Long.class.getName(), Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GAMEIDANDPLAYERID =
        new FinderPath(BuyInModelImpl.ENTITY_CACHE_ENABLED,
            BuyInModelImpl.FINDER_CACHE_ENABLED, BuyInImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "findBygameIdAndPlayerId",
            new String[] { Long.class.getName(), Long.class.getName() },
            BuyInModelImpl.GAMEID_COLUMN_BITMASK |
            BuyInModelImpl.PLAYERID_COLUMN_BITMASK |
            BuyInModelImpl.CREATEDDATE_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_GAMEIDANDPLAYERID = new FinderPath(BuyInModelImpl.ENTITY_CACHE_ENABLED,
            BuyInModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "countBygameIdAndPlayerId",
            new String[] { Long.class.getName(), Long.class.getName() });
    private static final String _FINDER_COLUMN_GAMEIDANDPLAYERID_GAMEID_2 = "buyIn.gameId = ? AND ";
    private static final String _FINDER_COLUMN_GAMEIDANDPLAYERID_PLAYERID_2 = "buyIn.playerId = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_GAMEID = new FinderPath(BuyInModelImpl.ENTITY_CACHE_ENABLED,
            BuyInModelImpl.FINDER_CACHE_ENABLED, BuyInImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygameId",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GAMEID =
        new FinderPath(BuyInModelImpl.ENTITY_CACHE_ENABLED,
            BuyInModelImpl.FINDER_CACHE_ENABLED, BuyInImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygameId",
            new String[] { Long.class.getName() },
            BuyInModelImpl.GAMEID_COLUMN_BITMASK |
            BuyInModelImpl.CREATEDDATE_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_GAMEID = new FinderPath(BuyInModelImpl.ENTITY_CACHE_ENABLED,
            BuyInModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygameId",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_GAMEID_GAMEID_2 = "buyIn.gameId = ?";
    private static final String _SQL_SELECT_BUYIN = "SELECT buyIn FROM BuyIn buyIn";
    private static final String _SQL_SELECT_BUYIN_WHERE = "SELECT buyIn FROM BuyIn buyIn WHERE ";
    private static final String _SQL_COUNT_BUYIN = "SELECT COUNT(buyIn) FROM BuyIn buyIn";
    private static final String _SQL_COUNT_BUYIN_WHERE = "SELECT COUNT(buyIn) FROM BuyIn buyIn WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "buyIn.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No BuyIn exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No BuyIn exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(BuyInPersistenceImpl.class);
    private static BuyIn _nullBuyIn = new BuyInImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<BuyIn> toCacheModel() {
                return _nullBuyInCacheModel;
            }
        };

    private static CacheModel<BuyIn> _nullBuyInCacheModel = new CacheModel<BuyIn>() {
            @Override
            public BuyIn toEntityModel() {
                return _nullBuyIn;
            }
        };

    public BuyInPersistenceImpl() {
        setModelClass(BuyIn.class);
    }

    /**
     * Returns all the BuyIns where gameId = &#63; and playerId = &#63;.
     *
     * @param gameId the game ID
     * @param playerId the player ID
     * @return the matching BuyIns
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<BuyIn> findBygameIdAndPlayerId(long gameId, long playerId)
        throws SystemException {
        return findBygameIdAndPlayerId(gameId, playerId, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
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
    @Override
    public List<BuyIn> findBygameIdAndPlayerId(long gameId, long playerId,
        int start, int end) throws SystemException {
        return findBygameIdAndPlayerId(gameId, playerId, start, end, null);
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
    @Override
    public List<BuyIn> findBygameIdAndPlayerId(long gameId, long playerId,
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

        List<BuyIn> list = (List<BuyIn>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (BuyIn buyIn : list) {
                if ((gameId != buyIn.getGameId()) ||
                        (playerId != buyIn.getPlayerId())) {
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

            query.append(_SQL_SELECT_BUYIN_WHERE);

            query.append(_FINDER_COLUMN_GAMEIDANDPLAYERID_GAMEID_2);

            query.append(_FINDER_COLUMN_GAMEIDANDPLAYERID_PLAYERID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(BuyInModelImpl.ORDER_BY_JPQL);
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
                    list = (List<BuyIn>) QueryUtil.list(q, getDialect(), start,
                            end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<BuyIn>(list);
                } else {
                    list = (List<BuyIn>) QueryUtil.list(q, getDialect(), start,
                            end);
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
     * Returns the first BuyIn in the ordered set where gameId = &#63; and playerId = &#63;.
     *
     * @param gameId the game ID
     * @param playerId the player ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching BuyIn
     * @throws com.sbs.pokerp.NoSuchBuyInException if a matching BuyIn could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BuyIn findBygameIdAndPlayerId_First(long gameId, long playerId,
        OrderByComparator orderByComparator)
        throws NoSuchBuyInException, SystemException {
        BuyIn buyIn = fetchBygameIdAndPlayerId_First(gameId, playerId,
                orderByComparator);

        if (buyIn != null) {
            return buyIn;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("gameId=");
        msg.append(gameId);

        msg.append(", playerId=");
        msg.append(playerId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchBuyInException(msg.toString());
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
    @Override
    public BuyIn fetchBygameIdAndPlayerId_First(long gameId, long playerId,
        OrderByComparator orderByComparator) throws SystemException {
        List<BuyIn> list = findBygameIdAndPlayerId(gameId, playerId, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public BuyIn findBygameIdAndPlayerId_Last(long gameId, long playerId,
        OrderByComparator orderByComparator)
        throws NoSuchBuyInException, SystemException {
        BuyIn buyIn = fetchBygameIdAndPlayerId_Last(gameId, playerId,
                orderByComparator);

        if (buyIn != null) {
            return buyIn;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("gameId=");
        msg.append(gameId);

        msg.append(", playerId=");
        msg.append(playerId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchBuyInException(msg.toString());
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
    @Override
    public BuyIn fetchBygameIdAndPlayerId_Last(long gameId, long playerId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countBygameIdAndPlayerId(gameId, playerId);

        if (count == 0) {
            return null;
        }

        List<BuyIn> list = findBygameIdAndPlayerId(gameId, playerId, count - 1,
                count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public BuyIn[] findBygameIdAndPlayerId_PrevAndNext(long transactionId,
        long gameId, long playerId, OrderByComparator orderByComparator)
        throws NoSuchBuyInException, SystemException {
        BuyIn buyIn = findByPrimaryKey(transactionId);

        Session session = null;

        try {
            session = openSession();

            BuyIn[] array = new BuyInImpl[3];

            array[0] = getBygameIdAndPlayerId_PrevAndNext(session, buyIn,
                    gameId, playerId, orderByComparator, true);

            array[1] = buyIn;

            array[2] = getBygameIdAndPlayerId_PrevAndNext(session, buyIn,
                    gameId, playerId, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected BuyIn getBygameIdAndPlayerId_PrevAndNext(Session session,
        BuyIn buyIn, long gameId, long playerId,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_BUYIN_WHERE);

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
            query.append(BuyInModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(gameId);

        qPos.add(playerId);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(buyIn);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<BuyIn> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the BuyIns where gameId = &#63; and playerId = &#63; from the database.
     *
     * @param gameId the game ID
     * @param playerId the player ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeBygameIdAndPlayerId(long gameId, long playerId)
        throws SystemException {
        for (BuyIn buyIn : findBygameIdAndPlayerId(gameId, playerId,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(buyIn);
        }
    }

    /**
     * Returns the number of BuyIns where gameId = &#63; and playerId = &#63;.
     *
     * @param gameId the game ID
     * @param playerId the player ID
     * @return the number of matching BuyIns
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

            query.append(_SQL_COUNT_BUYIN_WHERE);

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
     * Returns all the BuyIns where gameId = &#63;.
     *
     * @param gameId the game ID
     * @return the matching BuyIns
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<BuyIn> findBygameId(long gameId) throws SystemException {
        return findBygameId(gameId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    @Override
    public List<BuyIn> findBygameId(long gameId, int start, int end)
        throws SystemException {
        return findBygameId(gameId, start, end, null);
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
    @Override
    public List<BuyIn> findBygameId(long gameId, int start, int end,
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

        List<BuyIn> list = (List<BuyIn>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (BuyIn buyIn : list) {
                if ((gameId != buyIn.getGameId())) {
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

            query.append(_SQL_SELECT_BUYIN_WHERE);

            query.append(_FINDER_COLUMN_GAMEID_GAMEID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(BuyInModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(gameId);

                if (!pagination) {
                    list = (List<BuyIn>) QueryUtil.list(q, getDialect(), start,
                            end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<BuyIn>(list);
                } else {
                    list = (List<BuyIn>) QueryUtil.list(q, getDialect(), start,
                            end);
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
     * Returns the first BuyIn in the ordered set where gameId = &#63;.
     *
     * @param gameId the game ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching BuyIn
     * @throws com.sbs.pokerp.NoSuchBuyInException if a matching BuyIn could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BuyIn findBygameId_First(long gameId,
        OrderByComparator orderByComparator)
        throws NoSuchBuyInException, SystemException {
        BuyIn buyIn = fetchBygameId_First(gameId, orderByComparator);

        if (buyIn != null) {
            return buyIn;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("gameId=");
        msg.append(gameId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchBuyInException(msg.toString());
    }

    /**
     * Returns the first BuyIn in the ordered set where gameId = &#63;.
     *
     * @param gameId the game ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching BuyIn, or <code>null</code> if a matching BuyIn could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BuyIn fetchBygameId_First(long gameId,
        OrderByComparator orderByComparator) throws SystemException {
        List<BuyIn> list = findBygameId(gameId, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public BuyIn findBygameId_Last(long gameId,
        OrderByComparator orderByComparator)
        throws NoSuchBuyInException, SystemException {
        BuyIn buyIn = fetchBygameId_Last(gameId, orderByComparator);

        if (buyIn != null) {
            return buyIn;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("gameId=");
        msg.append(gameId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchBuyInException(msg.toString());
    }

    /**
     * Returns the last BuyIn in the ordered set where gameId = &#63;.
     *
     * @param gameId the game ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching BuyIn, or <code>null</code> if a matching BuyIn could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BuyIn fetchBygameId_Last(long gameId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countBygameId(gameId);

        if (count == 0) {
            return null;
        }

        List<BuyIn> list = findBygameId(gameId, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public BuyIn[] findBygameId_PrevAndNext(long transactionId, long gameId,
        OrderByComparator orderByComparator)
        throws NoSuchBuyInException, SystemException {
        BuyIn buyIn = findByPrimaryKey(transactionId);

        Session session = null;

        try {
            session = openSession();

            BuyIn[] array = new BuyInImpl[3];

            array[0] = getBygameId_PrevAndNext(session, buyIn, gameId,
                    orderByComparator, true);

            array[1] = buyIn;

            array[2] = getBygameId_PrevAndNext(session, buyIn, gameId,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected BuyIn getBygameId_PrevAndNext(Session session, BuyIn buyIn,
        long gameId, OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_BUYIN_WHERE);

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
            query.append(BuyInModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(gameId);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(buyIn);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<BuyIn> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the BuyIns where gameId = &#63; from the database.
     *
     * @param gameId the game ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeBygameId(long gameId) throws SystemException {
        for (BuyIn buyIn : findBygameId(gameId, QueryUtil.ALL_POS,
                QueryUtil.ALL_POS, null)) {
            remove(buyIn);
        }
    }

    /**
     * Returns the number of BuyIns where gameId = &#63;.
     *
     * @param gameId the game ID
     * @return the number of matching BuyIns
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

            query.append(_SQL_COUNT_BUYIN_WHERE);

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
     * Caches the BuyIn in the entity cache if it is enabled.
     *
     * @param buyIn the BuyIn
     */
    @Override
    public void cacheResult(BuyIn buyIn) {
        EntityCacheUtil.putResult(BuyInModelImpl.ENTITY_CACHE_ENABLED,
            BuyInImpl.class, buyIn.getPrimaryKey(), buyIn);

        buyIn.resetOriginalValues();
    }

    /**
     * Caches the BuyIns in the entity cache if it is enabled.
     *
     * @param buyIns the BuyIns
     */
    @Override
    public void cacheResult(List<BuyIn> buyIns) {
        for (BuyIn buyIn : buyIns) {
            if (EntityCacheUtil.getResult(BuyInModelImpl.ENTITY_CACHE_ENABLED,
                        BuyInImpl.class, buyIn.getPrimaryKey()) == null) {
                cacheResult(buyIn);
            } else {
                buyIn.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all BuyIns.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(BuyInImpl.class.getName());
        }

        EntityCacheUtil.clearCache(BuyInImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the BuyIn.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(BuyIn buyIn) {
        EntityCacheUtil.removeResult(BuyInModelImpl.ENTITY_CACHE_ENABLED,
            BuyInImpl.class, buyIn.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<BuyIn> buyIns) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (BuyIn buyIn : buyIns) {
            EntityCacheUtil.removeResult(BuyInModelImpl.ENTITY_CACHE_ENABLED,
                BuyInImpl.class, buyIn.getPrimaryKey());
        }
    }

    /**
     * Creates a new BuyIn with the primary key. Does not add the BuyIn to the database.
     *
     * @param transactionId the primary key for the new BuyIn
     * @return the new BuyIn
     */
    @Override
    public BuyIn create(long transactionId) {
        BuyIn buyIn = new BuyInImpl();

        buyIn.setNew(true);
        buyIn.setPrimaryKey(transactionId);

        return buyIn;
    }

    /**
     * Removes the BuyIn with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param transactionId the primary key of the BuyIn
     * @return the BuyIn that was removed
     * @throws com.sbs.pokerp.NoSuchBuyInException if a BuyIn with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BuyIn remove(long transactionId)
        throws NoSuchBuyInException, SystemException {
        return remove((Serializable) transactionId);
    }

    /**
     * Removes the BuyIn with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the BuyIn
     * @return the BuyIn that was removed
     * @throws com.sbs.pokerp.NoSuchBuyInException if a BuyIn with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BuyIn remove(Serializable primaryKey)
        throws NoSuchBuyInException, SystemException {
        Session session = null;

        try {
            session = openSession();

            BuyIn buyIn = (BuyIn) session.get(BuyInImpl.class, primaryKey);

            if (buyIn == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchBuyInException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(buyIn);
        } catch (NoSuchBuyInException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected BuyIn removeImpl(BuyIn buyIn) throws SystemException {
        buyIn = toUnwrappedModel(buyIn);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(buyIn)) {
                buyIn = (BuyIn) session.get(BuyInImpl.class,
                        buyIn.getPrimaryKeyObj());
            }

            if (buyIn != null) {
                session.delete(buyIn);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (buyIn != null) {
            clearCache(buyIn);
        }

        return buyIn;
    }

    @Override
    public BuyIn updateImpl(com.sbs.pokerp.model.BuyIn buyIn)
        throws SystemException {
        buyIn = toUnwrappedModel(buyIn);

        boolean isNew = buyIn.isNew();

        BuyInModelImpl buyInModelImpl = (BuyInModelImpl) buyIn;

        Session session = null;

        try {
            session = openSession();

            if (buyIn.isNew()) {
                session.save(buyIn);

                buyIn.setNew(false);
            } else {
                session.merge(buyIn);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !BuyInModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((buyInModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GAMEIDANDPLAYERID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        buyInModelImpl.getOriginalGameId(),
                        buyInModelImpl.getOriginalPlayerId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GAMEIDANDPLAYERID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GAMEIDANDPLAYERID,
                    args);

                args = new Object[] {
                        buyInModelImpl.getGameId(), buyInModelImpl.getPlayerId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GAMEIDANDPLAYERID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GAMEIDANDPLAYERID,
                    args);
            }

            if ((buyInModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GAMEID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] { buyInModelImpl.getOriginalGameId() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GAMEID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GAMEID,
                    args);

                args = new Object[] { buyInModelImpl.getGameId() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GAMEID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GAMEID,
                    args);
            }
        }

        EntityCacheUtil.putResult(BuyInModelImpl.ENTITY_CACHE_ENABLED,
            BuyInImpl.class, buyIn.getPrimaryKey(), buyIn);

        return buyIn;
    }

    protected BuyIn toUnwrappedModel(BuyIn buyIn) {
        if (buyIn instanceof BuyInImpl) {
            return buyIn;
        }

        BuyInImpl buyInImpl = new BuyInImpl();

        buyInImpl.setNew(buyIn.isNew());
        buyInImpl.setPrimaryKey(buyIn.getPrimaryKey());

        buyInImpl.setTransactionId(buyIn.getTransactionId());
        buyInImpl.setGameId(buyIn.getGameId());
        buyInImpl.setPlayerId(buyIn.getPlayerId());
        buyInImpl.setAmount(buyIn.getAmount());
        buyInImpl.setCredit(buyIn.isCredit());
        buyInImpl.setCreatedBy(buyIn.getCreatedBy());
        buyInImpl.setCreatedDate(buyIn.getCreatedDate());
        buyInImpl.setUpdatedBy(buyIn.getUpdatedBy());
        buyInImpl.setUpdatedDate(buyIn.getUpdatedDate());

        return buyInImpl;
    }

    /**
     * Returns the BuyIn with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the BuyIn
     * @return the BuyIn
     * @throws com.sbs.pokerp.NoSuchBuyInException if a BuyIn with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BuyIn findByPrimaryKey(Serializable primaryKey)
        throws NoSuchBuyInException, SystemException {
        BuyIn buyIn = fetchByPrimaryKey(primaryKey);

        if (buyIn == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchBuyInException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return buyIn;
    }

    /**
     * Returns the BuyIn with the primary key or throws a {@link com.sbs.pokerp.NoSuchBuyInException} if it could not be found.
     *
     * @param transactionId the primary key of the BuyIn
     * @return the BuyIn
     * @throws com.sbs.pokerp.NoSuchBuyInException if a BuyIn with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BuyIn findByPrimaryKey(long transactionId)
        throws NoSuchBuyInException, SystemException {
        return findByPrimaryKey((Serializable) transactionId);
    }

    /**
     * Returns the BuyIn with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the BuyIn
     * @return the BuyIn, or <code>null</code> if a BuyIn with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BuyIn fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        BuyIn buyIn = (BuyIn) EntityCacheUtil.getResult(BuyInModelImpl.ENTITY_CACHE_ENABLED,
                BuyInImpl.class, primaryKey);

        if (buyIn == _nullBuyIn) {
            return null;
        }

        if (buyIn == null) {
            Session session = null;

            try {
                session = openSession();

                buyIn = (BuyIn) session.get(BuyInImpl.class, primaryKey);

                if (buyIn != null) {
                    cacheResult(buyIn);
                } else {
                    EntityCacheUtil.putResult(BuyInModelImpl.ENTITY_CACHE_ENABLED,
                        BuyInImpl.class, primaryKey, _nullBuyIn);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(BuyInModelImpl.ENTITY_CACHE_ENABLED,
                    BuyInImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return buyIn;
    }

    /**
     * Returns the BuyIn with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param transactionId the primary key of the BuyIn
     * @return the BuyIn, or <code>null</code> if a BuyIn with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BuyIn fetchByPrimaryKey(long transactionId)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) transactionId);
    }

    /**
     * Returns all the BuyIns.
     *
     * @return the BuyIns
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<BuyIn> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    @Override
    public List<BuyIn> findAll(int start, int end) throws SystemException {
        return findAll(start, end, null);
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
    @Override
    public List<BuyIn> findAll(int start, int end,
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

        List<BuyIn> list = (List<BuyIn>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_BUYIN);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_BUYIN;

                if (pagination) {
                    sql = sql.concat(BuyInModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<BuyIn>) QueryUtil.list(q, getDialect(), start,
                            end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<BuyIn>(list);
                } else {
                    list = (List<BuyIn>) QueryUtil.list(q, getDialect(), start,
                            end);
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
     * Removes all the BuyIns from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (BuyIn buyIn : findAll()) {
            remove(buyIn);
        }
    }

    /**
     * Returns the number of BuyIns.
     *
     * @return the number of BuyIns
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

                Query q = session.createQuery(_SQL_COUNT_BUYIN);

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
     * Initializes the BuyIn persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.sbs.pokerp.model.BuyIn")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<BuyIn>> listenersList = new ArrayList<ModelListener<BuyIn>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<BuyIn>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(BuyInImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
