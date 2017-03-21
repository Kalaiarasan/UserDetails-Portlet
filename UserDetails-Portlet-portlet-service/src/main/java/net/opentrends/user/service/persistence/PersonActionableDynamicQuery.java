package net.opentrends.user.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import net.opentrends.user.model.Person;
import net.opentrends.user.service.PersonLocalServiceUtil;

/**
 * @author Ravi
 * @generated
 */
public abstract class PersonActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public PersonActionableDynamicQuery() throws SystemException {
        setBaseLocalService(PersonLocalServiceUtil.getService());
        setClass(Person.class);

        setClassLoader(net.opentrends.user.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("personId");
    }
}
