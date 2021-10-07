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
  street_name VARCHAR(60) NOT NULL,
  city VARCHAR(45) NOT NULL,
  average_number_of_passengers INT NULL,
  is_final_stop TINYINT NOT NULL,
  INDEX street (street_name ASC),
  PRIMARY KEY (street_name)
) ENGINE = InnoDB;

CREATE TABLE ticket (
  idticket INT NOT NULL AUTO_INCREMENT,
  speciality VARCHAR(45) NULL,
  price INT NOT NULL,
  width INT NULL,
  height INT NULL,
  produced_number INT NULL,
  INDEX ticket_type (speciality ASC),
  PRIMARY KEY (idticket)
) ENGINE = InnoDB;

CREATE TABLE route (
  number INT NOT NULL,
  stops_number INT NULL,
  length INT NOT NULL,
  average_two_stops_length INT NULL,
  whole_route_price FLOAT NOT NULL,
  two_stops_price FLOAT NULL,
  last_stop VARCHAR(60) NOT NULL,
  point_of_departure VARCHAR(60) NOT NULL,
  ticket_idticket INT NOT NULL,
  PRIMARY KEY (number),
  CONSTRAINT fk_route_stop1
    FOREIGN KEY (last_stop)
    REFERENCES stop (street_name),
  CONSTRAINT fk_route_stop2
    FOREIGN KEY (point_of_departure)
    REFERENCES stop (street_name),
  CONSTRAINT fk_route_ticket1
    FOREIGN KEY (ticket_idticket)
    REFERENCES ticket (idticket)
) ENGINE = InnoDB;

CREATE TABLE bus_rented (
  idbus_rented INT NOT NULL AUTO_INCREMENT,
  owner VARCHAR(45) NOT NULL,
  rental_fee VARCHAR(45) NOT NULL,
  owner_country VARCHAR(45) NULL,
  INDEX owner (owner ASC),
  PRIMARY KEY (idbus_rented))
ENGINE = InnoDB;

CREATE TABLE bus_producer (
  idbus_producer INT NOT NULL AUTO_INCREMENT,
  producer_country VARCHAR(45) NOT NULL,
  owner_name VARCHAR(45) NOT NULL,
  factory_new_production INT NULL,
  production_per_year INT NULL,
  PRIMARY KEY (idbus_producer),
  UNIQUE INDEX owner_name_UNIQUE (owner_name ASC) VISIBLE
) ENGINE = InnoDB;

CREATE TABLE bus (
idbus INT NOT NULL AUTO_INCREMENT,
age INT NOT NULL,
passenger_capacity INT NULL,
mileage INT NULL,
number_of_wheels INT NOT NULL,
doors_number INT NOT NULL,
seats INT NULL,
route_number INT NULL,
bus_rented_idbus_rented INT NULL,
bus_producer_id INT NOT NULL,
PRIMARY KEY (idbus, bus_producer_id),
CONSTRAINT fk_bus_route1
    FOREIGN KEY (route_number)
    REFERENCES route (number),
  CONSTRAINT fk_bus_bus_rented1
    FOREIGN KEY (bus_rented_idbus_rented)
    REFERENCES bus_rented (idbus_rented),
  CONSTRAINT fk_bus_bus_producer1
    FOREIGN KEY (bus_producer_id)
    REFERENCES bus_producer (idbus_producer)
) ENGINE = INNODB;

CREATE TABLE driver (
  id INT NOT NULL AUTO_INCREMENT,
  name VARCHAR(45) NULL,
  surname VARCHAR(45) NOT NULL,
  driver_licence_category VARCHAR(45) NOT NULL,
  sallary_in_bucks INT NULL,
  is_ready_to_die_for_company TINYINT NOT NULL,
  bus_idbus INT NULL,
  PRIMARY KEY (id),
  CONSTRAINT fk_driver_bus1
    FOREIGN KEY (bus_idbus)
    REFERENCES bus (idbus)
) ENGINE = InnoDB;

CREATE TABLE security (
  login VARCHAR(45) NOT NULL,
  password VARCHAR(45) NOT NULL,
  driver_id INT NOT NULL,
  PRIMARY KEY (login, driver_id),
  CONSTRAINT fk_security_driver1
    FOREIGN KEY (driver_id)
    REFERENCES driver (id)
) ENGINE = InnoDB;

CREATE TABLE route_has_stop (
  route_number INT NOT NULL,
  stop_street_name VARCHAR(60) NOT NULL,
  id INT NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (id),
  CONSTRAINT fk_route_has_stop_route
    FOREIGN KEY (route_number)
    REFERENCES route (number),
  CONSTRAINT fk_route_has_stop_stop1
    FOREIGN KEY (stop_street_name)
    REFERENCES stop (street_name)
) ENGINE = InnoDB;
