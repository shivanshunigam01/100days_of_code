//Query the list of CITY names from STATION which have vowels (i.e., a, e, i, o, and u) as both their first and last characters. 
//Your result cannot contain duplicates.
select distinct city from station
where (city like 'a%'
or city like 'e%'
or city like 'i%'
or city like 'o%'
or city like 'u%')
and
(
city like '%a'
or city like '%e'
or city like '%i'
or city like '%o'
or city like '%u'
)
