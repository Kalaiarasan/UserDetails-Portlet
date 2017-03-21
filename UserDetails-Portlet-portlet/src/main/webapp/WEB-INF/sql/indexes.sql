create index IX_3B89908D on portal_Person (city);
create index IX_1AF0D86 on portal_Person (uuid_);
create index IX_54CD66E2 on portal_Person (uuid_, companyId);
create unique index IX_AEE63DE4 on portal_Person (uuid_, groupId);