package net.opentrends.user.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Address}.
 * </p>
 *
 * @author Ravi
 * @see Address
 * @generated
 */
public class AddressWrapper implements Address, ModelWrapper<Address> {
    private Address _address;

    public AddressWrapper(Address address) {
        _address = address;
    }

    @Override
    public Class<?> getModelClass() {
        return Address.class;
    }

    @Override
    public String getModelClassName() {
        return Address.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("addressId", getAddressId());
        attributes.put("personId", getPersonId());
        attributes.put("groupId", getGroupId());
        attributes.put("companyId", getCompanyId());
        attributes.put("userId", getUserId());
        attributes.put("userName", getUserName());
        attributes.put("createDate", getCreateDate());
        attributes.put("modifiedDate", getModifiedDate());
        attributes.put("street1", getStreet1());
        attributes.put("street2", getStreet2());
        attributes.put("city", getCity());
        attributes.put("country", getCountry());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long addressId = (Long) attributes.get("addressId");

        if (addressId != null) {
            setAddressId(addressId);
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

        String street1 = (String) attributes.get("street1");

        if (street1 != null) {
            setStreet1(street1);
        }

        String street2 = (String) attributes.get("street2");

        if (street2 != null) {
            setStreet2(street2);
        }

        String city = (String) attributes.get("city");

        if (city != null) {
            setCity(city);
        }

        String country = (String) attributes.get("country");

        if (country != null) {
            setCountry(country);
        }
    }

    /**
    * Returns the primary key of this address.
    *
    * @return the primary key of this address
    */
    @Override
    public long getPrimaryKey() {
        return _address.getPrimaryKey();
    }

    /**
    * Sets the primary key of this address.
    *
    * @param primaryKey the primary key of this address
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _address.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the address ID of this address.
    *
    * @return the address ID of this address
    */
    @Override
    public long getAddressId() {
        return _address.getAddressId();
    }

    /**
    * Sets the address ID of this address.
    *
    * @param addressId the address ID of this address
    */
    @Override
    public void setAddressId(long addressId) {
        _address.setAddressId(addressId);
    }

    /**
    * Returns the person ID of this address.
    *
    * @return the person ID of this address
    */
    @Override
    public long getPersonId() {
        return _address.getPersonId();
    }

    /**
    * Sets the person ID of this address.
    *
    * @param personId the person ID of this address
    */
    @Override
    public void setPersonId(long personId) {
        _address.setPersonId(personId);
    }

    /**
    * Returns the group ID of this address.
    *
    * @return the group ID of this address
    */
    @Override
    public long getGroupId() {
        return _address.getGroupId();
    }

    /**
    * Sets the group ID of this address.
    *
    * @param groupId the group ID of this address
    */
    @Override
    public void setGroupId(long groupId) {
        _address.setGroupId(groupId);
    }

    /**
    * Returns the company ID of this address.
    *
    * @return the company ID of this address
    */
    @Override
    public long getCompanyId() {
        return _address.getCompanyId();
    }

    /**
    * Sets the company ID of this address.
    *
    * @param companyId the company ID of this address
    */
    @Override
    public void setCompanyId(long companyId) {
        _address.setCompanyId(companyId);
    }

    /**
    * Returns the user ID of this address.
    *
    * @return the user ID of this address
    */
    @Override
    public long getUserId() {
        return _address.getUserId();
    }

    /**
    * Sets the user ID of this address.
    *
    * @param userId the user ID of this address
    */
    @Override
    public void setUserId(long userId) {
        _address.setUserId(userId);
    }

    /**
    * Returns the user uuid of this address.
    *
    * @return the user uuid of this address
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.lang.String getUserUuid()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _address.getUserUuid();
    }

    /**
    * Sets the user uuid of this address.
    *
    * @param userUuid the user uuid of this address
    */
    @Override
    public void setUserUuid(java.lang.String userUuid) {
        _address.setUserUuid(userUuid);
    }

    /**
    * Returns the user name of this address.
    *
    * @return the user name of this address
    */
    @Override
    public java.lang.String getUserName() {
        return _address.getUserName();
    }

    /**
    * Sets the user name of this address.
    *
    * @param userName the user name of this address
    */
    @Override
    public void setUserName(java.lang.String userName) {
        _address.setUserName(userName);
    }

    /**
    * Returns the create date of this address.
    *
    * @return the create date of this address
    */
    @Override
    public java.util.Date getCreateDate() {
        return _address.getCreateDate();
    }

    /**
    * Sets the create date of this address.
    *
    * @param createDate the create date of this address
    */
    @Override
    public void setCreateDate(java.util.Date createDate) {
        _address.setCreateDate(createDate);
    }

    /**
    * Returns the modified date of this address.
    *
    * @return the modified date of this address
    */
    @Override
    public java.util.Date getModifiedDate() {
        return _address.getModifiedDate();
    }

    /**
    * Sets the modified date of this address.
    *
    * @param modifiedDate the modified date of this address
    */
    @Override
    public void setModifiedDate(java.util.Date modifiedDate) {
        _address.setModifiedDate(modifiedDate);
    }

    /**
    * Returns the street1 of this address.
    *
    * @return the street1 of this address
    */
    @Override
    public java.lang.String getStreet1() {
        return _address.getStreet1();
    }

    /**
    * Sets the street1 of this address.
    *
    * @param street1 the street1 of this address
    */
    @Override
    public void setStreet1(java.lang.String street1) {
        _address.setStreet1(street1);
    }

    /**
    * Returns the street2 of this address.
    *
    * @return the street2 of this address
    */
    @Override
    public java.lang.String getStreet2() {
        return _address.getStreet2();
    }

    /**
    * Sets the street2 of this address.
    *
    * @param street2 the street2 of this address
    */
    @Override
    public void setStreet2(java.lang.String street2) {
        _address.setStreet2(street2);
    }

    /**
    * Returns the city of this address.
    *
    * @return the city of this address
    */
    @Override
    public java.lang.String getCity() {
        return _address.getCity();
    }

    /**
    * Sets the city of this address.
    *
    * @param city the city of this address
    */
    @Override
    public void setCity(java.lang.String city) {
        _address.setCity(city);
    }

    /**
    * Returns the country of this address.
    *
    * @return the country of this address
    */
    @Override
    public java.lang.String getCountry() {
        return _address.getCountry();
    }

    /**
    * Sets the country of this address.
    *
    * @param country the country of this address
    */
    @Override
    public void setCountry(java.lang.String country) {
        _address.setCountry(country);
    }

    @Override
    public boolean isNew() {
        return _address.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _address.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _address.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _address.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _address.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _address.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _address.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _address.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _address.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _address.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _address.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new AddressWrapper((Address) _address.clone());
    }

    @Override
    public int compareTo(Address address) {
        return _address.compareTo(address);
    }

    @Override
    public int hashCode() {
        return _address.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<Address> toCacheModel() {
        return _address.toCacheModel();
    }

    @Override
    public Address toEscapedModel() {
        return new AddressWrapper(_address.toEscapedModel());
    }

    @Override
    public Address toUnescapedModel() {
        return new AddressWrapper(_address.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _address.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _address.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _address.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof AddressWrapper)) {
            return false;
        }

        AddressWrapper addressWrapper = (AddressWrapper) obj;

        if (Validator.equals(_address, addressWrapper._address)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Address getWrappedAddress() {
        return _address;
    }

    @Override
    public Address getWrappedModel() {
        return _address;
    }

    @Override
    public void resetOriginalValues() {
        _address.resetOriginalValues();
    }
}
