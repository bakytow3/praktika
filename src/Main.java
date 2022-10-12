public class Main {
    public static void main(String[] args) {
/* create table World(
                      id serial primary key,
                      name varchar(255),
                      continent varchar(255),
                      area int,
                      population int
);
insert into World(name, continent, area, population)
VALUES ('Afghanistan', 'Asia', 652230, 25500100),
       ('Albania','Europe', 28748, 2831741),
       ('Algeria','Africa', 28748, 2831741),
       ('Andorra','Europe', 28748, 2831741),
        ('Angola','Europe', 28748, 2831741);
 select name as country_name,continent from World
 where area >300000 and population > 25000000;
-- create table Person(
--                        id int,
--                        email varchar
-- );
-- insert into Person
-- VALUES
--     (1, 'a@b.com'),
--     (2, 'c@d.com'),
--     (3, 'a@b.com'),
--     (4, 'c@d.com'),
--     (5, 'd@b.com'),
--     (6, 'd@b.com');

--чыгарылыш 1
-- select distinct p1.email from person as p1
--     where (select  count(*) from person as p2
--                             where p2.email=p1.email)>1;
--чыгарылыш 2
-- select  email from (select email,count(email) as num
--                     from person
--                     group by email)as static where num >1;

  --чыгарылыш 3
--   select email from person
-- group by email
-- having  count(email)>1;
-- create table people (
--                         id INT,
--                         first_name VARCHAR(50),
--                         last_name VARCHAR(50),
--                         email VARCHAR(50),
--                         gender VARCHAR(50),
--                         birth_date DATE,
--                         country VARCHAR(50),
--                         salary int);
-- insert into people (id, first_name, last_name, email, gender, birth_date, country, salary)
-- values (1, 'Natalina', 'Ost', 'nost0@engadget.com', 'Female', '1994-02-04', 'Denmark',15000),
--        (2, 'Lu', 'Freathy', 'lfreathy1@vistaprint.com', 'Female', '1998-12-12', 'Brazil',45000),
--        (3, 'Mohandas', 'Mowsley', 'mmowsley2@xinhuanet.com', 'Male', '2001-05-19', 'Israel',95000),
--        (4, 'Emmalynn', 'Culshew', 'eculshew3@webmd.com', 'Female', '1994-08-29', 'Thailand',16000),
--        (5, 'Arty', 'Wipfler', 'awipfler4@yandex.ru', 'Male', '2000-02-19', 'Thailand',17000),
--        (6, 'Velma', 'Luberto', 'vluberto5@nbcnews.com', 'Female', '2011-01-19', 'China',19000),
--        (7, 'Alfred', 'Dunan', 'adunan6@intel.com', 'Female', '2014-03-10', 'Sri Lanka',23000),
--        (8, 'Avrom', 'Searby', 'asearby7@yahoo.com', 'Male', '1998-03-23', 'Brunei',193999),
--        (9, 'Libbey', 'Iacobetto', 'liacobetto8@dagondesign.com', 'Female', '2017-01-11', 'China',110003),
--        (10, 'Cleon', 'Heindrick', 'cheindrick9@time.com', 'Female', '2019-06-10', 'China', 45678),
--        (11, 'Donna', 'Calderonello', 'dcalderonelloa@unesco.org', 'Female', '2010-06-28', 'Philippines',44440),
--        (12, 'Jewelle', 'Bonds', 'jbondsb@ucla.edu', 'Female', '1994-08-11', 'Poland',30000),
--        (13, 'Dimitri', 'Hane', 'dhanec@ucsd.edu', 'Male', '1991-06-09', 'Argentina',18000),
--        (14, 'Vassili', 'Poschel', 'vposcheld@boston.com', 'Male', '2000-04-15', 'France',400000),
--        (15, 'Donna', 'Skivington', 'dskivingtone@cdbaby.com', 'Female', '1997-05-15', 'France',499930),
--        (16, 'Libbi', 'Grahlman', 'lgrahlmanf@com.com', 'Female', '2006-01-23', 'Vietnam',3243289),
--        (17, 'Liane', 'Prawle', 'lprawleg@irs.gov', 'Female', '2009-08-18', 'Sweden',4324320),
--        (18, 'Dedra', 'Camp', 'dcamph@unc.edu', 'Female', '1998-09-22', 'China', 88439),
--        (19, 'Carolyn', 'Ceschelli', 'cceschellii@ovh.net', 'Female', '2007-06-08', 'Argentina',99909),
--        (20, 'Blithe', 'Benkin', 'bbenkinj@spiegel.de', 'Female', '2008-03-10', 'Brazil',130000),
--        (21, 'Nolan', 'Shafe', 'nshafek@joomla.org', 'Male', '2018-08-22', 'Tajikistan',456789),
--        (22, 'Wald', 'Abramzon', 'wabramzonl@homestead.com', 'Male', '1998-04-10', 'Philippines',99003);

-- select id,first_name,gender,birth_date from people
-- where birth_date between '1999-01-01'and '2008-12-31'
-- order by birth_date desc ;
--
-- select count(*),gender from people
-- group by gender;
--
-- select * from people
-- where first_name like 'A%' or first_name like '%i';
--
-- select count(*) from people
-- where first_name like 'A%' or first_name like '%i';
--
-- select country, count(*) from people
-- where first_name like 'A%' or first_name like '%i'
-- group by country;
--
--select distinct country from people;
--
--  select first_name,salary from people
--  order by salary desc
-- limit 10;
--
--  select first_name,salary from people
--                    order by salary desc
--                    limit 5 offset 5;
--
--
--
-- select count(*),country,gender from people
-- where salary > (select avg (salary)from people)
-- group by gender, country;
--
-- select min(salary),country from people
-- group by country;
--
-- select min(salary),first_name,country from people
-- where salary >50000
-- group by  first_name, country,country;



-- select first_name,country, salary
-- from people as p1
-- where salary=(select min(p2.salary)from people as p2
--                                    where p2.country=p1.country
--                                    and  p2.salary>50000);*/
    }
}