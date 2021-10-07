SELECT Sum(outcome.out) as money FROM outcome 
where point = 2
order by money;

SELECT * FROM ships
WHERE class LIKE '%o';

SELECT distinct maker FROM laptop join product ON laptop.model = product.model
where speed <= 500;

SELECT distinct maker FROM product
where maker = ANY (select maker from product where type='PC' or type='Laptop');

SELECT distinct maker FROM product join laptop on product.model = laptop.model
where laptop.speed <= 500 and maker = ANY (select maker from product where type='PC');

SELECT date_format(date, '%Y.%d.%m') as date FROM battles;

SELECT battle, country, count(name) ships_from_country FROM ships 
join outcomes 
		on outcomes.ship = ships.name
join classes 
		on classes.class = ships.class
group by country
	having count(name)>=2;

SELECT name, country, numGuns FROM ships join classes on classes.class=ships.class
WHERE name = ANY(select ship from outcomes where result = 'damaged');
-- done

SELECT distinct product.maker,
				CASE
					when c.count is not null then concat('yes(', c.count, ')')
					else 'no'
				END AS printer
FROM product
left join (select maker, count(*) as count
      from printer join product on printer.model = product.model
      group by maker) as c on product.maker = c.maker
  order by maker;

SELECT avg(united.price) FROM 
	(select avg(price) price from pc 
		join product on product.model=pc.model
	where product.maker = 'A'
    union
    select avg(price) price from laptop
		join product on product.model=laptop.model
	where product.maker = 'A') as united;