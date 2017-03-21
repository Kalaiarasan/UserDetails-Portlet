package net.opentrends.user.model;

import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Person}.
 * </p>
 *
 * @author Ravi
 * @see Person
 * @generated
 */
public class PersonWrapper implements Person, ModelWrapper<Person> {
    private Person _person;

    public PersonWrapper(Person person) {
        _person = person;
    }

    @Override
    public Class<?> getModelClass() {
        return Person.class;
    }

    @Override
    public String getModelClassName() {
        return Person.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("uuid", getUuid());
        attributes.put("personId", getPersonId());
        attributes.put("groupId", getGroupId());
        attributes.put("companyId", getCompanyId());
        attributes.put("userId", getUserId());
        attributes.put("userName", getUserName());
        attributes.put("createDate", getCreateDate());
        attributes.put("modifiedDate", getModifiedDate());
        attributes.put("name", getName());
        attributes.put("sex", getSex());
        attributes.put("age", getAge());
        attributes.put("city", getCity());
        attributes.put("status", getStatus());
        attributes.put("statusByUserId", getStatusByUserId());
        attributes.put("statusByUserName", getStatusByUserName());
        attributes.put("statusDate", getStatusDate());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        String uuid = (String) attributes.get("uuid");

        if (uuid != null) {
            setUuid(uuid);
        }

        Long personId = (Long) attributes.get("personId");

        if (personId != null) {
            setPersonId(personId);
        }

        Long groupId = (Long) attributes.get("groupId");

        if (groupId != null) {
            setGroupId(groupId);
        }

        Long companyId = (Long) attributes.get("companyId");

        if (companyId != null) {
            setCompanyId(companyId);
        }

        Long userId = (Long) attributes.get("userId");

        if (userId != null) {
            setUserId(userId);
        }

        String userName = (String) attributes.get("userName");

        if (userName != null) {
            setUserName(userName);
        }

        Date createDate = (Date) attributes.get("createDate");

        if (createDate != null) {
            setCreateDate(createDate);
        }

        Date modifiedDate = (Date) attributes.get("modifiedDate");

        if (modifiedDate != null) {
            setModifiedDate(modifiedDate);
        }

        String name = (String) attributes.get("name");

        if (name != null) {
            setName(name);
        }

        String sex = (String) attributes.get("sex");

        if (sex != null) {
            setSex(sex);
        }

        Integer age = (Integer) attributes.get("age");

        if (age != null) {
            setAge(age);
        }

        String city = (String) attributes.get("city");

        if (city != null) {
            setCity(city);
        }

        Integer status = (Integer) attributes.get("status");

        if (status != null) {
            setStatus(status);
        }

        Long statusByUserId = (Long) attributes.get("statusByUserId");

        if (statusByUserId != null) {
            setStatusByUserId(statusByUserId);
        }

        String statusByUserName = (String) attributes.get("statusByUserName");

        if (statusByUserName != null) {
            setStatusByUserName(statusByUserName);
        }

        Date statusDate = (Date) attributes.get("statusDate");

        if (statusDate != null) {
            setStatusDate(statusDate);
        }
    }

    /**
    * Returns the primary key of this person.
    *
    * @return the primary key of this person
    */
    @Override
    public long getPrimaryKey() {
        return _person.getPrimaryKey();
    }

    /**
    * Sets the primary key of this person.
    *
    * @param primaryKey the primary key of this person
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _person.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the uuid of this person.
    *
    * @return the uuid of this person
    */
    @Override
    public java.lang.String getUuid() {
        return _person.getUuid();
    }

    /**
    * Sets the uuid of this person.
    *
    * @param uuid the uuid of this person
    */
    @Override
    public void setUuid(java.lang.String uuid) {
        _person.setUuid(uuid);
    }

    /**
    * Returns the person ID of this person.
    *
    * @return the person ID of this person
    */
    @Override
    public long getPersonId() {
        return _person.getPersonId();
    }

    /**
    * Sets the person ID of this person.
    *
    * @param personId the person ID of this person
    */
    @Override
    public void setPersonId(long personId) {
        _person.setPersonId(personId);
    }

    /**
    * Returns the group ID of this person.
    *
    * @return the group ID of this person
    */
    @Override
    public long getGroupId() {
        return _person.getGroupId();
    }

    /**
    * Sets the group ID of this person.
    *
    * @param groupId the group ID of this person
    */
    @Override
    public void setGroupId(long groupId) {
        _person.setGroupId(groupId);
    }

