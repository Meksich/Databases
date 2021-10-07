
-- bus_producer
INSERT INTO bus_producer (`producer_country`, `owner_name`, `factory_new_production`, `production_per_year`) VALUES 
('Italy', 'Stepanske', '15', '2'),
('Dathomir', 'Rehtom', '2', '1'),
('Ukraine', 'Poroshenko', '800000', '15000'),
('Russia', 'Chukcha', '1200', '100'),
('Germany', 'Menge', '16000000', '200000'),
('Kashyyk', 'Chewie', '4100', '120'),
('Kamino', 'Lamasu', '1200000', '200000');

-- ticket
INSERT INTO ticket (`speciality`, `price`, `width`, `height`, `produced_number`) VALUES 
('full', '10', '80', '35', '200000'),
('student', '5', null, null, '20000'),
('pilga', '4', null, null, '12000');

-- stop
INSERT INTO stop (`street_name`, `city`, `average_number_of_passengers`, `is_final_stop`) VALUES 
('Autovokzal', 'Lviv', '80000', '1'),
('Bogdana Hmelnytskogo', 'Lviv', '12', '0'),
('Patona', 'Ternopil', '5', '0'),
('Auchan_Chornovola', 'Lviv', '17', '0'),
('Stryiska-Naukova', 'Lviv', '25', '0'),
('Nykyforchuka', 'Ternopil', '1', '1'),
('Universytet', 'Lviv', '12', '1'),
('Lubinska', 'Lviv', '20', '0'),
('Antonovycha', 'Lviv', '15', '0'),
('Heroiv UPA', 'Lviv', '7', '0'),
('Chervonoi Kalyny', 'Lviv', '18', '1'),
('Motozavod', 'Lviv', '14', '1'),
('Rizni', 'Lviv', '4', '1'),
('Murovane', 'Lviv', '2', '1');

-- route
INSERT INTO route (`number`, `stops_number`, `length`, `average_two_stops_length`, `whole_route_price`, `two_stops_price`, `last_stop`, `point_of_departure`, `ticket_idticket`) VALUES 
('1', '4', '12', '3', '14', '2', 'Universytet', 'Patona', '2'),
('5', '3', '15', '5', '16', '3', 'Murovane', 'Autovokzal', '2'),
('13', '5', '10', '2', '10', '2', 'Chervonoi Kalyny', 'Motozavod', '1'),
('23', '4', '8', '2', '5', '1', 'Autovokzal', 'Rizni', '3');

-- bus_rented
INSERT INTO bus_rented (`owner`, `rental_fee`, `owner_country`) VALUES
('Mykhailo', '800', 'Uraine'),
('Stepnske', '1000', 'Italy'),
('CT-5555', '768', 'Camino'),
('Gregor', '750', 'Germany');

-- bus
INSERT INTO bus (`age`, `passenger_capacity`, `mileage`, `number_of_wheels`, `doors_number`, `seats`, `route_number`, `bus_rented_idbus_rented`, `bus_producer_id`) VALUES 
('15', '18', '100', '4', '2', null, '1', null, '2'),
('38', '19', '230', '4', '2', '19', null, null, '1'),
('1', '17', '8', '5', '1', '5', null, null, '1'),
('500', '20', '1337', '8', '1', null, null, '1', '3'),
('4', '40', '83', '1', '7', '1', '5', null, '5'),
('8', '421', '98', '4', '15', '210', null, null, '7'),
('510', '228', '1488', '6', '8', '227', null, null, '5'),
('19', '70', '137', '8', '3', null, '13', null, '2'),
('20', '150', '150', '150', '150', '150', '23', '3', '6');
 
-- route_has_stop
INSERT INTO route_has_stop (`route_number`, `stop_street_name`) VALUES 
('1', 'Universytet'),
('1', 'Auchan_Chornovola'),
('1', 'Bogdana Hmelnytskogo'),
('1', 'Patona'),
('5', 'Autovokzal'),
('5', 'Auchan_Chornovola'),
('5', 'Murovane'),
('13', 'Motozavod'),
('13', 'Lubinska'),
('13', 'Heroiv UPA'),
('13', 'Stryiska-Naukova'),
('13', 'Chervonoi Kalyny'),
('23', 'Rizni'),
('23', 'Universytet'),
('23', 'Stryiska-Naukova'),
('23', 'Autovokzal');

-- driver
INSERT INTO driver (`name`, `surname`, `driver_licence_category`, `sallary_in_bucks`, `is_ready_to_die_for_company`, `bus_idbus`) VALUES 
('Vasya', 'Stepanenko', 'C', '100', '0', null),
('Han', 'Solo', 'f', '15', '0', '5'),
('Rex', 'Gergo', 'H', '150', '1', '2'),
('Ahsoka', 'Tano', 'l', '30', '0', '9'),
('Vova', 'Androsyk', 'D', '3000', '1', '1'),
('Meks', 'Androsyk', 'A', '300', '1', null),
('Darth', 'Plaguies', 'D', '1000', '0', '4'),
('Maul', 'Wazovski', 'H', '2999', '1', '7'),
('Anton', 'Popov', 'A', '10', '0', null);

-- security
INSERT INTO security (`login`, `password`, `driver_id`) VALUES 
('Vasya', '14881337', '1'),
('Falcon', '1000', '2'),
('CT-7567', '501st', '3'),
('Anakin', 'Shmii', '4'),
('Teto', '1003maks03', '5'),
('Meksich', '01012015', '6'),
('tragedy', 'Is it possible to learn such power', '7'),
('Fear', 'revenge', '8'),
('Algo', 'rithms', '9');
