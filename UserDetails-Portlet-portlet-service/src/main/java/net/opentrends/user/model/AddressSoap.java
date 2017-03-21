package net.opentrends.user.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link net.opentrends.user.service.http.AddressServiceSoap}.
 *
 * @author Ravi
 * @see net.opentrends.user.service.http.AddressServiceSoap
 * @generated
 */
public class AddressSoap implements Serializable {
    private long _addressId;
    private long _personId;
    private long _groupId;
    private long _companyId;
    private long _userId;
    private String _userName;
    private Date _createDate;
    private Date _modifiedDate;
    private String _street1;
    private String _street2;
    private String _city;
    private String _country;

    public AddressSoap() {
    }

    public static AddressSoap toSoapModel(Address model) {
        AddressSoap soapModel = new AddressSoap();

        soapModel.setAddressId(model.getAddressId());
        soapModel.setPersonId(model.getPersonId());
        soapModel.setGroupId(model.getGroupId());
        soapModel.setCompanyId(model.getCompanyId());
        soapModel.setUserId(model.getUserId());
        soapModel.setUserName(model.getUserName());
        soapModel.setCreateDate(model.getCreateDate());
        soapModel.setModifiedDate(model.getModifiedDate());
        soapModel.setStreet1(model.getStreet1());
        soapModel.setStreet2(model.getStreet2());
        soapModel.setCity(model.getCity());
        soapModel.setCountry(model.getCountry());

        return soapModel;
    }

    public static AddressSoap[] toSoapModels(Address[] models) {
        AddressSoap[] soapModels = new AddressSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static AddressSoap[][] toSoapModels(Address[][] models) {
        AddressSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new AddressSoap[models.length][models[0].length];
        } else {
            soapModels = new AddressSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static AddressSoap[] toSoapModels(List<Address> models) {
        List<AddressSoap> soapModels = new ArrayList<AddressSoap>(models.size());

        for (Address model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new AddressSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _addressId;
    }

    public void setPrimaryKey(long pk) {
        setAddressId(pk);
    }

    public long getAddressId() {
        return _addressId;
    }

    public void setAddressId(long addressId) {
        _addressId = addressId;
    }

    public long getPersonId() {
        return _personId;
    }

    public void setPersonId(long personId) {
        _personId = personId;
    }

    public long getGroupId() {
        return _groupId;
    }

    public void setGroupId(long groupId) {
        _groupId = groupId;
    }

    public long getCompanyId() {
        return _companyId;
    }

    public void setCompanyId(long companyId) {
        _companyId = companyId;
    }

    public long getUserId() {
        return _userId;
    }

    public void setUserId(long userId) {
        _userId = userId;
    }

    public String getUserName() {
        return _userName;
    }

    public void setUserName(String userName) {
        _userName = userName;
    }

    public Date getCreateDate() {
        return _createDate;
    }

    public void setCreateDate(Date createDate) {
        _createDate = createDate;
    }

    public Date getModifiedDate() {
        return _modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        _modifiedDate = modifiedDate;
    }

    public String getStreet1() {
        return _street1;
    }

    public void setStreet1(String street1) {
        _street1 = street1;
    }

    public String getStreet2() {
        return _street2;
    }

    public void setStreet2(String street2) {
        _street2 = street2;
    }

    public String getCity() {
        return _city;
    }

    public void setCity(String city) {
        _city = city;
    }

    public String getCountry() {
        return _country;
    }

    public void setCountry(String country) {
        _country = country;
    }
}
