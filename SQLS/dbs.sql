SELECT * FROM mysql.user;

CREATE DATABASE IF NOT EXISTS dbm;
DROP TABLE IF EXISTS dbm.users;
CREATE TABLE dbm.users(
  id INT AUTO_INCREMENT PRIMARY KEY COMMENT 'id',
  username VARCHAR(255) NOT NULL COMMENT 'username',
  password VARCHAR(255) NOT NULL COMMENT 'password'
);

DROP TABLE IF EXISTS dbm.books;
CREATE TABLE dbm.books(
  id INT AUTO_INCREMENT PRIMARY KEY  COMMENT 'id',
  bookname VARCHAR(255) NOT NULL ,
  writer VARCHAR(255)
)
  
SELECT * FROM dbm.users;

SELECT *
FROM dbm.books;

INSERT INTO dbm.users VALUES (NULL ,'123','123');

INSERT INTO dbm.books VALUES (null,'test','test');