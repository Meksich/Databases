-- autobus
INSERT INTO `androsiuk`.`autobus` (`age`, `passenger_capacity`, `mileage`, `number_of_wheels`, `doors_number`, `route_number`, `bus_producer_id`) VALUES ('15', '18', '100', '4', '2', '1', '2');
INSERT INTO `androsiuk`.`autobus` (`age`, `passenger_capacity`, `mileage`, `number_of_wheels`, `doors_number`, `seats`, `bus_producer_id`) VALUES ('38', '19', '230', '4', '2', '19', '1');
INSERT INTO `androsiuk`.`autobus` (`age`, `passenger_capacity`, `mileage`, `number_of_wheels`, `doors_number`, `seats`, `bus_producer_id`) VALUES ('1', '17', '8', '5', '1', '5', '1');
INSERT INTO `androsiuk`.`autobus` (`age`, `passenger_capacity`, `mileage`, `number_of_wheels`, `doors_number`, `bus_rented_idbus_rented`, `bus_producer_id`) VALUES ('500', '20', '1337', '8', '1', '1', '3');
INSERT INTO `androsiuk`.`autobus` (`age`, `passenger_capacity`, `mileage`, `number_of_wheels`, `doors_number`, `seats`, `route_number`, `bus_producer_id`) VALUES ('4', '40', '83', '1', '7', '1', '5', '5');
INSERT INTO `androsiuk`.`autobus` (`age`, `passenger_capacity`, `mileage`, `number_of_wheels`, `doors_number`, `seats`, `bus_producer_id`) VALUES ('8', '421', '98', '4', '15', '210', '7');
INSERT INTO `androsiuk`.`autobus` (`age`, `passenger_capacity`, `mileage`, `number_of_wheels`, `doors_number`, `seats`, `bus_producer_id`) VALUES ('510', '228', '1488', '6', '8', '227', '5');
INSERT INTO `androsiuk`.`autobus` (`age`, `passenger_capacity`, `mileage`, `number_of_wheels`, `doors_number`, `route_number`, `bus_producer_id`) VALUES ('19', '70', '137', '8', '3', '13', '2');
INSERT INTO `androsiuk`.`autobus` (`age`, `passenger_capacity`, `mileage`, `number_of_wheels`, `doors_number`, `seats`, `route_number`, `bus_rented_idbus_rented`, `bus_producer_id`) VALUES ('20', '150', '150', '150', '150', '150', '23', '3', '6');

-- bus_producer
INSERT INTO `androsiuk`.`bus_producer` (`producer_country`, `owner_name`, `factory_new_production`, `production_per_year`) VALUES ('Italy', 'Stepanske', '15', '2');
INSERT INTO `androsiuk`.`bus_producer` (`producer_country`, `owner_name`, `factory_new_production`, `production_per_year`) VALUES ('Dathomir', 'Rehtom', '2', '1');
INSERT INTO `androsiuk`.`bus_producer` (`producer_country`, `owner_name`, `factory_new_production`, `production_per_year`) VALUES ('Ukraine', 'Poroshenko', '800000', '15000');
INSERT INTO `androsiuk`.`bus_producer` (`producer_country`, `owner_name`, `factory_new_production`, `production_per_year`) VALUES ('Russia', 'Chukcha', '1200', '100');
INSERT INTO `androsiuk`.`bus_producer` (`producer_country`, `owner_name`, `factory_new_production`, `production_per_year`) VALUES ('Germany', 'Menge', '16000000', '200000');
INSERT INTO `androsiuk`.`bus_producer` (`producer_country`, `owner_name`, `factory_new_production`, `production_per_year`) VALUES ('Kashyyk', 'Chewie', '4100', '120');
INSERT INTO `androsiuk`.`bus_producer` (`producer_country`, `owner_name`, `factory_new_production`, `production_per_year`) VALUES ('Kamino', 'Lamasu', '1200000', '200000');

-- bus_rented
INSERT INTO `androsiuk`.`bus_rented` (`owner`, `rental_fee`, `owner_country`) VALUES ('Mykhailo', '800', 'Uraine');
INSERT INTO `androsiuk`.`bus_rented` (`owner`, `rental_fee`, `owner_country`) VALUES ('Stepnske', '1000', 'Italy');
INSERT INTO `androsiuk`.`bus_rented` (`owner`, `rental_fee`, `owner_country`) VALUES ('CT-5555', '768', 'Camino');
INSERT INTO `androsiuk`.`bus_rented` (`owner`, `rental_fee`, `owner_country`) VALUES ('Gregor', '750', 'Germany');

-- ticket
INSERT INTO `androsiuk`.`ticket` (`speciality`, `price`, `width`, `height`, `produced_number`) VALUES ('full', '10', '80', '35', '200000');
INSERT INTO `androsiuk`.`ticket` (`speciality`, `price`, `produced_number`) VALUES ('student', '5', '20000');
INSERT INTO `androsiuk`.`ticket` (`speciality`, `price`, `produced_number`) VALUES ('pilga', '4', '12000');

