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

--- 9. Crie uma nova tabela chamada "Funcionários" com colunas para nome, cargo e data de contratação, e insira alguns registros nela.
CREATE TABLE Employees(
	id_employees SERIAL PRIMARY KEY,
	name VARCHAR(255) NOT NULL,
	position VARCHAR(50) NOT NULL,
	contractual_date DATE NOT NULL
);
