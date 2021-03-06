package net.opentrends.user.service.http;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import net.opentrends.user.service.PersonServiceUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * {@link net.opentrends.user.service.PersonServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link net.opentrends.user.model.PersonSoap}.
 * If the method in the service utility returns a
 * {@link net.opentrends.user.model.Person}, that is translated to a
 * {@link net.opentrends.user.model.PersonSoap}. Methods that SOAP cannot
 * safely wire are skipped.
 * </p>
 *
 * <p>
 * The benefits of using the SOAP utility is that it is cross platform
 * compatible. SOAP allows different languages like Java, .NET, C++, PHP, and
 * even Perl, to call the generated services. One drawback of SOAP is that it is
 * slow because it needs to serialize all calls into a text format (XML).
 * </p>
 *
 * <p>
 * You can see a list of services at http://localhost:8080/api/axis. Set the
 * property <b>axis.servlet.hosts.allowed</b> in portal.properties to configure
 * security.
 * </p>
 *
 * <p>
 * The SOAP utility is only generated for remote services.
 * </p>
 *
 * @author Ravi
 * @see PersonServiceHttp
 * @see net.opentrends.user.model.PersonSoap
 * @see net.opentrends.user.service.PersonServiceUtil
 * @generated
 */
public class PersonServiceSoap {
    private static Log _log = LogFactoryUtil.getLog(PersonServiceSoap.class);

    public static net.opentrends.user.model.PersonSoap addPerson(
        java.lang.String name, java.lang.String sex, int age,
        java.lang.String city,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws RemoteException {
        try {
            net.opentrends.user.model.Person returnValue = PersonServiceUtil.addPerson(name,
                    sex, age, city, serviceContext);

            return net.opentrends.user.model.PersonSoap.toSoapModel(returnValue);
        } catch (Exception e) {
            _log.error(e, e);

            throw new RemoteException(e.getMessage());
        }
    }
}
