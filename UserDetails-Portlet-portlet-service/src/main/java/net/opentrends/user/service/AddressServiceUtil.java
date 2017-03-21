package net.opentrends.user.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableService;

/**
 * Provides the remote service utility for Address. This utility wraps
 * {@link net.opentrends.user.service.impl.AddressServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Ravi
 * @see AddressService
 * @see net.opentrends.user.service.base.AddressServiceBaseImpl
 * @see net.opentrends.user.service.impl.AddressServiceImpl
 * @generated
 */
public class AddressServiceUtil {
    private static AddressService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link net.opentrends.user.service.impl.AddressServiceImpl} and rerun ServiceBuilder to regenerate this class.
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

    public static net.opentrends.user.model.Address addAddress(
        net.opentrends.user.model.Address address)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addAddress(address);
    }

    public static void clearService() {
        _service = null;
    }

    public static AddressService getService() {
        if (_service == null) {
            InvokableService invokableService = (InvokableService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    AddressService.class.getName());

            if (invokableService instanceof AddressService) {
                _service = (AddressService) invokableService;
            } else {
                _service = new AddressServiceClp(invokableService);
            }

            ReferenceRegistry.registerReference(AddressServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(AddressService service) {
    }
}
