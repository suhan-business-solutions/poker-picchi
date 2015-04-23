package com.sbs.pokerp.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.sbs.pokerp.model.PokerTable;

/**
 * The persistence interface for the PokerTable service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author jpnaidu
 * @see PokerTablePersistenceImpl
 * @see PokerTableUtil
 * @generated
 */
public interface PokerTablePersistence extends BasePersistence<PokerTable> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link PokerTableUtil} to access the PokerTable persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the PokerTable in the entity cache if it is enabled.
    *
    * @param pokerTable the PokerTable
    */
    public void cacheResult(com.sbs.pokerp.model.PokerTable pokerTable);

    /**
    * Caches the PokerTables in the entity cache if it is enabled.
    *
    * @param pokerTables the PokerTables
    */
    public void cacheResult(
        java.util.List<com.sbs.pokerp.model.PokerTable> pokerTables);

    /**
    * Creates a new PokerTable with the primary key. Does not add the PokerTable to the database.
    *
    * @param gameId the primary key for the new PokerTable
    * @return the new PokerTable
    */
    public com.sbs.pokerp.model.PokerTable create(long gameId);

    /**
    * Removes the PokerTable with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param gameId the primary key of the PokerTable
    * @return the PokerTable that was removed
    * @throws com.sbs.pokerp.NoSuchPokerTableException if a PokerTable with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.sbs.pokerp.model.PokerTable remove(long gameId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.sbs.pokerp.NoSuchPokerTableException;

    public com.sbs.pokerp.model.PokerTable updateImpl(
        com.sbs.pokerp.model.PokerTable pokerTable)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the PokerTable with the primary key or throws a {@link com.sbs.pokerp.NoSuchPokerTableException} if it could not be found.
    *
    * @param gameId the primary key of the PokerTable
    * @return the PokerTable
    * @throws com.sbs.pokerp.NoSuchPokerTableException if a PokerTable with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.sbs.pokerp.model.PokerTable findByPrimaryKey(long gameId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.sbs.pokerp.NoSuchPokerTableException;

    /**
    * Returns the PokerTable with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param gameId the primary key of the PokerTable
    * @return the PokerTable, or <code>null</code> if a PokerTable with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.sbs.pokerp.model.PokerTable fetchByPrimaryKey(long gameId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the PokerTables.
    *
    * @return the PokerTables
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.sbs.pokerp.model.PokerTable> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.sbs.pokerp.model.PokerTable> findAll(int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.sbs.pokerp.model.PokerTable> findAll(int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the PokerTables from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of PokerTables.
    *
    * @return the number of PokerTables
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
