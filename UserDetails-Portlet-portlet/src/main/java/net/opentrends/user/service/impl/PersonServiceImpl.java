package net.opentrends.user.service.impl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.ServiceContext;

import net.opentrends.user.model.Person;
import net.opentrends.user.service.PersonLocalServiceUtil;
import net.opentrends.user.service.base.PersonServiceBaseImpl;

/**
 * The implementation of the person remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link net.opentrends.user.service.PersonService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Ravi
 * @see net.opentrends.user.service.base.PersonServiceBaseImpl
 * @see net.opentrends.user.service.PersonServiceUtil
 */
public class PersonServiceImpl extends PersonServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link net.opentrends.user.service.PersonServiceUtil} to access the person remote service.
     */
	 public Person addPerson(String name, String sex, int age, String city, ServiceContext serviceContext)
			throws SystemException, PortalException {		 
		 
		return PersonLocalServiceUtil.addPerson(name, sex, age, city, serviceContext);

	} 

}
