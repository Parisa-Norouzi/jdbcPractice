CREATE TABLE authours (
                          Authour_id serial primary key ,
                          First_Name varchar(255),
                          Last_Name varchar(255),
                          age varchar (50)
);
CREATE TABLE book (
                          Book_id serial primary key ,
                          Book_Name varchar(255),
                          AuthourRef varchar(50),
                          year_publish varchar(50)
);