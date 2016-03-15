
/*
 * DROP TABLESPACE
 */
DROP TABLESPACE UMGDATA INCLUDING CONTENTS AND DATAFILES CASCADE CONSTRAINTS;
/*
 * DROP USER
 */
DROP USER UMGADMIN CASCADE;
/*CREATE TABLE SPACE */
CREATE TABLESPACE UMGDATA 
   DATAFILE 'UMGDATA.DBF' SIZE 1024M AUTOEXTEND ON
   ONLINE;
/*CREATE TEMP TABLESPACE*/
CREATE TEMPORARY TABLESPACE UMGTEMP
   TEMPFILE 'UMGTEMP.DBF' SIZE 5M AUTOEXTEND ON;
/*CREATE SCHEMA*/   
CREATE USER UMGADMIN
  IDENTIFIED BY UMGADMIN
  DEFAULT TABLESPACE UMGDATA
  TEMPORARY TABLESPACE UMGTEMP
  QUOTA 20M ON UMGDATA;
/*
 * GRANT ACCESS
 */
GRANT CREATE SESSION TO UMGADMIN;
GRANT CREATE TABLE TO UMGADMIN;
GRANT CREATE VIEW TO UMGADMIN;
GRANT CREATE ANY TRIGGER TO UMGADMIN;
GRANT CREATE ANY PROCEDURE TO UMGADMIN;
GRANT CREATE SEQUENCE TO UMGADMIN;
GRANT CREATE SYNONYM TO UMGADMIN;

--------------------