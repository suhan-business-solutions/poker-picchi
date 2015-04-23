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

import com.sbs.pokerp.NoSuchPokerTablePlayerException;
import com.sbs.pokerp.model.PokerTablePlayer;
import com.sbs.pokerp.model.impl.PokerTablePlayerImpl;
import com.sbs.pokerp.model.impl.PokerTablePlayerModelImpl;
import com.sbs.pokerp.service.persistence.PokerTablePlayerPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the PokerTablePlayer service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author jpnaidu
 * @see PokerTablePlayerPersistence
 * @see PokerTablePlayerUtil
 * @generated
 */
public class PokerTablePlayerPersistenceImpl extends BasePersistenceImpl<PokerTablePlayer>
    implements PokerTablePlayerPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link PokerTablePlayerUtil} to access the PokerTablePlayer persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = PokerTablePlayerImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(PokerTablePlayerModelImpl.ENTITY_CACHE_ENABLED,
            PokerTablePlayerModelImpl.FINDER_CACHE_ENABLED,
            PokerTablePlayerImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(PokerTablePlayerModelImpl.ENTITY_CACHE_ENABLED,
            PokerTablePlayerModelImpl.FINDER_CACHE_ENABLED,
            PokerTablePlayerImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(PokerTablePlayerModelImpl.ENTITY_CACHE_ENABLED,
            PokerTablePlayerModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_FETCH_BY_GAMEIDANDPLAYERID = new FinderPath(PokerTablePlayerModelImpl.ENTITY_CACHE_ENABLED,
            PokerTablePlayerModelImpl.FINDER_CACHE_ENABLED,
            PokerTablePlayerImpl.class, FINDER_CLASS_NAME_ENTITY,
            "fetchBygameIdAndPlayerId",
            new String[] { Long.class.getName(), Long.class.getName() },
            PokerTablePlayerModelImpl.GAMEID_COLUMN_BITMASK |
            PokerTablePlayerModelImpl.PLAYERID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_GAMEIDANDPLAYERID = new FinderPath(PokerTablePlayerModelImpl.ENTITY_CACHE_ENABLED,
            PokerTablePlayerModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "countBygameIdAndPlayerId",
            new String[] { Long.class.getName(), Long.class.getName() });
    private static final String _FINDER_COLUMN_GAMEIDANDPLAYERID_GAMEID_2 = "pokerTablePlayer.id.gameId = ? AND ";
    private static final String _FINDER_COLUMN_GAMEIDANDPLAYERID_PLAYERID_2 = "pokerTablePlayer.id.playerId = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_GAMEID = new FinderPath(PokerTablePlayerModelImpl.ENTITY_CACHE_ENABLED,
            PokerTablePlayerModelImpl.FINDER_CACHE_ENABLED,
            PokerTablePlayerImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findBygameId",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GAMEID =
        new FinderPath(PokerTablePlayerModelImpl.ENTITY_CACHE_ENABLED,
            PokerTablePlayerModelImpl.FINDER_CACHE_ENABLED,
            PokerTablePlayerImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygameId",
            new String[] { Long.class.getName() },
            PokerTablePlayerModelImpl.GAMEID_COLUMN_BITMASK |
            PokerTablePlayerModelImpl.CREATEDDATE_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_GAMEID = new FinderPath(PokerTablePlayerModelImpl.ENTITY_CACHE_ENABLED,
            PokerTablePlayerModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygameId",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_GAMEID_GAMEID_2 = "pokerTablePlayer.id.gameId = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PLAYERID = new FinderPath(PokerTablePlayerModelImpl.ENTITY_CACHE_ENABLED,
            PokerTablePlayerModelImpl.FINDER_CACHE_ENABLED,
            PokerTablePlayerImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findByplayerId",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PLAYERID =
        new FinderPath(PokerTablePlayerModelImpl.ENTITY_CACHE_ENABLED,
            PokerTablePlayerModelImpl.FINDER_CACHE_ENABLED,
            PokerTablePlayerImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByplayerId",
            new String[] { Long.class.getName() },
            PokerTablePlayerModelImpl.PLAYERID_COLUMN_BITMASK |
            PokerTablePlayerModelImpl.CREATEDDATE_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_PLAYERID = new FinderPath(PokerTablePlayerModelImpl.ENTITY_CACHE_ENABLED,
            PokerTablePlayerModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByplayerId",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_PLAYERID_PLAYERID_2 = "pokerTablePlayer.id.playerId = ?";
    private static final String _SQL_SELECT_POKERTABLEPLAYER = "SELECT pokerTablePlayer FROM PokerTablePlayer pokerTablePlayer";
    private static final String _SQL_SELECT_POKERTABLEPLAYER_WHERE = "SELECT pokerTablePlayer FROM PokerTablePlayer pokerTablePlayer WHERE ";
    private static final String _SQL_COUNT_POKERTABLEPLAYER = "SELECT COUNT(pokerTablePlayer) FROM PokerTablePlayer pokerTablePlayer";
    private static final String _SQL_COUNT_POKERTABLEPLAYER_WHERE = "SELECT COUNT(pokerTablePlayer) FROM PokerTablePlayer pokerTablePlayer WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "pokerTablePlayer.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No PokerTablePlayer exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No PokerTablePlayer exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(PokerTablePlayerPersistenceImpl.class);
    private static PokerTablePlayer _nullPokerTablePlayer = new PokerTablePlayerImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<PokerTablePlayer> toCacheModel() {
                return _nullPokerTablePlayerCacheModel;
            }
        };

    private static CacheModel<PokerTablePlayer> _nullPokerTablePlayerCacheModel = new CacheModel<PokerTablePlayer>() {
            @Override
            public PokerTablePlayer toEntityModel() {
                return _nullPokerTablePlayer;
            }
        };

    public PokerTablePlayerPersistenceImpl() {
        setModelClass(PokerTablePlayer.class);
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
    @Override
    public PokerTablePlayer findBygameIdAndPlayerId(long gameId, long playerId)
        throws NoSuchPokerTablePlayerException, SystemException {
        PokerTablePlayer pokerTablePlayer = fetchBygameIdAndPlayerId(gameId,
                playerId);

        if (pokerTablePlayer == null) {
            StringBundler msg = new StringBundler(6);

            msg.append(_NO_SUCH_ENTITY_WITH_KEY);

            msg.append("gameId=");
            msg.append(gameId);

            msg.append(", playerId=");
            msg.append(playerId);

            msg.append(StringPool.CLOSE_CURLY_BRACE);

            if (_log.isWarnEnabled()) {
                _log.warn(msg.toString());
            }

            throw new NoSuchPokerTablePlayerException(msg.toString());
        }

        return pokerTablePlayer;
    }

    /**
     * Returns the PokerTablePlayer where gameId = &#63; and playerId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
     *
     * @param gameId the game ID
     * @param playerId the player ID
     * @return the matching PokerTablePlayer, or <code>null</code> if a matching PokerTablePlayer could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PokerTablePlayer fetchBygameIdAndPlayerId(long gameId, long playerId)
        throws SystemException {
        return fetchBygameIdAndPlayerId(gameId, playerId, true);
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
    @Override
    public PokerTablePlayer fetchBygameIdAndPlayerId(long gameId,
        long playerId, boolean retrieveFromCache) throws SystemException {
        Object[] finderArgs = new Object[] { gameId, playerId };

        Object result = null;

        if (retrieveFromCache) {
            result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_GAMEIDANDPLAYERID,
                    finderArgs, this);
        }

        if (result instanceof PokerTablePlayer) {
            PokerTablePlayer pokerTablePlayer = (PokerTablePlayer) result;

            if ((gameId != pokerTablePlayer.getGameId()) ||
                    (playerId != pokerTablePlayer.getPlayerId())) {
                result = null;
            }
        }

        if (result == null) {
            StringBundler query = new StringBundler(4);

            query.append(_SQL_SELECT_POKERTABLEPLAYER_WHERE);

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

                List<PokerTablePlayer> list = q.list();

                if (list.isEmpty()) {
                    FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_GAMEIDANDPLAYERID,
                        finderArgs, list);
                } else {
                    if ((list.size() > 1) && _log.isWarnEnabled()) {
                        _log.warn(
                            "PokerTablePlayerPersistenceImpl.fetchBygameIdAndPlayerId(long, long, boolean) with parameters (" +
                            StringUtil.merge(finderArgs) +
                            ") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
                    }

                    PokerTablePlayer pokerTablePlayer = list.get(0);

                    result = pokerTablePlayer;

                    cacheResult(pokerTablePlayer);

                    if ((pokerTablePlayer.getGameId() != gameId) ||
                            (pokerTablePlayer.getPlayerId() != playerId)) {
                        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_GAMEIDANDPLAYERID,
                            finderArgs, pokerTablePlayer);
                    }
                }
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_GAMEIDANDPLAYERID,
                    finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        if (result instanceof List<?>) {
            return null;
        } else {
            return (PokerTablePlayer) result;
        }
    }

    /**
     * Removes the PokerTablePlayer where gameId = &#63; and playerId = &#63; from the database.
     *
     * @param gameId the game ID
     * @param playerId the player ID
     * @return the PokerTablePlayer that was removed
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PokerTablePlayer removeBygameIdAndPlayerId(long gameId, long playerId)
        throws NoSuchPokerTablePlayerException, SystemException {
        PokerTablePlayer pokerTablePlayer = findBygameIdAndPlayerId(gameId,
                playerId);

        return remove(pokerTablePlayer);
    }

    /**
     * Returns the number of PokerTablePlayers where gameId = &#63; and playerId = &#63;.
     *
     * @param gameId the game ID
     * @param playerId the player ID
     * @return the number of matching PokerTablePlayers
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

            query.append(_SQL_COUNT_POKERTABLEPLAYER_WHERE);

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
     * Returns all the PokerTablePlayers where gameId = &#63;.
     *
     * @param gameId the game ID
     * @return the matching PokerTablePlayers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<PokerTablePlayer> findBygameId(long gameId)
        throws SystemException {
        return findBygameId(gameId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    @Override
    public List<PokerTablePlayer> findBygameId(long gameId, int start, int end)
        throws SystemException {
        return findBygameId(gameId, start, end, null);
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
    @Override
    public List<PokerTablePlayer> findBygameId(long gameId, int start, int end,
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

        List<PokerTablePlayer> list = (List<PokerTablePlayer>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (PokerTablePlayer pokerTablePlayer : list) {
                if ((gameId != pokerTablePlayer.getGameId())) {
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

            query.append(_SQL_SELECT_POKERTABLEPLAYER_WHERE);

            query.append(_FINDER_COLUMN_GAMEID_GAMEID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(PokerTablePlayerModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(gameId);

                if (!pagination) {
                    list = (List<PokerTablePlayer>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<PokerTablePlayer>(list);
                } else {
                    list = (List<PokerTablePlayer>) QueryUtil.list(q,
                            getDialect(), start, end);
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
     * Returns the first PokerTablePlayer in the ordered set where gameId = &#63;.
     *
     * @param gameId the game ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching PokerTablePlayer
     * @throws com.sbs.pokerp.NoSuchPokerTablePlayerException if a matching PokerTablePlayer could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PokerTablePlayer findBygameId_First(long gameId,
        OrderByComparator orderByComparator)
        throws NoSuchPokerTablePlayerException, SystemException {
        PokerTablePlayer pokerTablePlayer = fetchBygameId_First(gameId,
                orderByComparator);

        if (pokerTablePlayer != null) {
            return pokerTablePlayer;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("gameId=");
        msg.append(gameId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchPokerTablePlayerException(msg.toString());
    }

    /**
     * Returns the first PokerTablePlayer in the ordered set where gameId = &#63;.
     *
     * @param gameId the game ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching PokerTablePlayer, or <code>null</code> if a matching PokerTablePlayer could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PokerTablePlayer fetchBygameId_First(long gameId,
        OrderByComparator orderByComparator) throws SystemException {
        List<PokerTablePlayer> list = findBygameId(gameId, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public PokerTablePlayer findBygameId_Last(long gameId,
        OrderByComparator orderByComparator)
        throws NoSuchPokerTablePlayerException, SystemException {
        PokerTablePlayer pokerTablePlayer = fetchBygameId_Last(gameId,
                orderByComparator);

        if (pokerTablePlayer != null) {
            return pokerTablePlayer;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("gameId=");
        msg.append(gameId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchPokerTablePlayerException(msg.toString());
    }

    /**
     * Returns the last PokerTablePlayer in the ordered set where gameId = &#63;.
     *
     * @param gameId the game ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching PokerTablePlayer, or <code>null</code> if a matching PokerTablePlayer could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PokerTablePlayer fetchBygameId_Last(long gameId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countBygameId(gameId);

        if (count == 0) {
            return null;
        }

        List<PokerTablePlayer> list = findBygameId(gameId, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public PokerTablePlayer[] findBygameId_PrevAndNext(
        PokerTablePlayerPK pokerTablePlayerPK, long gameId,
        OrderByComparator orderByComparator)
        throws NoSuchPokerTablePlayerException, SystemException {
        PokerTablePlayer pokerTablePlayer = findByPrimaryKey(pokerTablePlayerPK);

        Session session = null;

        try {
            session = openSession();

            PokerTablePlayer[] array = new PokerTablePlayerImpl[3];

            array[0] = getBygameId_PrevAndNext(session, pokerTablePlayer,
                    gameId, orderByComparator, true);

            array[1] = pokerTablePlayer;

            array[2] = getBygameId_PrevAndNext(session, pokerTablePlayer,
                    gameId, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected PokerTablePlayer getBygameId_PrevAndNext(Session session,
        PokerTablePlayer pokerTablePlayer, long gameId,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_POKERTABLEPLAYER_WHERE);

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
            query.append(PokerTablePlayerModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(gameId);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(pokerTablePlayer);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<PokerTablePlayer> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the PokerTablePlayers where gameId = &#63; from the database.
     *
     * @param gameId the game ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeBygameId(long gameId) throws SystemException {
        for (PokerTablePlayer pokerTablePlayer : findBygameId(gameId,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(pokerTablePlayer);
        }
    }

    /**
     * Returns the number of PokerTablePlayers where gameId = &#63;.
     *
     * @param gameId the game ID
     * @return the number of matching PokerTablePlayers
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

            query.append(_SQL_COUNT_POKERTABLEPLAYER_WHERE);

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
     * Returns all the PokerTablePlayers where playerId = &#63;.
     *
     * @param playerId the player ID
     * @return the matching PokerTablePlayers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<PokerTablePlayer> findByplayerId(long playerId)
        throws SystemException {
        return findByplayerId(playerId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
            null);
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
    @Override
    public List<PokerTablePlayer> findByplayerId(long playerId, int start,
        int end) throws SystemException {
        return findByplayerId(playerId, start, end, null);
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
    @Override
    public List<PokerTablePlayer> findByplayerId(long playerId, int start,
        int end, OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PLAYERID;
            finderArgs = new Object[] { playerId };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PLAYERID;
            finderArgs = new Object[] { playerId, start, end, orderByComparator };
        }

        List<PokerTablePlayer> list = (List<PokerTablePlayer>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (PokerTablePlayer pokerTablePlayer : list) {
                if ((playerId != pokerTablePlayer.getPlayerId())) {
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

            query.append(_SQL_SELECT_POKERTABLEPLAYER_WHERE);

            query.append(_FINDER_COLUMN_PLAYERID_PLAYERID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(PokerTablePlayerModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(playerId);

                if (!pagination) {
                    list = (List<PokerTablePlayer>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<PokerTablePlayer>(list);
                } else {
                    list = (List<PokerTablePlayer>) QueryUtil.list(q,
                            getDialect(), start, end);
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
     * Returns the first PokerTablePlayer in the ordered set where playerId = &#63;.
     *
     * @param playerId the player ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching PokerTablePlayer
     * @throws com.sbs.pokerp.NoSuchPokerTablePlayerException if a matching PokerTablePlayer could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PokerTablePlayer findByplayerId_First(long playerId,
        OrderByComparator orderByComparator)
        throws NoSuchPokerTablePlayerException, SystemException {
        PokerTablePlayer pokerTablePlayer = fetchByplayerId_First(playerId,
                orderByComparator);

        if (pokerTablePlayer != null) {
            return pokerTablePlayer;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("playerId=");
        msg.append(playerId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchPokerTablePlayerException(msg.toString());
    }

    /**
     * Returns the first PokerTablePlayer in the ordered set where playerId = &#63;.
     *
     * @param playerId the player ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching PokerTablePlayer, or <code>null</code> if a matching PokerTablePlayer could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PokerTablePlayer fetchByplayerId_First(long playerId,
        OrderByComparator orderByComparator) throws SystemException {
        List<PokerTablePlayer> list = findByplayerId(playerId, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public PokerTablePlayer findByplayerId_Last(long playerId,
        OrderByComparator orderByComparator)
        throws NoSuchPokerTablePlayerException, SystemException {
        PokerTablePlayer pokerTablePlayer = fetchByplayerId_Last(playerId,
                orderByComparator);

        if (pokerTablePlayer != null) {
            return pokerTablePlayer;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("playerId=");
        msg.append(playerId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchPokerTablePlayerException(msg.toString());
    }

    /**
     * Returns the last PokerTablePlayer in the ordered set where playerId = &#63;.
     *
     * @param playerId the player ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching PokerTablePlayer, or <code>null</code> if a matching PokerTablePlayer could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PokerTablePlayer fetchByplayerId_Last(long playerId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByplayerId(playerId);

        if (count == 0) {
            return null;
        }

        List<PokerTablePlayer> list = findByplayerId(playerId, count - 1,
                count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public PokerTablePlayer[] findByplayerId_PrevAndNext(
        PokerTablePlayerPK pokerTablePlayerPK, long playerId,
        OrderByComparator orderByComparator)
        throws NoSuchPokerTablePlayerException, SystemException {
        PokerTablePlayer pokerTablePlayer = findByPrimaryKey(pokerTablePlayerPK);

        Session session = null;

        try {
            session = openSession();

            PokerTablePlayer[] array = new PokerTablePlayerImpl[3];

            array[0] = getByplayerId_PrevAndNext(session, pokerTablePlayer,
                    playerId, orderByComparator, true);

            array[1] = pokerTablePlayer;

            array[2] = getByplayerId_PrevAndNext(session, pokerTablePlayer,
                    playerId, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected PokerTablePlayer getByplayerId_PrevAndNext(Session session,
        PokerTablePlayer pokerTablePlayer, long playerId,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_POKERTABLEPLAYER_WHERE);

        query.append(_FINDER_COLUMN_PLAYERID_PLAYERID_2);

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
            query.append(PokerTablePlayerModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(playerId);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(pokerTablePlayer);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<PokerTablePlayer> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the PokerTablePlayers where playerId = &#63; from the database.
     *
     * @param playerId the player ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByplayerId(long playerId) throws SystemException {
        for (PokerTablePlayer pokerTablePlayer : findByplayerId(playerId,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(pokerTablePlayer);
        }
    }

    /**
     * Returns the number of PokerTablePlayers where playerId = &#63;.
     *
     * @param playerId the player ID
     * @return the number of matching PokerTablePlayers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByplayerId(long playerId) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_PLAYERID;

        Object[] finderArgs = new Object[] { playerId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_POKERTABLEPLAYER_WHERE);

            query.append(_FINDER_COLUMN_PLAYERID_PLAYERID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

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
     * Caches the PokerTablePlayer in the entity cache if it is enabled.
     *
     * @param pokerTablePlayer the PokerTablePlayer
     */
    @Override
    public void cacheResult(PokerTablePlayer pokerTablePlayer) {
        EntityCacheUtil.putResult(PokerTablePlayerModelImpl.ENTITY_CACHE_ENABLED,
            PokerTablePlayerImpl.class, pokerTablePlayer.getPrimaryKey(),
            pokerTablePlayer);

        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_GAMEIDANDPLAYERID,
            new Object[] {
                pokerTablePlayer.getGameId(), pokerTablePlayer.getPlayerId()
            }, pokerTablePlayer);

        pokerTablePlayer.resetOriginalValues();
    }

    /**
     * Caches the PokerTablePlayers in the entity cache if it is enabled.
     *
     * @param pokerTablePlayers the PokerTablePlayers
     */
    @Override
    public void cacheResult(List<PokerTablePlayer> pokerTablePlayers) {
        for (PokerTablePlayer pokerTablePlayer : pokerTablePlayers) {
            if (EntityCacheUtil.getResult(
                        PokerTablePlayerModelImpl.ENTITY_CACHE_ENABLED,
                        PokerTablePlayerImpl.class,
                        pokerTablePlayer.getPrimaryKey()) == null) {
                cacheResult(pokerTablePlayer);
            } else {
                pokerTablePlayer.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all PokerTablePlayers.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(PokerTablePlayerImpl.class.getName());
        }

        EntityCacheUtil.clearCache(PokerTablePlayerImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the PokerTablePlayer.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(PokerTablePlayer pokerTablePlayer) {
        EntityCacheUtil.removeResult(PokerTablePlayerModelImpl.ENTITY_CACHE_ENABLED,
            PokerTablePlayerImpl.class, pokerTablePlayer.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        clearUniqueFindersCache(pokerTablePlayer);
    }

    @Override
    public void clearCache(List<PokerTablePlayer> pokerTablePlayers) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (PokerTablePlayer pokerTablePlayer : pokerTablePlayers) {
            EntityCacheUtil.removeResult(PokerTablePlayerModelImpl.ENTITY_CACHE_ENABLED,
                PokerTablePlayerImpl.class, pokerTablePlayer.getPrimaryKey());

            clearUniqueFindersCache(pokerTablePlayer);
        }
    }

    protected void cacheUniqueFindersCache(PokerTablePlayer pokerTablePlayer) {
        if (pokerTablePlayer.isNew()) {
            Object[] args = new Object[] {
                    pokerTablePlayer.getGameId(), pokerTablePlayer.getPlayerId()
                };

            FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_GAMEIDANDPLAYERID,
                args, Long.valueOf(1));
            FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_GAMEIDANDPLAYERID,
                args, pokerTablePlayer);
        } else {
            PokerTablePlayerModelImpl pokerTablePlayerModelImpl = (PokerTablePlayerModelImpl) pokerTablePlayer;

            if ((pokerTablePlayerModelImpl.getColumnBitmask() &
                    FINDER_PATH_FETCH_BY_GAMEIDANDPLAYERID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        pokerTablePlayer.getGameId(),
                        pokerTablePlayer.getPlayerId()
                    };

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_GAMEIDANDPLAYERID,
                    args, Long.valueOf(1));
                FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_GAMEIDANDPLAYERID,
                    args, pokerTablePlayer);
            }
        }
    }

    protected void clearUniqueFindersCache(PokerTablePlayer pokerTablePlayer) {
        PokerTablePlayerModelImpl pokerTablePlayerModelImpl = (PokerTablePlayerModelImpl) pokerTablePlayer;

        Object[] args = new Object[] {
                pokerTablePlayer.getGameId(), pokerTablePlayer.getPlayerId()
            };

        FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GAMEIDANDPLAYERID,
            args);
        FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_GAMEIDANDPLAYERID,
            args);

        if ((pokerTablePlayerModelImpl.getColumnBitmask() &
                FINDER_PATH_FETCH_BY_GAMEIDANDPLAYERID.getColumnBitmask()) != 0) {
            args = new Object[] {
                    pokerTablePlayerModelImpl.getOriginalGameId(),
                    pokerTablePlayerModelImpl.getOriginalPlayerId()
                };

            FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GAMEIDANDPLAYERID,
                args);
            FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_GAMEIDANDPLAYERID,
                args);
        }
    }

    /**
     * Creates a new PokerTablePlayer with the primary key. Does not add the PokerTablePlayer to the database.
     *
     * @param pokerTablePlayerPK the primary key for the new PokerTablePlayer
     * @return the new PokerTablePlayer
     */
    @Override
    public PokerTablePlayer create(PokerTablePlayerPK pokerTablePlayerPK) {
        PokerTablePlayer pokerTablePlayer = new PokerTablePlayerImpl();

        pokerTablePlayer.setNew(true);
        pokerTablePlayer.setPrimaryKey(pokerTablePlayerPK);

        return pokerTablePlayer;
    }

    /**
     * Removes the PokerTablePlayer with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param pokerTablePlayerPK the primary key of the PokerTablePlayer
     * @return the PokerTablePlayer that was removed
     * @throws com.sbs.pokerp.NoSuchPokerTablePlayerException if a PokerTablePlayer with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PokerTablePlayer remove(PokerTablePlayerPK pokerTablePlayerPK)
        throws NoSuchPokerTablePlayerException, SystemException {
        return remove((Serializable) pokerTablePlayerPK);
    }

    /**
     * Removes the PokerTablePlayer with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the PokerTablePlayer
     * @return the PokerTablePlayer that was removed
     * @throws com.sbs.pokerp.NoSuchPokerTablePlayerException if a PokerTablePlayer with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PokerTablePlayer remove(Serializable primaryKey)
        throws NoSuchPokerTablePlayerException, SystemException {
        Session session = null;

        try {
            session = openSession();

            PokerTablePlayer pokerTablePlayer = (PokerTablePlayer) session.get(PokerTablePlayerImpl.class,
                    primaryKey);

            if (pokerTablePlayer == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchPokerTablePlayerException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(pokerTablePlayer);
        } catch (NoSuchPokerTablePlayerException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected PokerTablePlayer removeImpl(PokerTablePlayer pokerTablePlayer)
        throws SystemException {
        pokerTablePlayer = toUnwrappedModel(pokerTablePlayer);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(pokerTablePlayer)) {
                pokerTablePlayer = (PokerTablePlayer) session.get(PokerTablePlayerImpl.class,
                        pokerTablePlayer.getPrimaryKeyObj());
            }

            if (pokerTablePlayer != null) {
                session.delete(pokerTablePlayer);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (pokerTablePlayer != null) {
            clearCache(pokerTablePlayer);
        }

        return pokerTablePlayer;
    }

    @Override
    public PokerTablePlayer updateImpl(
        com.sbs.pokerp.model.PokerTablePlayer pokerTablePlayer)
        throws SystemException {
        pokerTablePlayer = toUnwrappedModel(pokerTablePlayer);

        boolean isNew = pokerTablePlayer.isNew();

        PokerTablePlayerModelImpl pokerTablePlayerModelImpl = (PokerTablePlayerModelImpl) pokerTablePlayer;

        Session session = null;

        try {
            session = openSession();

            if (pokerTablePlayer.isNew()) {
                session.save(pokerTablePlayer);

                pokerTablePlayer.setNew(false);
            } else {
                session.merge(pokerTablePlayer);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !PokerTablePlayerModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((pokerTablePlayerModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GAMEID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        pokerTablePlayerModelImpl.getOriginalGameId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GAMEID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GAMEID,
                    args);

                args = new Object[] { pokerTablePlayerModelImpl.getGameId() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GAMEID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GAMEID,
                    args);
            }

            if ((pokerTablePlayerModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PLAYERID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        pokerTablePlayerModelImpl.getOriginalPlayerId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PLAYERID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PLAYERID,
                    args);

                args = new Object[] { pokerTablePlayerModelImpl.getPlayerId() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PLAYERID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PLAYERID,
                    args);
            }
        }

        EntityCacheUtil.putResult(PokerTablePlayerModelImpl.ENTITY_CACHE_ENABLED,
            PokerTablePlayerImpl.class, pokerTablePlayer.getPrimaryKey(),
            pokerTablePlayer);

        clearUniqueFindersCache(pokerTablePlayer);
        cacheUniqueFindersCache(pokerTablePlayer);

        return pokerTablePlayer;
    }

    protected PokerTablePlayer toUnwrappedModel(
        PokerTablePlayer pokerTablePlayer) {
        if (pokerTablePlayer instanceof PokerTablePlayerImpl) {
            return pokerTablePlayer;
        }

        PokerTablePlayerImpl pokerTablePlayerImpl = new PokerTablePlayerImpl();

        pokerTablePlayerImpl.setNew(pokerTablePlayer.isNew());
        pokerTablePlayerImpl.setPrimaryKey(pokerTablePlayer.getPrimaryKey());

        pokerTablePlayerImpl.setGameId(pokerTablePlayer.getGameId());
        pokerTablePlayerImpl.setPlayerId(pokerTablePlayer.getPlayerId());
        pokerTablePlayerImpl.setTimeJoined(pokerTablePlayer.getTimeJoined());
        pokerTablePlayerImpl.setTimeLeft(pokerTablePlayer.getTimeLeft());
        pokerTablePlayerImpl.setAmountWon(pokerTablePlayer.getAmountWon());
        pokerTablePlayerImpl.setCreatedBy(pokerTablePlayer.getCreatedBy());
        pokerTablePlayerImpl.setCreatedDate(pokerTablePlayer.getCreatedDate());
        pokerTablePlayerImpl.setUpdatedBy(pokerTablePlayer.getUpdatedBy());
        pokerTablePlayerImpl.setUpdatedDate(pokerTablePlayer.getUpdatedDate());

        return pokerTablePlayerImpl;
    }

    /**
     * Returns the PokerTablePlayer with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the PokerTablePlayer
     * @return the PokerTablePlayer
     * @throws com.sbs.pokerp.NoSuchPokerTablePlayerException if a PokerTablePlayer with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PokerTablePlayer findByPrimaryKey(Serializable primaryKey)
        throws NoSuchPokerTablePlayerException, SystemException {
        PokerTablePlayer pokerTablePlayer = fetchByPrimaryKey(primaryKey);

        if (pokerTablePlayer == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchPokerTablePlayerException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return pokerTablePlayer;
    }

    /**
     * Returns the PokerTablePlayer with the primary key or throws a {@link com.sbs.pokerp.NoSuchPokerTablePlayerException} if it could not be found.
     *
     * @param pokerTablePlayerPK the primary key of the PokerTablePlayer
     * @return the PokerTablePlayer
     * @throws com.sbs.pokerp.NoSuchPokerTablePlayerException if a PokerTablePlayer with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PokerTablePlayer findByPrimaryKey(
        PokerTablePlayerPK pokerTablePlayerPK)
        throws NoSuchPokerTablePlayerException, SystemException {
        return findByPrimaryKey((Serializable) pokerTablePlayerPK);
    }

    /**
     * Returns the PokerTablePlayer with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the PokerTablePlayer
     * @return the PokerTablePlayer, or <code>null</code> if a PokerTablePlayer with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PokerTablePlayer fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        PokerTablePlayer pokerTablePlayer = (PokerTablePlayer) EntityCacheUtil.getResult(PokerTablePlayerModelImpl.ENTITY_CACHE_ENABLED,
                PokerTablePlayerImpl.class, primaryKey);

        if (pokerTablePlayer == _nullPokerTablePlayer) {
            return null;
        }

        if (pokerTablePlayer == null) {
            Session session = null;

            try {
                session = openSession();

                pokerTablePlayer = (PokerTablePlayer) session.get(PokerTablePlayerImpl.class,
                        primaryKey);

                if (pokerTablePlayer != null) {
                    cacheResult(pokerTablePlayer);
                } else {
                    EntityCacheUtil.putResult(PokerTablePlayerModelImpl.ENTITY_CACHE_ENABLED,
                        PokerTablePlayerImpl.class, primaryKey,
                        _nullPokerTablePlayer);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(PokerTablePlayerModelImpl.ENTITY_CACHE_ENABLED,
                    PokerTablePlayerImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return pokerTablePlayer;
    }

    /**
     * Returns the PokerTablePlayer with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param pokerTablePlayerPK the primary key of the PokerTablePlayer
     * @return the PokerTablePlayer, or <code>null</code> if a PokerTablePlayer with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PokerTablePlayer fetchByPrimaryKey(
        PokerTablePlayerPK pokerTablePlayerPK) throws SystemException {
        return fetchByPrimaryKey((Serializable) pokerTablePlayerPK);
    }

    /**
     * Returns all the PokerTablePlayers.
     *
     * @return the PokerTablePlayers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<PokerTablePlayer> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    @Override
    public List<PokerTablePlayer> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
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
    @Override
    public List<PokerTablePlayer> findAll(int start, int end,
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

        List<PokerTablePlayer> list = (List<PokerTablePlayer>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_POKERTABLEPLAYER);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_POKERTABLEPLAYER;

                if (pagination) {
                    sql = sql.concat(PokerTablePlayerModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<PokerTablePlayer>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<PokerTablePlayer>(list);
                } else {
                    list = (List<PokerTablePlayer>) QueryUtil.list(q,
                            getDialect(), start, end);
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
     * Removes all the PokerTablePlayers from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (PokerTablePlayer pokerTablePlayer : findAll()) {
            remove(pokerTablePlayer);
        }
    }

    /**
     * Returns the number of PokerTablePlayers.
     *
     * @return the number of PokerTablePlayers
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

                Query q = session.createQuery(_SQL_COUNT_POKERTABLEPLAYER);

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
     * Initializes the PokerTablePlayer persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.sbs.pokerp.model.PokerTablePlayer")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<PokerTablePlayer>> listenersList = new ArrayList<ModelListener<PokerTablePlayer>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<PokerTablePlayer>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(PokerTablePlayerImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
