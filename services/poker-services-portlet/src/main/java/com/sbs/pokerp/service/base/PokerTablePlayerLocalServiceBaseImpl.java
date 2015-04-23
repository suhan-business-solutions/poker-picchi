package com.sbs.pokerp.service.base;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.BaseLocalServiceImpl;
import com.liferay.portal.service.PersistedModelLocalServiceRegistryUtil;
import com.liferay.portal.service.persistence.UserPersistence;

import com.sbs.pokerp.model.PokerTablePlayer;
import com.sbs.pokerp.service.PokerTablePlayerLocalService;
import com.sbs.pokerp.service.persistence.BuyInPersistence;
import com.sbs.pokerp.service.persistence.BuyOutPersistence;
import com.sbs.pokerp.service.persistence.PokerTablePersistence;
import com.sbs.pokerp.service.persistence.PokerTablePlayerPK;
import com.sbs.pokerp.service.persistence.PokerTablePlayerPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the PokerTablePlayer local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.sbs.pokerp.service.impl.PokerTablePlayerLocalServiceImpl}.
 * </p>
 *
 * @author jpnaidu
 * @see com.sbs.pokerp.service.impl.PokerTablePlayerLocalServiceImpl
 * @see com.sbs.pokerp.service.PokerTablePlayerLocalServiceUtil
 * @generated
 */
