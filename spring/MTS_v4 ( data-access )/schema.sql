create database mts;
use mts;

create table mts.ACCOUNTS(
num varchar(12) primary key,
name varchar(100),
balance double,
type varchar(100),
staus varchar(100)
);

insert into mts.ACCOUNTS values("1","Naga",1000.00,"SAVING","ACTIVE");
insert into mts.ACCOUNTS values("2","Ria",1000.00,"SAVING","ACTIVE");