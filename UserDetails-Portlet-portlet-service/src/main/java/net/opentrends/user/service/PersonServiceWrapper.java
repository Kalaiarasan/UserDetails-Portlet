package net.opentrends.user.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link PersonService}.
 *
 * @author Ravi
 * @see PersonService
 * @generated
 */
public class PersonServiceWrapper implements PersonService,
    ServiceWrapper<PersonService> {
    private PersonService _personService;

    public PersonServiceWrapper(PersonService personService) {
        _personService = personService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _personService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _personService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _personService.invokeMethod(name, parameterTypes, arguments);
    }

    @Override
    public net.opentrends.user.model.Person addPerson(java.lang.String name,
        java.lang.String sex, int age, java.lang.String city,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _personService.addPerson(name, sex, age, city, serviceContext);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public PersonService getWrappedPersonService() {
        return _personService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedPersonService(PersonService personService) {
        _personService = personService;
    }

    @Override
    public PersonService getWrappedService() {
        return _personService;
    }

    @Override
    public void setWrappedService(PersonService personService) {
        _personService = personService;
    }
}
