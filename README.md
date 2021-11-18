# eTicket
A web application that allows event hosts to add events ,upon which clients can get to view  and buy tickets that covers their best interests.

## Contributors:
<ul>
   <li>Felix Maina</li>
   <li>Tevin Otieno</li>
   <li>Sheldon Okware</li>
   <li>Simon Mungai</li>
</ul>

## Setup/Installation Requirements
* Fork this repo
* Clone this repo 
* Open terminal
* Navigate to appropriate directory using the cd command
* type in the command git clone and paste the url of clone and then press enter 

## Setup Requirements for Database
 In PSQL:
 <ul>
<li>CREATE DATABASE eticket;</li>
<li\c eticket;</li>
<li>CREATE TABLE events (id serial PRIMARY KEY, title VARCHAR, location VARCHAR, eventtime VARCHAR,price INTEGER, host VARCHAR, imageurl VARCHAR, description VARCHAR);</li>
<li> CREATE TABLE users (id serial PRIMARY KEY, name VARCHAR, phonenumber VARCHAR, ticket VARCHAR, event_Id INTEGER);</li>
<li> CREATE DATABASE eticket_test WITH TEMPLATE eticket;</li>
</ul>

## In order to run locally
 Go to DB.class in main/java folder and insert your postgress credentials
 
## Technologies Used
<ul>
<li>Java</li>
<li>Heroku</li>
<li>CSS</li>
<li>HBS</li>
</ul>

## Support and contact details
for support, kindly reach us via email  eticket-website@gmail.com

### License
*This project is licensed under the terms of the MIT license.*
Copyright (c) 2020 **Tevin Otieno, Felix Maina,Sheldon Okware, Simon Mungai**

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:


  
  
