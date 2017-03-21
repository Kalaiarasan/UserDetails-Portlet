package net.opentrends.user.service.impl;

import com.liferay.portal.kernel.exception.SystemException;

import net.opentrends.user.model.Address;
import net.opentrends.user.service.AddressLocalServiceUtil;
import net.opentrends.user.service.base.AddressServiceBaseImpl;

/**
 * The implementation of the address remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link net.opentrends.user.service.AddressService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Ravi
 * @see net.opentrends.user.service.base.AddressServiceBaseImpl
 * @see net.opentrends.user.service.AddressServiceUtil
 */
public class AddressServiceImpl extends AddressServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link net.opentrends.user.service.AddressServiceUtil} to access the address remote service.
     */
	 public Address addAddress(Address address) throws SystemException{
		return AddressLocalServiceUtil.addAddress(address);
		
	} 
}
