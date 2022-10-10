//Query the NAME field for all American cities in the CITY table with populations larger than 120000. The CountryCode for America is USA.

//The CITY table is described as follows:

select name from city where countrycode='usa' and population>120000;
