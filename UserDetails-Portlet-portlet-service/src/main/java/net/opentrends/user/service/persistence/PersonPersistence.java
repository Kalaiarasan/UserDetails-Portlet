package net.opentrends.user.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import net.opentrends.user.model.Person;

/**
 * The persistence interface for the person service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Ravi
 * @see PersonPersistenceImpl
 * @see PersonUtil
 * @generated
 */
public interface PersonPersistence extends BasePersistence<Person> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link PersonUtil} to access the person persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the persons where uuid = &#63;.
    *
    * @param uuid the uuid
    * @return the matching persons
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<net.opentrends.user.model.Person> findByUuid(
        java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the persons where uuid = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link net.opentrends.user.model.impl.PersonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param start the lower bound of the range of persons
    * @param end the upper bound of the range of persons (not inclusive)
    * @return the range of matching persons
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<net.opentrends.user.model.Person> findByUuid(
        java.lang.String uuid, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the persons where uuid = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link net.opentrends.user.model.impl.PersonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param start the lower bound of the range of persons
    * @param end the upper bound of the range of persons (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching persons
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<net.opentrends.user.model.Person> findByUuid(
        java.lang.String uuid, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first person in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching person
    * @throws net.opentrends.user.NoSuchPersonException if a matching person could not be found
    * @throws SystemException if a system exception occurred
    */
    public net.opentrends.user.model.Person findByUuid_First(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            net.opentrends.user.NoSuchPersonException;

    /**
    * Returns the first person in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching person, or <code>null</code> if a matching person could not be found
    * @throws SystemException if a system exception occurred
    */
    public net.opentrends.user.model.Person fetchByUuid_First(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last person in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching person
    * @throws net.opentrends.user.NoSuchPersonException if a matching person could not be found
    * @throws SystemException if a system exception occurred
    */
    public net.opentrends.user.model.Person findByUuid_Last(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            net.opentrends.user.NoSuchPersonException;

    /**
    * Returns the last person in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching person, or <code>null</code> if a matching person could not be found
    * @throws SystemException if a system exception occurred
    */
    public net.opentrends.user.model.Person fetchByUuid_Last(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the persons before and after the current person in the ordered set where uuid = &#63;.
    *
    * @param personId the primary key of the current person
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next person
    * @throws net.opentrends.user.NoSuchPersonException if a person with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public net.opentrends.user.model.Person[] findByUuid_PrevAndNext(
        long personId, java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            net.opentrends.user.NoSuchPersonException;

    /**
    * Removes all the persons where uuid = &#63; from the database.
    *
    * @param uuid the uuid
    * @throws SystemException if a system exception occurred
    */
    public void removeByUuid(java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of persons where uuid = &#63;.
    *
    * @param uuid the uuid
    * @return the number of matching persons
    * @throws SystemException if a system exception occurred
    */
    public int countByUuid(java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the person where uuid = &#63; and groupId = &#63; or throws a {@link net.opentrends.user.NoSuchPersonException} if it could not be found.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the matching person
    * @throws net.opentrends.user.NoSuchPersonException if a matching person could not be found
    * @throws SystemException if a system exception occurred
    */
    public net.opentrends.user.model.Person findByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException,
            net.opentrends.user.NoSuchPersonException;

    /**
    * Returns the person where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the matching person, or <code>null</code> if a matching person could not be found
    * @throws SystemException if a system exception occurred
    */
    public net.opentrends.user.model.Person fetchByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the person where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching person, or <code>null</code> if a matching person could not be found
    * @throws SystemException if a system exception occurred
    */
    public net.opentrends.user.model.Person fetchByUUID_G(
        java.lang.String uuid, long groupId, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes the person where uuid = &#63; and groupId = &#63; from the database.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the person that was removed
    * @throws SystemException if a system exception occurred
    */
    public net.opentrends.user.model.Person removeByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException,
            net.opentrends.user.NoSuchPersonException;

    /**
    * Returns the number of persons where uuid = &#63; and groupId = &#63;.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the number of matching persons
    * @throws SystemException if a system exception occurred
    */
    public int countByUUID_G(java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the persons where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @return the matching persons
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<net.opentrends.user.model.Person> findByUuid_C(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the persons where uuid = &#63; and companyId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link net.opentrends.user.model.impl.PersonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param start the lower bound of the range of persons
    * @param end the upper bound of the range of persons (not inclusive)
    * @return the range of matching persons
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<net.opentrends.user.model.Person> findByUuid_C(
        java.lang.String uuid, long companyId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the persons where uuid = &#63; and companyId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link net.opentrends.user.model.impl.PersonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param start the lower bound of the range of persons
    * @param end the upper bound of the range of persons (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching persons
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<net.opentrends.user.model.Person> findByUuid_C(
        java.lang.String uuid, long companyId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first person in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching person
    * @throws net.opentrends.user.NoSuchPersonException if a matching person could not be found
    * @throws SystemException if a system exception occurred
    */
    public net.opentrends.user.model.Person findByUuid_C_First(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            net.opentrends.user.NoSuchPersonException;

    /**
    * Returns the first person in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching person, or <code>null</code> if a matching person could not be found
    * @throws SystemException if a system exception occurred
    */
    public net.opentrends.user.model.Person fetchByUuid_C_First(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last person in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching person
    * @throws net.opentrends.user.NoSuchPersonException if a matching person could not be found
    * @throws SystemException if a system exception occurred
    */
    public net.opentrends.user.model.Person findByUuid_C_Last(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            net.opentrends.user.NoSuchPersonException;

    /**
    * Returns the last person in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching person, or <code>null</code> if a matching person could not be found
    * @throws SystemException if a system exception occurred
    */
    public net.opentrends.user.model.Person fetchByUuid_C_Last(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the persons before and after the current person in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param personId the primary key of the current person
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next person
    * @throws net.opentrends.user.NoSuchPersonException if a person with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public net.opentrends.user.model.Person[] findByUuid_C_PrevAndNext(
        long personId, java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            net.opentrends.user.NoSuchPersonException;

    /**
    * Removes all the persons where uuid = &#63; and companyId = &#63; from the database.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByUuid_C(java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of persons where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @return the number of matching persons
    * @throws SystemException if a system exception occurred
    */
    public int countByUuid_C(java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the persons where city = &#63;.
    *
    * @param city the city
    * @return the matching persons
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<net.opentrends.user.model.Person> findBycity(
        java.lang.String city)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the persons where city = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link net.opentrends.user.model.impl.PersonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param city the city
    * @param start the lower bound of the range of persons
    * @param end the upper bound of the range of persons (not inclusive)
    * @return the range of matching persons
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<net.opentrends.user.model.Person> findBycity(
        java.lang.String city, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the persons where city = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link net.opentrends.user.model.impl.PersonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param city the city
    * @param start the lower bound of the range of persons
    * @param end the upper bound of the range of persons (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching persons
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<net.opentrends.user.model.Person> findBycity(
        java.lang.String city, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first person in the ordered set where city = &#63;.
    *
    * @param city the city
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching person
    * @throws net.opentrends.user.NoSuchPersonException if a matching person could not be found
    * @throws SystemException if a system exception occurred
    */
    public net.opentrends.user.model.Person findBycity_First(
        java.lang.String city,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            net.opentrends.user.NoSuchPersonException;

    /**
    * Returns the first person in the ordered set where city = &#63;.
    *
    * @param city the city
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching person, or <code>null</code> if a matching person could not be found
    * @throws SystemException if a system exception occurred
    */
    public net.opentrends.user.model.Person fetchBycity_First(
        java.lang.String city,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last person in the ordered set where city = &#63;.
    *
    * @param city the city
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching person
    * @throws net.opentrends.user.NoSuchPersonException if a matching person could not be found
    * @throws SystemException if a system exception occurred
    */
    public net.opentrends.user.model.Person findBycity_Last(
        java.lang.String city,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            net.opentrends.user.NoSuchPersonException;

    /**
    * Returns the last person in the ordered set where city = &#63;.
    *
    * @param city the city
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching person, or <code>null</code> if a matching person could not be found
    * @throws SystemException if a system exception occurred
    */
    public net.opentrends.user.model.Person fetchBycity_Last(
        java.lang.String city,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the persons before and after the current person in the ordered set where city = &#63;.
    *
    * @param personId the primary key of the current person
    * @param city the city
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next person
    * @throws net.opentrends.user.NoSuchPersonException if a person with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public net.opentrends.user.model.Person[] findBycity_PrevAndNext(
        long personId, java.lang.String city,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            net.opentrends.user.NoSuchPersonException;

    /**
    * Removes all the persons where city = &#63; from the database.
    *
    * @param city the city
    * @throws SystemException if a system exception occurred
    */
    public void removeBycity(java.lang.String city)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of persons where city = &#63;.
    *
    * @param city the city
    * @return the number of matching persons
    * @throws SystemException if a system exception occurred
    */
    public int countBycity(java.lang.String city)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the person in the entity cache if it is enabled.
    *
    * @param person the person
    */
    public void cacheResult(net.opentrends.user.model.Person person);

    /**
    * Caches the persons in the entity cache if it is enabled.
    *
    * @param persons the persons
    */
    public void cacheResult(
        java.util.List<net.opentrends.user.model.Person> persons);

    /**
    * Creates a new person with the primary key. Does not add the person to the database.
    *
    * @param personId the primary key for the new person
    * @return the new person
    */
    public net.opentrends.user.model.Person create(long personId);

    /**
    * Removes the person with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param personId the primary key of the person
    * @return the person that was removed
    * @throws net.opentrends.user.NoSuchPersonException if a person with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public net.opentrends.user.model.Person remove(long personId)
        throws com.liferay.portal.kernel.exception.SystemException,
            net.opentrends.user.NoSuchPersonException;

    public net.opentrends.user.model.Person updateImpl(
        net.opentrends.user.model.Person person)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the person with the primary key or throws a {@link net.opentrends.user.NoSuchPersonException} if it could not be found.
    *
    * @param personId the primary key of the person
    * @return the person
    * @throws net.opentrends.user.NoSuchPersonException if a person with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public net.opentrends.user.model.Person findByPrimaryKey(long personId)
        throws com.liferay.portal.kernel.exception.SystemException,
            net.opentrends.user.NoSuchPersonException;

    /**
    * Returns the person with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param personId the primary key of the person
    * @return the person, or <code>null</code> if a person with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public net.opentrends.user.model.Person fetchByPrimaryKey(long personId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the persons.
    *
    * @return the persons
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<net.opentrends.user.model.Person> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the persons.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link net.opentrends.user.model.impl.PersonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of persons
    * @param end the upper bound of the range of persons (not inclusive)
    * @return the range of persons
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<net.opentrends.user.model.Person> findAll(int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the persons.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link net.opentrends.user.model.impl.PersonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of persons
    * @param end the upper bound of the range of persons (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of persons
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<net.opentrends.user.model.Person> findAll(int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the persons from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of persons.
    *
    * @return the number of persons
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
