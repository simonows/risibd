CREATE DATABASE AviaData;

CREATE TABLE COUNTRY
(
   id int PRIMARY KEY NOT NULL AUTO_INCREMENT,
   countryName varchar(100) NOT NULL,
   population int NOT NULL
);

CREATE TABLE airport
(
    id int PRIMARY KEY NOT NULL AUTO_INCREMENT,
    name varchar(100) NOT NULL,
    city varchar(100) NOT NULL,
    country int
);

CREATE TABLE raice
(
    id int PRIMARY KEY NOT NULL AUTO_INCREMENT,
    number_t int,
    to_t varchar(100),
    from_t varchar(100),
    to_time TIME,
    from_time TIME,
    img varchar(100),
    ariport int
);

CREATE TABLE ticket
(
    id int PRIMARY KEY NOT NULL AUTO_INCREMENT,
    type_t int,
    cost int,
    place int,
    service int,
    raice int
);