-- stop
INSERT INTO `androsiuk`.`stop` (`street_name`, `city`, `average_number_of_passengers`, `is_final_stop`) VALUES ('Autovokzal', 'Lviv', '80000', '1');
INSERT INTO `androsiuk`.`stop` (`street_name`, `city`, `average_number_of_passengers`, `is_final_stop`) VALUES ('Bogdana Hmelnytskogo', 'Lviv', '12', '0');
INSERT INTO `androsiuk`.`stop` (`street_name`, `city`, `average_number_of_passengers`, `is_final_stop`) VALUES ('Patona', 'Ternopil', '5', '0');
INSERT INTO `androsiuk`.`stop` (`street_name`, `city`, `average_number_of_passengers`, `is_final_stop`) VALUES ('Auchan_Chornovola', 'Lviv', '17', '0');
INSERT INTO `androsiuk`.`stop` (`street_name`, `city`, `average_number_of_passengers`, `is_final_stop`) VALUES ('Stryiska-Naukova', 'Lviv', '25', '0');
INSERT INTO `androsiuk`.`stop` (`street_name`, `city`, `average_number_of_passengers`, `is_final_stop`) VALUES ('Nykyforchuka', 'Ternopil', '1', '1');
INSERT INTO `androsiuk`.`stop` (`street_name`, `city`, `average_number_of_passengers`, `is_final_stop`) VALUES ('Universytet', 'Lviv', '12', '1');
INSERT INTO `androsiuk`.`stop` (`street_name`, `city`, `average_number_of_passengers`, `is_final_stop`) VALUES ('Lubinska', 'Lviv', '20', '0');
INSERT INTO `androsiuk`.`stop` (`street_name`, `city`, `average_number_of_passengers`, `is_final_stop`) VALUES ('Antonovycha', 'Lviv', '15', '0');
INSERT INTO `androsiuk`.`stop` (`street_name`, `city`, `average_number_of_passengers`, `is_final_stop`) VALUES ('Heroiv UPA', 'Lviv', '7', '0');
INSERT INTO `androsiuk`.`stop` (`street_name`, `city`, `average_number_of_passengers`, `is_final_stop`) VALUES ('Chervonoi Kalyny', 'Lviv', '18', '1');
INSERT INTO `androsiuk`.`stop` (`street_name`, `city`, `average_number_of_passengers`, `is_final_stop`) VALUES ('Motozavod', 'Lviv', '14', '1');
INSERT INTO `androsiuk`.`stop` (`street_name`, `city`, `average_number_of_passengers`, `is_final_stop`) VALUES ('Rizni', 'Lviv', '4', '1');
INSERT INTO `androsiuk`.`stop` (`street_name`, `city`, `average_number_of_passengers`, `is_final_stop`) VALUES ('Murovane', 'Lviv', '2', '1');

-- route
INSERT INTO `androsiuk`.`route` (`number`, `stops_number`, `length`, `average_two_stops_length`, `whole_route_price`, `two_stops_price`, `last_stop`, `point_of departure`, `ticket_idticket`) VALUES ('1', '4', '12', '3', '14', '2', 'Universytet', 'Patona', '2');
INSERT INTO `androsiuk`.`route` (`number`, `stops_number`, `length`, `average_two_stops_length`, `whole_route_price`, `two_stops_price`, `last_stop`, `point_of departure`, `ticket_idticket`) VALUES ('5', '3', '15', '5', '16', '3', 'Murovane', 'Autovokzal', '2');
INSERT INTO `androsiuk`.`route` (`number`, `stops_number`, `length`, `average_two_stops_length`, `whole_route_price`, `two_stops_price`, `last_stop`, `point_of departure`, `ticket_idticket`) VALUES ('13', '5', '10', '2', '10', '2', 'Chervonoi Kalyny', 'Motozavod', '1');
INSERT INTO `androsiuk`.`route` (`number`, `stops_number`, `length`, `average_two_stops_length`, `whole_route_price`, `two_stops_price`, `last_stop`, `point_of departure`, `ticket_idticket`) VALUES ('23', '4', '8', '2', '5', '1', 'Autovokzal', 'Rizni', '3');
 
