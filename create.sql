CREATE DATABASE eticket;
\c eticket;
CREATE TABLE event (id serial PRIMARY KEY, title VARCHAR, price INTEGER, host VARCHAR, location VARCHAR, time VARCHAR);
CREATE TABLE users (id serial PRIMARY KEY, name VARCHAR, phonenumber VARCHAR, ticket VARCHAR);

CREATE DATABASE eticket_test WITH TEMPLATE eticket;