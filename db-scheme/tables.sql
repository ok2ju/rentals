drop table Branch;

create table Branch
(branchno char(5) not null,
 street varchar(35) not null,
 city varchar(10) not null,
 postcode varchar(10) not null,
 primary key(branchno)
);

drop table Staff;

create table Staff
(staffno char(5) not null,
 fname varchar(10) not null,
 lname varchar(10) not null,
 position varchar(10) not null,
 sex char(1),
 dob date,
 salary smallint not null,
 branchno char(5) not null,
 primary key(staffno),
 foreign key(branchno) references Branch(branchno)
);

drop table PropertyForRent;

create table PropertyForRent 
(propertyno char(5) not null, 
 street varchar(35) not null, 
 city varchar(10) not null,
 postcode varchar(10) not null,
 type varchar(10) not null,
 rooms smallint not null,
 rent int not null,
 ownerno char(5) not null,
 staffno char(5),
 branchno char(5) not null,
 primary key(propertyno),
 foreign key(ownerno) references PrivateOwner(ownerno),
 foreign key(staffno) references Staff(staffno),
 foreign key(branchno) references Branch(branchno)
);

drop table Client;

create table Client
(clientno char(5) not null,
 fname varchar(10) not null,
 lname varchar(10) not null,
 telno char(15) not null,
 preftype varchar(10) not null,
 maxrent int not null,
 primary key(clientno)
);


drop table PrivateOwner;

create table PrivateOwner 
(ownerno char(5) not null,
 fname varchar(10) not null,
 lname varchar(10) not null,
 address varchar(50) not null,
 telno char(15) not null,
 primary key(ownerno)
);

drop table Viewing;

create table Viewing
(clientno char(5) not null,
 propertyno char(5) not null,
 viewdate date not null,
 comments varchar(50),
 primary key(clientno,propertyno),
 foreign key(propertyno) references PropertyForRent(propertyno),
 foreign key(clientno) references Client(clientno)
);

drop table Registration;

create table Registration
(clientNo char(5) not null,
branchNo char(5) not null,
staffNo char(5) not null,
dateJoined date not null,
primary key(clientNo,branchNo),
foreign key(clientNo) references Client(clientno),
foreign key(branchNo) references Branch(branchno),
foreign key(staffNo) references Staff(staffno)
);