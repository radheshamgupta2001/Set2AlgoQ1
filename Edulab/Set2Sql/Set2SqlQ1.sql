CREATE DATABASE employe;
USE employe;

CREATE TABLE person (
    id INT PRIMARY KEY,
    email VARCHAR(255) NOT NULL UNIQUE
);

INSERT INTO person (id, email)
VALUES
    (1, 'radhesham@gmail.com'),
    (2, 'anita.smith@gmail.com'),
    (3, 'raj.doe@gmail.com'),
    (4, 'raj.doe@gmail.com'); 

SELECT email
FROM person
GROUP BY email
HAVING COUNT(*) = 2;

