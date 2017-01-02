DROP TABLE EMPLOYEES;

CREATE TABLE EMPLOYEES ( 
ID INT PRIMARY KEY AUTO_INCREMENT, 
CODE VARCHAR(10) NOT NULL,
NAME VARCHAR(100) NOT NULL,
ROLE_ID INT NOT NULL,
EMAIL_ID VARCHAR(100),
MOBILE_NO BIGINT,
ACTIVE TINYINT NOT NULL DEFAULT 1,
CREATED_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
MODIFIED_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
CONSTRAINT emp_code_uq UNIQUE ( CODE),
CONSTRAINT emp_email_uq UNIQUE ( EMAIL_ID ),
CONSTRAINT emp_mobile_no_uq UNIQUE ( MOBILE_NO),
CONSTRAINT EMP_ROLE_ID_FK FOREIGN KEY ( ROLE_ID)
REFERENCES ROLE( ID)
);

insert into EMPLOYEES ( CODE, NAME, ROLE_ID, EMAIL_ID, MOBILE_NO)
VALUES ( 'RCS127','Janani V', 2, 'janani@revature.com', NULL);

insert into EMPLOYEES ( CODE, NAME, ROLE_ID, EMAIL_ID, MOBILE_NO)
VALUES ( 'RCS120','Naresh Kumar H', 1, 'naresh.kumar@revature.com', 9994194773);


select * from EMPLOYEES;

