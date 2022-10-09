//Query all columns for all American cities in the CITY table with populations larger than 100000. The CountryCode for America is USA.


//The query to display the tuples which belongs to city table and belongs to "USA" country where the population is more than 100000 is follows:-
SELECT*FROM CITY WHERE COUNTRYCODE='USA'AND POPULATION>100000;
