CREATE TABLE product (
    id int AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    price DOUBLE NOT NULL
);

INSERT INTO product (name, price) VALUES ('Sample Product', 19.99);