public abstract class PokerTablePlayerLocalServiceBaseImpl
    extends BaseLocalServiceImpl implements PokerTablePlayerLocalService,
        IdentifiableBean {
    @BeanReference(type = com.sbs.pokerp.service.BuyInLocalService.class)
    protected com.sbs.pokerp.service.BuyInLocalService buyInLocalService;
    @BeanReference(type = BuyInPersistence.class)
    protected BuyInPersistence buyInPersistence;
    @BeanReference(type = com.sbs.pokerp.service.BuyOutLocalService.class)
    protected com.sbs.pokerp.service.BuyOutLocalService buyOutLocalService;
    @BeanReference(type = BuyOutPersistence.class)
    protected BuyOutPersistence buyOutPersistence;
    @BeanReference(type = com.sbs.pokerp.service.PokerTableLocalService.class)
    protected com.sbs.pokerp.service.PokerTableLocalService pokerTableLocalService;
    @BeanReference(type = PokerTablePersistence.class)
    protected PokerTablePersistence pokerTablePersistence;
    @BeanReference(type = com.sbs.pokerp.service.PokerTablePlayerLocalService.class)
    protected com.sbs.pokerp.service.PokerTablePlayerLocalService pokerTablePlayerLocalService;
    @BeanReference(type = PokerTablePlayerPersistence.class)
    protected PokerTablePlayerPersistence pokerTablePlayerPersistence;
    @BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
    protected com.liferay.counter.service.CounterLocalService counterLocalService;
    @BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
    protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
    @BeanReference(type = com.liferay.portal.service.UserLocalService.class)
    protected com.liferay.portal.service.UserLocalService userLocalService;
    @BeanReference(type = com.liferay.portal.service.UserService.class)
    protected com.liferay.portal.service.UserService userService;
    @BeanReference(type = UserPersistence.class)
    protected UserPersistence userPersistence;
    private String _beanIdentifier;
    private ClassLoader _classLoader;
    private PokerTablePlayerLocalServiceClpInvoker _clpInvoker = new PokerTablePlayerLocalServiceClpInvoker();

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link com.sbs.pokerp.service.PokerTablePlayerLocalServiceUtil} to access the PokerTablePlayer local service.
     */

    /**
     * Adds the PokerTablePlayer to the database. Also notifies the appropriate model listeners.
     *
     * @param pokerTablePlayer the PokerTablePlayer
     * @return the PokerTablePlayer that was added
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.REINDEX)
    @Override
    public PokerTablePlayer addPokerTablePlayer(
        PokerTablePlayer pokerTablePlayer) throws SystemException {
        pokerTablePlayer.setNew(true);

        return pokerTablePlayerPersistence.update(pokerTablePlayer);
    }

    /**
     * Creates a new PokerTablePlayer with the primary key. Does not add the PokerTablePlayer to the database.
     *
     * @param pokerTablePlayerPK the primary key for the new PokerTablePlayer
     * @return the new PokerTablePlayer
     */
    @Override
    public PokerTablePlayer createPokerTablePlayer(
        PokerTablePlayerPK pokerTablePlayerPK) {
        return pokerTablePlayerPersistence.create(pokerTablePlayerPK);
    }

    /**
     * Deletes the PokerTablePlayer with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param pokerTablePlayerPK the primary key of the PokerTablePlayer
     * @return the PokerTablePlayer that was removed
     * @throws PortalException if a PokerTablePlayer with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.DELETE)
    @Override
    public PokerTablePlayer deletePokerTablePlayer(
        PokerTablePlayerPK pokerTablePlayerPK)
        throws PortalException, SystemException {
        return pokerTablePlayerPersistence.remove(pokerTablePlayerPK);
    }

    /**
     * Deletes the PokerTablePlayer from the database. Also notifies the appropriate model listeners.
     *
     * @param pokerTablePlayer the PokerTablePlayer
     * @return the PokerTablePlayer that was removed
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.DELETE)
    @Override
    public PokerTablePlayer deletePokerTablePlayer(
        PokerTablePlayer pokerTablePlayer) throws SystemException {
        return pokerTablePlayerPersistence.remove(pokerTablePlayer);
    }

    @Override
    public DynamicQuery dynamicQuery() {
        Class<?> clazz = getClass();

        return DynamicQueryFactoryUtil.forClass(PokerTablePlayer.class,
            clazz.getClassLoader());
    }

    /**
     * Performs a dynamic query on the database and returns the matching rows.
     *
     * @param dynamicQuery the dynamic query
     * @return the matching rows
     * @throws SystemException if a system exception occurred
     */
    @Override
    @SuppressWarnings("rawtypes")
    public List dynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return pokerTablePlayerPersistence.findWithDynamicQuery(dynamicQuery);
    }

    /**
     * Performs a dynamic query on the database and returns a range of the matching rows.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.sbs.pokerp.model.impl.PokerTablePlayerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param dynamicQuery the dynamic query
     * @param start the lower bound of the range of model instances
     * @param end the upper bound of the range of model instances (not inclusive)
     * @return the range of matching rows
     * @throws SystemException if a system exception occurred
     */
    @Override
    @SuppressWarnings("rawtypes")
    public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return pokerTablePlayerPersistence.findWithDynamicQuery(dynamicQuery,
            start, end);
    }

    /**
     * Performs a dynamic query on the database and returns an ordered range of the matching rows.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.sbs.pokerp.model.impl.PokerTablePlayerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param dynamicQuery the dynamic query
     * @param start the lower bound of the range of model instances
     * @param end the upper bound of the range of model instances (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching rows
     * @throws SystemException if a system exception occurred
     */
    @Override
    @SuppressWarnings("rawtypes")
    public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return pokerTablePlayerPersistence.findWithDynamicQuery(dynamicQuery,
            start, end, orderByComparator);
    }

    /**
     * Returns the number of rows that match the dynamic query.
     *
     * @param dynamicQuery the dynamic query
     * @return the number of rows that match the dynamic query
     * @throws SystemException if a system exception occurred
     */
    @Override
    public long dynamicQueryCount(DynamicQuery dynamicQuery)
        throws SystemException {
        return pokerTablePlayerPersistence.countWithDynamicQuery(dynamicQuery);
    }

    /**
     * Returns the number of rows that match the dynamic query.
     *
     * @param dynamicQuery the dynamic query
     * @param projection the projection to apply to the query
     * @return the number of rows that match the dynamic query
     * @throws SystemException if a system exception occurred
     */
    @Override
    public long dynamicQueryCount(DynamicQuery dynamicQuery,
        Projection projection) throws SystemException {
        return pokerTablePlayerPersistence.countWithDynamicQuery(dynamicQuery,
            projection);
    }

    @Override
    public PokerTablePlayer fetchPokerTablePlayer(
        PokerTablePlayerPK pokerTablePlayerPK) throws SystemException {
        return pokerTablePlayerPersistence.fetchByPrimaryKey(pokerTablePlayerPK);
    }

    /**
     * Returns the PokerTablePlayer with the primary key.
     *
     * @param pokerTablePlayerPK the primary key of the PokerTablePlayer
     * @return the PokerTablePlayer
     * @throws PortalException if a PokerTablePlayer with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PokerTablePlayer getPokerTablePlayer(
        PokerTablePlayerPK pokerTablePlayerPK)
        throws PortalException, SystemException {
        return pokerTablePlayerPersistence.findByPrimaryKey(pokerTablePlayerPK);
    }

    @Override
    public PersistedModel getPersistedModel(Serializable primaryKeyObj)
        throws PortalException, SystemException {
        return pokerTablePlayerPersistence.findByPrimaryKey(primaryKeyObj);
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
    public List<PokerTablePlayer> getPokerTablePlayers(int start, int end)
        throws SystemException {
        return pokerTablePlayerPersistence.findAll(start, end);
    }

    /**
     * Returns the number of PokerTablePlayers.
     *
     * @return the number of PokerTablePlayers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int getPokerTablePlayersCount() throws SystemException {
        return pokerTablePlayerPersistence.countAll();
    }

    /**
     * Updates the PokerTablePlayer in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
     *
     * @param pokerTablePlayer the PokerTablePlayer
     * @return the PokerTablePlayer that was updated
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.REINDEX)
    @Override
    public PokerTablePlayer updatePokerTablePlayer(
        PokerTablePlayer pokerTablePlayer) throws SystemException {
        return pokerTablePlayerPersistence.update(pokerTablePlayer);
    }

    /**
     * Returns the BuyIn local service.
     *
     * @return the BuyIn local service
     */
    public com.sbs.pokerp.service.BuyInLocalService getBuyInLocalService() {
        return buyInLocalService;
    }

    /**
     * Sets the BuyIn local service.
     *
     * @param buyInLocalService the BuyIn local service
     */
    public void setBuyInLocalService(
        com.sbs.pokerp.service.BuyInLocalService buyInLocalService) {
        this.buyInLocalService = buyInLocalService;
    }

    /**
     * Returns the BuyIn persistence.
     *
     * @return the BuyIn persistence
     */
    public BuyInPersistence getBuyInPersistence() {
        return buyInPersistence;
    }

    /**
     * Sets the BuyIn persistence.
     *
     * @param buyInPersistence the BuyIn persistence
     */
    public void setBuyInPersistence(BuyInPersistence buyInPersistence) {
        this.buyInPersistence = buyInPersistence;
    }

    /**
     * Returns the BuyOut local service.
     *
     * @return the BuyOut local service
     */
    public com.sbs.pokerp.service.BuyOutLocalService getBuyOutLocalService() {
        return buyOutLocalService;
    }

    /**
     * Sets the BuyOut local service.
     *
     * @param buyOutLocalService the BuyOut local service
     */
    public void setBuyOutLocalService(
        com.sbs.pokerp.service.BuyOutLocalService buyOutLocalService) {
        this.buyOutLocalService = buyOutLocalService;
    }

    /**
     * Returns the BuyOut persistence.
     *
     * @return the BuyOut persistence
     */
    public BuyOutPersistence getBuyOutPersistence() {
        return buyOutPersistence;
    }

    /**
     * Sets the BuyOut persistence.
     *
     * @param buyOutPersistence the BuyOut persistence
     */
    public void setBuyOutPersistence(BuyOutPersistence buyOutPersistence) {
        this.buyOutPersistence = buyOutPersistence;
    }

    /**
     * Returns the PokerTable local service.
     *
     * @return the PokerTable local service
     */
    public com.sbs.pokerp.service.PokerTableLocalService getPokerTableLocalService() {
        return pokerTableLocalService;
    }

    /**
     * Sets the PokerTable local service.
     *
     * @param pokerTableLocalService the PokerTable local service
     */
    public void setPokerTableLocalService(
        com.sbs.pokerp.service.PokerTableLocalService pokerTableLocalService) {
        this.pokerTableLocalService = pokerTableLocalService;
    }

    /**
     * Returns the PokerTable persistence.
     *
     * @return the PokerTable persistence
     */
    public PokerTablePersistence getPokerTablePersistence() {
        return pokerTablePersistence;
    }

    /**
     * Sets the PokerTable persistence.
     *
     * @param pokerTablePersistence the PokerTable persistence
     */
    public void setPokerTablePersistence(
        PokerTablePersistence pokerTablePersistence) {
        this.pokerTablePersistence = pokerTablePersistence;
    }

    /**
     * Returns the PokerTablePlayer local service.
     *
     * @return the PokerTablePlayer local service
     */
    public com.sbs.pokerp.service.PokerTablePlayerLocalService getPokerTablePlayerLocalService() {
        return pokerTablePlayerLocalService;
    }

    /**
     * Sets the PokerTablePlayer local service.
     *
     * @param pokerTablePlayerLocalService the PokerTablePlayer local service
     */
    public void setPokerTablePlayerLocalService(
        com.sbs.pokerp.service.PokerTablePlayerLocalService pokerTablePlayerLocalService) {
        this.pokerTablePlayerLocalService = pokerTablePlayerLocalService;
    }

    /**
     * Returns the PokerTablePlayer persistence.
     *
     * @return the PokerTablePlayer persistence
     */
    public PokerTablePlayerPersistence getPokerTablePlayerPersistence() {
        return pokerTablePlayerPersistence;
    }

    /**
     * Sets the PokerTablePlayer persistence.
     *
     * @param pokerTablePlayerPersistence the PokerTablePlayer persistence
     */
    public void setPokerTablePlayerPersistence(
        PokerTablePlayerPersistence pokerTablePlayerPersistence) {
        this.pokerTablePlayerPersistence = pokerTablePlayerPersistence;
    }

    /**
     * Returns the counter local service.
     *
     * @return the counter local service
     */
    public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
        return counterLocalService;
    }

    /**
     * Sets the counter local service.
     *
     * @param counterLocalService the counter local service
     */
    public void setCounterLocalService(
        com.liferay.counter.service.CounterLocalService counterLocalService) {
        this.counterLocalService = counterLocalService;
    }

    /**
     * Returns the resource local service.
     *
     * @return the resource local service
     */
    public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
        return resourceLocalService;
    }

    /**
     * Sets the resource local service.
     *
     * @param resourceLocalService the resource local service
     */
    public void setResourceLocalService(
        com.liferay.portal.service.ResourceLocalService resourceLocalService) {
        this.resourceLocalService = resourceLocalService;
    }

    /**
     * Returns the user local service.
     *
     * @return the user local service
     */
    public com.liferay.portal.service.UserLocalService getUserLocalService() {
        return userLocalService;
    }

    /**
     * Sets the user local service.
     *
     * @param userLocalService the user local service
     */
    public void setUserLocalService(
        com.liferay.portal.service.UserLocalService userLocalService) {
        this.userLocalService = userLocalService;
    }

    /**
     * Returns the user remote service.
     *
     * @return the user remote service
     */
    public com.liferay.portal.service.UserService getUserService() {
        return userService;
    }

    /**
     * Sets the user remote service.
     *
     * @param userService the user remote service
     */
    public void setUserService(
        com.liferay.portal.service.UserService userService) {
        this.userService = userService;
    }

    /**
     * Returns the user persistence.
     *
     * @return the user persistence
     */
    public UserPersistence getUserPersistence() {
        return userPersistence;
    }

    /**
     * Sets the user persistence.
     *
     * @param userPersistence the user persistence
     */
    public void setUserPersistence(UserPersistence userPersistence) {
        this.userPersistence = userPersistence;
    }

    public void afterPropertiesSet() {
        Class<?> clazz = getClass();

        _classLoader = clazz.getClassLoader();

        PersistedModelLocalServiceRegistryUtil.register("com.sbs.pokerp.model.PokerTablePlayer",
            pokerTablePlayerLocalService);
    }

    public void destroy() {
        PersistedModelLocalServiceRegistryUtil.unregister(
            "com.sbs.pokerp.model.PokerTablePlayer");
    }

    /**
     * Returns the Spring bean ID for this bean.
     *
     * @return the Spring bean ID for this bean
     */
    @Override
    public String getBeanIdentifier() {
        return _beanIdentifier;
    }

    /**
     * Sets the Spring bean ID for this bean.
     *
     * @param beanIdentifier the Spring bean ID for this bean
     */
    @Override
    public void setBeanIdentifier(String beanIdentifier) {
        _beanIdentifier = beanIdentifier;
    }

    @Override
    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        Thread currentThread = Thread.currentThread();

        ClassLoader contextClassLoader = currentThread.getContextClassLoader();

        if (contextClassLoader != _classLoader) {
            currentThread.setContextClassLoader(_classLoader);
        }

        try {
            return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
        } finally {
            if (contextClassLoader != _classLoader) {
                currentThread.setContextClassLoader(contextClassLoader);
            }
        }
    }

    protected Class<?> getModelClass() {
        return PokerTablePlayer.class;
    }

    protected String getModelClassName() {
        return PokerTablePlayer.class.getName();
    }

    /**
     * Performs an SQL query.
     *
     * @param sql the sql query
     */
    protected void runSQL(String sql) throws SystemException {
        try {
            DataSource dataSource = pokerTablePlayerPersistence.getDataSource();

            SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
                    sql, new int[0]);

            sqlUpdate.update();
        } catch (Exception e) {
            throw new SystemException(e);
        }
    }
}
