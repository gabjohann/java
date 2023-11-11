-- Inserir dados na tabela Clients
INSERT INTO Clients (name, email, phone_number) VALUES
  ('Cliente 1', 'cliente1@email.com', '123456789'),
  ('Cliente 2', 'cliente2@email.com', '986543210');
  ('Cliente 3', 'cliente3@email.com', '325435567');

-- Inserir dados na tabela Products
INSERT INTO Products (name, price, category) VALUES
  ('Produto A', 49.99, 'Categoria 1'),
  ('Produto B', 29.99, 'Categoria 2'),
  ('Produto C', 59.99, 'Categoria 1');

-- Inserir dados na tabela Orders
INSERT INTO Orders (id_client, request_date, total_amount) VALUES
  (1, '2023-11-01 10:00:00', 99.98),
  (2, '2023-11-02 12:30:00', 49.99);
  (3, '2023-11-02 12:30:00', 109.99);

-- Inserir dados na tabela OrderDetails
INSERT INTO OrderDetails (id_order, id_product, quantity) VALUES
  (1, 1, 2),
  (2, 3, 3);
  (3, 2, 1);

-- Inserir dados na tabela Employees
INSERT INTO Employees (name, position, contractual_date) VALUES
  ('Employee 1', 'Quality Assurance', '2023-01-10'),
  ('Employee 2', 'Back-end Developer', '2022-05-15'),
  ('Employee 3', 'Front-end Developer', '2023-03-20');