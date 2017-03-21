create table portal_Address (
	addressId LONG not null primary key,
	personId LONG,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	street1 VARCHAR(75) null,
	street2 VARCHAR(75) null,
	city VARCHAR(75) null,
	country VARCHAR(75) null
);

create table portal_Person (
	uuid_ VARCHAR(75) null,
	personId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	name VARCHAR(75) null,
	sex VARCHAR(75) null,
	age INTEGER,
	city VARCHAR(75) null,
	status INTEGER,
	statusByUserId LONG,
	statusByUserName VARCHAR(75) null,
	statusDate DATE null
);