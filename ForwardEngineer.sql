-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema androsiuk
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema androsiuk
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `androsiuk` DEFAULT CHARACTER SET utf8 ;
USE `androsiuk` ;

-- -----------------------------------------------------
-- Table `androsiuk`.`stop`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `androsiuk`.`stop` (
  `street_name` VARCHAR(60) NOT NULL,
  `city` VARCHAR(45) NOT NULL,
  `average_number_of_passengers` INT NULL,
  `is_final_stop` TINYINT NOT NULL,
  PRIMARY KEY (`street_name`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `androsiuk`.`ticket`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `androsiuk`.`ticket` (
  `idticket` INT NOT NULL AUTO_INCREMENT,
  `speciality` VARCHAR(45) NULL,
  `price` INT NOT NULL,
  `width` INT NULL,
  `height` INT NULL,
  `produced_number` INT NULL,
  PRIMARY KEY (`idticket`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `androsiuk`.`route`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `androsiuk`.`route` (
  `number` INT NOT NULL,
  `stops_number` INT NULL,
  `length` INT NOT NULL,
  `average_two_stops_length` INT NULL,
  `whole_route_price` FLOAT NOT NULL,
  `two_stops_price` FLOAT NULL,
  `last_stop` VARCHAR(60) NOT NULL,
  `point_of departure` VARCHAR(60) NOT NULL,
  `ticket_idticket` INT NOT NULL,
  PRIMARY KEY (`number`),
  INDEX `fk_route_stop1_idx` (`last_stop` ASC) VISIBLE,
  INDEX `fk_route_stop2_idx` (`point_of departure` ASC) VISIBLE,
  INDEX `fk_route_ticket1_idx` (`ticket_idticket` ASC) VISIBLE,
  CONSTRAINT `fk_route_stop1`
    FOREIGN KEY (`last_stop`)
    REFERENCES `androsiuk`.`stop` (`street_name`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_route_stop2`
    FOREIGN KEY (`point_of departure`)
    REFERENCES `androsiuk`.`stop` (`street_name`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_route_ticket1`
    FOREIGN KEY (`ticket_idticket`)
    REFERENCES `androsiuk`.`ticket` (`idticket`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `androsiuk`.`bus_rented`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `androsiuk`.`bus_rented` (
  `idbus_rented` INT NOT NULL AUTO_INCREMENT,
  `owner` VARCHAR(45) NOT NULL,
  `rental_fee` VARCHAR(45) NOT NULL,
  `owner_country` VARCHAR(45) NULL,
  PRIMARY KEY (`idbus_rented`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `androsiuk`.`bus_producer`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `androsiuk`.`bus_producer` (
  `idbus_producer` INT NOT NULL AUTO_INCREMENT,
  `producer_country` VARCHAR(45) NOT NULL,
  `owner_name` VARCHAR(45) NOT NULL,
  `factory_new_production` INT NULL,
  `production_per_year` INT NULL,
  PRIMARY KEY (`idbus_producer`),
  UNIQUE INDEX `owner_name_UNIQUE` (`owner_name` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `androsiuk`.`autobus`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `androsiuk`.`autobus` (
  `idbus` INT NOT NULL AUTO_INCREMENT,
  `age` INT NOT NULL,
  `passenger_capacity` INT NULL,
  `mileage` INT NULL,
  `number_of_wheels` INT NOT NULL,
  `doors_number` INT NOT NULL,
  `seats` INT NULL,
  `route_number` INT NULL,
  `bus_rented_idbus_rented` INT NULL,
  `bus_producer_id` INT NOT NULL,
  PRIMARY KEY (`idbus`, `bus_producer_id`),
  INDEX `fk_bus_route1_idx` (`route_number` ASC) VISIBLE,
  INDEX `fk_bus_bus_rented1_idx` (`bus_rented_idbus_rented` ASC) VISIBLE,
  INDEX `fk_bus_bus_producer1_idx` (`bus_producer_id` ASC) VISIBLE,
  CONSTRAINT `fk_bus_route1`
    FOREIGN KEY (`route_number`)
    REFERENCES `androsiuk`.`route` (`number`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_bus_bus_rented1`
    FOREIGN KEY (`bus_rented_idbus_rented`)
    REFERENCES `androsiuk`.`bus_rented` (`idbus_rented`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_bus_bus_producer1`
    FOREIGN KEY (`bus_producer_id`)
    REFERENCES `androsiuk`.`bus_producer` (`idbus_producer`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `androsiuk`.`driver`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `androsiuk`.`driver` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NULL,
  `surname` VARCHAR(45) NOT NULL,
  `driver_licence_category` VARCHAR(45) NOT NULL,
  `sallary_in_bucks` INT NULL,
  `is_ready_to_die_for_company` TINYINT NOT NULL,
  `bus_idbus` INT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_driver_bus1_idx` (`bus_idbus` ASC) VISIBLE,
  CONSTRAINT `fk_driver_bus1`
    FOREIGN KEY (`bus_idbus`)
    REFERENCES `androsiuk`.`autobus` (`idbus`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `androsiuk`.`security`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `androsiuk`.`security` (
  `login` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  `driver_id` INT NOT NULL,
  PRIMARY KEY (`login`, `driver_id`),
  INDEX `fk_security_driver1_idx` (`driver_id` ASC) VISIBLE,
  CONSTRAINT `fk_security_driver1`
    FOREIGN KEY (`driver_id`)
    REFERENCES `androsiuk`.`driver` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `androsiuk`.`route_has_stop`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `androsiuk`.`route_has_stop` (
  `route_number` INT NOT NULL,
  `stop_street_name` VARCHAR(60) NOT NULL,
  `id` INT NOT NULL AUTO_INCREMENT,
  INDEX `fk_route_has_stop_stop1_idx` (`stop_street_name` ASC) VISIBLE,
  INDEX `fk_route_has_stop_route_idx` (`route_number` ASC) VISIBLE,
  PRIMARY KEY (`id`),
  CONSTRAINT `fk_route_has_stop_route`
    FOREIGN KEY (`route_number`)
    REFERENCES `androsiuk`.`route` (`number`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_route_has_stop_stop1`
    FOREIGN KEY (`stop_street_name`)
    REFERENCES `androsiuk`.`stop` (`street_name`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
