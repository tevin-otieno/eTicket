CREATE DATABASE eticket;
\c eticket;
CREATE TABLE events (id serial PRIMARY KEY, title VARCHAR, location VARCHAR, eventtime VARCHAR,price INTEGER, host VARCHAR, imageurl VARCHAR, description VARCHAR);
CREATE TABLE users (id serial PRIMARY KEY, name VARCHAR, phonenumber VARCHAR, ticket VARCHAR, event_Id INTEGER);

CREATE DATABASE eticket_test WITH TEMPLATE eticket;