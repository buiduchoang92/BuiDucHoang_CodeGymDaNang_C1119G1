drop database if exists spring_security;
create database spring_security;
use spring_security;
CREATE TABLE `spring_security`.`user` (
  `iduser` INT NOT NULL AUTO_INCREMENT,
  `username` VARCHAR(45) NULL,
  `password` VARCHAR(255) NULL,
  `enabled` INT(1) NULL,
  PRIMARY KEY (`iduser`),
  UNIQUE INDEX `username_UNIQUE` (`username` ASC));
  CREATE TABLE `spring_security`.`role` (
  `idrole` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NULL,
  PRIMARY KEY (`idrole`));
  CREATE TABLE `spring_security`.`users_roles` (
  `id` INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  `iduser` INT NULL,
  `idrole` INT NULL,
	FOREIGN KEY (iduser)
		REFERENCES user (iduser),
    FOREIGN KEY (idrole)
		REFERENCES role (idrole));
 INSERT INTO `user` VALUES (1,'kai','$2a$04$GYGsaJj9l6kH2GikK6QVzO0v3sOCxt3vdkiA2/tcoSw8erI85ZYDG',1),
 (2,'sena','$2a$04$GYGsaJj9l6kH2GikK6QVzO0v3sOCxt3vdkiA2/tcoSw8erI85ZYDG',1);
 INSERT INTO `role` VALUES (1,'ROLE_ADMIN'),(2,'ROLE_USER');
 INSERT INTO `users_roles` VALUES (1,1,1),(2,1,2),(4,2,2);