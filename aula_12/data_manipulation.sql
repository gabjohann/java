--- 1. Selecione todos os registros de uma tabela chamada "Clientes".
SELECT * from Clients;

--- 2. Selecione apenas os nomes dos clientes da tabela "Clientes".
SELECT name FROM Clients;

--- 3. Selecione todos os registros da tabela "Pedidos" onde o valor total seja superior a 100.
SELECT * FROM Orders WHERE total_amount > 100;

--- 4. Selecione todos os produtos da tabela "Produtos" que tenham um preço menor que 50.
SELECT * FROM Products WHERE price < 50;

--- 5. Atualize o nome de um cliente na tabela "Clientes" para um novo nome de sua escolha.
UPDATE Clients SET name='Client 1' WHERE id_client=1;

--- 6. Delete um registro da tabela "Produtos" com base em um critério específico, como o ID do produto.
--- obs.: não é possível deletar diretamente pois viola as regras de FK
DELETE FROM OrderDetails WHERE id_product=3;
DELETE FROM Products WHERE id_product=3;

--- 7. Selecione todos os pedidos da tabela "Pedidos" que foram feitos por um cliente específico.
SELECT * FROM Orders WHERE id_client=1;

--- 8. Calcule a média dos preços dos produtos na tabela "Produtos".
SELECT ROUND(AVG(price), 2) AS avg_price FROM Products;
