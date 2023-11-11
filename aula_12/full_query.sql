--- LEVEL 1
CREATE TABLE Clients (
  id_client SERIAL PRIMARY KEY,
  name VARCHAR(255) NOT NULL,
  email VARCHAR(50) NOT NULL,
  phone_number INTEGER NOT NULL
);

CREATE TABLE Products (
  id_product SERIAL PRIMARY KEY,
  name VARCHAR(255) NOT NULL,
  price NUMERIC NOT NULL,
  category VARCHAR(100) NOT NULL
);

CREATE TABLE Orders (
  id_order SERIAL PRIMARY KEY,
  id_client INTEGER REFERENCES Clients(id_client),
  request_date TIMESTAMP NOT NULL,
  total_amount NUMERIC NOT NULL
);

CREATE TABLE OrderDetails (
  id_order_details SERIAL PRIMARY KEY,
  id_order INTEGER REFERENCES Orders(id_order),
  id_product INTEGER REFERENCES Products(id_product),
  quantity NUMERIC NOT NULL
);

INSERT INTO Clients (name, email, phone_number) VALUES
  ('Cliente 1', 'cliente1@email.com', '123456789'),
  ('Cliente 2', 'cliente2@email.com', '986543210');
  ('Cliente 3', 'cliente3@email.com', '325435567');

INSERT INTO Products (name, price, category) VALUES
  ('Produto A', 49.99, 'Categoria 1'),
  ('Produto B', 29.99, 'Categoria 2'),
  ('Produto C', 59.99, 'Categoria 1');

INSERT INTO Orders (id_client, request_date, total_amount) VALUES
  (1, '2023-11-01 10:00:00', 99.98),
  (2, '2023-11-02 12:30:00', 49.99);
  (3, '2023-11-02 12:30:00', 109.99);

INSERT INTO OrderDetails (id_order, id_product, quantity) VALUES
  (1, 1, 2),
  (2, 3, 3);
  (3, 2, 1);

--- LEVEL 2
SELECT * from Clients;

SELECT name FROM Clients;

SELECT * FROM Orders WHERE total_amount > 100;

SELECT * FROM Products WHERE price < 50;

UPDATE Clients SET name='Client 1' WHERE id_client=1;

--- 6. Delete um registro da tabela "Produtos" com base em um critério específico, como o ID do produto.
--- não é possível deletar diretamente pois viola as regras de FK
DELETE FROM OrderDetails WHERE id_product=3;
DELETE FROM Products WHERE id_product=3;

SELECT * FROM Orders WHERE id_client=1;

SELECT ROUND(AVG(price), 2) AS avg_price FROM Products;


CREATE TABLE Employees(
	id_employees SERIAL PRIMARY KEY,
	name VARCHAR(255) NOT NULL,
	position VARCHAR(50) NOT NULL,
	contractual_date DATE NOT NULL
);

INSERT INTO Employees (name, position, contractual_date) VALUES
  ('Employee 1', 'Quality Assurance', '2023-01-10'),
  ('Employee 2', 'Back-end Developer', '2022-05-15'),
  ('Employee 3', 'Front-end Developer', '2023-03-20');