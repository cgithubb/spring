CREATE TABLE EMPLY (
    EMP_UID INT PRIMARY KEY,
    EMP_FIRSTNAME VARCHAR(50),
    EMP_LASTNAME VARCHAR(50),
    EMP_MOBILE VARCHAR(15)
);

INSERT INTO EMPLY (EMP_UID, EMP_FIRSTNAME, EMP_LASTNAME, EMP_MOBILE)
VALUES
    (1, 'John', 'Doe', '1234567890'),
    (2, 'Jane', 'Smith', '0987654321'),
    (3, 'Michael', 'Johnson', '5551234567'),
    (4, 'Emily', 'Brown', '9876543210'),
    (5, 'James', 'Taylor', '1239876543'),
    (6, 'Emma', 'Wilson', '4567890123'),
    (7, 'David', 'Martinez', '7890123456'),
    (8, 'Sarah', 'Anderson', '3216549870'),
    (9, 'Matthew', 'Thomas', '6543210987'),
    (10, 'Olivia', 'Garcia', '8765432109'),
    (11, 'Daniel', 'Hernandez', '2345678901'),
    (12, 'Sophia', 'Lopez', '9012345678'),
    (13, 'William', 'Wang', '6789012345'),
    (14, 'Ava', 'Lee', '4321098765'),
    (15, 'Alexander', 'Kim', '3456789012');
