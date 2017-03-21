package net.opentrends.user.service.impl;

import java.util.Date;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.liferay.portal.model.User;
import com.liferay.portal.service.ServiceContext;

import net.opentrends.user.model.Person;
import net.opentrends.user.service.base.PersonLocalServiceBaseImpl;

/**
 * The implementation of the person local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link net.opentrends.user.service.PersonLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author Ravi
 * @see net.opentrends.user.service.base.PersonLocalServiceBaseImpl
 * @see net.opentrends.user.service.PersonLocalServiceUtil
 */
public class PersonLocalServiceImpl extends PersonLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link
	 * net.opentrends.user.service.PersonLocalServiceUtil} to access the person
	 * local service.
	 */
	public Person addPerson(String name, String sex, int age, String city, ServiceContext serviceContext)
			throws SystemException, PortalException {
		long groupId = serviceContext.getScopeGroupId();
		User user = userPersistence.findByPrimaryKey(serviceContext.getUserId());
		Date now = new Date();
		long personId = counterLocalService.increment();
		Person person = personPersistence.create(personId);
		person.setUserId(serviceContext.getUserId());
		person.setGroupId(groupId);
		person.setCompanyId(user.getCompanyId());
		person.setUserName(user.getFullName());
		person.setCreateDate(serviceContext.getCreateDate(now));
		person.setModifiedDate(serviceContext.getModifiedDate(now));
		person.setName(name);
		person.setAge(age);
		person.setSex(sex);
		person.setCity(city);
		personPersistence.update(person);
		return person;

	}

	public Person updateStatus(long userId, long personId, int status, ServiceContext serviceContext)
			throws PortalException, SystemException {

		User user = userLocalService.getUser(userId);
		Person person = getPerson(personId);

		person.setStatus(status);
		person.setStatusByUserId(userId);
		person.setStatusByUserName(user.getFullName());
		person.setStatusDate(new Date());
		personPersistence.update(person);

		if (status == WorkflowConstants.STATUS_APPROVED) {

			assetEntryLocalService.updateVisible(Person.class.getName(), personId, true);

		} else {

			assetEntryLocalService.updateVisible(Person.class.getName(), personId, false);
		}

		return person;
	}

}
