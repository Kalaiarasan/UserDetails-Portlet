package net.opentrends.user.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import net.opentrends.user.model.Address;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Address in entity cache.
 *
 * @author Ravi
 * @see Address
 * @generated
 */
public class AddressCacheModel implements CacheModel<Address>, Externalizable {
    public long addressId;
    public long personId;
    public long groupId;
    public long companyId;
    public long userId;
    public String userName;
    public long createDate;
    public long modifiedDate;
    public String street1;
    public String street2;
    public String city;
    public String country;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(25);

        sb.append("{addressId=");
        sb.append(addressId);
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
        sb.append(", street1=");
        sb.append(street1);
        sb.append(", street2=");
        sb.append(street2);
        sb.append(", city=");
        sb.append(city);
        sb.append(", country=");
        sb.append(country);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Address toEntityModel() {
        AddressImpl addressImpl = new AddressImpl();

        addressImpl.setAddressId(addressId);
        addressImpl.setPersonId(personId);
        addressImpl.setGroupId(groupId);
        addressImpl.setCompanyId(companyId);
        addressImpl.setUserId(userId);

        if (userName == null) {
            addressImpl.setUserName(StringPool.BLANK);
        } else {
            addressImpl.setUserName(userName);
        }

        if (createDate == Long.MIN_VALUE) {
            addressImpl.setCreateDate(null);
        } else {
            addressImpl.setCreateDate(new Date(createDate));
        }

        if (modifiedDate == Long.MIN_VALUE) {
            addressImpl.setModifiedDate(null);
        } else {
            addressImpl.setModifiedDate(new Date(modifiedDate));
        }

        if (street1 == null) {
            addressImpl.setStreet1(StringPool.BLANK);
        } else {
            addressImpl.setStreet1(street1);
        }

        if (street2 == null) {
            addressImpl.setStreet2(StringPool.BLANK);
        } else {
            addressImpl.setStreet2(street2);
        }

        if (city == null) {
            addressImpl.setCity(StringPool.BLANK);
        } else {
            addressImpl.setCity(city);
        }

        if (country == null) {
            addressImpl.setCountry(StringPool.BLANK);
        } else {
            addressImpl.setCountry(country);
        }

        addressImpl.resetOriginalValues();

        return addressImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        addressId = objectInput.readLong();
        personId = objectInput.readLong();
        groupId = objectInput.readLong();
        companyId = objectInput.readLong();
        userId = objectInput.readLong();
        userName = objectInput.readUTF();
        createDate = objectInput.readLong();
        modifiedDate = objectInput.readLong();
        street1 = objectInput.readUTF();
        street2 = objectInput.readUTF();
        city = objectInput.readUTF();
        country = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(addressId);
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

        if (street1 == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(street1);
        }

        if (street2 == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(street2);
        }

        if (city == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(city);
        }

        if (country == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(country);
        }
    }
}
