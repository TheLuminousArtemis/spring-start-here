create table account (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name varchar(50) NOT NULL,
    amount DOUBLE NOT NULL
);

 INSERT INTO account VALUES (DEFAULT, 'Helen Down', 1000);
 INSERT INTO account VALUES (DEFAULT, 'Peter Read', 1000);