    /**
    * Returns the company ID of this person.
    *
    * @return the company ID of this person
    */
    @Override
    public long getCompanyId() {
        return _person.getCompanyId();
    }

    /**
    * Sets the company ID of this person.
    *
    * @param companyId the company ID of this person
    */
    @Override
    public void setCompanyId(long companyId) {
        _person.setCompanyId(companyId);
    }

    /**
    * Returns the user ID of this person.
    *
    * @return the user ID of this person
    */
    @Override
    public long getUserId() {
        return _person.getUserId();
    }

    /**
    * Sets the user ID of this person.
    *
    * @param userId the user ID of this person
    */
    @Override
    public void setUserId(long userId) {
        _person.setUserId(userId);
    }

    /**
    * Returns the user uuid of this person.
    *
    * @return the user uuid of this person
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.lang.String getUserUuid()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _person.getUserUuid();
    }

    /**
    * Sets the user uuid of this person.
    *
    * @param userUuid the user uuid of this person
    */
    @Override
    public void setUserUuid(java.lang.String userUuid) {
        _person.setUserUuid(userUuid);
    }

    /**
    * Returns the user name of this person.
    *
    * @return the user name of this person
    */
    @Override
    public java.lang.String getUserName() {
        return _person.getUserName();
    }

    /**
    * Sets the user name of this person.
    *
    * @param userName the user name of this person
    */
    @Override
    public void setUserName(java.lang.String userName) {
        _person.setUserName(userName);
    }

    /**
    * Returns the create date of this person.
    *
    * @return the create date of this person
    */
    @Override
    public java.util.Date getCreateDate() {
        return _person.getCreateDate();
    }

    /**
    * Sets the create date of this person.
    *
    * @param createDate the create date of this person
    */
    @Override
    public void setCreateDate(java.util.Date createDate) {
        _person.setCreateDate(createDate);
    }

    /**
    * Returns the modified date of this person.
    *
    * @return the modified date of this person
    */
    @Override
    public java.util.Date getModifiedDate() {
        return _person.getModifiedDate();
    }

    /**
    * Sets the modified date of this person.
    *
    * @param modifiedDate the modified date of this person
    */
    @Override
    public void setModifiedDate(java.util.Date modifiedDate) {
        _person.setModifiedDate(modifiedDate);
    }

    /**
    * Returns the name of this person.
    *
    * @return the name of this person
    */
    @Override
    public java.lang.String getName() {
        return _person.getName();
    }

    /**
    * Sets the name of this person.
    *
    * @param name the name of this person
    */
    @Override
    public void setName(java.lang.String name) {
        _person.setName(name);
    }

    /**
    * Returns the sex of this person.
    *
    * @return the sex of this person
    */
    @Override
    public java.lang.String getSex() {
        return _person.getSex();
    }

    /**
    * Sets the sex of this person.
    *
    * @param sex the sex of this person
    */
    @Override
    public void setSex(java.lang.String sex) {
        _person.setSex(sex);
    }

    /**
    * Returns the age of this person.
    *
    * @return the age of this person
    */
    @Override
    public int getAge() {
        return _person.getAge();
    }

    /**
    * Sets the age of this person.
    *
    * @param age the age of this person
    */
    @Override
    public void setAge(int age) {
        _person.setAge(age);
    }

    /**
    * Returns the city of this person.
    *
    * @return the city of this person
    */
    @Override
    public java.lang.String getCity() {
        return _person.getCity();
    }

    /**
    * Sets the city of this person.
    *
    * @param city the city of this person
    */
    @Override
    public void setCity(java.lang.String city) {
        _person.setCity(city);
    }

    /**
    * Returns the status of this person.
    *
    * @return the status of this person
    */
    @Override
    public int getStatus() {
        return _person.getStatus();
    }

    /**
    * Sets the status of this person.
    *
    * @param status the status of this person
    */
    @Override
    public void setStatus(int status) {
        _person.setStatus(status);
    }

    /**
    * Returns the status by user ID of this person.
    *
    * @return the status by user ID of this person
    */
    @Override
    public long getStatusByUserId() {
        return _person.getStatusByUserId();
    }

    /**
    * Sets the status by user ID of this person.
    *
    * @param statusByUserId the status by user ID of this person
    */
    @Override
    public void setStatusByUserId(long statusByUserId) {
        _person.setStatusByUserId(statusByUserId);
    }

