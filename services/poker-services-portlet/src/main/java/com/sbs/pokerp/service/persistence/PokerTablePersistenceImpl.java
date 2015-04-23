package com.sbs.pokerp.service.persistence;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
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
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.sbs.pokerp.NoSuchPokerTableException;
import com.sbs.pokerp.model.PokerTable;
import com.sbs.pokerp.model.impl.PokerTableImpl;
import com.sbs.pokerp.model.impl.PokerTableModelImpl;
import com.sbs.pokerp.service.persistence.PokerTablePersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the PokerTable service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author jpnaidu
 * @see PokerTablePersistence
 * @see PokerTableUtil
 * @generated
 */
public class PokerTablePersistenceImpl extends BasePersistenceImpl<PokerTable>
    implements PokerTablePersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link PokerTableUtil} to access the PokerTable persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = PokerTableImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(PokerTableModelImpl.ENTITY_CACHE_ENABLED,
            PokerTableModelImpl.FINDER_CACHE_ENABLED, PokerTableImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(PokerTableModelImpl.ENTITY_CACHE_ENABLED,
            PokerTableModelImpl.FINDER_CACHE_ENABLED, PokerTableImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(PokerTableModelImpl.ENTITY_CACHE_ENABLED,
            PokerTableModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_POKERTABLE = "SELECT pokerTable FROM PokerTable pokerTable";
    private static final String _SQL_COUNT_POKERTABLE = "SELECT COUNT(pokerTable) FROM PokerTable pokerTable";
    private static final String _ORDER_BY_ENTITY_ALIAS = "pokerTable.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No PokerTable exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(PokerTablePersistenceImpl.class);
    private static PokerTable _nullPokerTable = new PokerTableImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<PokerTable> toCacheModel() {
                return _nullPokerTableCacheModel;
            }
        };

    private static CacheModel<PokerTable> _nullPokerTableCacheModel = new CacheModel<PokerTable>() {
            @Override
            public PokerTable toEntityModel() {
                return _nullPokerTable;
            }
        };

    public PokerTablePersistenceImpl() {
        setModelClass(PokerTable.class);
    }

    /**
     * Caches the PokerTable in the entity cache if it is enabled.
     *
     * @param pokerTable the PokerTable
     */
    @Override
    public void cacheResult(PokerTable pokerTable) {
        EntityCacheUtil.putResult(PokerTableModelImpl.ENTITY_CACHE_ENABLED,
            PokerTableImpl.class, pokerTable.getPrimaryKey(), pokerTable);

        pokerTable.resetOriginalValues();
    }

    /**
     * Caches the PokerTables in the entity cache if it is enabled.
     *
     * @param pokerTables the PokerTables
     */
    @Override
    public void cacheResult(List<PokerTable> pokerTables) {
        for (PokerTable pokerTable : pokerTables) {
            if (EntityCacheUtil.getResult(
                        PokerTableModelImpl.ENTITY_CACHE_ENABLED,
                        PokerTableImpl.class, pokerTable.getPrimaryKey()) == null) {
                cacheResult(pokerTable);
            } else {
                pokerTable.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all PokerTables.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(PokerTableImpl.class.getName());
        }

        EntityCacheUtil.clearCache(PokerTableImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the PokerTable.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(PokerTable pokerTable) {
        EntityCacheUtil.removeResult(PokerTableModelImpl.ENTITY_CACHE_ENABLED,
            PokerTableImpl.class, pokerTable.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<PokerTable> pokerTables) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (PokerTable pokerTable : pokerTables) {
            EntityCacheUtil.removeResult(PokerTableModelImpl.ENTITY_CACHE_ENABLED,
                PokerTableImpl.class, pokerTable.getPrimaryKey());
        }
    }

    /**
     * Creates a new PokerTable with the primary key. Does not add the PokerTable to the database.
     *
     * @param gameId the primary key for the new PokerTable
     * @return the new PokerTable
     */
    @Override
    public PokerTable create(long gameId) {
        PokerTable pokerTable = new PokerTableImpl();

        pokerTable.setNew(true);
        pokerTable.setPrimaryKey(gameId);

        return pokerTable;
    }

    /**
     * Removes the PokerTable with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param gameId the primary key of the PokerTable
     * @return the PokerTable that was removed
     * @throws com.sbs.pokerp.NoSuchPokerTableException if a PokerTable with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PokerTable remove(long gameId)
        throws NoSuchPokerTableException, SystemException {
        return remove((Serializable) gameId);
    }

    /**
     * Removes the PokerTable with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the PokerTable
     * @return the PokerTable that was removed
     * @throws com.sbs.pokerp.NoSuchPokerTableException if a PokerTable with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PokerTable remove(Serializable primaryKey)
        throws NoSuchPokerTableException, SystemException {
        Session session = null;

        try {
            session = openSession();

            PokerTable pokerTable = (PokerTable) session.get(PokerTableImpl.class,
                    primaryKey);

            if (pokerTable == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchPokerTableException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(pokerTable);
        } catch (NoSuchPokerTableException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected PokerTable removeImpl(PokerTable pokerTable)
        throws SystemException {
        pokerTable = toUnwrappedModel(pokerTable);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(pokerTable)) {
                pokerTable = (PokerTable) session.get(PokerTableImpl.class,
                        pokerTable.getPrimaryKeyObj());
            }

            if (pokerTable != null) {
                session.delete(pokerTable);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (pokerTable != null) {
            clearCache(pokerTable);
        }

        return pokerTable;
    }

    @Override
    public PokerTable updateImpl(com.sbs.pokerp.model.PokerTable pokerTable)
        throws SystemException {
        pokerTable = toUnwrappedModel(pokerTable);

        boolean isNew = pokerTable.isNew();

        Session session = null;

        try {
            session = openSession();

            if (pokerTable.isNew()) {
                session.save(pokerTable);

                pokerTable.setNew(false);
            } else {
                session.merge(pokerTable);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }

        EntityCacheUtil.putResult(PokerTableModelImpl.ENTITY_CACHE_ENABLED,
            PokerTableImpl.class, pokerTable.getPrimaryKey(), pokerTable);

        return pokerTable;
    }

    protected PokerTable toUnwrappedModel(PokerTable pokerTable) {
        if (pokerTable instanceof PokerTableImpl) {
            return pokerTable;
        }

        PokerTableImpl pokerTableImpl = new PokerTableImpl();

        pokerTableImpl.setNew(pokerTable.isNew());
        pokerTableImpl.setPrimaryKey(pokerTable.getPrimaryKey());

        pokerTableImpl.setGameId(pokerTable.getGameId());
        pokerTableImpl.setOrgId(pokerTable.getOrgId());
        pokerTableImpl.setTableName(pokerTable.getTableName());
        pokerTableImpl.setPlayerCount(pokerTable.getPlayerCount());
        pokerTableImpl.setStatus(pokerTable.getStatus());
        pokerTableImpl.setNotes(pokerTable.getNotes());
        pokerTableImpl.setCreatedBy(pokerTable.getCreatedBy());
        pokerTableImpl.setCreatedDate(pokerTable.getCreatedDate());
        pokerTableImpl.setUpdatedBy(pokerTable.getUpdatedBy());
        pokerTableImpl.setUpdatedDate(pokerTable.getUpdatedDate());

        return pokerTableImpl;
    }

    /**
     * Returns the PokerTable with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the PokerTable
     * @return the PokerTable
     * @throws com.sbs.pokerp.NoSuchPokerTableException if a PokerTable with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PokerTable findByPrimaryKey(Serializable primaryKey)
        throws NoSuchPokerTableException, SystemException {
        PokerTable pokerTable = fetchByPrimaryKey(primaryKey);

        if (pokerTable == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchPokerTableException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return pokerTable;
    }

    /**
     * Returns the PokerTable with the primary key or throws a {@link com.sbs.pokerp.NoSuchPokerTableException} if it could not be found.
     *
     * @param gameId the primary key of the PokerTable
     * @return the PokerTable
     * @throws com.sbs.pokerp.NoSuchPokerTableException if a PokerTable with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PokerTable findByPrimaryKey(long gameId)
        throws NoSuchPokerTableException, SystemException {
        return findByPrimaryKey((Serializable) gameId);
    }

    /**
     * Returns the PokerTable with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the PokerTable
     * @return the PokerTable, or <code>null</code> if a PokerTable with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PokerTable fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        PokerTable pokerTable = (PokerTable) EntityCacheUtil.getResult(PokerTableModelImpl.ENTITY_CACHE_ENABLED,
                PokerTableImpl.class, primaryKey);

        if (pokerTable == _nullPokerTable) {
            return null;
        }

        if (pokerTable == null) {
            Session session = null;

            try {
                session = openSession();

                pokerTable = (PokerTable) session.get(PokerTableImpl.class,
                        primaryKey);

                if (pokerTable != null) {
                    cacheResult(pokerTable);
                } else {
                    EntityCacheUtil.putResult(PokerTableModelImpl.ENTITY_CACHE_ENABLED,
                        PokerTableImpl.class, primaryKey, _nullPokerTable);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(PokerTableModelImpl.ENTITY_CACHE_ENABLED,
                    PokerTableImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return pokerTable;
    }

    /**
     * Returns the PokerTable with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param gameId the primary key of the PokerTable
     * @return the PokerTable, or <code>null</code> if a PokerTable with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PokerTable fetchByPrimaryKey(long gameId) throws SystemException {
        return fetchByPrimaryKey((Serializable) gameId);
    }

    /**
     * Returns all the PokerTables.
     *
     * @return the PokerTables
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<PokerTable> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    @Override
    public List<PokerTable> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
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
    @Override
    public List<PokerTable> findAll(int start, int end,
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

        List<PokerTable> list = (List<PokerTable>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_POKERTABLE);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_POKERTABLE;

                if (pagination) {
                    sql = sql.concat(PokerTableModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<PokerTable>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<PokerTable>(list);
                } else {
                    list = (List<PokerTable>) QueryUtil.list(q, getDialect(),
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
     * Removes all the PokerTables from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (PokerTable pokerTable : findAll()) {
            remove(pokerTable);
        }
    }

    /**
     * Returns the number of PokerTables.
     *
     * @return the number of PokerTables
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

                Query q = session.createQuery(_SQL_COUNT_POKERTABLE);

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
     * Initializes the PokerTable persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.sbs.pokerp.model.PokerTable")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<PokerTable>> listenersList = new ArrayList<ModelListener<PokerTable>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<PokerTable>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(PokerTableImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
