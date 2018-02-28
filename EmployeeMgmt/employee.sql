CREATE TABLE hobongbonus
(
	id   TINYINT  PRIMARY KEY,
	money  INT    NOT NULL
);

INSERT INTO hobongbonus VALUES(1, 900000);
INSERT INTO hobongbonus VALUES(2, 400000);
INSERT INTO hobongbonus VALUES(3, 600000);
INSERT INTO hobongbonus VALUES(4, 800000);
INSERT INTO hobongbonus VALUES(5, 300000);
INSERT INTO hobongbonus VALUES(6, 800000);
INSERT INTO hobongbonus VALUES(7, 800000);

CREATE TABLE defaultbonus
(
	id   TINYINT  PRIMARY KEY,
	money  INT    NOT NULL
);

INSERT INTO defaultbonus VALUES(1, 15000);
INSERT INTO defaultbonus VALUES(2, 25000);
INSERT INTO defaultbonus VALUES(3, 35000);
INSERT INTO defaultbonus VALUES(4, 45000);

CREATE TABLE nightbonus
(
	id   TINYINT  PRIMARY KEY,
	money  INT    NOT NULL
);

INSERT INTO nightbonus VALUES(1, 1500);
INSERT INTO nightbonus VALUES(2, 2500);
INSERT INTO nightbonus VALUES(3, 3500);
INSERT INTO nightbonus VALUES(4, 4500);

departmentCREATE TABLE department
(
	code   CHAR(1) PRIMARY KEY,
	dname  VARCHAR(20)   NOT NULL
);

INSERT INTO department VALUES('A', '영업부');
INSERT INTO department VALUES('B', '업무부');
INSERT INTO department VALUES('C', '홍보부');
INSERT INTO department VALUES('D', '인사부');
INSERT INTO department VALUES('E', '경리부');
INSERT INTO department VALUES('F', '판촉부');
INSERT INTO department VALUES('G', '총무부');

CREATE TABLE employee
(
	empno       CHAR(4)   PRIMARY KEY,
	name        VARCHAR(20)  NOT NULL,
	giboncode   TINYINT   NOT NULL,
	nighthour   TINYINT   NOT NULL,
	family      TINYINT   NOT NULL,
	dname       VARCHAR(20),
	gibon       INT,
	hobongbonus  INT,
	familybonus  SMALLINT,
	nightbonus   SMALLINT,
	sum          INT,
	salary       INT
)