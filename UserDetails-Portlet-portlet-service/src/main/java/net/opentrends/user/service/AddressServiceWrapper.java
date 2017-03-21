package net.opentrends.user.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AddressService}.
 *
 * @author Ravi
 * @see AddressService
 * @generated
 */
public class AddressServiceWrapper implements AddressService,
    ServiceWrapper<AddressService> {
    private AddressService _addressService;

    public AddressServiceWrapper(AddressService addressService) {
        _addressService = addressService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _addressService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _addressService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _addressService.invokeMethod(name, parameterTypes, arguments);
    }

    @Override
    public net.opentrends.user.model.Address addAddress(
        net.opentrends.user.model.Address address)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _addressService.addAddress(address);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public AddressService getWrappedAddressService() {
        return _addressService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedAddressService(AddressService addressService) {
        _addressService = addressService;
    }

    @Override
    public AddressService getWrappedService() {
        return _addressService;
    }

    @Override
    public void setWrappedService(AddressService addressService) {
        _addressService = addressService;
    }
}
