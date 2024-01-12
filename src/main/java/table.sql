CREATE TABLE authours (
                          Authour_id serial primary key ,
                          First_Name varchar(255),
                          Last_Name varchar(255),
                          age int
);
CREATE TABLE book (
                          Book_id serial primary key ,
                          Book_Name varchar(255),
                          AuthourRef int,
                          year_publish varchar(50)
);