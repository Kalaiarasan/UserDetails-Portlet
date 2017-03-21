package net.opentrends.user.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableService;

/**
 * Provides the remote service utility for Person. This utility wraps
 * {@link net.opentrends.user.service.impl.PersonServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Ravi
 * @see PersonService
 * @see net.opentrends.user.service.base.PersonServiceBaseImpl
 * @see net.opentrends.user.service.impl.PersonServiceImpl
 * @generated
 */
public class PersonServiceUtil {
    private static PersonService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link net.opentrends.user.service.impl.PersonServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public static java.lang.String getBeanIdentifier() {
        return getService().getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public static void setBeanIdentifier(java.lang.String beanIdentifier) {
        getService().setBeanIdentifier(beanIdentifier);
    }

    public static java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return getService().invokeMethod(name, parameterTypes, arguments);
    }

    public static net.opentrends.user.model.Person addPerson(
        java.lang.String name, java.lang.String sex, int age,
        java.lang.String city,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().addPerson(name, sex, age, city, serviceContext);
    }

    public static void clearService() {
        _service = null;
    }

    public static PersonService getService() {
        if (_service == null) {
            InvokableService invokableService = (InvokableService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    PersonService.class.getName());

            if (invokableService instanceof PersonService) {
                _service = (PersonService) invokableService;
            } else {
                _service = new PersonServiceClp(invokableService);
            }

            ReferenceRegistry.registerReference(PersonServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(PersonService service) {
    }
}
