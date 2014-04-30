drop table Branch;

create table Branch
(branchno char(5) not null,
 street varchar(35),
 city varchar(10),
 postcode varchar(10),
 primary key(branchno)
);

drop table Staff;

create table Staff
(staffno char(5) not null,
 fname varchar(10),
 lname varchar(10),
 position varchar(10),
 sex char(1),
 dob char(9),
 salary smallint,
 branchno char(5),
 primary key(staffno)
);

drop table PropertyForRent;

create table PropertyForRent 
(propertyno char(5) not null, 
 street varchar(35), 
 city varchar(10),
 postcode varchar(10),
 type varchar(10),
 rooms smallint,
 rent int,
 ownerno char(5),
 staffno char(5),
 branchno char(5),
 primary key(propertyno)
);

drop table Client;

create table Client
(clientno char(5) not null,
 fname varchar(10),
 lname varchar(10),
 telno char(15),
 preftype varchar(10),
 maxrent int,
 primary key(clientno)
);


drop table PrivateOwner;

create table PrivateOwner 
(ownerno char(5) not null,
 fname varchar(10),
 lname varchar(10),
 address varchar(50),
 telno char(15),
 primary key(ownerno)
);

drop table Viewing;

create table Viewing
(clientno char(5) not null,
 propertyno char(5) not null,
 viewdate char(9),
 commnt varchar(15),
 primary key(clientno,propertyno)
);

drop table Registration;

create table Registration
(clientNo char(5) not null,
branchNo char(5) not null,
staffNo char(5),
dateJoined char(9),
primary key(clientNo,branchNo)
);