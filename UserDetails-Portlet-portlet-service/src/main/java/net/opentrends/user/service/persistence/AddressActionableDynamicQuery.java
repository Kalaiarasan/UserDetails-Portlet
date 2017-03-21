package net.opentrends.user.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import net.opentrends.user.model.Address;
import net.opentrends.user.service.AddressLocalServiceUtil;

/**
 * @author Ravi
 * @generated
 */
public abstract class AddressActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public AddressActionableDynamicQuery() throws SystemException {
        setBaseLocalService(AddressLocalServiceUtil.getService());
        setClass(Address.class);

        setClassLoader(net.opentrends.user.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("addressId");
    }
}