    /**
    * Returns the status by user uuid of this person.
    *
    * @return the status by user uuid of this person
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.lang.String getStatusByUserUuid()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _person.getStatusByUserUuid();
    }

    /**
    * Sets the status by user uuid of this person.
    *
    * @param statusByUserUuid the status by user uuid of this person
    */
    @Override
    public void setStatusByUserUuid(java.lang.String statusByUserUuid) {
        _person.setStatusByUserUuid(statusByUserUuid);
    }

    /**
    * Returns the status by user name of this person.
    *
    * @return the status by user name of this person
    */
    @Override
    public java.lang.String getStatusByUserName() {
        return _person.getStatusByUserName();
    }

    /**
    * Sets the status by user name of this person.
    *
    * @param statusByUserName the status by user name of this person
    */
    @Override
    public void setStatusByUserName(java.lang.String statusByUserName) {
        _person.setStatusByUserName(statusByUserName);
    }

    /**
    * Returns the status date of this person.
    *
    * @return the status date of this person
    */
    @Override
    public java.util.Date getStatusDate() {
        return _person.getStatusDate();
    }

    /**
    * Sets the status date of this person.
    *
    * @param statusDate the status date of this person
    */
    @Override
    public void setStatusDate(java.util.Date statusDate) {
        _person.setStatusDate(statusDate);
    }

    /**
    * @deprecated As of 6.1.0, replaced by {@link #isApproved()}
    */
    @Override
    public boolean getApproved() {
        return _person.getApproved();
    }

    /**
    * Returns <code>true</code> if this person is approved.
    *
    * @return <code>true</code> if this person is approved; <code>false</code> otherwise
    */
    @Override
    public boolean isApproved() {
        return _person.isApproved();
    }

    /**
    * Returns <code>true</code> if this person is denied.
    *
    * @return <code>true</code> if this person is denied; <code>false</code> otherwise
    */
    @Override
    public boolean isDenied() {
        return _person.isDenied();
    }

    /**
    * Returns <code>true</code> if this person is a draft.
    *
    * @return <code>true</code> if this person is a draft; <code>false</code> otherwise
    */
    @Override
    public boolean isDraft() {
        return _person.isDraft();
    }

    /**
    * Returns <code>true</code> if this person is expired.
    *
    * @return <code>true</code> if this person is expired; <code>false</code> otherwise
    */
    @Override
    public boolean isExpired() {
        return _person.isExpired();
    }

    /**
    * Returns <code>true</code> if this person is inactive.
    *
    * @return <code>true</code> if this person is inactive; <code>false</code> otherwise
    */
    @Override
    public boolean isInactive() {
        return _person.isInactive();
    }

    /**
    * Returns <code>true</code> if this person is incomplete.
    *
    * @return <code>true</code> if this person is incomplete; <code>false</code> otherwise
    */
    @Override
    public boolean isIncomplete() {
        return _person.isIncomplete();
    }

    /**
    * Returns <code>true</code> if this person is pending.
    *
    * @return <code>true</code> if this person is pending; <code>false</code> otherwise
    */
    @Override
    public boolean isPending() {
        return _person.isPending();
    }

    /**
    * Returns <code>true</code> if this person is scheduled.
    *
    * @return <code>true</code> if this person is scheduled; <code>false</code> otherwise
    */
    @Override
    public boolean isScheduled() {
        return _person.isScheduled();
    }

    @Override
    public boolean isNew() {
        return _person.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _person.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _person.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _person.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _person.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _person.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _person.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _person.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _person.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _person.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _person.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new PersonWrapper((Person) _person.clone());
    }

    @Override
    public int compareTo(Person person) {
        return _person.compareTo(person);
    }

    @Override
    public int hashCode() {
        return _person.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<Person> toCacheModel() {
        return _person.toCacheModel();
    }

    @Override
    public Person toEscapedModel() {
        return new PersonWrapper(_person.toEscapedModel());
    }

    @Override
    public Person toUnescapedModel() {
        return new PersonWrapper(_person.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _person.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _person.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _person.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof PersonWrapper)) {
            return false;
        }

        PersonWrapper personWrapper = (PersonWrapper) obj;

        if (Validator.equals(_person, personWrapper._person)) {
            return true;
        }

        return false;
    }

    @Override
    public StagedModelType getStagedModelType() {
        return _person.getStagedModelType();
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Person getWrappedPerson() {
        return _person;
    }

    @Override
    public Person getWrappedModel() {
        return _person;
    }

    @Override
    public void resetOriginalValues() {
        _person.resetOriginalValues();
    }
}
