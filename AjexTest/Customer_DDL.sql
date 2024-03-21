-- 고객 정보를 위한 DB의 객체 
DROP TABLE customer; 
DROP SEQUENCE customer_seq;

CREATE TABLE customer 
(
	customer_num NUMBER PROMARY KEY 
	, user name VARCHAR2(30)
	, email 	VARCHAR2(30)
	
)
CREATE SEQUENCE customer_seq;