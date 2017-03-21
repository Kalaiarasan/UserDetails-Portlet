package net.opentrends.user.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import net.opentrends.user.model.Person;

import java.util.List;

/**
 * The persistence utility for the person service. This utility wraps {@link PersonPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Ravi
 * @see PersonPersistence
 * @see PersonPersistenceImpl
 * @generated
 */
public class PersonUtil {
    private static PersonPersistence _persistence;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
     */
    public static void clearCache() {
        getPersistence().clearCache();
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
     */
    public static void clearCache(Person person) {
        getPersistence().clearCache(person);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
     */
    public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().countWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
     */
    public static List<Person> findWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Person> findWithDynamicQuery(DynamicQuery dynamicQuery,
        int start, int end) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Person> findWithDynamicQuery(DynamicQuery dynamicQuery,
        int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static Person update(Person person) throws SystemException {
        return getPersistence().update(person);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static Person update(Person person, ServiceContext serviceContext)
        throws SystemException {
        return getPersistence().update(person, serviceContext);
    }

    /**
    * Returns all the persons where uuid = &#63;.
    *
    * @param uuid the uuid
    * @return the matching persons
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<net.opentrends.user.model.Person> findByUuid(
        java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid(uuid);
    }

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
    public static java.util.List<net.opentrends.user.model.Person> findByUuid(
        java.lang.String uuid, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid(uuid, start, end);
    }

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
    public static java.util.List<net.opentrends.user.model.Person> findByUuid(
        java.lang.String uuid, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid(uuid, start, end, orderByComparator);
    }

    /**
    * Returns the first person in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching person
    * @throws net.opentrends.user.NoSuchPersonException if a matching person could not be found
    * @throws SystemException if a system exception occurred
    */
    public static net.opentrends.user.model.Person findByUuid_First(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            net.opentrends.user.NoSuchPersonException {
        return getPersistence().findByUuid_First(uuid, orderByComparator);
    }

    /**
    * Returns the first person in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching person, or <code>null</code> if a matching person could not be found
    * @throws SystemException if a system exception occurred
    */
    public static net.opentrends.user.model.Person fetchByUuid_First(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByUuid_First(uuid, orderByComparator);
    }

    /**
    * Returns the last person in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching person
    * @throws net.opentrends.user.NoSuchPersonException if a matching person could not be found
    * @throws SystemException if a system exception occurred
    */
    public static net.opentrends.user.model.Person findByUuid_Last(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            net.opentrends.user.NoSuchPersonException {
        return getPersistence().findByUuid_Last(uuid, orderByComparator);
    }

    /**
    * Returns the last person in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching person, or <code>null</code> if a matching person could not be found
    * @throws SystemException if a system exception occurred
    */
    public static net.opentrends.user.model.Person fetchByUuid_Last(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
    }

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
    public static net.opentrends.user.model.Person[] findByUuid_PrevAndNext(
        long personId, java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            net.opentrends.user.NoSuchPersonException {
        return getPersistence()
                   .findByUuid_PrevAndNext(personId, uuid, orderByComparator);
    }

    /**
    * Removes all the persons where uuid = &#63; from the database.
    *
    * @param uuid the uuid
    * @throws SystemException if a system exception occurred
    */
    public static void removeByUuid(java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByUuid(uuid);
    }

    /**
    * Returns the number of persons where uuid = &#63;.
    *
    * @param uuid the uuid
    * @return the number of matching persons
    * @throws SystemException if a system exception occurred
    */
    public static int countByUuid(java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByUuid(uuid);
    }

    /**
    * Returns the person where uuid = &#63; and groupId = &#63; or throws a {@link net.opentrends.user.NoSuchPersonException} if it could not be found.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the matching person
    * @throws net.opentrends.user.NoSuchPersonException if a matching person could not be found
    * @throws SystemException if a system exception occurred
    */
    public static net.opentrends.user.model.Person findByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException,
            net.opentrends.user.NoSuchPersonException {
        return getPersistence().findByUUID_G(uuid, groupId);
    }

    /**
    * Returns the person where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the matching person, or <code>null</code> if a matching person could not be found
    * @throws SystemException if a system exception occurred
    */
    public static net.opentrends.user.model.Person fetchByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByUUID_G(uuid, groupId);
    }

    /**
    * Returns the person where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching person, or <code>null</code> if a matching person could not be found
    * @throws SystemException if a system exception occurred
    */
    public static net.opentrends.user.model.Person fetchByUUID_G(
        java.lang.String uuid, long groupId, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
    }

    /**
    * Removes the person where uuid = &#63; and groupId = &#63; from the database.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the person that was removed
    * @throws SystemException if a system exception occurred
    */
    public static net.opentrends.user.model.Person removeByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException,
            net.opentrends.user.NoSuchPersonException {
        return getPersistence().removeByUUID_G(uuid, groupId);
    }

    /**
    * Returns the number of persons where uuid = &#63; and groupId = &#63;.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the number of matching persons
    * @throws SystemException if a system exception occurred
    */
    public static int countByUUID_G(java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByUUID_G(uuid, groupId);
    }

    /**
    * Returns all the persons where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @return the matching persons
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<net.opentrends.user.model.Person> findByUuid_C(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid_C(uuid, companyId);
    }

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
    public static java.util.List<net.opentrends.user.model.Person> findByUuid_C(
        java.lang.String uuid, long companyId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid_C(uuid, companyId, start, end);
    }

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
    public static java.util.List<net.opentrends.user.model.Person> findByUuid_C(
        java.lang.String uuid, long companyId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
    }

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
    public static net.opentrends.user.model.Person findByUuid_C_First(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            net.opentrends.user.NoSuchPersonException {
        return getPersistence()
                   .findByUuid_C_First(uuid, companyId, orderByComparator);
    }

    /**
    * Returns the first person in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching person, or <code>null</code> if a matching person could not be found
    * @throws SystemException if a system exception occurred
    */
    public static net.opentrends.user.model.Person fetchByUuid_C_First(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
    }

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
    public static net.opentrends.user.model.Person findByUuid_C_Last(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            net.opentrends.user.NoSuchPersonException {
        return getPersistence()
                   .findByUuid_C_Last(uuid, companyId, orderByComparator);
    }

    /**
    * Returns the last person in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching person, or <code>null</code> if a matching person could not be found
    * @throws SystemException if a system exception occurred
    */
    public static net.opentrends.user.model.Person fetchByUuid_C_Last(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
    }

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
    public static net.opentrends.user.model.Person[] findByUuid_C_PrevAndNext(
        long personId, java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            net.opentrends.user.NoSuchPersonException {
        return getPersistence()
                   .findByUuid_C_PrevAndNext(personId, uuid, companyId,
            orderByComparator);
    }

    /**
    * Removes all the persons where uuid = &#63; and companyId = &#63; from the database.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeByUuid_C(java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByUuid_C(uuid, companyId);
    }

    /**
    * Returns the number of persons where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @return the number of matching persons
    * @throws SystemException if a system exception occurred
    */
    public static int countByUuid_C(java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByUuid_C(uuid, companyId);
    }

    /**
    * Returns all the persons where city = &#63;.
    *
    * @param city the city
    * @return the matching persons
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<net.opentrends.user.model.Person> findBycity(
        java.lang.String city)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findBycity(city);
    }

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
    public static java.util.List<net.opentrends.user.model.Person> findBycity(
        java.lang.String city, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findBycity(city, start, end);
    }

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
    public static java.util.List<net.opentrends.user.model.Person> findBycity(
        java.lang.String city, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findBycity(city, start, end, orderByComparator);
    }

    /**
    * Returns the first person in the ordered set where city = &#63;.
    *
    * @param city the city
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching person
    * @throws net.opentrends.user.NoSuchPersonException if a matching person could not be found
    * @throws SystemException if a system exception occurred
    */
    public static net.opentrends.user.model.Person findBycity_First(
        java.lang.String city,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            net.opentrends.user.NoSuchPersonException {
        return getPersistence().findBycity_First(city, orderByComparator);
    }

    /**
    * Returns the first person in the ordered set where city = &#63;.
    *
    * @param city the city
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching person, or <code>null</code> if a matching person could not be found
    * @throws SystemException if a system exception occurred
    */
    public static net.opentrends.user.model.Person fetchBycity_First(
        java.lang.String city,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchBycity_First(city, orderByComparator);
    }

    /**
    * Returns the last person in the ordered set where city = &#63;.
    *
    * @param city the city
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching person
    * @throws net.opentrends.user.NoSuchPersonException if a matching person could not be found
    * @throws SystemException if a system exception occurred
    */
    public static net.opentrends.user.model.Person findBycity_Last(
        java.lang.String city,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            net.opentrends.user.NoSuchPersonException {
        return getPersistence().findBycity_Last(city, orderByComparator);
    }

    /**
    * Returns the last person in the ordered set where city = &#63;.
    *
    * @param city the city
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching person, or <code>null</code> if a matching person could not be found
    * @throws SystemException if a system exception occurred
    */
    public static net.opentrends.user.model.Person fetchBycity_Last(
        java.lang.String city,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchBycity_Last(city, orderByComparator);
    }

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
    public static net.opentrends.user.model.Person[] findBycity_PrevAndNext(
        long personId, java.lang.String city,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            net.opentrends.user.NoSuchPersonException {
        return getPersistence()
                   .findBycity_PrevAndNext(personId, city, orderByComparator);
    }

    /**
    * Removes all the persons where city = &#63; from the database.
    *
    * @param city the city
    * @throws SystemException if a system exception occurred
    */
    public static void removeBycity(java.lang.String city)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeBycity(city);
    }

    /**
    * Returns the number of persons where city = &#63;.
    *
    * @param city the city
    * @return the number of matching persons
    * @throws SystemException if a system exception occurred
    */
    public static int countBycity(java.lang.String city)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countBycity(city);
    }

    /**
    * Caches the person in the entity cache if it is enabled.
    *
    * @param person the person
    */
    public static void cacheResult(net.opentrends.user.model.Person person) {
        getPersistence().cacheResult(person);
    }

    /**
    * Caches the persons in the entity cache if it is enabled.
    *
    * @param persons the persons
    */
    public static void cacheResult(
        java.util.List<net.opentrends.user.model.Person> persons) {
        getPersistence().cacheResult(persons);
    }

    /**
    * Creates a new person with the primary key. Does not add the person to the database.
    *
    * @param personId the primary key for the new person
    * @return the new person
    */
    public static net.opentrends.user.model.Person create(long personId) {
        return getPersistence().create(personId);
    }

    /**
    * Removes the person with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param personId the primary key of the person
    * @return the person that was removed
    * @throws net.opentrends.user.NoSuchPersonException if a person with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static net.opentrends.user.model.Person remove(long personId)
        throws com.liferay.portal.kernel.exception.SystemException,
            net.opentrends.user.NoSuchPersonException {
        return getPersistence().remove(personId);
    }

    public static net.opentrends.user.model.Person updateImpl(
        net.opentrends.user.model.Person person)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(person);
    }

    /**
    * Returns the person with the primary key or throws a {@link net.opentrends.user.NoSuchPersonException} if it could not be found.
    *
    * @param personId the primary key of the person
    * @return the person
    * @throws net.opentrends.user.NoSuchPersonException if a person with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static net.opentrends.user.model.Person findByPrimaryKey(
        long personId)
        throws com.liferay.portal.kernel.exception.SystemException,
            net.opentrends.user.NoSuchPersonException {
        return getPersistence().findByPrimaryKey(personId);
    }

    /**
    * Returns the person with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param personId the primary key of the person
    * @return the person, or <code>null</code> if a person with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static net.opentrends.user.model.Person fetchByPrimaryKey(
        long personId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(personId);
    }

    /**
    * Returns all the persons.
    *
    * @return the persons
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<net.opentrends.user.model.Person> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

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
    public static java.util.List<net.opentrends.user.model.Person> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

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
    public static java.util.List<net.opentrends.user.model.Person> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the persons from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of persons.
    *
    * @return the number of persons
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static PersonPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (PersonPersistence) PortletBeanLocatorUtil.locate(net.opentrends.user.service.ClpSerializer.getServletContextName(),
                    PersonPersistence.class.getName());

            ReferenceRegistry.registerReference(PersonUtil.class, "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(PersonPersistence persistence) {
    }
}
