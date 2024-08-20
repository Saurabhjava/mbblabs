--------------------------------------------------------
--  File created - Tuesday-August-20-2024   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table EMPLOYEE
--------------------------------------------------------

  CREATE TABLE "TRAINING"."EMPLOYEE" 
   (	"EMPID" NUMBER(10,0), 
	"DOB" DATE, 
	"EMAIL" VARCHAR2(255 CHAR), 
	"NAME" VARCHAR2(255 CHAR)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
REM INSERTING into TRAINING.EMPLOYEE
SET DEFINE OFF;
Insert into TRAINING.EMPLOYEE (EMPID,DOB,EMAIL,NAME) values (52,to_date('26/11/1999','DD/MM/RRRR'),'bh@gmail.com','Bhuwan');
Insert into TRAINING.EMPLOYEE (EMPID,DOB,EMAIL,NAME) values (1,to_date('25/10/1998','DD/MM/RRRR'),'bhuwan@gmail.com','Bhuwan');
Insert into TRAINING.EMPLOYEE (EMPID,DOB,EMAIL,NAME) values (2,to_date('26/11/1999','DD/MM/RRRR'),'amit@gmail.com','Amit');
Insert into TRAINING.EMPLOYEE (EMPID,DOB,EMAIL,NAME) values (952,to_date('26/10/2000','DD/MM/RRRR'),'parth@gmail.com','Parth');
Insert into TRAINING.EMPLOYEE (EMPID,DOB,EMAIL,NAME) values (953,to_date('26/11/2000','DD/MM/RRRR'),'mukesh@gmail.com','Mukesh Ambani');
Insert into TRAINING.EMPLOYEE (EMPID,DOB,EMAIL,NAME) values (1002,to_date('26/11/2000','DD/MM/RRRR'),'mukesh@gmail.com','Mukesh Kumar');
Insert into TRAINING.EMPLOYEE (EMPID,DOB,EMAIL,NAME) values (1052,to_date('26/11/2000','DD/MM/RRRR'),'manju@gmail.com','Manju Kumari');
Insert into TRAINING.EMPLOYEE (EMPID,DOB,EMAIL,NAME) values (1053,to_date('26/11/2000','DD/MM/RRRR'),'amrita@gmail.com','Amrita');
Insert into TRAINING.EMPLOYEE (EMPID,DOB,EMAIL,NAME) values (1054,to_date('26/11/2000','DD/MM/RRRR'),'amrita@gmail.com','Amrita Kumari');
Insert into TRAINING.EMPLOYEE (EMPID,DOB,EMAIL,NAME) values (1102,to_date('24/11/2001','DD/MM/RRRR'),'Sa@gmail.com','Saurabh');
Insert into TRAINING.EMPLOYEE (EMPID,DOB,EMAIL,NAME) values (1252,to_date('21/05/2007','DD/MM/RRRR'),'zati@gmail.com','zatiab');
--------------------------------------------------------
--  DDL for Index SYS_C008455
--------------------------------------------------------

  CREATE UNIQUE INDEX "TRAINING"."SYS_C008455" ON "TRAINING"."EMPLOYEE" ("EMPID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  Constraints for Table EMPLOYEE
--------------------------------------------------------

  ALTER TABLE "TRAINING"."EMPLOYEE" MODIFY ("EMPID" NOT NULL ENABLE);
  ALTER TABLE "TRAINING"."EMPLOYEE" ADD PRIMARY KEY ("EMPID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
