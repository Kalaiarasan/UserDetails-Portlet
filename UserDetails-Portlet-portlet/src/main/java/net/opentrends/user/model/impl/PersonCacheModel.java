package net.opentrends.user.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import net.opentrends.user.model.Person;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Person in entity cache.
 *
 * @author Ravi
 * @see Person
 * @generated
 */
public class PersonCacheModel implements CacheModel<Person>, Externalizable {
    public String uuid;
    public long personId;
    public long groupId;
    public long companyId;
    public long userId;
    public String userName;
    public long createDate;
    public long modifiedDate;
    public String name;
    public String sex;
    public int age;
    public String city;
    public int status;
    public long statusByUserId;
    public String statusByUserName;
    public long statusDate;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(33);

        sb.append("{uuid=");
        sb.append(uuid);
        sb.append(", personId=");
        sb.append(personId);
        sb.append(", groupId=");
        sb.append(groupId);
        sb.append(", companyId=");
        sb.append(companyId);
        sb.append(", userId=");
        sb.append(userId);
        sb.append(", userName=");
        sb.append(userName);
        sb.append(", createDate=");
        sb.append(createDate);
        sb.append(", modifiedDate=");
        sb.append(modifiedDate);
        sb.append(", name=");
        sb.append(name);
        sb.append(", sex=");
        sb.append(sex);
        sb.append(", age=");
        sb.append(age);
        sb.append(", city=");
        sb.append(city);
        sb.append(", status=");
        sb.append(status);
        sb.append(", statusByUserId=");
        sb.append(statusByUserId);
        sb.append(", statusByUserName=");
        sb.append(statusByUserName);
        sb.append(", statusDate=");
        sb.append(statusDate);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Person toEntityModel() {
        PersonImpl personImpl = new PersonImpl();

        if (uuid == null) {
            personImpl.setUuid(StringPool.BLANK);
        } else {
            personImpl.setUuid(uuid);
        }

        personImpl.setPersonId(personId);
        personImpl.setGroupId(groupId);
        personImpl.setCompanyId(companyId);
        personImpl.setUserId(userId);

        if (userName == null) {
            personImpl.setUserName(StringPool.BLANK);
        } else {
            personImpl.setUserName(userName);
        }

        if (createDate == Long.MIN_VALUE) {
            personImpl.setCreateDate(null);
        } else {
            personImpl.setCreateDate(new Date(createDate));
        }

        if (modifiedDate == Long.MIN_VALUE) {
            personImpl.setModifiedDate(null);
        } else {
            personImpl.setModifiedDate(new Date(modifiedDate));
        }

        if (name == null) {
            personImpl.setName(StringPool.BLANK);
        } else {
            personImpl.setName(name);
        }

        if (sex == null) {
            personImpl.setSex(StringPool.BLANK);
        } else {
            personImpl.setSex(sex);
        }

        personImpl.setAge(age);

        if (city == null) {
            personImpl.setCity(StringPool.BLANK);
        } else {
            personImpl.setCity(city);
        }

        personImpl.setStatus(status);
        personImpl.setStatusByUserId(statusByUserId);

        if (statusByUserName == null) {
            personImpl.setStatusByUserName(StringPool.BLANK);
        } else {
            personImpl.setStatusByUserName(statusByUserName);
        }

        if (statusDate == Long.MIN_VALUE) {
            personImpl.setStatusDate(null);
        } else {
            personImpl.setStatusDate(new Date(statusDate));
        }

        personImpl.resetOriginalValues();

        return personImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        uuid = objectInput.readUTF();
        personId = objectInput.readLong();
        groupId = objectInput.readLong();
        companyId = objectInput.readLong();
        userId = objectInput.readLong();
        userName = objectInput.readUTF();
        createDate = objectInput.readLong();
        modifiedDate = objectInput.readLong();
        name = objectInput.readUTF();
        sex = objectInput.readUTF();
        age = objectInput.readInt();
        city = objectInput.readUTF();
        status = objectInput.readInt();
        statusByUserId = objectInput.readLong();
        statusByUserName = objectInput.readUTF();
        statusDate = objectInput.readLong();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        if (uuid == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(uuid);
        }

        objectOutput.writeLong(personId);
        objectOutput.writeLong(groupId);
        objectOutput.writeLong(companyId);
        objectOutput.writeLong(userId);

        if (userName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(userName);
        }

        objectOutput.writeLong(createDate);
        objectOutput.writeLong(modifiedDate);

        if (name == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(name);
        }

        if (sex == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(sex);
        }

        objectOutput.writeInt(age);

        if (city == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(city);
        }

        objectOutput.writeInt(status);
        objectOutput.writeLong(statusByUserId);

        if (statusByUserName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(statusByUserName);
        }

        objectOutput.writeLong(statusDate);
    }
}
