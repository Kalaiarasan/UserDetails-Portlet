package net.opentrends.user.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import net.opentrends.user.service.AddressLocalServiceUtil;
import net.opentrends.user.service.ClpSerializer;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class AddressClp extends BaseModelImpl<Address> implements Address {
    private long _addressId;
    private long _personId;
    private long _groupId;
    private long _companyId;
    private long _userId;
    private String _userUuid;
    private String _userName;
    private Date _createDate;
    private Date _modifiedDate;
    private String _street1;
    private String _street2;
    private String _city;
    private String _country;
    private BaseModel<?> _addressRemoteModel;

    public AddressClp() {
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
    public long getPrimaryKey() {
        return _addressId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setAddressId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _addressId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
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

    @Override
    public long getAddressId() {
        return _addressId;
    }

    @Override
    public void setAddressId(long addressId) {
        _addressId = addressId;

        if (_addressRemoteModel != null) {
            try {
                Class<?> clazz = _addressRemoteModel.getClass();

                Method method = clazz.getMethod("setAddressId", long.class);

                method.invoke(_addressRemoteModel, addressId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getPersonId() {
        return _personId;
    }

    @Override
    public void setPersonId(long personId) {
        _personId = personId;

        if (_addressRemoteModel != null) {
            try {
                Class<?> clazz = _addressRemoteModel.getClass();

                Method method = clazz.getMethod("setPersonId", long.class);

                method.invoke(_addressRemoteModel, personId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getGroupId() {
        return _groupId;
    }

    @Override
    public void setGroupId(long groupId) {
        _groupId = groupId;

        if (_addressRemoteModel != null) {
            try {
                Class<?> clazz = _addressRemoteModel.getClass();

                Method method = clazz.getMethod("setGroupId", long.class);

                method.invoke(_addressRemoteModel, groupId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getCompanyId() {
        return _companyId;
    }

    @Override
    public void setCompanyId(long companyId) {
        _companyId = companyId;

        if (_addressRemoteModel != null) {
            try {
                Class<?> clazz = _addressRemoteModel.getClass();

                Method method = clazz.getMethod("setCompanyId", long.class);

                method.invoke(_addressRemoteModel, companyId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getUserId() {
        return _userId;
    }

    @Override
    public void setUserId(long userId) {
        _userId = userId;

        if (_addressRemoteModel != null) {
            try {
                Class<?> clazz = _addressRemoteModel.getClass();

                Method method = clazz.getMethod("setUserId", long.class);

                method.invoke(_addressRemoteModel, userId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getUserUuid() throws SystemException {
        return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
    }

    @Override
    public void setUserUuid(String userUuid) {
        _userUuid = userUuid;
    }

    @Override
    public String getUserName() {
        return _userName;
    }

    @Override
    public void setUserName(String userName) {
        _userName = userName;

        if (_addressRemoteModel != null) {
            try {
                Class<?> clazz = _addressRemoteModel.getClass();

                Method method = clazz.getMethod("setUserName", String.class);

                method.invoke(_addressRemoteModel, userName);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getCreateDate() {
        return _createDate;
    }

    @Override
    public void setCreateDate(Date createDate) {
        _createDate = createDate;

        if (_addressRemoteModel != null) {
            try {
                Class<?> clazz = _addressRemoteModel.getClass();

                Method method = clazz.getMethod("setCreateDate", Date.class);

                method.invoke(_addressRemoteModel, createDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getModifiedDate() {
        return _modifiedDate;
    }

    @Override
    public void setModifiedDate(Date modifiedDate) {
        _modifiedDate = modifiedDate;

        if (_addressRemoteModel != null) {
            try {
                Class<?> clazz = _addressRemoteModel.getClass();

                Method method = clazz.getMethod("setModifiedDate", Date.class);

                method.invoke(_addressRemoteModel, modifiedDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getStreet1() {
        return _street1;
    }

    @Override
    public void setStreet1(String street1) {
        _street1 = street1;

        if (_addressRemoteModel != null) {
            try {
                Class<?> clazz = _addressRemoteModel.getClass();

                Method method = clazz.getMethod("setStreet1", String.class);

                method.invoke(_addressRemoteModel, street1);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getStreet2() {
        return _street2;
    }

    @Override
    public void setStreet2(String street2) {
        _street2 = street2;

        if (_addressRemoteModel != null) {
            try {
                Class<?> clazz = _addressRemoteModel.getClass();

                Method method = clazz.getMethod("setStreet2", String.class);

                method.invoke(_addressRemoteModel, street2);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getCity() {
        return _city;
    }

    @Override
    public void setCity(String city) {
        _city = city;

        if (_addressRemoteModel != null) {
            try {
                Class<?> clazz = _addressRemoteModel.getClass();

                Method method = clazz.getMethod("setCity", String.class);

                method.invoke(_addressRemoteModel, city);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getCountry() {
        return _country;
    }

    @Override
    public void setCountry(String country) {
        _country = country;

        if (_addressRemoteModel != null) {
            try {
                Class<?> clazz = _addressRemoteModel.getClass();

                Method method = clazz.getMethod("setCountry", String.class);

                method.invoke(_addressRemoteModel, country);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getAddressRemoteModel() {
        return _addressRemoteModel;
    }

    public void setAddressRemoteModel(BaseModel<?> addressRemoteModel) {
        _addressRemoteModel = addressRemoteModel;
    }

    public Object invokeOnRemoteModel(String methodName,
        Class<?>[] parameterTypes, Object[] parameterValues)
        throws Exception {
        Object[] remoteParameterValues = new Object[parameterValues.length];

        for (int i = 0; i < parameterValues.length; i++) {
            if (parameterValues[i] != null) {
                remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
            }
        }

        Class<?> remoteModelClass = _addressRemoteModel.getClass();

        ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

        Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

        for (int i = 0; i < parameterTypes.length; i++) {
            if (parameterTypes[i].isPrimitive()) {
                remoteParameterTypes[i] = parameterTypes[i];
            } else {
                String parameterTypeName = parameterTypes[i].getName();

                remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
            }
        }

        Method method = remoteModelClass.getMethod(methodName,
                remoteParameterTypes);

        Object returnValue = method.invoke(_addressRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            AddressLocalServiceUtil.addAddress(this);
        } else {
            AddressLocalServiceUtil.updateAddress(this);
        }
    }

    @Override
    public Address toEscapedModel() {
        return (Address) ProxyUtil.newProxyInstance(Address.class.getClassLoader(),
            new Class[] { Address.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        AddressClp clone = new AddressClp();

        clone.setAddressId(getAddressId());
        clone.setPersonId(getPersonId());
        clone.setGroupId(getGroupId());
        clone.setCompanyId(getCompanyId());
        clone.setUserId(getUserId());
        clone.setUserName(getUserName());
        clone.setCreateDate(getCreateDate());
        clone.setModifiedDate(getModifiedDate());
        clone.setStreet1(getStreet1());
        clone.setStreet2(getStreet2());
        clone.setCity(getCity());
        clone.setCountry(getCountry());

        return clone;
    }

    @Override
    public int compareTo(Address address) {
        long primaryKey = address.getPrimaryKey();

        if (getPrimaryKey() < primaryKey) {
            return -1;
        } else if (getPrimaryKey() > primaryKey) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof AddressClp)) {
            return false;
        }

        AddressClp address = (AddressClp) obj;

        long primaryKey = address.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(25);

        sb.append("{addressId=");
        sb.append(getAddressId());
        sb.append(", personId=");
        sb.append(getPersonId());
        sb.append(", groupId=");
        sb.append(getGroupId());
        sb.append(", companyId=");
        sb.append(getCompanyId());
        sb.append(", userId=");
        sb.append(getUserId());
        sb.append(", userName=");
        sb.append(getUserName());
        sb.append(", createDate=");
        sb.append(getCreateDate());
        sb.append(", modifiedDate=");
        sb.append(getModifiedDate());
        sb.append(", street1=");
        sb.append(getStreet1());
        sb.append(", street2=");
        sb.append(getStreet2());
        sb.append(", city=");
        sb.append(getCity());
        sb.append(", country=");
        sb.append(getCountry());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(40);

        sb.append("<model><model-name>");
        sb.append("net.opentrends.user.model.Address");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>addressId</column-name><column-value><![CDATA[");
        sb.append(getAddressId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>personId</column-name><column-value><![CDATA[");
        sb.append(getPersonId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>groupId</column-name><column-value><![CDATA[");
        sb.append(getGroupId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>companyId</column-name><column-value><![CDATA[");
        sb.append(getCompanyId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>userId</column-name><column-value><![CDATA[");
        sb.append(getUserId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>userName</column-name><column-value><![CDATA[");
        sb.append(getUserName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>createDate</column-name><column-value><![CDATA[");
        sb.append(getCreateDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
        sb.append(getModifiedDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>street1</column-name><column-value><![CDATA[");
        sb.append(getStreet1());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>street2</column-name><column-value><![CDATA[");
        sb.append(getStreet2());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>city</column-name><column-value><![CDATA[");
        sb.append(getCity());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>country</column-name><column-value><![CDATA[");
        sb.append(getCountry());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
