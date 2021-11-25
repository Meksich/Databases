USE lab_7;

DELIMITER //

DROP procedure if exists insert_into_discipline//
DROP procedure if exists select_disciplines_has_empoyees//
DROP procedure if exists shuffle_discipline//


CREATE procedure `insert_into_discipline` (
in title varchar(45),
in semester int,
in code int,
in form_of_reception char(1)
)
begin 
	INSERT into discipline(title, semester, code, form_of_reception) values 
    (title, semester, code, form_of_reception);
end//

CREATE procedure `select_disciplines_has_empoyees`(
in discipline_id int,
in empoyee_id int
)
begin
	SELECT empoyees.surname, discipline.name from discipline_has_employee 
		inner join discipline on discipline_has_employee.discipline_id = discipline.id
        inner join empoyees on discipline_has_employee.empolyee_id = empoyees.id
	where (discipline_id = '' or discipline_id = discipline.id)and(empoyee_id = '' or empoyee_id = empoyees.id);
end//

CREATE procedure `shuffle_discipline`()
begin
declare done bool default false;

declare id int;
declare title varchar(45);
declare semester int;
declare code int;
declare form_of_reception char(1);

declare discipline_cursor cursor for select * from discipline;
declare continue handler for not found set done = true;

set @create_query = concat("CREATE table `discipline_", curdate(), "_", curtime(), "_first` (",
								"id int,",
								"title varchar(45) not null,",
								"semester int,",
								"code int,",
								"form_of_reception char(1) not null,",
                                "constraint pk_discipline primary key(id)",
							");");
prepare create_statement from @create_query;
execute create_statement;
deallocate prepare create_statement;

set @create_query = concat("CREATE table `discipline_", curdate(), "_", curtime(), "_second` (",
								"id int,",
								"title varchar(45) not null,",
								"semester int,",
								"code int,",
								"form_of_reception char(1) not null,",
                                "constraint pk_discipline primary key(id)",
							");");
prepare create_statement from @create_query;
execute create_statement;
deallocate prepare create_statement;

open discipline_cursor;
discipline_loop: loop
	fetch discipline_cursor into id, title, semester, code, form_of_reception;
	IF done=true THEN 
		LEAVE discipline_loop;
	END IF;
	if rand()>0.5 then
		SET @temp_query=CONCAT("INSERT into `discipline_", curdate(), "_", curtime(), "_first` (id, title, semester, code, form_of_reception) values(`",
								id, "`,`", title, "`,`", semester, "`,`", code, "`,`", form_of_reception, "`);");
	else
		SET @temp_query=CONCAT("INSERT into `discipline_", curdate(), "_", curtime(), "_second` (id, title, semester, code, form_of_reception) values(`",
								id, "`,`", title, "`,`", semester, "`,`", code, "`,`", form_of_reception, "`);");
	end if;
	PREPARE temp_statement FROM @temp_query;
	EXECUTE temp_statement;
	DEALLOCATE PREPARE temp_statement;
end loop;
close discipline_cursor;
end//
