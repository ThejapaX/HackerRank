		-----------------------
		|  Field |     Type   |
		-----------------------
		|   ID   |  NUMBER    |
		|  CITY  | VARCHAR2(21)
		|  STATE | VARCHAR2(2)|
		|  LAT_N |  NUMBER    |
		| LONG_W |  NUMBER    |
		-----------------------
		
 --Challenge: Weather Observation Station 5
 --Author: Felipe yudi
 --HackerRank: https://www.hackerrank.com/yudi_imamura
 
 -- ordering city by length of each city researched
 -- Showing a data of columns just when rownum =1
 
 SELECT * FROM (SELECT city, length(city) 
				FROM STATION 
				ORDER BY length(city) ASC)
		  WHERE ROWNUM =1
 
 UNION ALL
 
 SELECT * FROM (SELECT city,length(city) 
				FROM STATION
				ORDER BY length(city) DESC)
		  WHERE ROWNUM =1;