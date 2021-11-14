CREATE DATABASE IF NOT EXISTS autobus;
USE autobus;

DROP TABLE IF EXISTS route_has_stop;
DROP TABLE IF EXISTS security;
DROP TABLE IF EXISTS driver;
DROP TABLE IF EXISTS bus;
DROP TABLE IF EXISTS bus_producer;
DROP TABLE IF EXISTS bus_rented;
DROP TABLE IF EXISTS route;
DROP TABLE IF EXISTS stop;
DROP TABLE IF EXISTS ticket;

CREATE TABLE stop (
  id INT NOT NULL AUTO_INCREMENT,
  street_name VARCHAR(60) NOT NULL,
  city VARCHAR(45) NOT NULL,
  average_number_of_passengers INT NULL,
  is_final_stop TINYINT NOT NULL,
  INDEX id (id ASC),
  PRIMARY KEY (id)
) ENGINE = InnoDB;

CREATE TABLE ticket (
  id INT NOT NULL AUTO_INCREMENT,
  speciality VARCHAR(45) NULL,
  price INT NOT NULL,
  width INT NULL,
  height INT NULL,
  produced_number INT NULL,
  INDEX ticket_type (speciality ASC),
  PRIMARY KEY (id)
) ENGINE = InnoDB;

CREATE TABLE route (
  id INT NOT NULL AUTO_INCREMENT,
  stops_number INT NULL,
  length INT NOT NULL,
  average_two_stops_length INT NULL,
  whole_route_price FLOAT NOT NULL,
  two_stops_price FLOAT NULL,
  ticket_id INT NOT NULL,
  PRIMARY KEY (id),
  CONSTRAINT fk_route_ticket1
    FOREIGN KEY (ticket_id)
    REFERENCES ticket (id)
) ENGINE = InnoDB;

CREATE TABLE bus_rented (
  id INT NOT NULL AUTO_INCREMENT,
  owner VARCHAR(45) NOT NULL,
  rental_fee VARCHAR(45) NOT NULL,
  owner_country VARCHAR(45) NULL,
  INDEX owner (owner ASC),
  PRIMARY KEY (id))
ENGINE = InnoDB;

CREATE TABLE bus_producer (
  id INT NOT NULL AUTO_INCREMENT,
  producer_country VARCHAR(45) NOT NULL,
  owner_name VARCHAR(45) NOT NULL,
  factory_new_production INT NULL,
  production_per_year INT NULL,
  PRIMARY KEY (id),
  UNIQUE INDEX owner_name_UNIQUE (owner_name ASC) VISIBLE
) ENGINE = InnoDB;

CREATE TABLE bus (
id INT NOT NULL AUTO_INCREMENT,
age INT NOT NULL,
passenger_capacity INT NULL,
mileage INT NULL,
number_of_wheels INT NOT NULL,
doors_number INT NOT NULL,
seats INT NULL,
route_number INT NULL,
bus_rented_id INT NULL,
bus_producer_id INT NOT NULL,
PRIMARY KEY (id),
CONSTRAINT fk_bus_route1
    FOREIGN KEY (route_number)
    REFERENCES route (id),
  CONSTRAINT fk_bus_bus_rented1
    FOREIGN KEY (bus_rented_id)
    REFERENCES bus_rented (id),
  CONSTRAINT fk_bus_bus_producer1
    FOREIGN KEY (bus_producer_id)
    REFERENCES bus_producer (id)
) ENGINE = INNODB;

CREATE TABLE driver (
  id INT NOT NULL AUTO_INCREMENT,
  name VARCHAR(45) NULL,
  surname VARCHAR(45) NOT NULL,
  driver_licence_category VARCHAR(45) NOT NULL,
  sallary_in_bucks INT NULL,
  is_ready_to_die_for_company TINYINT NOT NULL,
  bus_id INT NULL,
  PRIMARY KEY (id),
  CONSTRAINT fk_driver_bus1
    FOREIGN KEY (bus_id)
    REFERENCES bus (id)
) ENGINE = InnoDB;

CREATE TABLE security (
  id INT NOT NULL AUTO_INCREMENT,
  password VARCHAR(45) NOT NULL,
  driver_id INT NOT NULL,
  PRIMARY KEY (id),
  CONSTRAINT fk_security_driver1
    FOREIGN KEY (driver_id)
    REFERENCES driver (id)
) ENGINE = InnoDB;