-- route_has_stop
INSERT INTO `androsiuk`.`route_has_stop` (`route_number`, `stop_street_name`) VALUES ('1', 'Universytet');
INSERT INTO `androsiuk`.`route_has_stop` (`route_number`, `stop_street_name`) VALUES ('1', 'Auchan_Chornovola');
INSERT INTO `androsiuk`.`route_has_stop` (`route_number`, `stop_street_name`) VALUES ('1', 'Bogdana Hmelnytskogo');
INSERT INTO `androsiuk`.`route_has_stop` (`route_number`, `stop_street_name`) VALUES ('1', 'Patona');
INSERT INTO `androsiuk`.`route_has_stop` (`route_number`, `stop_street_name`) VALUES ('5', 'Autovokzal');
INSERT INTO `androsiuk`.`route_has_stop` (`route_number`, `stop_street_name`) VALUES ('5', 'Auchan_Chornovola');
INSERT INTO `androsiuk`.`route_has_stop` (`route_number`, `stop_street_name`) VALUES ('5', 'Murovane');
INSERT INTO `androsiuk`.`route_has_stop` (`route_number`, `stop_street_name`) VALUES ('13', 'Motozavod');
INSERT INTO `androsiuk`.`route_has_stop` (`route_number`, `stop_street_name`) VALUES ('13', 'Lubinska');
INSERT INTO `androsiuk`.`route_has_stop` (`route_number`, `stop_street_name`) VALUES ('13', 'Heroiv UPA');
INSERT INTO `androsiuk`.`route_has_stop` (`route_number`, `stop_street_name`) VALUES ('13', 'Stryiska-Naukova');
INSERT INTO `androsiuk`.`route_has_stop` (`route_number`, `stop_street_name`) VALUES ('13', 'Chervonoi Kalyny');
INSERT INTO `androsiuk`.`route_has_stop` (`route_number`, `stop_street_name`) VALUES ('23', 'Rizni');
INSERT INTO `androsiuk`.`route_has_stop` (`route_number`, `stop_street_name`) VALUES ('23', 'Universytet');
INSERT INTO `androsiuk`.`route_has_stop` (`route_number`, `stop_street_name`) VALUES ('23', 'Stryiska-Naukova');
INSERT INTO `androsiuk`.`route_has_stop` (`route_number`, `stop_street_name`) VALUES ('23', 'Autovokzal');

-- driver
INSERT INTO `androsiuk`.`driver` (`name`, `surname`, `driver_licence_category`, `sallary_in_bucks`, `is_ready_to_die_for_company`) VALUES ('Vasya', 'Stepanenko', 'C', '100', '0');
INSERT INTO `androsiuk`.`driver` (`name`, `surname`, `driver_licence_category`, `sallary_in_bucks`, `is_ready_to_die_for_company`, `bus_idbus`) VALUES ('Han', 'Solo', 'f', '15', '0', '23');
INSERT INTO `androsiuk`.`driver` (`name`, `surname`, `driver_licence_category`, `sallary_in_bucks`, `is_ready_to_die_for_company`, `bus_idbus`) VALUES ('Rex', 'Gergo', 'H', '150', '1', '20');
INSERT INTO `androsiuk`.`driver` (`name`, `surname`, `driver_licence_category`, `sallary_in_bucks`, `is_ready_to_die_for_company`, `bus_idbus`) VALUES ('Ahsoka', 'Tano', 'l', '30', '0', '27');
INSERT INTO `androsiuk`.`driver` (`name`, `surname`, `driver_licence_category`, `sallary_in_bucks`, `is_ready_to_die_for_company`, `bus_idbus`) VALUES ('Vova', 'Androsyk', 'D', '3000', '1', '19');
INSERT INTO `androsiuk`.`driver` (`name`, `surname`, `driver_licence_category`, `sallary_in_bucks`, `is_ready_to_die_for_company`) VALUES ('Meks', 'Androsyk', 'A', '300', '1');
INSERT INTO `androsiuk`.`driver` (`name`, `surname`, `driver_licence_category`, `sallary_in_bucks`, `is_ready_to_die_for_company`, `bus_idbus`) VALUES ('Darth', 'Plaguies', 'D', '1000', '0', '22');
INSERT INTO `androsiuk`.`driver` (`name`, `surname`, `driver_licence_category`, `sallary_in_bucks`, `is_ready_to_die_for_company`, `bus_idbus`) VALUES ('Maul', 'Wazovski', 'H', '2999', '1', '25');
INSERT INTO `androsiuk`.`driver` (`name`, `surname`, `driver_licence_category`, `sallary_in_bucks`, `is_ready_to_die_for_company`) VALUES ('Anton', 'Popov', 'A', '10', '0');

-- security
INSERT INTO `androsiuk`.`security` (`login`, `password`, `driver_id`) VALUES ('Vasya', '14881337', '1');
INSERT INTO `androsiuk`.`security` (`login`, `password`, `driver_id`) VALUES ('Falcon', '1000', '2');
INSERT INTO `androsiuk`.`security` (`login`, `password`, `driver_id`) VALUES ('CT-7567', '501st', '3');
INSERT INTO `androsiuk`.`security` (`login`, `password`, `driver_id`) VALUES ('Anakin', 'Skyguy', '4');
INSERT INTO `androsiuk`.`security` (`login`, `password`, `driver_id`) VALUES ('Teto', '1003maks03', '5');
INSERT INTO `androsiuk`.`security` (`login`, `password`, `driver_id`) VALUES ('Meksich', '01012015', '6');
INSERT INTO `androsiuk`.`security` (`login`, `password`, `driver_id`) VALUES ('tragedy', 'Is it possible to learn such power', '7');
INSERT INTO `androsiuk`.`security` (`login`, `password`, `driver_id`) VALUES ('Fear', 'revenge', '8');
INSERT INTO `androsiuk`.`security` (`login`, `password`, `driver_id`) VALUES ('Algo', 'rithms', '9');
