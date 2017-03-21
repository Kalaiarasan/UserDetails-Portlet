package net.opentrends.user.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link net.opentrends.user.service.http.PersonServiceSoap}.
 *
 * @author Ravi
 * @see net.opentrends.user.service.http.PersonServiceSoap
 * @generated
 */
public class PersonSoap implements Serializable {
    private String _uuid;
    private long _personId;
    private long _groupId;
    private long _companyId;
    private long _userId;
    private String _userName;
    private Date _createDate;
    private Date _modifiedDate;
    private String _name;
    private String _sex;
    private int _age;
    private String _city;
    private int _status;
    private long _statusByUserId;
    private String _statusByUserName;
    private Date _statusDate;

    public PersonSoap() {
    }

    public static PersonSoap toSoapModel(Person model) {
        PersonSoap soapModel = new PersonSoap();

        soapModel.setUuid(model.getUuid());
        soapModel.setPersonId(model.getPersonId());
        soapModel.setGroupId(model.getGroupId());
        soapModel.setCompanyId(model.getCompanyId());
        soapModel.setUserId(model.getUserId());
        soapModel.setUserName(model.getUserName());
        soapModel.setCreateDate(model.getCreateDate());
        soapModel.setModifiedDate(model.getModifiedDate());
        soapModel.setName(model.getName());
        soapModel.setSex(model.getSex());
        soapModel.setAge(model.getAge());
        soapModel.setCity(model.getCity());
        soapModel.setStatus(model.getStatus());
        soapModel.setStatusByUserId(model.getStatusByUserId());
        soapModel.setStatusByUserName(model.getStatusByUserName());
        soapModel.setStatusDate(model.getStatusDate());

        return soapModel;
    }

    public static PersonSoap[] toSoapModels(Person[] models) {
        PersonSoap[] soapModels = new PersonSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static PersonSoap[][] toSoapModels(Person[][] models) {
        PersonSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new PersonSoap[models.length][models[0].length];
        } else {
            soapModels = new PersonSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static PersonSoap[] toSoapModels(List<Person> models) {
        List<PersonSoap> soapModels = new ArrayList<PersonSoap>(models.size());

        for (Person model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new PersonSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _personId;
    }

    public void setPrimaryKey(long pk) {
        setPersonId(pk);
    }

    public String getUuid() {
        return _uuid;
    }

    public void setUuid(String uuid) {
        _uuid = uuid;
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

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        _name = name;
    }

    public String getSex() {
        return _sex;
    }

    public void setSex(String sex) {
        _sex = sex;
    }

    public int getAge() {
        return _age;
    }

    public void setAge(int age) {
        _age = age;
    }

    public String getCity() {
        return _city;
    }

    public void setCity(String city) {
        _city = city;
    }

    public int getStatus() {
        return _status;
    }

    public void setStatus(int status) {
        _status = status;
    }

    public long getStatusByUserId() {
        return _statusByUserId;
    }

    public void setStatusByUserId(long statusByUserId) {
        _statusByUserId = statusByUserId;
    }

    public String getStatusByUserName() {
        return _statusByUserName;
    }

    public void setStatusByUserName(String statusByUserName) {
        _statusByUserName = statusByUserName;
    }

    public Date getStatusDate() {
        return _statusDate;
    }

    public void setStatusDate(Date statusDate) {
        _statusDate = statusDate;
    }
}
