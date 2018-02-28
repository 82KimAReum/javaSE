CREATE TABLE test.user
(
   userid   VARCHAR(12)  PRIMARY KEY,
   passwd   VARCHAR(12)  NOT NULL
)


INSERT INTO test.user
VALUES ('javaexpert', '12345678');

student
truncate table test.student;